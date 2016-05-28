package development.gearznetworking.com.Core.Players;

import development.gearznetworking.com.Core.Ranks.GearzRank;
import org.bukkit.Bukkit;
import org.bukkit.OfflinePlayer;
import org.bukkit.entity.Player;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by Ben on 5/27/2016.
 */
public class GearzPlayerManager
{

    private Map<Player, GearzPlayer> players;
    private Map<Player, GearzRank> ranks;
    private Map<Player, Integer> tokens;

    public GearzPlayerManager()
    {
        players = new HashMap<>();
        ranks = new HashMap<>();
        tokens = new HashMap<>();
    }

    public Map<Player, GearzPlayer> getPlayers()
    {
        return players;
    }
    public Map<Player, GearzRank> getRanks()
    {
        return ranks;
    }
    public Map<Player, Integer> getTokens()
    {
        return tokens;
    }

    /*public void addGearzPlayer(Player p)
    {
        GearzPlayer gearzPlayer = new GearzPlayer(p);
        players.put(p, gearzPlayer);

        if (!gearzPlayer.exists()) {
            ranks.put(p, GearzRank.MEMBER);
        } else {
            ranks.put(p, gearzPlayer.getOfflineRank());
        }
    }

    public void removeGearzPlayer(Player p)
    {
        GearzPlayer gearzPlayer = new GearzPlayer(p);

        gearzPlayer.setOfflineRank(gearzPlayer.getOnlineRank());
        players.remove(p);
    }

    public void loadGearzPlayers()
    {
        players.clear();
        ranks.clear();
        tokens.clear();

        for (Player p : Bukkit.getOnlinePlayers())
        {
            addGearzPlayer(p);
        }
    }

    public GearzPlayer getGearzPlayer(OfflinePlayer p)
    {
        if(p.isOnline())
        {
            if(players.containsKey(p.getPlayer()))
            {
                return players.get(p.getPlayer());
            }

            addGearzPlayer(p.getPlayer());
            return getGearzPlayer(p);
        }

        return new GearzPlayer(p);
    }*/
}


