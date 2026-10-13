package arrays.contagemComForEach;

import java.util.Scanner;

public class Main {

    static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        notas();
    }

    public static void notas() {
        double somaDasNotas = 0;
        int aprovados = 0, reprovados = 0;

        System.out.println("Digite a quantidade de notas: ");
        int quantidade = scanner.nextInt();

        double[] notas = new double[quantidade];

        for (int i = 0; i< quantidade; i ++) {
            System.out.printf("Digite a nota %d°: ", (i +1));
            double nota = scanner.nextDouble();

            notas[i] = nota;
        }

        for (double nota: notas) {
            if(nota>=7) {
                aprovados++;
            } else {
                reprovados++;
            }
            somaDasNotas+=nota;
        }

        System.out.printf("A media da sala é de: %.2f%n",(somaDasNotas/quantidade) );
        System.out.printf("Aprovados: %d%nReprovados: %d",aprovados,reprovados);
    }
}
