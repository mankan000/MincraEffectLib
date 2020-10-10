package jp.mincra.effectlib.mincraeffectlib;

import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;


import jp.mincra.effectlib.mincraeffectlib.Effects.*;
import org.bukkit.entity.Entity;
import org.bukkit.entity.Player;


public class Commands implements CommandExecutor {
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
        switch (args[0]) {
            case "list":
                sender.sendMessage("テスト１");
                return true;
            case "basic":
                if (sender instanceof Entity && args.length > 1) {
                    Entity entity = ((Entity) sender);
                    new Basic(entity, args);
                    return true;
                } else {
                    sender.sendMessage("[MincraEffectLib] プレイヤーから実行してください。");
                    return false;
                }
            default:
                return false;
        }
    }
}
