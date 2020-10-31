package jp.mincra.effectlib.mincraeffectlib;

import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.bukkit.command.TabCompleter;
import org.bukkit.plugin.java.JavaPlugin;
import org.jetbrains.annotations.NotNull;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class CommandTabCompleter implements TabCompleter {
    public CommandTabCompleter(){

    }
    @Override
    public List<String> onTabComplete(@NotNull CommandSender sender, @NotNull Command command, @NotNull String alias, @NotNull String[] args) {
        //if (!command.getName().equalsIgnoreCase("meffect")) return super.onTabComplete(sender, command, alias, args);
        if (args.length == 1) {
            if (args[0].length() == 0) { // /testまで
                return Arrays.asList("effectlist", "particlelist","gettype","basic","magiccirclehorizon","magiccirclehorizonanimation");
            } else {
                //入力されている文字列と先頭一致
                if ("effectlist".startsWith(args[0])) {
                    return Collections.singletonList("effectlist");
                } else if ("particlelist".startsWith(args[0])) {
                    return Collections.singletonList("particlelist");
                }
            }
        }
        //JavaPlugin#onTabComplete()を呼び出す
        return Collections.singletonList("null");
    }
}
