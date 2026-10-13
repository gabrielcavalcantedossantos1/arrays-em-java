package arrays.contagemComForEach;

public class Main {
    public static void main(String[] args) {
        char[] letras = {'a', 'e', 'i', 'o', 'u'};

        char letraProcurada = 'i';

        for (char letra : letras) {
            if (letra == letraProcurada) {
                System.out.printf("Letra encontrada: %c", letra);
            }
        }
    }
}
