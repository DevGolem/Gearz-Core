package development.gearznetworking.com.Core.Utilities;

import net.minecraft.server.v1_7_R4.*;
import org.bukkit.Location;
import org.bukkit.craftbukkit.v1_7_R4.CraftWorld;
import org.bukkit.craftbukkit.v1_7_R4.util.UnsafeList;
import org.bukkit.event.entity.CreatureSpawnEvent;

import java.lang.reflect.Field;

/**
 * Created by Ben on 5/28/2016.
 */
public class GearzVillagerNPC extends EntityVillager
{
    private Location spawn;

    public GearzVillagerNPC(World world)
    {
        super(world);

        try {
            Field bField = PathfinderGoalSelector.class.getDeclaredField("b");
            bField.setAccessible(true);
            Field cField = PathfinderGoalSelector.class.getDeclaredField("c");
            cField.setAccessible(true);
            bField.set(goalSelector, new UnsafeList<>());
            bField.set(targetSelector, new UnsafeList<>());
            cField.set(goalSelector, new UnsafeList<>());
            cField.set(targetSelector, new UnsafeList<>());
        }
        catch (NoSuchFieldException | SecurityException | IllegalArgumentException | IllegalAccessException ex) {
            ex.printStackTrace();
        }
        this.goalSelector.a(8, new PathfinderGoalLookAtPlayer(this, EntityHuman.class, 3.0F));
        this.goalSelector.a(8, new PathfinderGoalRandomLookaround(this));
    }

    @Override
    public EntityAgeable createChild(EntityAgeable entityAgeable)
    {
        return null;
    }

    public GearzVillagerNPC spawn(Location loc)
    {
        spawn = loc;
        World nmsWorld = ((CraftWorld) loc.getWorld()).getHandle();
        setPositionRotation(loc.getX(), loc.getY(), loc.getZ(), loc.getYaw(), loc.getPitch());

        nmsWorld.addEntity(this, CreatureSpawnEvent.SpawnReason.CUSTOM);
        return this;
    }

    @Override
    public void move(double d0, double d1, double d2)
    {

    }

}

