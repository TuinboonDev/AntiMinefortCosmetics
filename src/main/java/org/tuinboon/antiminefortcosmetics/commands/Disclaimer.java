package org.tuinboon.antiminefortcosmetics.commands;

import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;

public class Disclaimer implements CommandExecutor {
    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String [] args) {
        sender.sendMessage("link");
        return true;
    }
}
