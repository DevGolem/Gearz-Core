package development.gearznetworking.com.Core.Commands;

import development.gearznetworking.com.Core.Core;
import development.gearznetworking.com.Core.Interfaces.GearzInterfaces;
import development.gearznetworking.com.Core.Utilities.GearzCommand;
import development.gearznetworking.com.Core.Utilities.GearzMessage;
import development.gearznetworking.com.Core.Utilities.GearzPreventionSet;
import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

import java.util.List;

/**
 * Created by Ben on 5/20/2016.
 */
public class GearzBaseCommand extends GearzCommand
{

    public GearzBaseCommand(String command, String usage, String description, List<String> alias)
    {
        super(command, usage, description, alias);
    }

    public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {

        if (cmd.getName().equalsIgnoreCase("gearz") && sender.isOp()) {

            if (args.length == 0 || args[0].equalsIgnoreCase("help"))
            {

                sender.sendMessage(GearzMessage.GEARZ_GLOBAL_SPACER);
                sender.sendMessage(GearzMessage.GEARZ_GLOBAL_PREFIX + GearzMessage.colorizeStringInput("&b/Gearz Info"));
                sender.sendMessage(GearzMessage.GEARZ_GLOBAL_PREFIX + GearzMessage.colorizeStringInput("&b/Gearz Preventions"));
                sender.sendMessage(GearzMessage.GEARZ_GLOBAL_PREFIX + GearzMessage.colorizeStringInput("&b/Gearz Debug"));
                sender.sendMessage(GearzMessage.GEARZ_GLOBAL_PREFIX + GearzMessage.colorizeStringInput("&b/Gearz Fly"));
                sender.sendMessage(GearzMessage.GEARZ_GLOBAL_SPACER);
            }

            else if (args[0].equalsIgnoreCase("info"))
            {

                sender.sendMessage(GearzMessage.GEARZ_GLOBAL_SPACER);
                sender.sendMessage(GearzMessage.GEARZ_GLOBAL_PREFIX + GearzMessage.colorizeStringInput("&bGearz Version: &e" + Core.getInstance().getDescription().getVersion()));
                sender.sendMessage(GearzMessage.GEARZ_GLOBAL_PREFIX + GearzMessage.colorizeStringInput("&bGearz Developers: &e" + Core.getInstance().getDescription().getAuthors()));
                sender.sendMessage(GearzMessage.GEARZ_GLOBAL_PREFIX + GearzMessage.colorizeStringInput("&bGearz Description: &e" + Core.getInstance().getDescription().getDescription()));
                sender.sendMessage(GearzMessage.GEARZ_GLOBAL_PREFIX + GearzMessage.colorizeStringInput("&bGearz Website: &e" + Core.getInstance().getDescription().getWebsite()));
                sender.sendMessage(GearzMessage.GEARZ_GLOBAL_SPACER);

            }

            else if (args[0].equalsIgnoreCase("preventions"))
            {

                GearzPreventionSet gearzPreventionSet = new GearzPreventionSet();

                sender.sendMessage(GearzMessage.GEARZ_GLOBAL_SPACER);
                sender.sendMessage(GearzMessage.GEARZ_GLOBAL_PREFIX + GearzMessage.colorizeStringInput("&bGearz PvP Status: &c" + gearzPreventionSet.getPvPStatus()));
                sender.sendMessage(GearzMessage.GEARZ_GLOBAL_PREFIX + GearzMessage.colorizeStringInput("&bGearz Build Status: &c" + gearzPreventionSet.getBuildStatus()));
                sender.sendMessage(GearzMessage.GEARZ_GLOBAL_PREFIX + GearzMessage.colorizeStringInput("&bGearz Fall Damage Status: &c" + gearzPreventionSet.getFallDamageStatus()));
                sender.sendMessage(GearzMessage.GEARZ_GLOBAL_SPACER);

            }

            else if (args[0].equalsIgnoreCase("debug"))
            {

                Player p = (Player) sender;
                p.sendMessage(GearzMessage.GEARZ_GLOBAL_DEBUG + "§cNow entering debugging mode.");
                p.sendMessage(GearzMessage.GEARZ_GLOBAL_DEBUG + "§cNothing in this mode is permanent.");
                GearzInterfaces.getGearzCosmeticsInterface().open(p);

            }

            else if (args[0].equalsIgnoreCase("fly"))
            {

                Player p = (Player) sender;
                p.setAllowFlight(true);
                p.setFlying(true);
                p.sendMessage(GearzMessage.GEARZ_GLOBAL_PREFIX + "§bYou are now flying.");

            }

        }

        else {
            sender.sendMessage(GearzMessage.GEARZ_GLOBAL_ERROR + "&cYou don't have permission.");
        }

        return true;
    }
}

