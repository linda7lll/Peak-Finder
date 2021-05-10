
//linda türkmen
//this program finds Peak using Divide and Conquer Algorithm-1D


import java.util.Random;

public class PeakFinder2D {

    int[][] a;
    int nrow, ncol;

    public PeakFinder2D(int row, int col) {
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

    public int divideAndConquer1(int startcol, int endcol) {

        int midcol = (startcol + endcol) / 2;
        int imax = findMaxOnCol(midcol);

        if (midcol == 0 || midcol == ncol - 1)
            return imax;
        if (a[imax][midcol] >= a[imax][midcol + 1] && a[imax][midcol] >= a[imax][midcol - 1])
            return a[imax][midcol];

        if (a[imax][midcol + 1] >= a[imax][midcol - 1]) {
            return divideAndConquer1(midcol, endcol);
        } else {
            return divideAndConquer1(startcol, midcol);

        }
    }
 void printArray() {
          PeakFinder2D peakFinder2D = new PeakFinder2D();
          System.out.println(peakFinder2D);
    }


    static int testDivideAndConq1(int startcol, int endcol) {
        PeakFinder2D peakFinder2D = new PeakFinder2D();
        return peakFinder2D.divideAndConquer1(startcol, endcol);

    }

    
    public static void main(String[] args) {


        System.out.println(testDivideAndConq1(0,4));
    }

}

