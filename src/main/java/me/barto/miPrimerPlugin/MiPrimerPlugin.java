package me.barto.miPrimerPlugin;

import org.bukkit.plugin.java.JavaPlugin;
import me.barto.miPrimerPlugin.commands.GodCommand;
import me.barto.miPrimerPlugin.commands.FlyCommand;
import me.barto.miPrimerPlugin.commands.FeedCommand;

import java.util.Objects;

public final class MiPrimerPlugin extends JavaPlugin {

    @Override
    public void onEnable() {
        // Plugin startup logic
        Objects.requireNonNull(getCommand("fly")).setExecutor(new FlyCommand());
        Objects.requireNonNull(getCommand("feed")).setExecutor(new FeedCommand());
        Objects.requireNonNull(getCommand("god")).setExecutor(new GodCommand());
    }
}
