package jp.mincra.effectlib.mincraeffectlib;

public class PreCalc {
    static double posMCH[][][] = new double[10][2][60];
    private static double posMCHc [][] = new double [2][180];
    public void PreCalc() {
        int ii = 0;
        //public float posMCH[][][] = new float[10][2][60];
        //public float posMCHc [][] = new float [2][180];
        for(float i=0;i<360;i=i+2F){
            posMCHc[1][ii] = Math.sin(Math.toRadians(i));
            posMCHc[2][ii] = Math.cos(Math.toRadians(i));
            ii ++;
        }
        //1画
        ii = 0;
        for(float x=-0.95F;x<0.95F;x=x+0.05F){
            posMCH[1][1][ii] = x;
            posMCH[1][2][ii] = 0.309D;
            ii ++;
        }
        //2画
        double y = 0.309D;
        ii = 0;
        for(float x=0.95F;x>-0.58F;x=x-0.05F){
            posMCH[1][1][ii] = x;
            posMCH[1][2][ii] = y;
            ii ++;
            y=y-0.0360D;
        }
        //3画
        y=-0.809D;
        ii = 0;
        for(float x=-0.58F;x<0F;x=x+0.01F){
            posMCH[1][1][ii] = x;
            posMCH[1][2][ii] = y;
            ii ++;
            y=y+0.03007D;
        }
        //4画
        y=1D;
        ii = 0;
        for(float x=0F;x<0.58F;x=x+0.01F){
            posMCH[1][1][ii] = x;
            posMCH[1][2][ii] = y;
            ii ++;
            y=y-0.03007F;
        }
        //5画
        y=-0.809F;
        ii = 0;
        for(float x=0.5877F;x>-0.951F;x=x-0.05F){
            posMCH[1][1][ii] = x;
            posMCH[1][2][ii] = y;
            ii ++;
            y=y+0.0360F;
        }
        //以下から5角形の描画
        //1画
        y=1F;
        ii = 0;
        for(float x=0F;x<0.95F;x=x+0.05F){
            posMCH[1][1][ii] = x;
            posMCH[1][2][ii] = y;
            ii ++;
            y=y-0.0360F;
        }
        //2画
        y=0.309F;
        ii = 0;
        for(float x=0.95F;x>0.58F;x=x-0.01F){
            posMCH[1][1][ii] = x;
            posMCH[1][2][ii] = y;
            ii ++;
            y=y-0.03007F;
        }
        //3画
        ii = 0;
        for(float x=0.58F;x>-0.58F;x=x-0.05F){
            posMCH[1][1][ii] = x;
            posMCH[1][2][ii] = -0.809F;
            ii ++;
        }
        //4画
        y=-0.809F;
        ii = 0;
        for(float x=-0.58F;x>-0.95F;x=x-0.01F){
            posMCH[1][1][ii] = x;
            posMCH[1][2][ii] = y;
            ii ++;
            y=y+0.03007F;
        }
        //5画
        y=0.309F;
        ii = 0;
        for(float x=-0.95F;x<0F;x=x+0.05F){
            posMCH[1][1][ii] = x;
            posMCH[1][2][ii] = y;
            ii ++;
            y=y+0.0360F;
        }
    }
}
