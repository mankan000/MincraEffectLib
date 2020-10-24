package jp.mincra.effectlib.mincraeffectlib;

public class PreCalc {
    public static double[][][] posMCHs = new double[5][2][20];
    //starのs
    public static double[][][] posMCHp = new double[5][2][20];
    //pentagonのp
    public static double[][] posMCHc = new double [2][180];
    //circleのc
    static void PreCalculation() {
        int ii = 0;
        //public float posMCH[][][] = new float[10][2][60];
        //public float posMCHc [][] = new float [2][180];
        for(float i=0;i<360;i=i+2F){
            posMCHc[1][ii] = Math.sin(Math.toRadians(i));
            posMCHc[2][ii] = Math.cos(Math.toRadians(i));
            ii ++;
        }
        //
        for(ii=0; ii < 20; ii++){
            posMCHs[1][1][ii] = -0.95 + (0.95 * ii);
            posMCHs[1][2][ii] = 0.309;
            posMCHs[2][1][ii] = 0.95 - (0.0765 * ii);
            posMCHs[2][2][ii] = 0.0309 - (0.0559 * ii);
            posMCHs[3][1][ii] = -0.58 + (0.029 * ii);
            posMCHs[3][2][ii] = -0.809 + (0.09045 * ii);
            posMCHs[4][1][ii] = 0 + (0.029 * ii);
            posMCHs[4][2][ii] = 1F - (0.09045 * ii);
            posMCHs[5][1][ii] = 0.5877 - (0.0765F * ii);
            posMCHs[5][2][ii] = -0.809 + (0.0559 * ii);
        }
        //以下から5角形の描画
        for(ii=0; ii < 20; ii++) {
            posMCHp[1][1][ii] = 0.0475 * ii;
            posMCHp[1][2][ii] = 1 - (0.03455 * ii);
            posMCHp[2][1][ii] = 0.95 - (0.0185 * ii);
            posMCHp[2][2][ii] = 0.309 - (0.03455 * ii);
            posMCHp[3][1][ii] = 0.58 - (0.058 * ii);
            posMCHp[3][2][ii] = -0.809;
            posMCHp[4][1][ii] = -0.58 - (0.0185 * ii);
            posMCHp[4][2][ii] = -0.809 + (0.03455 * ii);
            posMCHp[5][1][ii] = -0.95 + (0.0475 * ii);
            posMCHp[5][2][ii] = 0.309 + (0.03455 * ii);
        }
    }
}
