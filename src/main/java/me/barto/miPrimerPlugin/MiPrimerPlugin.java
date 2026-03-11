package me.barto.miPrimerPlugin;

import org.bukkit.plugin.java.JavaPlugin;
import me.barto.miPrimerPlugin.commands.Fly;

import java.util.Objects;

public final class MiPrimerPlugin extends JavaPlugin {

    @Override
    public void onEnable() {
        // Plugin startup logic
        Objects.requireNonNull(getCommand("fly")).setExecutor(new Fly());
    }
}
