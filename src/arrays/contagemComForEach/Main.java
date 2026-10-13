package arrays.contagemComForEach;

public class Main {
    public static void main(String[] args) {
        int[] valores = {1, 2, 4, 1, 6, 36, 77};

        int maiorValor = valores[0];

        for (int valor : valores) {
            System.out.println(valor);
            if (valor > maiorValor) {
                maiorValor = valor;
            }
        }
        System.out.printf("O maior valor é %d%n", maiorValor);
    }
}
