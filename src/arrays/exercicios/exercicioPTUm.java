package arrays.exercicios;

import java.lang.reflect.Array;
import java.util.Arrays;

public class exercicioPTUm {
    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 4, 5, 6, 7, 8, 9, 0};
        int[] numsInvertido = new int[nums.length];

        for (int i = 0; i < nums.length; i++) {
            numsInvertido[i] = nums[nums.length - 1 - i];
        }

        System.out.println(Arrays.toString(nums));
        System.out.println(Arrays.toString(numsInvertido));
    }
}
