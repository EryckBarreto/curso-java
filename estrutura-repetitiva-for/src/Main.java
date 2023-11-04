import java.util.Scanner;

public class Main {
    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);
        int numero = sc.nextInt();
        int soma = 0;

        for (int x = 0; x < numero; x++) {
            int numeroFor = sc.nextInt();
            soma += numeroFor;
        }

        System.out.println(soma);

        sc.close();


    }
}