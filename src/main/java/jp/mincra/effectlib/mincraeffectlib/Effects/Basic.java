package jp.mincra.effectlib.mincraeffectlib.Effects;

import jp.mincra.effectlib.mincraeffectlib.LocationManager;
import org.bukkit.ChatColor;
import org.bukkit.Location;
import org.bukkit.Particle;
import org.bukkit.entity.Entity;


public class Basic {

    public Basic(Entity targetentity, String[] args) {
        //usage: /<command> basic <particle> [self/target] <count>
        LocationManager lm = new LocationManager();
        Location loc = targetentity.getLocation();
        int count = 10;
        if (args[2].equals("target")) {
            targetentity.sendMessage(ChatColor.GREEN+"[MincraEffectlib]"+ChatColor.RESET+"未実装です");
        } else {
            loc = lm.CasterFront(targetentity);
        }
        if (args[3]!=null) {
            count = Integer.valueOf(args[3]);
        }
        Particle particle = Particle.valueOf(args[1]);
        loc.getWorld().spawnParticle(particle,loc,count);
    }
}
