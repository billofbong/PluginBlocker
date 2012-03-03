package org.awesomecraft.plugins.pluginblocker;

import org.bukkit.event.EventHandler;
import org.bukkit.event.EventPriority;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerCommandPreprocessEvent;

public class PluginBlockerCommandListener implements Listener {

    @EventHandler(priority = EventPriority.HIGHEST)
    public void onPlayerCommandPreprocess(PlayerCommandPreprocessEvent event) {
        if(event.getMessage().equals("/pl") || event.getMessage().equals("/plugins")) {
            event.setCancelled(true);
            event.setMessage("");
        }
    }
}
