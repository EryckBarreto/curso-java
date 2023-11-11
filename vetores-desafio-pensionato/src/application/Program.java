package application;

import java.util.Locale;
import java.util.Scanner;

public class Program {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        Integer[] vetorNumeroDeQuartos = new Integer[10];
        String[] vetorNomeCliente = new String[10];
        String[] vetorEmailCliente = new String[10];

        System.out.print("How many rooms will be rented? ");
        int numeroDeQuartosAlugados = sc.nextInt();

        for (int i=0; i<numeroDeQuartosAlugados; i++) {
            System.out.println("Rent #" + (i + 1));
            System.out.print("Name: ");
            sc.nextLine();
            String nomeCliente = sc.nextLine();
            System.out.print("Email: ");
            String emailCliente = sc.nextLine();
            System.out.print("Room: ");
            int quartoCliente = sc.nextInt();
            vetorNomeCliente[quartoCliente] = nomeCliente;
            vetorEmailCliente[quartoCliente] = emailCliente;
            vetorNumeroDeQuartos[quartoCliente] = quartoCliente;
        }

        System.out.println("Busy rooms:");

        for (int i=0; i<vetorNumeroDeQuartos.length; i++) {

            if (vetorNumeroDeQuartos[i] != null) {
                System.out.printf("%d: %s, %s%n", i, vetorNomeCliente[i], vetorEmailCliente[i]);
            }


        }

        sc.close();
    }

}