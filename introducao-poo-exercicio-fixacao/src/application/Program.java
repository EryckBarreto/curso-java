package application;

import entities.Account;

import java.util.Locale;
import java.util.Scanner;

public class Program {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter account number: ");
        int clientAccountNumber = sc.nextInt();
        sc.nextLine();
        System.out.print("Enter account holder: ");
        String clientAccountHolder = sc.nextLine();
        System.out.print("Is there a initial deposit (y/n)? ");
        char clientYesOrNoInitialDeposit = sc.next().toLowerCase().charAt(0);

        double clientInitialDeposit = 0;
        if (clientYesOrNoInitialDeposit == 'y') {
            System.out.print("Enter initial deposit value: ");
            clientInitialDeposit = sc.nextDouble();
        }

        Account account = new Account(clientAccountNumber, clientAccountHolder, clientInitialDeposit);

        System.out.println();
        System.out.println("Account data:");
        System.out.println(account);
        System.out.println();

        System.out.print("Enter a deposit value: ");
        double clientDepositValue = sc.nextDouble();
        account.deposit(clientDepositValue);
        System.out.println("Updated account data:");
        System.out.println(account);

        System.out.println();

        System.out.print("Enter a withdraw value: ");
        double clientWithdrawValue = sc.nextDouble();
        account.withdraw(clientWithdrawValue);
        System.out.println("Updated account data:");
        System.out.println(account);

    }

}
