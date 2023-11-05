package application;

import entities.Employee;

import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        Employee employee = new Employee();

        System.out.print("Name: ");
        employee.name = sc.nextLine();

        System.out.print("Gross salary: ");
        employee.salary = sc.nextDouble();

        System.out.print("Tax: ");
        employee.tax = sc.nextDouble();

        System.out.println();
        System.out.printf("Employee: %s, $ %.2f", employee.name, employee.salary);

        System.out.println();
        System.out.print("Which percentage to increase salary? ");
        employee.percentageIncreaseSalary = sc.nextDouble();

        System.out.println();
        System.out.println(employee);

    }
}
