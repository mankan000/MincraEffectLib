package jp.mincra.effectlib.mincraeffectlib.Effects;

import jp.mincra.effectlib.mincraeffectlib.PreCalc;
import org.bukkit.Location;
import org.bukkit.Particle;
import org.bukkit.entity.Entity;

public class MagicCircleHorizon {
    private Particle particle;
    private Location loc;
    public MagicCircleHorizon(Entity caster, String _particle) {
        particle = Particle.valueOf(_particle);
        loc = caster.getLocation();
        float _radius = 1.6F;
        float _radius2 = _radius * 1.25F;
        float p = 0.2F;
        //BukkitTask task=new Magicsquare(player,s,kakeru,kakeru2,kakeru3,p,loc).runTaskLater(this,40);
        //BukkitTask task2=new Magicsquare2(player,s,kakeru,kakeru2,kakeru3,p,loc).runTaskLater(this,40);
        //BukkitTask task3=new Magicsquare3(player,s,kakeru,kakeru2,kakeru3,p,loc).runTaskLater(this,40);
        for (int i = 0; i<180; i++){
            loc.getWorld().spawnParticle(particle, loc.getX() + PreCalc.posMCHc[0][i] * _radius, loc.getY() + p, loc.getZ() + PreCalc.posMCHc[1][i] * _radius, 1, 0, 0, 0, 0);
            loc.getWorld().spawnParticle(particle, loc.getX() + PreCalc.posMCHc[0][i] * _radius2, loc.getY() + p, loc.getZ() + PreCalc.posMCHc[1][i] * _radius2, 1, 0, 0, 0, 0);
        }
        for (int i = 0; i<20; i++){
            loc.getWorld().spawnParticle(particle, loc.getX() + PreCalc.posMCHs[0][0][i] * _radius, loc.getY() + p, loc.getZ() + PreCalc.posMCHs[0][1][i] * _radius, 1, 0, 0, 0, 0);
            loc.getWorld().spawnParticle(particle, loc.getX() + PreCalc.posMCHs[1][0][i] * _radius, loc.getY() + p, loc.getZ() + PreCalc.posMCHs[1][1][i] * _radius, 1, 0, 0, 0, 0);
            loc.getWorld().spawnParticle(particle, loc.getX() + PreCalc.posMCHs[2][0][i] * _radius, loc.getY() + p, loc.getZ() + PreCalc.posMCHs[2][1][i] * _radius, 1, 0, 0, 0, 0);
            loc.getWorld().spawnParticle(particle, loc.getX() + PreCalc.posMCHs[3][0][i] * _radius, loc.getY() + p, loc.getZ() + PreCalc.posMCHs[3][1][i] * _radius, 1, 0, 0, 0, 0);
            loc.getWorld().spawnParticle(particle, loc.getX() + PreCalc.posMCHs[4][0][i] * _radius, loc.getY() + p, loc.getZ() + PreCalc.posMCHs[4][1][i] * _radius, 1, 0, 0, 0, 0);
            loc.getWorld().spawnParticle(particle, loc.getX() + PreCalc.posMCHp[0][0][i] * _radius, loc.getY() + p, loc.getZ() + PreCalc.posMCHp[0][1][i] * _radius, 1, 0, 0, 0, 0);
            loc.getWorld().spawnParticle(particle, loc.getX() + PreCalc.posMCHp[1][0][i] * _radius, loc.getY() + p, loc.getZ() + PreCalc.posMCHp[1][1][i] * _radius, 1, 0, 0, 0, 0);
            loc.getWorld().spawnParticle(particle, loc.getX() + PreCalc.posMCHp[2][0][i] * _radius, loc.getY() + p, loc.getZ() + PreCalc.posMCHp[2][1][i] * _radius, 1, 0, 0, 0, 0);
            loc.getWorld().spawnParticle(particle, loc.getX() + PreCalc.posMCHp[3][0][i] * _radius, loc.getY() + p, loc.getZ() + PreCalc.posMCHp[3][1][i] * _radius, 1, 0, 0, 0, 0);
            loc.getWorld().spawnParticle(particle, loc.getX() + PreCalc.posMCHp[4][0][i] * _radius, loc.getY() + p, loc.getZ() + PreCalc.posMCHp[4][1][i] * _radius, 1, 0, 0, 0, 0);
        }
    }

    public void MagicCircleHorizonOld(Entity caster, String _particle){
        particle = Particle.valueOf(_particle);
        loc = caster.getLocation();
        float kakeru = 1.6F;
        float kakeru2 = kakeru * 1.25F;
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
