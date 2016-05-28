package development.gearznetworking.com.Core.Cosmetics.Pets;

import development.gearznetworking.com.Core.Ranks.GearzRank;
import development.gearznetworking.com.Core.Utilities.GearzPet;
import org.bukkit.Material;
import org.bukkit.entity.Entity;
import org.bukkit.entity.EntityType;

/**
 * Created by Ben on 5/20/2016.
 */
public enum GearzPets
{

    WOLF(Material.BONE, "§bWolf Pet", 0, 500, GearzRank.ULTRA.getId(), GearzRank.ULTRA),
    CAT(Material.RAW_FISH, "§bCat Pet", 1, 500, GearzRank.ULTRA.getId(), GearzRank.ULTRA);

    private Material material;
    private String name;
    private int slot;
    private int price;
    private int requiredRankID;
    private GearzRank requiredRank;

    GearzPets(Material material, String name, int slot, int price, int requiredRankID, GearzRank requiredRank)
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

