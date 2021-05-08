//linda türkmen
//The program that finds Peak using the Divide and Conquer Algorithm-2D

import java.util.Random;
public class PeakFinder {

    int[][] a;
    int nrow, ncol;

    public PeakFinder(int row, int col) {
        nrow = row;
        ncol = col;
        a = new int[nrow][ncol];
        Random r = new Random();
        a[nrow][ncol] = r.nextInt();
    }


    public int findMaxOnCol(int col) {
        int imax = 0;
        for (int i = 0; i < nrow; i++) {
            if (a[i][col] > a[imax][col]) {
                imax = i;
            }
        }
        return imax;
    }


    public int findMaxOnRow(int row) {
        int imax = 0;
        for (int i = 0; i < ncol; i++) {
            if (a[row][i] > a[row][imax]) {
                imax = i;
            }
        }
        return imax;
    }


    public static int divideAndConquer2(int startrow, int startcol, int endrow, int endcol) {

        int[][] a = new int[0][];
        int mid = (startcol + endcol) / 2;
        int imax = findMaxOnCol(mid);

       
        if (mid == 0 || mid == (startcol + startcol) - 1) ;
        return a[i][mid];

        if (a[imax][mid] >= a[imax][mid + 1] && a[imax][mid] >= a[imax][mid - 1]) //2 tane
            return a[imax][mid];
        if (a[imax][mid] < a[imax][mid - 1])
            return divideAndConquer2(startrow, startcol, endrow, (int) (mid - (double) mid / 2));

        else if (a[imax][mid] < a[imax][mid + 1])

            return divideAndConquer2(startrow, (int) (mid + (double) mid / 2), endrow, endcol);

    }
    void printArray(){
          PeakFinder peakFinder = new PeakFinder(3,3);
          System.out.println(peakFinder);


    }


    static int testDivideAndConq2(int startrow, int startcol, int endrow, int endcol) {
             PeakFinder

      int a1=  divideAndConquer2(startrow, startcol, endrow, (startcol + endcol) / 2);
          return a1;
        
    }

public static void main(String[] args)
    {
        System.out.println(testDivideAndConq2(0,0,4,4));
    }


}