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
                if ("effectlist".startsWith(args[0])) {
                    return Collections.singletonList("effectlist");
                } else if ("particlelist".startsWith(args[0])) {
                    return Collections.singletonList("particlelist");
                } else if ("gettype".startsWith(args[0])) {
                    return Collections.singletonList("gettype");
                } else if ("basic".startsWith(args[0])) {
                    return Collections.singletonList("basic");
                } else if ("magiccirclehorizon".startsWith(args[0])) {
                    return Collections.singletonList("magiccirclehorizon");
                } else if ("magiccirclehorizonanimation".startsWith(args[0])) {
                    return Collections.singletonList("magiccirclehorizonanimation");
                }
            }
        } else if (args.length == 2) {
            //effectlistとprticlelistとgettype以外では第二引数の候補にパーティクルリストを表示
            if (args[1].length() == 0 && !args[0].equalsIgnoreCase("effectlist") && !args[0].equalsIgnoreCase("particlelist") && !args[0].equalsIgnoreCase("gettype")) { // /testまで
                return ParticleList.plist;
            } else if (args[1].length() == 0 && args[0].equalsIgnoreCase("particlelist")){
                return Collections.singletonList("random");
            } else {
                for (String s:ParticleList.plist) {
                    if (s.startsWith(args[1])) {
                        return Collections.singletonList(s);
                    }
                }
                if ("random".startsWith(args[1])) {
                    return Collections.singletonList("random");
                }
            }
        } else if (args.length == 3) {
            //第三引数ではパーティクルの追加情報を。
            if (args[2].length() == 0) {
                return ParticleList.plist;
            } else {
                //入力されている文字列と先頭一致
                if ("effectlist".startsWith(args[2])) {
                    return Collections.singletonList("effectlist");
                } else if ("particlelist".startsWith(args[2])) {
                    return Collections.singletonList("particlelist");
                } else if ("gettype".startsWith(args[2])) {
                    return Collections.singletonList("gettype");
                } else if ("basic".startsWith(args[2])) {
                    return Collections.singletonList("basic");
                } else if ("magiccirclehorizon".startsWith(args[2])) {
                    return Collections.singletonList("magiccirclehorizon");
                } else if ("magiccirclehorizonanimation".startsWith(args[2])) {
                    return Collections.singletonList("magiccirclehorizonanimation");
                }
            }
        }
        //JavaPlugin#onTabComplete()を呼び出す
        return null;
    }
}
