package development.gearznetworking.com.Core.Interfaces.CosmeticInterfaces;

import development.gearznetworking.com.Core.Cosmetics.Hats.GearzHats;
import development.gearznetworking.com.Core.Interfaces.GearzInterfaces;
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
public class GearzHatsInterface extends GearzInventory
{

    public String getName()
    {

        return "Hats";

    }

    public void open(Player p)
    {

        Inventory inventory = Bukkit.createInventory(p, 9, getName());

        for (GearzHats gearzHats : GearzHats.values())
        {

            ItemStack stack = new ItemStack(gearzHats.getMaterial());
            ItemMeta meta = stack.getItemMeta();
            meta.setDisplayName(gearzHats.getName());
            meta.setLore(Arrays.asList("§7Requires Rank: " + gearzHats.getRequiredRank().getPrefix(), "§7Price: §e" + gearzHats.getPrice()));
            stack.setItemMeta(meta);

            inventory.setItem(gearzHats.getSlot(), stack);

        }

        p.openInventory(inventory);

    }

    public void click(Player p, int slot)
    {
        switch (slot)
        {
            case 0:
                p.getInventory().setHelmet(GearzItemBuilder.createStack(Material.NOTE_BLOCK, 1));
                p.sendMessage(GearzMessage.colorizeStringInput(GearzMessage.GEARZ_HAT_PREFIX + "&aYou have selected the &bNote Hat!"));
                p.closeInventory();
                break;

            case 1:
                p.getInventory().setHelmet(GearzItemBuilder.createStack(Material.GLASS, 1));
                p.sendMessage(GearzMessage.colorizeStringInput(GearzMessage.GEARZ_HAT_PREFIX + "&aYou have selected the &bGlass Hat!"));
                p.closeInventory();
                break;

        }
    }
}


