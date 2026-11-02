import java.util.Scanner;

public class SalaryCalculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter basic salary: ");
        double basicSalary = input.nextDouble();

        System.out.print("Enter allowance: ");
        double allowance = input.nextDouble();

        double initialGrossSalary = basicSalary + allowance;

        System.0out.printf("Initial gross salary = %.2f%n", initialGrossSalary);

        input.close();
    }
}
