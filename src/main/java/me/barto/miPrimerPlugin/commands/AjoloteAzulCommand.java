package me.barto.miPrimerPlugin.commands;

import net.kyori.adventure.text.Component;
import net.kyori.adventure.text.format.NamedTextColor;
import org.bukkit.Material;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Item;
import org.bukkit.entity.Player;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;
import org.jetbrains.annotations.NotNull;

public class AjoloteAzulCommand implements CommandExecutor {

    @Override
    public boolean onCommand(@NotNull CommandSender sender, @NotNull Command command, @NotNull String s, @NotNull String @NotNull [] args) {

        if(sender instanceof Player p){
            ItemStack ajolote = ItemStack.of(Material.AXOLOTL_BUCKET);
            ItemMeta meta = ajolote.getItemMeta();

            meta.displayName(Component.text("Ajolote Azul"));
            meta.setVariant()
            ajolote.setItemMeta(meta);

            p.getInventory().addItem(ajolote);

            p.sendMessage(NamedTextColor.BLUE + "Recibiste un ajolote azul! El ajolote mas raro del juego!");
        }

        return true;
    }
}
