package development.gearznetworking.com.Core;

import development.gearznetworking.com.Core.Commands.GearzBaseCommand;
import development.gearznetworking.com.Core.Listeners.InventoryClickListener;
import development.gearznetworking.com.Core.Listeners.PlayerJoinListener;
import development.gearznetworking.com.Core.Listeners.PlayerQuitListener;
import development.gearznetworking.com.Core.Listeners.PreventionSetListeners.BuildStatusPreventionSet;
import development.gearznetworking.com.Core.Listeners.PreventionSetListeners.FallDamageStatusPreventionSet;
import development.gearznetworking.com.Core.Listeners.PreventionSetListeners.PvPStatusPreventionSet;
import development.gearznetworking.com.Core.Utilities.GearzCommand;
import development.gearznetworking.com.Core.Utilities.GearzPreventionSet;
import org.bukkit.Bukkit;
import org.bukkit.plugin.PluginManager;
import org.bukkit.plugin.java.JavaPlugin;

import java.util.Arrays;

/**
 * Created by Ben on 5/19/2016.
 */
public class Core extends JavaPlugin
{

    private static Core instance;
    GearzPreventionSet gearzPreventionSet = new GearzPreventionSet();

    public void onEnable()
    {

        instance = this;
        gearzPreventionSet.loadDefaultPreventions();
        registerListeners();
        registerCommands();

    }

    public static Core getInstance()
    {

        return instance;

    }

    public void registerListeners()
    {

        PluginManager pm = Bukkit.getPluginManager();

        pm.registerEvents(new InventoryClickListener(), this);
        pm.registerEvents(new PlayerJoinListener(), this);
        pm.registerEvents(new PlayerQuitListener(), this);

        pm.registerEvents(new BuildStatusPreventionSet(), this);
        pm.registerEvents(new FallDamageStatusPreventionSet(), this);
        pm.registerEvents(new PvPStatusPreventionSet(), this);

    }

    public void registerCommands()
    {

        GearzCommand gearzBaseCommand = new GearzBaseCommand("Gearz", "gearz", "Gearz Base Command", Arrays.asList("g"));
        gearzBaseCommand.register();

    }

}

