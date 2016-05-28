package development.gearznetworking.com.Core.Listeners;

import development.gearznetworking.com.Core.Interfaces.GearzInterfaces;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.inventory.InventoryClickEvent;

/**
 * Created by Ben on 5/20/2016.
 */
public class InventoryClickListener implements Listener
{

    @EventHandler
    public void onInventoryClickEvent(InventoryClickEvent e)
    {

        Player p = (Player) e.getWhoClicked();
        int slot = e.getRawSlot();
        String name = e.getInventory().getName();

        if (name.equalsIgnoreCase(GearzInterfaces.getGearzCosmeticsInterface().getName()))
        {

            e.setCancelled(true);
            GearzInterfaces.getGearzCosmeticsInterface().click(p, slot);

        }

        else if (name.equalsIgnoreCase(GearzInterfaces.getGearzHatsInterface().getName()))
        {

            e.setCancelled(true);
            GearzInterfaces.getGearzHatsInterface().click(p, slot);

        }

        else if (name.equalsIgnoreCase(GearzInterfaces.getGearzPetsInterface().getName()))
        {

            e.setCancelled(true);
            GearzInterfaces.getGearzPetsInterface().click(p, slot);

        }

    }

}

