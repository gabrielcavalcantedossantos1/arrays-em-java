package arrays.modificarArray;

import java.util.Arrays;

public class Matrizes {

    public static void main(String[] args) {
        int[][] matrizes = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };

        for (int[] matriz : matrizes) {
            System.out.println(Arrays.toString(matriz));
        }
    }
}
