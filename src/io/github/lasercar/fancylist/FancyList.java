package io.github.lasercar.fancylist;

import org.bukkit.plugin.java.JavaPlugin;

public class FancyList extends JavaPlugin {
    public void onEnable() {
        saveDefaultConfig();
        getServer().getPluginManager().registerEvents(Commands, this);
    }
}
