package development.gearznetworking.com.Core.Utilities;

import org.bukkit.entity.Player;

/**
 * Created by Ben on 5/20/2016.
 */
public abstract class GearzInventory
{

    public abstract String getName();

    public abstract void open(Player p);

    public abstract void click(Player p, int slot);

}

