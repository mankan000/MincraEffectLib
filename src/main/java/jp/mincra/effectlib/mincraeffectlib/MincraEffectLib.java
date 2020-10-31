package jp.mincra.effectlib.mincraeffectlib;

import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.plugin.java.JavaPlugin;
import org.jetbrains.annotations.NotNull;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public final class MincraEffectLib extends JavaPlugin {



    @Override
    public void onEnable() {
        // Plugin startup logic

        getCommand("meffect").setExecutor(new Commands(this));
        new PreCalc();
        PreCalc.PreCalculation();
        //Config.Config(this);
        //DataBase.setConnection();
        getLogger().info("Mincra Effect Lib読み込み完了");
        


    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
    }
    @Override
    public List<String> onTabComplete(@NotNull CommandSender sender, Command command, @NotNull String alias, @NotNull String[] args) {
        if (!command.getName().equalsIgnoreCase("meffect")) return super.onTabComplete(sender, command, alias, args);
        if (args.length == 1) {
            if (args[0].length() == 0) { // /testまで
                return Arrays.asList("effectlist", "particlelist");
            } else {
                //入力されている文字列と先頭一致
                if ("hoge".startsWith(args[0])) {
                    return Collections.singletonList("hoge");
                } else if ("piyo".startsWith(args[0])) {
                    return Collections.singletonList("piyo");
                }
            }
        }
        //JavaPlugin#onTabComplete()を呼び出す
        return super.onTabComplete(sender, command, alias, args);
    }
}
