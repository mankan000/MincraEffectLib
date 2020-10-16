package jp.mincra.effectlib.mincraeffectlib;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.Location;
import org.bukkit.Particle;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Entity;
import org.bukkit.entity.LivingEntity;

import java.util.*;

public class ParticleList {
    private static final List<String> plist = setParticleList();
    private static final String plist2 = setParticleListForString();
    public ParticleList(CommandSender ccaster, String[] args){
        Random random = new Random();
        int r = random.nextInt(78);
        if (ccaster instanceof LivingEntity) {
            Entity caster = (Entity) ccaster;
            if (args[1].isEmpty()) {
                caster.sendMessage(ChatColor.GREEN + "[MincraEffectLib]" + ChatColor.BLUE + "List of Particle");
                caster.sendMessage(plist2);
           } else if (args[1].equals("random")) {
                caster.sendMessage(plist.get(r));
                Particle particle = Particle.valueOf(plist.get(r));
                LivingEntity le = (LivingEntity) caster;
                caster.getLocation().getWorld().spawnParticle(particle, le.getLocation(), 1);
            } else {
                caster.sendMessage("パラメタが不正です。");
            }
        } else {
            if (args[1].isEmpty()){
                Bukkit.getLogger().info(plist.get(r));
                Particle particle = Particle.valueOf(plist.get(r));
                Bukkit.getLogger().info(String.valueOf(particle));
            } else if (args[1].equals("random")){
                Bukkit.getLogger().info(String.valueOf(plist));
            } else {
                Bukkit.getLogger().info("パラメタが不正です。");
            }
        }
    }
    private static List<String> setParticleList(){
        return new ArrayList<>(Arrays.asList("ASH", "BARRIER", "BLOCK_CRACK", "BLOCK_DUST", "BUBBLE_COLUMN_UP", "BUBBLE_POP", "CAMPFIRE_COSY_SMOKE", "CAMPFIRE_SIGNAL_SMOKE", "CLOUD", "COMPOSTER", "CRIMSON_SPORE", "CRIT", "CRIT_MAGIC", "CURRENT_DOWN", "DAMAGE_INDICATOR", "DOLPHIN", "DRAGON_BREATH", "DRIP_LAVA", "DRIP_WATER", "DRIPPING_HONEY", "DRIPPING_OBSIDIAN_TEAR", "ENCHANTMENT_TABLE", "END_ROD", "EXPLOSION_HUGE", "EXPLOSION_LARGE", "EXPLOSION_NORMAL", "FALLING_DUST", "FALLING_HONEY", "FALLING_LAVA", "FALLING_NECTAR", "FALLING_OBSIDIAN_TEAR", "FALLING_WATER", "FIREWORKS_SPARK", "FLAME", "FLASH", "HEART", "ITEM_CRACK", "LANDING_HONEY", "LANDING_LAVA", "LANDING_OBSIDIAN_TEAR", "LAVA", "LEGACY_BLOCK_CRACK", "LEGACY_BLOCK_DUST", "LEGACY_FALLING_DUST", "MOB_APPEARANCE", "NAUTILUS", "NOTE", "PORTAL", "REDSTONE", "REVERSE_PORTAL", "SLIME", "SMOKE_LARGE", "SMOKE_NORMAL", "SNEEZE", "SNOW_SHOVEL", "SNOWBALL", "SOUL", "SOUL_FIRE_FLAME", "SPELL", "SPELL_INSTANT", "SPELL_MOB", "SPELL_MOB_AMBIENT", "SPELL_WITCH", "SPIT", "SQUID_INK", "SUSPENDED", "SUSPENDED_DEPTH", "SWEEP_ATTACK", "TOTEM", "TOWN_AURA", "VILLAGER_ANGRY", "VILLAGER_HAPPY", "WARPED_SPORE", "WATER_BUBBLE", "WATER_DROP", "WATER_SPLASH", "WATER_WAKE", "WHITE_ASH"));
    }

    private static String setParticleListForString(){
        StringBuilder ss = new StringBuilder();
        for (String s : plist) {
            ss.append(s).append(" / ");
        }
        return ss.toString();
    }
}
