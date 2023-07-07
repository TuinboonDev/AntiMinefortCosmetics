package org.tuinboon.antiminefortcosmetics.commands;

import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;

public class Credits implements CommandExecutor {
    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String [] args) {
        sender.sendMessage("This plugin has been made by Tuinboon with the help of eminence5070");
        return true;
    }
}
