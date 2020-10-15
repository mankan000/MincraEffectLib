package jp.mincra.effectlib.mincraeffectlib;

import org.jetbrains.annotations.Nullable;
import javax.annotation.Nonnull;

import org.bukkit.ChatColor;
import org.bukkit.Location;
import org.bukkit.Material;
import org.bukkit.block.Block;
import org.bukkit.entity.Entity;
import org.bukkit.entity.LivingEntity;
import org.bukkit.util.Vector;

import java.util.*;


public class LocationManager {

    @Nonnull
    public static Location CasterFront(LivingEntity caster){
        Location loc = caster.getEyeLocation();
        loc.add(CasterEyeDirection(loc).multiply(5));
        return loc;
    }

    @Nonnull
    public static Location LookingAtEntity(LivingEntity caster,@Nullable Double allowance) {
        Location loc = caster.getEyeLocation();
        if (allowance == null) allowance = 1D;
        Vector cv = CasterEyeDirection(loc);
        Collection<Entity> c = caster.getNearbyEntities(10d,10d,10d);
        Double rad ;
        Vector v = new Vector(0,0,0) ;
        for(Entity e : c){
            Location l = e.getLocation();
            v.setX(l.getX() - loc.getX());
            v.setY(l.getY() - loc.getY());
            v.setX(l.getZ() - loc.getZ());
            v.normalize();
            rad = Math.acos(cv.getX() * v.getX() + cv.getY() * v.getY() + cv.getZ() * v.getZ());
            if (rad <= allowance) {
                if (caster.hasPermission("mincra.effectlib.debug"))
                    caster.sendMessage(ChatColor.GREEN + "[MincraEffectLib]" + ChatColor.YELLOW + "LookingAt" + e + "/ Position" + l);
                return l;
            }
        }
        //TargetとなるEntityが定まらなかった場合、見ているブロック付近で再生
        return LookingAtBlock(caster,cv);
    }

    @Nonnull
    public static Location LookingAtBlock(LivingEntity caster, @Nullable Vector cv){
        Location loc = caster.getEyeLocation();
        int dest = 10;
        if (cv == null) cv = CasterEyeDirection(loc);
        Block b = caster.getTargetBlockExact(dest);
        if (b == null) return loc.add(cv.multiply(dest));
        return b.getLocation().add(cv.multiply(-1));
    }

    @Nonnull
    private static Vector CasterEyeDirection(Location loc){
        Vector vec = new Vector(0f,0f,1f);
        float anglePitch = loc.getPitch();
        float angleYaw = loc.getYaw();
        vec.rotateAroundX(Math.toRadians(anglePitch));
        vec.rotateAroundY(-Math.toRadians(angleYaw));
        vec.normalize();
        return vec;
    }


}
