//linda türkmen
//this program finds Peak using Greedy Algorithm

import java.util.Random;

public class PeakFinder2D {
    int[][] a;
    int nrow, ncol;
    int imax = 0;

    public PeakFinder2D(int row, int col){
        nrow = row;
        ncol = col;
        a = new int[nrow][ncol];
        Random r = new Random();
        a[nrow][ncol] = r.nextInt();
    }

    public int findMax(int[] a){

        for(int i = 0; i < a.length; i++ ){
            if(a[i]>a[imax])
                imax = i;
        }
        return imax;
    }
    public int greedyAlg(){
        int peak = a[0][0];
        for(int row = 0; row< nrow; row++){
            for(int col = 0; col < ncol; col++){

                if(imax == 0 || imax == ncol-1 ){
                    peak=imax;
                }
                if (a[row][col]>=a[row][col+1] && a[row][col]>=a[row+1][col])
                    peak = a[row][col];
                if(a[row][col]<a[row][col+1] && a[row+1][col]<a[row][col+1])
                    peak =a[row][col+1];

                if(a[row][col]<a[row+1][col] && a[row][col+1]<a[row+1][col])
                    peak =a[row+1][col];
            }
        }
        return peak;
    }

    void printArray(){
        PeakFinder2D peakFinder2D = new PeakFinder2D(3,3);
       System.out.println(peakFinder2D);
    }


    static void testGreedyAlg(){
        PeakFinder2D peakFinder2D = new PeakFinder2D(3,3);
        peakFinder2D.greedyAlg();
    }
    public static void main(String[] args)
    {
        System.out.println(testGreedyAlg());
    }
}
