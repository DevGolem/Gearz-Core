package development.gearznetworking.com.Core.Cosmetics.Hats;

import development.gearznetworking.com.Core.Ranks.GearzRank;
import org.bukkit.Material;

/**
 * Created by Ben on 5/19/2016.
 */
public enum GearzHats
{

    NOTE_BLOCK(Material.NOTE_BLOCK, "§bNote Hats", 0, 250, GearzRank.HERO.getId(), GearzRank.HERO),
    GLASS(Material.GLASS, "§bGlass Hats", 1, 250, GearzRank.HERO.getId(), GearzRank.HERO);

    private Material material;
    private String name;
    private int slot;
    private int price;
    private int requiredRankID;
    private GearzRank requiredRank;

    GearzHats(Material material, String name, int slot, int price, int requiredRankID, GearzRank requiredRank)
    {

        this.material = material;
        this.name = name;
        this.slot = slot;
        this.price = price;
        this.requiredRankID = requiredRankID;
        this.requiredRank = requiredRank;

    }

    public Material getMaterial()
    {
        return material;
    }

    public String getName()
    {
        return name;
    }

    public int getSlot()
    {
        return slot;
    }

    public int getPrice()
    {
        return price;
    }

    public int getRequiredRankID()
    {
        return requiredRankID;
    }

    public GearzRank getRequiredRank()
    {
        return requiredRank;
    }

}
