package application;

import java.util.Locale;
import java.util.Scanner;

public class Program {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Quantas pessoas serão digitadas? ");
        int numeroDePessoas = sc.nextInt();

        String[] vetorNome = new String[numeroDePessoas];
        int[] vetorIdade = new int[numeroDePessoas];
        double[] vetorAltura = new double[numeroDePessoas];

        for (int i=0; i < vetorNome.length; i++) {
            System.out.printf("Digite os dados da %dª pessoa: ", i + 1);
            System.out.println();
            sc.nextLine();
            System.out.print("Nome: ");
            vetorNome[i] = sc.nextLine();
            System.out.print("Idade: ");
            vetorIdade[i] = sc.nextInt();
            System.out.print("Altura: ");
            vetorAltura[i] = sc.nextDouble();
        }

        double somaAltura = 0.0;
        int quantidadeMenos16Anos = 0;

        for (int i=0; i < vetorNome.length; i++) {
            somaAltura += vetorAltura[i];

            if (vetorIdade[i] < 16) {
                quantidadeMenos16Anos++;
            }
        }

        double alturaMedia = somaAltura / numeroDePessoas;
        double porcentagemPessoasMenorIdade = (double) quantidadeMenos16Anos / numeroDePessoas * 100;
        System.out.println();
        System.out.printf("Altura média: %.2f", alturaMedia);
        System.out.println();
        System.out.printf("Pessoas com menos de 16 anos: %.2f%%", porcentagemPessoasMenorIdade);
        System.out.println();
        for (int i=0; i < vetorNome.length; i++) {

            if (vetorIdade[i] < 16) {
                System.out.println(vetorNome[i]);
            }
        }


        sc.close();
    }

}