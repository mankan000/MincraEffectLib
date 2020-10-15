package jp.mincra.effectlib.mincraeffectlib;

import org.bukkit.Location;
import org.bukkit.Particle;
import org.bukkit.entity.Entity;
import org.bukkit.entity.LivingEntity;

import java.util.*;

public class ParticleList {
    private static final List<String> plist = setParticleList();
    public ParticleList(Entity caster,String[] args){
        if (args[0].equals("random")) {
            Random random = new Random();
            int r = random.nextInt(78);
            caster.sendMessage(plist.get(r));
            Particle particle = Particle.valueOf(plist.get(r));
            LivingEntity le = (LivingEntity) caster;
            caster.getLocation().getWorld().spawnParticle(particle,LocationManager.CasterFront(le),1);
        } else {
            caster.sendMessage("ASH  /" +
                    "BARRIER  /" +
                    "BLOCK_CRACK  \n" +
                    "BLOCK_DUST  /" +
                    "BUBBLE_COLUMN_UP  /" +
                    "BUBBLE_POP  \n" +
                    "CAMPFIRE_COSY_SMOKE  /" +
                    "CAMPFIRE_SIGNAL_SMOKE  /" +
                    "CLOUD  \n" +
                    "COMPOSTER  /" +
                    "CRIMSON_SPORE  /" +
                    "CRIT  \n" +
                    "CRIT_MAGIC  /" +
                    "CURRENT_DOWN  /" +
                    "DAMAGE_INDICATOR  \n" +
                    "DOLPHIN  /" +
                    "DRAGON_BREATH  /" +
                    "DRIP_LAVA  \n" +
                    "DRIP_WATER  /" +
                    "DRIPPING_HONEY  /" +
                    "DRIPPING_OBSIDIAN_TEAR  \n" +
                    "ENCHANTMENT_TABLE  /" +
                    "END_ROD  /" +
                    "EXPLOSION_HUGE  \n" +
                    "EXPLOSION_LARGE  /" +
                    "EXPLOSION_NORMAL  /" +
                    "FALLING_DUST  \n" +
                    "FALLING_HONEY  /" +
                    "FALLING_LAVA  /" +
                    "FALLING_NECTAR  \n" +
                    "FALLING_OBSIDIAN_TEAR  /" +
                    "FALLING_WATER  /" +
                    "FIREWORKS_SPARK  \n" +
                    "FLAME  /" +
                    "FLASH  /" +
                    "HEART  \n" +
                    "ITEM_CRACK  /" +
                    "LANDING_HONEY  /" +
                    "LANDING_LAVA  \n" +
                    "LANDING_OBSIDIAN_TEAR  /" +
                    "LAVA  /" +
                    "LEGACY_BLOCK_CRACK  \n" +
                    "LEGACY_BLOCK_DUST  /" +
                    "LEGACY_FALLING_DUST  /" +
                    "MOB_APPEARANCE  \n" +
                    "NAUTILUS  /" +
                    "NOTE  /" +
                    "PORTAL  \n" +
                    "REDSTONE  /" +
                    "REVERSE_PORTAL  /" +
                    "SLIME  \n" +
                    "SMOKE_LARGE  /" +
                    "SMOKE_NORMAL  /" +
                    "SNEEZE  \n" +
                    "SNOW_SHOVEL  /" +
                    "SNOWBALL  /" +
                    "SOUL  \n" +
                    "SOUL_FIRE_FLAME  /" +
                    "SPELL  /" +
                    "SPELL_INSTANT  \n" +
                    "SPELL_MOB  /" +
                    "SPELL_MOB_AMBIENT  /" +
                    "SPELL_WITCH  \n" +
                    "SPIT  /" +
                    "SQUID_INK  /" +
                    "SUSPENDED  \n" +
                    "SUSPENDED_DEPTH  /" +
                    "SWEEP_ATTACK  /" +
                    "TOTEM  \n" +
                    "TOWN_AURA  /" +
                    "VILLAGER_ANGRY  /" +
                    "VILLAGER_HAPPY  \n" +
                    "WARPED_SPORE  /" +
                    "WATER_BUBBLE  /" +
                    "WATER_DROP  \n" +
                    "WATER_SPLASH  \n" +
                    "WATER_WAKE  \n" +
                    "WHITE_ASH");
        }
    }
    private static List<String> setParticleList(){
        return new ArrayList<>(Arrays.asList("ASH", "BARRIER", "BLOCK_CRACK", "BLOCK_DUST", "BUBBLE_COLUMN_UP", "BUBBLE_POP", "CAMPFIRE_COSY_SMOKE", "CAMPFIRE_SIGNAL_SMOKE", "CLOUD", "COMPOSTER", "CRIMSON_SPORE", "CRIT", "CRIT_MAGIC", "CURRENT_DOWN", "DAMAGE_INDICATOR", "DOLPHIN", "DRAGON_BREATH", "DRIP_LAVA", "DRIP_WATER", "DRIPPING_HONEY", "DRIPPING_OBSIDIAN_TEAR", "ENCHANTMENT_TABLE", "END_ROD", "EXPLOSION_HUGE", "EXPLOSION_LARGE", "EXPLOSION_NORMAL", "FALLING_DUST", "FALLING_HONEY", "FALLING_LAVA", "FALLING_NECTAR", "FALLING_OBSIDIAN_TEAR", "FALLING_WATER", "FIREWORKS_SPARK", "FLAME", "FLASH", "HEART", "ITEM_CRACK", "LANDING_HONEY", "LANDING_LAVA", "LANDING_OBSIDIAN_TEAR", "LAVA", "LEGACY_BLOCK_CRACK", "LEGACY_BLOCK_DUST", "LEGACY_FALLING_DUST", "MOB_APPEARANCE", "NAUTILUS", "NOTE", "PORTAL", "REDSTONE", "REVERSE_PORTAL", "SLIME", "SMOKE_LARGE", "SMOKE_NORMAL", "SNEEZE", "SNOW_SHOVEL", "SNOWBALL", "SOUL", "SOUL_FIRE_FLAME", "SPELL", "SPELL_INSTANT", "SPELL_MOB", "SPELL_MOB_AMBIENT", "SPELL_WITCH", "SPIT", "SQUID_INK", "SUSPENDED", "SUSPENDED_DEPTH", "SWEEP_ATTACK", "TOTEM", "TOWN_AURA", "VILLAGER_ANGRY", "VILLAGER_HAPPY", "WARPED_SPORE", "WATER_BUBBLE", "WATER_DROP", "WATER_SPLASH", "WATER_WAKE", "WHITE_ASH"));
    }
}
