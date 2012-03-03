package org.awesomecraft.plugins.pluginblocker;

import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;
import org.bukkit.plugin.java.JavaPlugin;

public class Pluginblocker extends JavaPlugin {
    public void onDisable() {
        // TODO: Place any custom disable code here.
    }
    private PluginBlockerCommandListener pbcl = new PluginBlockerCommandListener();
    public void onEnable() {
        getServer().getPluginManager().registerEvents(pbcl, this);
    }
}

