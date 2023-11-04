import java.util.Scanner;

public class Main {
    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        String dia;

//        if (x == 1) {
//            dia = "domingo";
//        } else if (x == 2) {
//            dia = "segunda";
//        } else if (x == 3) {
//            dia = "terça";
//        } else if (x == 4) {
//            dia = "quarta";
//        } else if (x == 5) {
//            dia = "quinta";
//        } else if (x == 6) {
//            dia = "sexta";
//        } else if (x == 7) {
//            dia = "sábado";
//        } else {
//            dia = "valor inválido";
//        }

        switch (x) {
            case 1:
                dia = "domingo";
                break;
            case 2:
                dia = "terça";
                break;
            case 3:
                dia = "quarta";
                break;
            case 4:
                dia = "quinta";
                break;
            case 5:
                dia = "sexta";
                break;
            case 6:
                dia = "sábado";
                break;
            case 7:
                dia = "domingo";
                break;
            default:
                dia = "valor inválido";
                break;
        }

        System.out.println("Dia da semana: " + dia);

    }
}