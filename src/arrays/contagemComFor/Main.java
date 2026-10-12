package arrays.contagemComFor;

public class Main {
        public static void main(String[] args) {

            double[] itens = {2.4, 42, 245.2, 234.8};
            double soma = 0;

            for (int i = 0; i < itens.length; i++) {
                System.out.println(itens[i]);
                soma += itens[i];

            }
            System.out.println("a soma é "+soma);
        }
    }


