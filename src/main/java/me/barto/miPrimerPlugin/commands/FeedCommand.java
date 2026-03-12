package me.barto.miPrimerPlugin.commands;

import net.kyori.adventure.text.format.NamedTextColor;
import org.bukkit.Bukkit;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.command.ConsoleCommandSender;
import org.bukkit.entity.Player;
import org.jetbrains.annotations.NotNull;

public class FeedCommand implements CommandExecutor {

    @Override
    public boolean onCommand(@NotNull CommandSender sender, @NotNull Command command, @NotNull String s, @NotNull String @NotNull [] args) {
        if(sender instanceof Player p){
            if(args.length==0){
                FeedPlayer(p);
                p.sendMessage(NamedTextColor.YELLOW + "Te sientes lleno gracias a los poderes de los dioses");
            }else if(args.length==1){
                Player target = Bukkit.getPlayer(args[0]);
                if(target != null){
                    FeedPlayer(target);
                    p.sendMessage(target.getName() + NamedTextColor.YELLOW + " se siente lleno gracias a los poderes de los dioses");
                }else{
                    System.out.println("Error");
                }
            }
        }else if(sender instanceof ConsoleCommandSender){

        }

        return true;
    }

    private void FeedPlayer(Player p) {
        p.setFoodLevel(20);
        p.setSaturation(10);
    }

}