package application;

import java.util.Locale;
import java.util.Scanner;

public class Program {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Quantos números você vai digitar? ");
        int numerosDigitados = sc.nextInt();
        int[] vetor = new int[numerosDigitados];

        for (int i = 0; i < vetor.length; i++) {
            System.out.print("Digite um número: ");
            vetor[i] = sc.nextInt();
        }

        System.out.println("NUMEROS NEGATIVOS: ");

        for (int i = 0; i < vetor.length; i++) {
            if (vetor[i] < 0) {
                System.out.println(vetor[i]);
            }
        }

        sc.close();
    }

}
