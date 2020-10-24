package jp.mincra.effectlib.mincraeffectlib.Effects;

import jp.mincra.effectlib.mincraeffectlib.PreCalc;
import org.bukkit.Bukkit;
import org.bukkit.Location;
import org.bukkit.Particle;
import org.bukkit.entity.Entity;
import org.bukkit.plugin.Plugin;
import org.bukkit.plugin.java.JavaPlugin;
import org.bukkit.scheduler.BukkitRunnable;
import org.bukkit.scheduler.BukkitTask;

public class MagicCircleHorizonAnimation extends BukkitRunnable{
    private float _radius ;
    private float _radius2 ;
    private float p;
    private Location loc;
    private Particle particle;
    private int counter;

    public MagicCircleHorizonAnimation(Entity _caster, String _particle) {
        this.particle = Particle.valueOf(_particle);
        this.loc = _caster.getLocation();
        this._radius = 1.6F;
        this._radius2 = (float) (_radius * 1.25);
        this.p = 1.2F;
        this.counter = 0;
    }
    @Override
    public void run() {
        int sub_counter;
        for (int i = 0; i<9 ; i++){
            //外周の円は点を180個用意してあるため、1tickあたり9点を表示
            sub_counter = counter * 9 + i;
            loc.getWorld().spawnParticle(particle, loc.getX() + PreCalc.posMCHc[1][sub_counter] * _radius, loc.getY() + p, loc.getZ() + PreCalc.posMCHc[2][sub_counter] * _radius, 1, 0, 0, 0, 0);
            loc.getWorld().spawnParticle(particle, loc.getX() + PreCalc.posMCHc[1][sub_counter] * _radius2, loc.getY() + p, loc.getZ() + PreCalc.posMCHc[2][sub_counter] * _radius2, 1, 0, 0, 0, 0);
        }
        loc.getWorld().spawnParticle(particle, loc.getX() + PreCalc.posMCHs[1][1][counter] * _radius, loc.getY() + p, loc.getZ() + PreCalc.posMCHs[1][2][counter] * _radius, 1, 0, 0, 0, 0);
        loc.getWorld().spawnParticle(particle, loc.getX() + PreCalc.posMCHs[2][1][counter] * _radius, loc.getY() + p, loc.getZ() + PreCalc.posMCHs[2][2][counter] * _radius, 1, 0, 0, 0, 0);
        loc.getWorld().spawnParticle(particle, loc.getX() + PreCalc.posMCHs[3][1][counter] * _radius, loc.getY() + p, loc.getZ() + PreCalc.posMCHs[3][2][counter] * _radius, 1, 0, 0, 0, 0);
        loc.getWorld().spawnParticle(particle, loc.getX() + PreCalc.posMCHs[4][1][counter] * _radius, loc.getY() + p, loc.getZ() + PreCalc.posMCHs[4][2][counter] * _radius, 1, 0, 0, 0, 0);
        loc.getWorld().spawnParticle(particle, loc.getX() + PreCalc.posMCHs[5][1][counter] * _radius, loc.getY() + p, loc.getZ() + PreCalc.posMCHs[5][2][counter] * _radius, 1, 0, 0, 0, 0);
        loc.getWorld().spawnParticle(particle, loc.getX() + PreCalc.posMCHp[1][1][counter] * _radius, loc.getY() + p, loc.getZ() + PreCalc.posMCHp[1][2][counter] * _radius, 1, 0, 0, 0, 0);
        loc.getWorld().spawnParticle(particle, loc.getX() + PreCalc.posMCHp[2][1][counter] * _radius, loc.getY() + p, loc.getZ() + PreCalc.posMCHp[2][2][counter] * _radius, 1, 0, 0, 0, 0);
        loc.getWorld().spawnParticle(particle, loc.getX() + PreCalc.posMCHp[3][1][counter] * _radius, loc.getY() + p, loc.getZ() + PreCalc.posMCHp[3][2][counter] * _radius, 1, 0, 0, 0, 0);
        loc.getWorld().spawnParticle(particle, loc.getX() + PreCalc.posMCHp[4][1][counter] * _radius, loc.getY() + p, loc.getZ() + PreCalc.posMCHp[4][2][counter] * _radius, 1, 0, 0, 0, 0);
        loc.getWorld().spawnParticle(particle, loc.getX() + PreCalc.posMCHp[5][1][counter] * _radius, loc.getY() + p, loc.getZ() + PreCalc.posMCHp[5][2][counter] * _radius, 1, 0, 0, 0, 0);
        counter++;
        if (counter == 20){
            //20フレーム実行したら最後に円を表示して終了
            for (int i = 0; i<180; i++){
                loc.getWorld().spawnParticle(particle, loc.getX() + PreCalc.posMCHc[1][i] * _radius, loc.getY() + p, loc.getZ() + PreCalc.posMCHc[2][i] * _radius, 1, 0, 0, 0, 0);
                loc.getWorld().spawnParticle(particle, loc.getX() + PreCalc.posMCHc[1][i] * _radius2, loc.getY() + p, loc.getZ() + PreCalc.posMCHc[2][i] * _radius2, 1, 0, 0, 0, 0);
            }
            for (int i = 0; i<20; i++){
                loc.getWorld().spawnParticle(particle, loc.getX() + PreCalc.posMCHs[1][1][i] * _radius, loc.getY() + p, loc.getZ() + PreCalc.posMCHs[1][2][i] * _radius, 1, 0, 0, 0, 0);
                loc.getWorld().spawnParticle(particle, loc.getX() + PreCalc.posMCHs[2][1][i] * _radius, loc.getY() + p, loc.getZ() + PreCalc.posMCHs[2][2][i] * _radius, 1, 0, 0, 0, 0);
                loc.getWorld().spawnParticle(particle, loc.getX() + PreCalc.posMCHs[3][1][i] * _radius, loc.getY() + p, loc.getZ() + PreCalc.posMCHs[3][2][i] * _radius, 1, 0, 0, 0, 0);
                loc.getWorld().spawnParticle(particle, loc.getX() + PreCalc.posMCHs[4][1][i] * _radius, loc.getY() + p, loc.getZ() + PreCalc.posMCHs[4][2][i] * _radius, 1, 0, 0, 0, 0);
                loc.getWorld().spawnParticle(particle, loc.getX() + PreCalc.posMCHs[5][1][i] * _radius, loc.getY() + p, loc.getZ() + PreCalc.posMCHs[5][2][i] * _radius, 1, 0, 0, 0, 0);
                loc.getWorld().spawnParticle(particle, loc.getX() + PreCalc.posMCHp[1][1][i] * _radius, loc.getY() + p, loc.getZ() + PreCalc.posMCHp[1][2][i] * _radius, 1, 0, 0, 0, 0);
                loc.getWorld().spawnParticle(particle, loc.getX() + PreCalc.posMCHp[2][1][i] * _radius, loc.getY() + p, loc.getZ() + PreCalc.posMCHp[2][2][i] * _radius, 1, 0, 0, 0, 0);
                loc.getWorld().spawnParticle(particle, loc.getX() + PreCalc.posMCHp[3][1][i] * _radius, loc.getY() + p, loc.getZ() + PreCalc.posMCHp[3][2][i] * _radius, 1, 0, 0, 0, 0);
                loc.getWorld().spawnParticle(particle, loc.getX() + PreCalc.posMCHp[4][1][i] * _radius, loc.getY() + p, loc.getZ() + PreCalc.posMCHp[4][2][i] * _radius, 1, 0, 0, 0, 0);
                loc.getWorld().spawnParticle(particle, loc.getX() + PreCalc.posMCHp[5][1][i] * _radius, loc.getY() + p, loc.getZ() + PreCalc.posMCHp[5][2][i] * _radius, 1, 0, 0, 0, 0);
            }
            this.cancel();
        }
    }
}


