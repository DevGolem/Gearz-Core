package development.gearznetworking.com.Core.Interfaces.CosmeticInterfaces;

import development.gearznetworking.com.Core.Cosmetics.Hats.GearzHats;
import development.gearznetworking.com.Core.Cosmetics.Pets.CatPet;
import development.gearznetworking.com.Core.Cosmetics.Pets.GearzPets;
import development.gearznetworking.com.Core.Cosmetics.Pets.WolfPet;
import development.gearznetworking.com.Core.Players.GearzPlayer;
import development.gearznetworking.com.Core.Utilities.GearzInventory;
import development.gearznetworking.com.Core.Utilities.GearzItemBuilder;
import development.gearznetworking.com.Core.Utilities.GearzMessage;
import org.bukkit.Bukkit;
import org.bukkit.Material;
import org.bukkit.entity.Player;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

import java.util.Arrays;

/**
 * Created by Ben on 5/20/2016.
 */
public class GearzPetsInterface extends GearzInventory
{

    WolfPet wolfPet;
    CatPet catPet;

    public String getName()
    {

        return "Pets";

    }

    public void open(Player p)
    {

        Inventory inventory = Bukkit.createInventory(p, 9, getName());

        for (GearzPets gearzPets : GearzPets.values())
        {

            ItemStack stack = new ItemStack(gearzPets.getMaterial());
            ItemMeta meta = stack.getItemMeta();
            meta.setDisplayName(gearzPets.getName());
            meta.setLore(Arrays.asList("§7Requires Rank: " + gearzPets.getRequiredRank().getPrefix(), "§7Price: §e" + gearzPets.getPrice()));
            stack.setItemMeta(meta);

            inventory.setItem(gearzPets.getSlot(), stack);
            inventory.setItem(8, GearzItemBuilder.createStack(Material.REDSTONE, 1, "&cRemove Pet"));

        }

        p.openInventory(inventory);

    }

    public void click(Player p, int slot)
    {
        switch (slot)
        {
            case 0:
                wolfPet = new WolfPet(p);
                wolfPet.spawnPet();
                p.sendMessage(GearzMessage.colorizeStringInput(GearzMessage.GEARZ_PET_PREFIX + "&aYou have selected the &bWolf Pet!"));
                p.closeInventory();
                break;

            case 1:
                catPet = new CatPet(p);
                catPet.spawnPet();
                p.sendMessage(GearzMessage.colorizeStringInput(GearzMessage.GEARZ_PET_PREFIX + "&aYou have selected the &bCat Pet!"));
                p.closeInventory();
                break;

            case 8:
                if (wolfPet == null && catPet == null)
                {
                    p.sendMessage(GearzMessage.colorizeStringInput(GearzMessage.GEARZ_PET_PREFIX + "&cYou haven't selected a Pet!"));
                }
                else if (wolfPet == null)
                {
                    catPet.removePet();
                    p.sendMessage(GearzMessage.colorizeStringInput(GearzMessage.GEARZ_PET_PREFIX + "&aYour &bCat Pet &ahas been removed!"));
                }
                else if (catPet == null)
                {
                    wolfPet.removePet();
                    p.sendMessage(GearzMessage.colorizeStringInput(GearzMessage.GEARZ_PET_PREFIX + "&aYour &bWolf Pet &ahas been removed!"));
                }
        }
    }
}


