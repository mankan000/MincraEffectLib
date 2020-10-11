package jp.mincra.effectlib.mincraeffectlib;

import org.bukkit.Location;
import org.bukkit.entity.Entity;
import org.bukkit.util.Vector;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;


public class LocationManager {
    public Location CasterFront(Entity caster){
        Location loc = caster.getLocation();
        loc.add(CasterEyeDirection(loc).multiply(5));
        return loc;
    }
    public Location LookingAt(Entity caster) {
        Location loc = caster.getLocation();
        Vector cv = CasterEyeDirection(loc);
        Collection<Entity> c = caster.getNearbyEntities(10d,10d,10d);
        Double rad ;
        List<Vector> el = new ArrayList<>();
        Vector v = new Vector(0,0,0) ;
        for(Entity e : c){
            Location l = e.getLocation();
            v.setX(l.getX() - loc.getX());
            v.setY(l.getY() - loc.getY());
            v.setX(l.getZ() - loc.getZ());

        }
        return loc;
    }
    private Vector CasterEyeDirection(Location loc){
        Vector vec = new Vector(0f,0f,1f);
        float anglePitch = loc.getPitch();
        float angleYaw = loc.getYaw();
        vec.rotateAroundX(Math.toRadians(anglePitch));
        vec.rotateAroundY(-Math.toRadians(angleYaw));
        vec.normalize();
        return vec;
    }
}
