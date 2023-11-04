import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

//        int numero1 = 89;
//        int numero2 = 60;
//
//        System.out.println(numero1 & numero2);
//        System.out.println(numero1 | numero2);
//        System.out.println(numero1 ^ numero2);

        Scanner sc = new Scanner(System.in);

        int mask = 0b00100000;
        int n = sc.nextInt();

        if ((n & mask) != 0) {
            System.out.println("6th bit is true!");
        } else {
            System.out.println("6th bit is false");
        }

        sc.close();

    }
}