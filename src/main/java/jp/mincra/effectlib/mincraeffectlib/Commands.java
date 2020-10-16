package jp.mincra.effectlib.mincraeffectlib;

import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;


import jp.mincra.effectlib.mincraeffectlib.Effects.*;
import org.bukkit.entity.Entity;
import org.bukkit.entity.Player;


public class Commands implements CommandExecutor {
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
        if (args[0].equals("particlelist")) args[0] = "plist";
        switch (args[0]) {
            case "list":
                sender.sendMessage("テスト１");
                return true;
            case "plist" :
                new ParticleList(sender, args);
                return true;
            case "basic":
                if (sender instanceof Entity && args.length > 1) {
                    Entity entity = ((Entity) sender);
                    new Basic(entity, args);
                    return true;
                } else {
                    sender.sendMessage("[MincraEffectLib] パラメタが足りません");
                    return false;
                }
            default:
                return false;
        }
    }
}
