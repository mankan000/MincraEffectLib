package jp.mincra.effectlib.mincraeffectlib.Effects;

import org.bukkit.Location;
import org.bukkit.Particle;
import org.bukkit.entity.Entity;

public class MagicCircleHorizon {
    public void MagicCircleHorizon(Entity caster, String _particle){
        Particle particle = Particle.valueOf(_particle);
        Location loc = caster.getLocation();
        float kakeru=1.6F;
        float kakeru2=2F;
        float p=0.2F;
        //BukkitTask task=new Magicsquare(player,s,kakeru,kakeru2,kakeru3,p,loc).runTaskLater(this,40);
        //BukkitTask task2=new Magicsquare2(player,s,kakeru,kakeru2,kakeru3,p,loc).runTaskLater(this,40);
        //BukkitTask task3=new Magicsquare3(player,s,kakeru,kakeru2,kakeru3,p,loc).runTaskLater(this,40);
        for(float i=0;i<360;i=i+2F){
            loc.getWorld().spawnParticle(particle, loc.getX()+Math.sin(Math.toRadians(i))*kakeru, loc.getY()+p, loc.getZ()+Math.cos(Math.toRadians(i))*kakeru, 1, 0, 0, 0, 0);
        }
		/*for(float i=0;i<360;i=i+0.5F){
			((CraftWorld) player.getWorld()).getHandle().a("enchantmenttable", loc.getX()+Math.sin(Math.toRadians(i))*kakeru3, loc.getY()+p, loc.getZ()+Math.cos(Math.toRadians(i))*kakeru3, 1, 0, 0, 0, 0);
		}*/
        for(float i=0;i<360;i=i+2F){
            loc.getWorld().spawnParticle(particle, loc.getX()+Math.sin(Math.toRadians(i))*kakeru2, loc.getY()+p, loc.getZ()+Math.cos(Math.toRadians(i))*kakeru2, 1, 0, 0, 0, 0);
        }
        //1画
        float y=0.309F;
        for(float x=-0.95F;x<0.95F;x=x+0.05F){
            loc.getWorld().spawnParticle(particle, loc.getX()+x*kakeru, loc.getY()+p, loc.getZ()+y*kakeru, 1, 0, 0, 0, 0);
        }
        //2画
        y=0.309F;
        for(float x=0.95F;x>-0.58F;x=x-0.05F){
            loc.getWorld().spawnParticle(particle, loc.getX()+x*kakeru, loc.getY()+p, loc.getZ()+y*kakeru, 1, 0, 0, 0, 0);
            y=y-0.0360F;
        }
        //3画
        y=-0.809F;
        for(float x=-0.58F;x<0F;x=x+0.01F){
            loc.getWorld().spawnParticle(particle, loc.getX()+x*kakeru, loc.getY()+p, loc.getZ()+y*kakeru, 1, 0, 0, 0, 0);
            y=y+0.03007F;
        }
        //4画
        y=1F;
        for(float x=0F;x<0.58F;x=x+0.01F){
            loc.getWorld().spawnParticle(particle, loc.getX()+x*kakeru, loc.getY()+p, loc.getZ()+y*kakeru, 1, 0, 0, 0, 0);
            y=y-0.03007F;
        }
        //5画
        y=-0.809F;
        for(float x=0.5877F;x>-0.951F;x=x-0.05F){
            loc.getWorld().spawnParticle(particle, loc.getX()+x*kakeru, loc.getY()+p, loc.getZ()+y*kakeru, 1, 0, 0, 0, 0);
            y=y+0.0360F;
        }
        //以下から5角形の描画
        //1画
        y=1F;
        for(float x=0F;x<0.95F;x=x+0.05F){
            loc.getWorld().spawnParticle(particle, loc.getX()+x*kakeru, loc.getY()+p, loc.getZ()+y*kakeru, 1, 0, 0, 0, 0);
            y=y-0.0360F;
        }
        //2画
        y=0.309F;
        for(float x=0.95F;x>0.58F;x=x-0.01F){
            loc.getWorld().spawnParticle(particle, loc.getX()+x*kakeru, loc.getY()+p, loc.getZ()+y*kakeru, 1, 0, 0, 0, 0);
            y=y-0.03007F;
        }
        //3画
        y=-0.809F;
        for(float x=0.58F;x>-0.58F;x=x-0.05F){
            loc.getWorld().spawnParticle(particle, loc.getX()+x*kakeru, loc.getY()+p, loc.getZ()+y*kakeru, 1, 0, 0, 0, 0);
        }
        //4画
        y=-0.809F;
        for(float x=-0.58F;x>-0.95F;x=x-0.01F){
            loc.getWorld().spawnParticle(particle, loc.getX()+x*kakeru, loc.getY()+p, loc.getZ()+y*kakeru, 1, 0, 0, 0, 0);
            y=y+0.03007F;
        }
        //5画
        y=0.309F;
        for(float x=-0.95F;x<0F;x=x+0.05F){
            loc.getWorld().spawnParticle(particle, loc.getX()+x*kakeru, loc.getY()+p, loc.getZ()+y*kakeru, 1, 0, 0, 0, 0);
            y=y+0.0360F;
        }
    }
}
