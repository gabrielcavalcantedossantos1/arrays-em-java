package arrays.modificarArray;

import java.util.Arrays;

public class AddItensAoArray {
    public static void main(String[] args) {
        int[] numeros = {1, 2, 3, 4, 5, 6, 7, 8, 9, 0};

        int[] novoArray = new int[numeros.length + 1];

        System.out.println(Arrays.toString(numeros));
        System.out.println(Arrays.toString(novoArray));

        for (int i = 0; i < numeros.length; i++) {
            novoArray[i] = numeros[i];
        }
        System.out.println(Arrays.toString(novoArray));

        novoArray[novoArray.length -1] = 100;
        System.out.println(Arrays.toString(novoArray));
    }
}
