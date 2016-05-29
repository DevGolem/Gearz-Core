package development.gearznetworking.com.Core.Interfaces.CosmeticInterfaces;

import development.gearznetworking.com.Core.Cosmetics.Pets.GearzPets;
import development.gearznetworking.com.Core.Utilities.GearzInventory;
import development.gearznetworking.com.Core.Utilities.GearzItemBuilder;
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

    }
}


