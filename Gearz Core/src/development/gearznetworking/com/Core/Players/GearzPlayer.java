package development.gearznetworking.com.Core.Players;

import development.gearznetworking.com.Core.MySQL.MySQL;
import development.gearznetworking.com.Core.Ranks.GearzRank;
import org.bukkit.OfflinePlayer;
import org.bukkit.entity.Player;

import java.sql.ResultSet;
import java.sql.SQLException;

/**
 * Created by Ben on 5/22/2016.
 */
public class GearzPlayer
{

    private GearzPlayerManager gearzPlayerManager;
    //private MySQL mySQL;
    private OfflinePlayer offlinePlayer;
    private Player player;

    public GearzPlayer(OfflinePlayer offlinePlayer)
    {
        gearzPlayerManager = new GearzPlayerManager();
        //mySQL = new MySQL();
        this.offlinePlayer = offlinePlayer;
        player = offlinePlayer.getPlayer();
    }

    /*public GearzRank getOfflineRank()
    {
        try {
            ResultSet resultSet = mySQL.getResultSet("SELECT Rank FROM PlayerInfo WHERE UUID='" + offlinePlayer.getUniqueId() + "'");
            if (resultSet.next()) {
                return GearzRank.valueOf(resultSet.getString("Rank"));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return GearzRank.MEMBER;
    }

    public void setOfflineRank(GearzRank rank)
    {
        if (!exists()) {
            try {

                mySQL.executeUpdate("INSERT INTO PlayerInfo (`UUID`, `Rank`) VALUES ('" + offlinePlayer.getUniqueId() + "','" + rank.name() + "')");
            } catch (SQLException e) {
                e.printStackTrace();
            }
        } else {
            try {
                mySQL.executeUpdate("UPDATE PlayerInfo SET Rank='" + rank.name() + "' WHERE UUID='" + offlinePlayer.getUniqueId() + "'");
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }

    public GearzRank getOnlineRank()
    {
        if (offlinePlayer.isOnline()) {
            return gearzPlayerManager.getRanks().get(player);
        }

        return getOfflineRank();
    }

    public void setOnlineRank(GearzRank rank)
    {
        if (offlinePlayer.isOnline()) {
            gearzPlayerManager.getRanks().put(player, rank);
            return;
        }

        setOfflineRank(rank);
    }

    public boolean exists()
    {

        try {
            ResultSet rs = mySQL.getResultSet("SELECT * FROM PlayerInfo WHERE UUID='" + offlinePlayer.getUniqueId() + "'");
            return rs.next();
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return false;
    }


    public int getOfflineTokens()
    {
        try {
            ResultSet resultSet = mySQL.getResultSet("SELECT Tokens FROM PlayerInfo WHERE UUID='" + offlinePlayer.getUniqueId() + "'");
            if (resultSet.next()) {
                return resultSet.getInt("Tokens");
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return 0;
    }

    public void setOfflineTokens(int value)
    {
        try {
            mySQL.executeUpdate("UPDATE PlayerInfo SET Tokens='" + value + "' WHERE UUID='" + offlinePlayer.getUniqueId() + "'");
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public int getOnlineTokens()
    {
        if (offlinePlayer.isOnline()) {
            return gearzPlayerManager.getTokens().get(player);
        }

        return getOfflineTokens();
    }

    public void setOnlineTokens(int value)
    {
        if (offlinePlayer.isOnline()) {
            gearzPlayerManager.getTokens().put(player, value);
            return;
        }

        setOfflineTokens(value);
    }*/

}


