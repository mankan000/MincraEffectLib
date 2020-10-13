package jp.mincra.effectlib.mincraeffectlib.Effects;

import jp.mincra.effectlib.mincraeffectlib.LocationManager;
import org.bukkit.ChatColor;
import org.bukkit.Location;
import org.bukkit.Particle;
import org.bukkit.entity.Entity;


public class Basic {

    public Basic(Entity caster, String[] args) {
        //usage: /<command> basic <particle> [self/target] <count>
        LocationManager lm = new LocationManager();
        Location loc = caster.getLocation();
        int count = 10;
        if (args[3]!=null) {
            count = Integer.valueOf(args[3]);
        }
        if (args[2].equals("target")) {
            loc = lm.LookingAtEntity(caster,1D);
        } else {
            loc = lm.CasterFront(caster);
        }
        Particle particle = Particle.valueOf(args[1]);
        if (particle == null) particle = Particle.EXPLOSION_HUGE;
        try{
            loc.getWorld().spawnParticle(particle,loc,count);
        } catch(NullPointerException n){
            caster.sendMessage(ChatColor.GREEN + "[MincraEffectLib]" + ChatColor.RED + "spawnParticle失敗。");
        }
    }
}
