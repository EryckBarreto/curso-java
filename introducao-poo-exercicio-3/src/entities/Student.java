package entities;

public class Student {

    public String name;
    public double firstQuarter, secondQuarter, thirdQuarter;

    public double finalGrade() {
        return firstQuarter + secondQuarter + thirdQuarter;
    }

    public String passedTheYear() {
        if (finalGrade() < 60) {
            double missing = 60 - finalGrade();
            return "FAILED" + String.format("%nMISSING %.2f POINTS", missing);
        }
        else {
            return "PASS";
        }
    }
    public String toString() {
        return String.format("FINAL GRADE = %.2f%n", finalGrade())
                + passedTheYear();
    }

}
