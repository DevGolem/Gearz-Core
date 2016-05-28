package development.gearznetworking.com.Core.Loadouts.GearzHub;

import development.gearznetworking.com.Core.Utilities.GearzItemBuilder;
import org.bukkit.Material;
import org.bukkit.entity.Player;

/**
 * Created by Ben on 5/22/2016.
 */
public class GearzHubLoadout
{

    public void giveGearzHubInventory(Player p)
    {

        p.getInventory().setItem(0, GearzItemBuilder.createItem(Material.CHEST, "&aCosmetics &7&o(Right Click)"));
        p.getInventory().setItem(1, GearzItemBuilder.createItem(Material.GOLD_INGOT, "&aAchievements &7&o(Right Click)"));
        p.getInventory().setItem(4, GearzItemBuilder.createItem(Material.COMPASS, "&aServer Selector &7&o(Right Click)"));
        p.getInventory().setItem(7, GearzItemBuilder.createItem(Material.INK_SACK, (byte) 8, "&fPlayers: &aVisable &7&o(Right Click)"));
        p.getInventory().setItem(8, GearzItemBuilder.createItem(Material.HOPPER, "&aLobby Selector &7&o(Right Click&7)"));

    }

}



