package arrays.exercicios;

public class Main {
    public static void main(String[] args) {
        int[] nums = {12, 6, 18, 24, 48, 5};

        int limite = 10;

        for (int num : nums) {
            if (num > limite) {
                System.out.printf("Numero maior que %d encontrado: %d%n", limite, num);
            }
        }
    }
}
