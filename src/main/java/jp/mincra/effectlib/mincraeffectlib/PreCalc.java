package jp.mincra.effectlib.mincraeffectlib;

public class PreCalc {
    public static double[][][] posMCHs = new double[5][2][20];
    //星形、starのs
    //double[星の各辺][XorZ座標][各辺の20点に分けて表現]
    public static double[][][] posMCHp = new double[5][2][20];
    //五角形、pentagonのp
    //double[五角形の各辺][XorZ座標][各辺の20点に分けて表現]
    public static double[][] posMCHc = new double [2][180];
    //外円と内円、circleのc
    //double[外円or内円][XorZ座標][円周上に180点に分けて表現]
    static void PreCalculation() {
        int ii = 0;
        for(float i=0;i<360;i=i+2F){
            posMCHc[0][ii] = Math.sin(Math.toRadians(i));
            posMCHc[1][ii] = Math.cos(Math.toRadians(i));
            ii ++;
        }
        //
        for(ii=0; ii < 20; ii++){
            posMCHs[0][0][ii] = -0.95 + (0.095 * ii);
            posMCHs[0][1][ii] = 0.309;
            posMCHs[1][0][ii] = 0.95 - (0.0765 * ii);
            posMCHs[1][1][ii] = 0.309 - (0.0559 * ii);
            posMCHs[2][0][ii] = -0.58 + (0.029 * ii);
            posMCHs[2][1][ii] = -0.809 + (0.09045 * ii);
            posMCHs[3][0][ii] = 0 + (0.029 * ii);
            posMCHs[3][1][ii] = 1F - (0.09045 * ii);
            posMCHs[4][0][ii] = 0.5877 - (0.0765F * ii);
            posMCHs[4][1][ii] = -0.809 + (0.0559 * ii);
        }
        //以下から5角形の描画
        for(ii=0; ii < 20; ii++) {
            posMCHp[0][0][ii] = 0.0475 * ii;
            posMCHp[0][1][ii] = 1 - (0.03455 * ii);
            posMCHp[1][0][ii] = 0.95 - (0.0185 * ii);
            posMCHp[1][1][ii] = 0.309 - (0.0559 * ii);
            posMCHp[2][0][ii] = 0.58 - (0.058 * ii);
            posMCHp[2][1][ii] = -0.809;
            posMCHp[3][0][ii] = -0.58 - (0.0185 * ii);
            posMCHp[3][1][ii] = -0.809 + (0.0559 * ii);
            posMCHp[4][0][ii] = -0.95 + (0.0475 * ii);
            posMCHp[4][1][ii] = 0.309 + (0.03455 * ii);
        }
    }
}
