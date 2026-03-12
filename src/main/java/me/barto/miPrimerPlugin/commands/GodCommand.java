package me.barto.miPrimerPlugin.commands;

import net.kyori.adventure.text.format.NamedTextColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.jetbrains.annotations.NotNull;

public class GodCommand implements CommandExecutor {

    @Override
    public boolean onCommand(@NotNull CommandSender sender, @NotNull Command command, @NotNull String s, @NotNull String @NotNull [] args) {
        if(sender instanceof Player p){
            if(args.length==0){
                if(p.isInvulnerable()){
                    p.setInvulnerable(true);
                    p.sendMessage(NamedTextColor.GOLD + "Ahora eres invulnerable");
                }else{
                    p.setInvulnerable(false);
                    p.sendMessage(NamedTextColor.DARK_RED + "Ya no eres invulnerable, ten cuidado");
                }
            }

        }
        return true;
    }
}
