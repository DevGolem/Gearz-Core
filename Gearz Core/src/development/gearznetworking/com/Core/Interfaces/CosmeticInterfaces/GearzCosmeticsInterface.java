package development.gearznetworking.com.Core.Interfaces.CosmeticInterfaces;

import development.gearznetworking.com.Core.Cosmetics.GearzCosmetics;
import development.gearznetworking.com.Core.Interfaces.GearzInterfaces;
import development.gearznetworking.com.Core.Ranks.GearzRank;
import development.gearznetworking.com.Core.Utilities.GearzInventory;
import development.gearznetworking.com.Core.Utilities.GearzMessage;
import org.bukkit.Bukkit;
import org.bukkit.entity.Player;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

import java.util.Arrays;

/**
 * Created by Ben on 5/20/2016.
 */
public class GearzCosmeticsInterface extends GearzInventory
{

    public String getName()
    {
        return "Cosmetics";
    }

    public void open(Player p)
    {

        Inventory inventory = Bukkit.createInventory(p, 45, getName());

        for (GearzCosmetics gearzCosmetics : GearzCosmetics.values())
        {

            ItemStack stack = new ItemStack(gearzCosmetics.getMaterial());
            ItemMeta meta = stack.getItemMeta();
            meta.setDisplayName(gearzCosmetics.getName());
            meta.setLore(Arrays.asList("§7Requires Rank: " + gearzCosmetics.getRequiredRank().getPrefix()));
            stack.setItemMeta(meta);

            inventory.setItem(gearzCosmetics.getSlot(), stack);

        }

        p.openInventory(inventory);

    }

    public void click(Player p, int slot)
    {
        switch (slot)
        {
            case 11:
                GearzInterfaces.getGearzHatsInterface().open(p);
                break;
            case 30:
                p.closeInventory();
                p.sendMessage(GearzMessage.GEARZ_GLOBAL_PREFIX + GearzMessage.colorizeStringInput("&cPets are under development"));

        }
    }
}

