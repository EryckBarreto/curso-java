import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        char resposta;
        do {
            System.out.print("Digite a temperatura em Celsius: ");
            double temperaturaEmCelsius = sc.nextDouble();
            double Fahrenheit = 9 * temperaturaEmCelsius / 5 + 32;
            System.out.println("Equivalente em Fahrenheit: " + Fahrenheit);
            System.out.println("Deseja repetir (s/n)? ");
            resposta = sc.next().charAt(0);
        } while (resposta != 'n');

        sc.close();

    }
}