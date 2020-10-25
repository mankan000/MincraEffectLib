package jp.mincra.effectlib.mincraeffectlib;

import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.plugin.java.JavaPlugin;

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
}
