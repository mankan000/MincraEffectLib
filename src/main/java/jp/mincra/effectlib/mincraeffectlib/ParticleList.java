package jp.mincra.effectlib.mincraeffectlib;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.Location;
import org.bukkit.Particle;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Entity;
import org.bukkit.entity.LivingEntity;
import org.bukkit.entity.Player;

import java.util.*;

public class ParticleList {
    private static final List<String> plist = setParticleList();
    private static final String listAsString = setParticleListForString();
    public static final List<String> SafeList = setSafeParticleList();
    public static final List<String> UnsafeList = setUnSafeParticleList();
    public ParticleList(CommandSender ccaster, String[] args){
        Random random = new Random();
        int r = random.nextInt(78);
        if (ccaster instanceof LivingEntity) {
            Entity caster = (Entity) ccaster;
            if (args.length < 2) {
                caster.sendMessage(ChatColor.GREEN + "[MincraEffectLib]" + ChatColor.BLUE + "List of Particle");
                caster.sendMessage(listAsString);
           } else if (args[1].equals("random")) {
                caster.sendMessage(plist.get(r));
                Particle particle = Particle.valueOf(plist.get(r));
                LivingEntity le = (LivingEntity) caster;
                caster.getLocation().getWorld().spawnParticle(particle, le.getLocation(), 1);
            } else {
                caster.sendMessage("パラメタが不正です。");
            }
        } else {
            if (args.length < 2){
                Bukkit.getLogger().info(ChatColor.GREEN + "[MincraEffectLib]" + ChatColor.BLUE + "List of Particle");
                Bukkit.getLogger().info(String.valueOf(listAsString));
            } else if (args[1].equals("random")){
                Bukkit.getLogger().info(String.valueOf(plist.get(r)));
            } else {
                Bukkit.getLogger().info("パラメタが不正です。");
            }
        }
    }
    private static List<String> setParticleList(){
        return new ArrayList<>(Arrays.asList("ASH", "BARRIER", "BLOCK_CRACK", "BLOCK_DUST", "BUBBLE_COLUMN_UP", "BUBBLE_POP", "CAMPFIRE_COSY_SMOKE", "CAMPFIRE_SIGNAL_SMOKE", "CLOUD", "COMPOSTER", "CRIMSON_SPORE", "CRIT", "CRIT_MAGIC", "CURRENT_DOWN", "DAMAGE_INDICATOR", "DOLPHIN", "DRAGON_BREATH", "DRIP_LAVA", "DRIP_WATER", "DRIPPING_HONEY", "DRIPPING_OBSIDIAN_TEAR", "ENCHANTMENT_TABLE", "END_ROD", "EXPLOSION_HUGE", "EXPLOSION_LARGE", "EXPLOSION_NORMAL", "FALLING_DUST", "FALLING_HONEY", "FALLING_LAVA", "FALLING_NECTAR", "FALLING_OBSIDIAN_TEAR", "FALLING_WATER", "FIREWORKS_SPARK", "FLAME", "FLASH", "HEART", "ITEM_CRACK", "LANDING_HONEY", "LANDING_LAVA", "LANDING_OBSIDIAN_TEAR", "LAVA", "LEGACY_BLOCK_CRACK", "LEGACY_BLOCK_DUST", "LEGACY_FALLING_DUST", "MOB_APPEARANCE", "NAUTILUS", "NOTE", "PORTAL", "REDSTONE", "REVERSE_PORTAL", "SLIME", "SMOKE_LARGE", "SMOKE_NORMAL", "SNEEZE", "SNOW_SHOVEL", "SNOWBALL", "SOUL", "SOUL_FIRE_FLAME", "SPELL", "SPELL_INSTANT", "SPELL_MOB", "SPELL_MOB_AMBIENT", "SPELL_WITCH", "SPIT", "SQUID_INK", "SUSPENDED", "SUSPENDED_DEPTH", "SWEEP_ATTACK", "TOTEM", "TOWN_AURA", "VILLAGER_ANGRY", "VILLAGER_HAPPY", "WARPED_SPORE", "WATER_BUBBLE", "WATER_DROP", "WATER_SPLASH", "WATER_WAKE", "WHITE_ASH"));
    }

    private static List<String> setSafeParticleList(){
        //Unsafe Particle list
        return new ArrayList<>(Arrays.asList("ASH", "BARRIER", "BUBBLE_COLUMN_UP", "BUBBLE_POP", "CAMPFIRE_COSY_SMOKE", "CAMPFIRE_SIGNAL_SMOKE", "CLOUD", "COMPOSTER", "CRIMSON_SPORE", "CRIT", "CRIT_MAGIC", "CURRENT_DOWN", "DAMAGE_INDICATOR", "DOLPHIN", "DRAGON_BREATH", "DRIP_LAVA", "DRIP_WATER", "DRIPPING_HONEY", "DRIPPING_OBSIDIAN_TEAR", "ENCHANTMENT_TABLE", "END_ROD", "EXPLOSION_HUGE", "EXPLOSION_LARGE", "EXPLOSION_NORMAL", "FALLING_HONEY", "FALLING_LAVA", "FALLING_NECTAR", "FALLING_OBSIDIAN_TEAR", "FALLING_WATER", "FIREWORKS_SPARK", "FLAME", "FLASH", "HEART", "ITEM_CRACK", "LANDING_HONEY", "LANDING_LAVA", "LANDING_OBSIDIAN_TEAR", "LAVA", "MOB_APPEARANCE", "NAUTILUS", "NOTE", "PORTAL", "REVERSE_PORTAL", "SLIME", "SMOKE_LARGE", "SMOKE_NORMAL", "SNEEZE", "SNOW_SHOVEL", "SNOWBALL", "SOUL", "SOUL_FIRE_FLAME", "SPELL", "SPELL_INSTANT", "SPELL_MOB", "SPELL_MOB_AMBIENT", "SPELL_WITCH", "SPIT", "SQUID_INK", "SUSPENDED", "SUSPENDED_DEPTH", "SWEEP_ATTACK", "TOTEM", "TOWN_AURA", "VILLAGER_ANGRY", "VILLAGER_HAPPY", "WARPED_SPORE", "WATER_BUBBLE", "WATER_DROP", "WATER_SPLASH", "WATER_WAKE", "WHITE_ASH"));
    }
    private static List<String> setUnSafeParticleList(){
        //Unsafe Particle list
        return new ArrayList<>(Arrays.asList("BLOCK_CRACK", "BLOCK_DUST", "FALLING_DUST", "ITEM_CRACK", "LEGACY_BLOCK_DUST", "LEGACY_FALLING_DUST", "REDSTONE"));
    }
    private static String setParticleListForString(){
        StringBuilder ss = new StringBuilder();
        for (String s : plist) {
            ss.append(s).append(" / ");
        }
        return ss.toString();
    }
    public static Boolean Check(CommandSender _caster,String _particle){
        if (SafeList.contains(_particle)){
            return true;
        } else if (UnsafeList.contains(_particle)){
            new MessageManager(_caster,"未対応のパーティクルです。");
            return false;
        } else {
            new MessageManager(_caster,"パーティクル名が不正です");
            return false;
        }
    }
}
