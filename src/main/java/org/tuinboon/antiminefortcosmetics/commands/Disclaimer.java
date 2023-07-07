package org.tuinboon.antiminefortcosmetics.commands;

import net.md_5.bungee.api.ChatColor;
import net.md_5.bungee.api.chat.ClickEvent;
import net.md_5.bungee.api.chat.TextComponent;
import org.bukkit.Bukkit;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;

public class Disclaimer implements CommandExecutor {
    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String [] args) {
        TextComponent textComponent = new TextComponent();
        textComponent.setClickEvent(new ClickEvent(ClickEvent.Action.OPEN_URL, "https://github.com/TuinboonDev/AntiMinefortCosmetics/tree/main#disclaimer"));
        textComponent.setText("Disclaimer!");
        textComponent.setColor(ChatColor.GREEN);
        textComponent.setUnderlined(true);
        sender.spigot().sendMessage(textComponent);
        return true;
    }
}
