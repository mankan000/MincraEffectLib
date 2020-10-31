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
        getCommand("meffect").setTabCompleter(new CommandTabCompleter());
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
}
