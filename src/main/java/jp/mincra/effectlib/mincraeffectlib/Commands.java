package jp.mincra.effectlib.mincraeffectlib;

import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;


import jp.mincra.effectlib.mincraeffectlib.Effects.*;
import org.bukkit.entity.Entity;
import org.bukkit.entity.Player;
import org.bukkit.plugin.Plugin;
import org.bukkit.plugin.java.JavaPlugin;
import org.bukkit.scheduler.BukkitTask;


public class Commands implements CommandExecutor {
    BukkitTask task;
    JavaPlugin plugin;
    public Commands(JavaPlugin plugin){
        this.plugin = plugin;
    }
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
        Entity caster = null;
        MagicCircleHorizonAnimation mcha;
        if (sender instanceof Entity) caster = (Entity)sender;
        if (args.length < 1){
            //argsが空っぽの時の処理
            return false;
        }
        switch (args[0]) {
            case "list":
                sender.sendMessage("テスト１");
                return true;
            case "particlelist":
            case "plist" :
                new ParticleList(sender, args);
                return true;
            case "magiccirclehorizon":
            case "magiccirclehorizontal":
            case "magiccircleh":
            case "mch":
                if (sender instanceof Entity && args.length > 1) {
                    new MagicCircleHorizon(caster, args[1]);
                }
                return true;
            case "magiccirclehorizonanimation":
            case "mcha":
                if (sender instanceof Entity && args.length > 1) {
                    //mcha = new MagicCircleHorizonAnimation(caster, args[1]);
                    //task = plugin.getServer().getScheduler().runTaskTimer(plugin,mcha,0L,1L);
                    new MagicCircleHorizonAnimation((Entity) sender, args[1]).runTaskTimer(plugin,0L,1L);
                }
                return true;
            case "basic":
                if (sender instanceof Entity && args.length > 1) {
                    new Basic(caster, args);
                    return true;
                } else {
                    return CommandErrorManager(sender);
                }
            default:

                return false;
        }
    }

    private boolean CommandErrorManager(CommandSender sender) {
        if (sender instanceof Entity){
            sender.sendMessage("[MincraEffectLib] パラメタが足りません");
        } else {
            sender.sendMessage("[MincraEffectLib] コンソールからの実行はできません");
        }
        return false;
    }
}
