package entities;

public class Employee {

    public String name;
    public double salary;
    public double tax;
    public double percentageIncreaseSalary;

    public double updatedSalary() {
        return (salary * (1 + percentageIncreaseSalary / 100)) - tax;
    }

    public String toString() {
        return name + ", $ " + String.format("%.2f", updatedSalary());
    }
}
