package jp.mincra.effectlib.mincraeffectlib;

import org.bukkit.ChatColor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Entity;
import org.bukkit.entity.Player;

import static org.bukkit.Bukkit.getLogger;

public class MessageManager {
    public MessageManager(CommandSender _caster, String _message){
        if (_caster instanceof Player){
            _caster.sendMessage(ChatColor.GREEN + "[MincraEffectLib]" + ChatColor.RED + _message );
        } else {
            getLogger().info("[MincraEffectLib]" + _message);
        }
    }
}
