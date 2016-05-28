package development.gearznetworking.com.Core.Listeners;

import development.gearznetworking.com.Core.Players.GearzPlayerManager;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerQuitEvent;

/**
 * Created by Ben on 5/27/2016.
 */
public class PlayerQuitListener implements Listener
{

    GearzPlayerManager gearzPlayerManager = new GearzPlayerManager();

    @EventHandler
    public void onPlayerQuitEvent(PlayerQuitEvent e)
    {

        Player p = e.getPlayer();
        //gearzPlayerManager.removeGearzPlayer(p);

    }

}

