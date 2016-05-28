package development.gearznetworking.com.Core.Listeners.PreventionSetListeners;

import development.gearznetworking.com.Core.Utilities.GearzPreventionSet;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.EntityDamageEvent;

/**
 * Created by Ben on 5/27/2016.
 */
public class FallDamageStatusPreventionSet implements Listener
{

    @EventHandler
    public void onEntityDamageEvent(EntityDamageEvent e)
    {

        if (!(e.getEntity() instanceof Player))
            return;

        if (e.getCause() == EntityDamageEvent.DamageCause.FALL)
        {
            GearzPreventionSet gearzPreventionSet = new GearzPreventionSet();

            if (gearzPreventionSet.getFallDamageStatus() == false)
            {
                e.setCancelled(true);
            }
        }

    }

}

