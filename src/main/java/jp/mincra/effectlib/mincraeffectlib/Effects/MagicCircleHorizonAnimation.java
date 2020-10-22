package jp.mincra.effectlib.mincraeffectlib.Effects;

import jp.mincra.effectlib.mincraeffectlib.PreCalc;
import org.bukkit.Location;
import org.bukkit.Particle;
import org.bukkit.entity.Entity;

public class MagicCircleHorizonAnimation {
    public MagicCircleHorizonAnimation(Entity caster, String _particle){
        Particle particle = Particle.valueOf(_particle);
        Location loc = caster.getLocation();
        float kakeru = 1.6F;
        float kakeru2 = kakeru * 1.25F;
        float p=0.2F;
        //360/2/5
        //20
        //4
        for(int i=0;i<180;i++){
            loc.getWorld().spawnParticle(particle, loc.getX()+ PreCalc.posMCHc[1][i] *kakeru, loc.getY()+p, loc.getZ()+ PreCalc.posMCHc[2][i] *kakeru, 1, 0, 0, 0, 0);
            loc.getWorld().spawnParticle(particle, loc.getX()+ PreCalc.posMCHc[1][i] *kakeru2, loc.getY()+p, loc.getZ()+ PreCalc.posMCHc[1][i] *kakeru2, 1, 0, 0, 0, 0);
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


