package development.gearznetworking.com.Core.Listeners.PreventionSetListeners;

import development.gearznetworking.com.Core.Players.GearzPlayer;
import development.gearznetworking.com.Core.Utilities.GearzPreventionSet;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.block.BlockBreakEvent;
import org.bukkit.event.block.BlockPlaceEvent;

/**
 * Created by Ben on 5/27/2016.
 */
public class BuildStatusPreventionSet implements Listener
{

    @EventHandler
    public void onBlockPlaceEvent(BlockPlaceEvent e)
    {

        GearzPreventionSet gearzPreventionSet = new GearzPreventionSet();

        if (gearzPreventionSet.getBuildStatus() == false)
        {
            e.setCancelled(true);
        }

    }

    @EventHandler
    public void onBlockBreakEvent(BlockBreakEvent e)
    {

        GearzPreventionSet gearzPreventionSet = new GearzPreventionSet();

        if (gearzPreventionSet.getBuildStatus() == false)
        {
            e.setCancelled(true);
        }

    }

}

