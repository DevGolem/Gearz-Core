package development.gearznetworking.com.Core.Utilities;

import org.bukkit.ChatColor;

/**
 * Created by Ben on 5/20/2016.
 */
public class GearzMessage
{
    public static String GEARZ_GLOBAL_PREFIX = "§eGearz §8» ";
    public static String GEARZ_GLOBAL_ERROR = "§4Gearz Error §8» ";
    public static String GEARZ_GLOBAL_WARNING = "§cGearz Warning §8» ";
    public static String GEARZ_GLOBAL_DEBUG = "§4Gearz Debug §8» ";
    public static String GEARZ_GLOBAL_SPACER = "§8§m----------------------------------------";
    public static String GEARZ_GLOBAL_BLANK_MESSAGES = " ";

    public static String GEARZ_HAT_PREFIX = "§eGearz Hats §8» ";
    public static String GEARZ_GADGET_PREFIX = "§eGearz Gadgets §8» ";
    public static String GEARZ_PARTICLE_PREFIX = "§eGearz Particles §8» ";
    public static String GEARZ_PET_PREFIX = "§eGearz Pets §8» ";
    public static String GEARZ_SUIT_PREFIX = "§eGearz Suits §8» ";


    public static String colorizeStringInput(String input)
    {

        return ChatColor.translateAlternateColorCodes('&', input);

    }

}

