package development.gearznetworking.com.Core.Cosmetics;

import development.gearznetworking.com.Core.Ranks.GearzRank;
import org.bukkit.Material;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

/**
 * Created by Ben on 5/19/2016.
 */
public enum GearzCosmetics
{

    HATS(Material.DIAMOND_HELMET, "§aHats", 11, GearzRank.ULTRA.getId(), GearzRank.ULTRA),
    GADGETS(Material.FIREWORK, "§bGadgets", 13, GearzRank.ULTRA.getId(), GearzRank.ULTRA),
    PARTICLES(Material.BLAZE_POWDER, "§eParticles", 15, GearzRank.ULTRA.getId(), GearzRank.ULTRA),
    PETS(Material.BONE, "§dPets", 30, GearzRank.DEV.getId(), GearzRank.DEV),
    SUITS(Material.LEATHER_LEGGINGS, "§6Suits", 32, GearzRank.ULTRA.getId(), GearzRank.ULTRA);

    Material material;
    String name;
    String prefix;
    int slot;
    int requiredRankID;
    GearzRank requiredRank;


    GearzCosmetics(Material material, String name, int slot, int requiredRankID, GearzRank requiredRank)
    {
        this.material = material;
        this.name = name;
        this.slot = slot;
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

    public int getRequiredRankID()
    {
        return requiredRankID;
    }

    public GearzRank getRequiredRank()
    {
        return requiredRank;
    }

}

