package jp.mincra.effectlib.mincraeffectlib.Effects;

import org.bukkit.ChatColor;
import org.bukkit.Location;
import org.bukkit.Particle;
import org.bukkit.entity.Entity;
import org.bukkit.util.Vector;

import static org.bukkit.Particle.*;

public class Basic {

    public Basic(Entity targetentity, String[] args) {
        //usage: /<command> basic <particle> [self/target] <count>
        Location loc = targetentity.getLocation();
        Vector vec = new Vector(0f,0f,1f);
        float anglePitch = loc.getPitch();
        float angleYaw = loc.getYaw();
        vec.rotateAroundX(Math.toRadians(anglePitch));
        vec.rotateAroundY(-Math.toRadians(angleYaw));
        vec.normalize();
        vec.multiply(5f);
        int count = 10;
        if (args[2].equals("target")) {
            targetentity.sendMessage(ChatColor.GREEN+"[MincraEffectlib]"+ChatColor.RESET+"未実装です");
        } else {
            loc.add(vec);
        }
        if (args[3]!=null) {
            count = Integer.valueOf(args[3]);
        }
        Particle particle = Particle.valueOf(args[1]);
        loc.getWorld().spawnParticle(particle,loc,count);
    }
}
