package jp.mincra.effectlib.mincraeffectlib.Effects;

import org.bukkit.Location;
import org.bukkit.entity.Entity;
import org.bukkit.util.Vector;

public class LocationManager {
    public Location CasterFront(Entity caster){
        Location loc = caster.getLocation();
        Vector vec = new Vector(0f,0f,1f);
        float anglePitch = loc.getPitch();
        float angleYaw = loc.getYaw();
        vec.rotateAroundX(Math.toRadians(anglePitch));
        vec.rotateAroundY(-Math.toRadians(angleYaw));
        vec.multiply(5f);
        loc.add(vec);
        return loc;
    }
}
