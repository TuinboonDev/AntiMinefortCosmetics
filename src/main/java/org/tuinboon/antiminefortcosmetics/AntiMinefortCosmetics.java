package org.tuinboon.antiminefortcosmetics;

import org.bukkit.Bukkit;
import org.bukkit.plugin.Plugin;
import org.bukkit.plugin.java.JavaPlugin;
import org.tuinboon.antiminefortcosmetics.commands.Credits;
import org.tuinboon.antiminefortcosmetics.commands.Disclaimer;
import org.tuinboon.antiminefortcosmetics.commands.Github;

public final class AntiMinefortCosmetics extends JavaPlugin {

    @Override
    public void onEnable() {
        // Plugin startup logic

        // Plugin startup logic
        Plugin minefortplugin = Bukkit.getPluginManager().getPlugin("MinefortCosmetics");
        minefortplugin.onEnable();
        Bukkit.getPluginManager().disablePlugin(minefortplugin);
        Bukkit.getLogger().info("Succesfully disabled Minefort's cosmetics plugin");
        getCommand("authors").setExecutor(new Credits());
        getCommand("github").setExecutor(new Github());
        getCommand("disclaimer").setExecutor(new Disclaimer());
    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
    }
}
