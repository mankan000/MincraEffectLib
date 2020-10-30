package jp.mincra.effectlib.mincraeffectlib;

import org.bukkit.Color;
import org.bukkit.Particle;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;


import jp.mincra.effectlib.mincraeffectlib.Effects.*;
import org.bukkit.entity.Entity;
import org.bukkit.entity.Player;
import org.bukkit.plugin.Plugin;
import org.bukkit.plugin.java.JavaPlugin;
import org.bukkit.scheduler.BukkitTask;
import org.jetbrains.annotations.NotNull;


public class Commands implements CommandExecutor {
    BukkitTask task;
    private JavaPlugin plugin;
    Commands(JavaPlugin plugin){
        this.plugin = plugin;
    }
    public boolean onCommand(@NotNull CommandSender sender, @NotNull Command command, @NotNull String label, @NotNull String[] args) {
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
            case "gettype":
                if (args.length > 1 && ParticleList.Check(sender,args[1])) {
                    new MessageManager(sender,String.valueOf(Particle.valueOf(args[1]).getDataType()));
                } else {
                    new MessageManager(sender,"/meffect gettype <particle>");
                    return true;
                }
                return true;
            case "magiccirclehorizon":
            case "magiccirclehorizontal":
            case "magiccircleh":
            case "mch":
                if (sender instanceof Entity && args.length > 1) {
                    new MagicCircleHorizon(caster, args[1]);
                    return true;
                }else {
                    return CommandErrorManager(sender);
                }
            case "magiccirclehorizonanimation":
            case "mcha":
                if (sender instanceof Entity && args.length > 1) {
                    new MagicCircleHorizonAnimation((Entity) sender, args[1]).runTaskTimer(plugin,0L,1L);
                    return true;
                } else {
                    return CommandErrorManager(sender);
                }
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
        if (sender instanceof Player){
            sender.sendMessage(Color.GREEN + "[MincraEffectLib]" + Color.NAVY + "パラメタが足りません");
            sender.sendMessage(Color.GREEN + "[MincraEffectLib]" + Color.NAVY + "/meffect [エフェクト名] [パーティクルの種類] [エフェクト位置] [エフェクトサイズ] [フレーム更新タイミング(tick)] [追加情報]");
        } else {
            sender.sendMessage("[MincraEffectLib] コンソールからの実行はできません");
        }
        return false;
    }
}
