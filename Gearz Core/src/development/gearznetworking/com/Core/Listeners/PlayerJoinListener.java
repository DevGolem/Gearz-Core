package development.gearznetworking.com.Core.Listeners;

import development.gearznetworking.com.Core.Players.GearzPlayerManager;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;

/**
 * Created by Ben on 5/27/2016.
 */
public class PlayerJoinListener implements Listener
{

    GearzPlayerManager gearzPlayerManager = new GearzPlayerManager();

    @EventHandler
    public void onPlayerJoinEvent(PlayerJoinEvent e)
    {

        Player p = e.getPlayer();
        //gearzPlayerManager.addGearzPlayer(p);

    }

}

