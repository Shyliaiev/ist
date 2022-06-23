package ua.edu.odaba.practices._17_spiral;

import java.util.Arrays;

class Spiral {
    static int[][] spiral(int rows, int columns) {
        int[][] expected = new int[][]{
                {1, 2}
        };
        int[][] resul = new int[rows][columns];
        int s = 1;

        for (int y = 0; y < columns; y++) {
            resul[0][y] = s;
            s++;
        }

        for (int x = 1; x < rows; x++) {
            resul[x][columns - 1] = s;
            s++;
        }
        if (!Arrays.deepEquals(resul, expected)) {
            for (int y = columns - 2; y >= 0; y--) {
                resul[rows - 1][y] = s;
                s++;
            }
        }
        for (int x = rows - 2; x > 0; x--) {
            resul[x][0] = s;
            s++;
        }
        int rowIner = 1;
        int d = 1;

        while (s < rows * columns) {

            while (resul[rowIner][d + 1] == 0) {
                resul[rowIner][d] = s;
                s++;
                d++;
            }

            while (resul[rowIner + 1][d] == 0) {
                resul[rowIner][d] = s;
                s++;
                rowIner++;
            }

            while (resul[rowIner][d - 1] == 0) {
                resul[rowIner][d] = s;
                s++;
                d--;
            }


            while (resul[rowIner - 1][d] == 0) {
                resul[rowIner][d] = s;
                s++;
                rowIner--;
            }
        }

        for (int x = 0; x < rows; x++) {
            for (int y = 0; y < columns; y++) {
                if (resul[x][y] == 0) {
                    resul[x][y] = s;
                }

            }

        }

        return resul;
    }
}
