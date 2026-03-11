package me.barto.miPrimerPlugin.commands;

import net.kyori.adventure.text.format.NamedTextColor;
import org.bukkit.command.Command;
import org.bukkit.command.ConsoleCommandSender;
import org.bukkit.entity.Player;
import org.bukkit.Bukkit;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.jetbrains.annotations.NotNull;

import java.util.ArrayList;

public class Fly implements CommandExecutor{

    //private ArrayList<Player> flyPlayers = new ArrayList<>();

    @Override
    public boolean onCommand(@NotNull CommandSender sender, @NotNull Command command, @NotNull String s, @NotNull String @NotNull [] strings) {
        if(sender instanceof Player p && strings.length==0){
            activateDeactivateFly(p);
        }else if (sender instanceof ConsoleCommandSender && strings.length==1) {
            Player target = Bukkit.getPlayer(strings[0]);
            if(target != null) {
                activateDeactivateFly(target);
            }
        }else{
            System.out.println("La cantidad de argumentos debe ser 0 o 1");
        }
        return true;
    }

    private void activateDeactivateFly(Player p){
        if(p.getAllowFlight()){
            p.setAllowFlight(false);
            p.sendMessage(NamedTextColor.AQUA + "Se ha desactivado el modo vuelo");
        }else{
            p.setAllowFlight(true);
            p.sendMessage(NamedTextColor.AQUA + "Se ha activado el modo vuelo");
        }
    }

}