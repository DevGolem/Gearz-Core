package development.gearznetworking.com.Core.Listeners.PreventionSetListeners;

import development.gearznetworking.com.Core.Utilities.GearzPreventionSet;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.EntityDamageByEntityEvent;
import org.bukkit.event.entity.EntityDamageEvent;

/**
 * Created by Ben on 5/27/2016.
 */
public class PvPStatusPreventionSet implements Listener
{

    @EventHandler
    public void onEntityDamageByEntityEvent(EntityDamageByEntityEvent e)
    {

        if (!(e.getEntity() instanceof Player))
            return;

        if (!(e.getDamager() instanceof Player))
            return;

        GearzPreventionSet gearzPreventionSet = new GearzPreventionSet();

        if (gearzPreventionSet.getPvPStatus() == false)
        {
            e.setCancelled(true);
        }
    }

}

