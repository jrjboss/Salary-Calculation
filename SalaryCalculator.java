import java.util.Scanner;

public class SalaryCalculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        final double BONUS = 100.00; // OMR 100 bonus for every staff member

        System.out.print("Enter basic salary: ");
        double basicSalary = input.nextDouble();

        System.out.print("Enter allowance: ");
        double allowance = input.nextDouble();

        double initialGrossSalary = basicSalary + allowance;
        double updatedGrossSalary = initialGrossSalary + BONUS;

        System.out.printf("Initial gross salary: %.2f OMR%n", initialGrossSalary);
        System.out.printf("Bonus: %.2f OMR%n", BONUS);
        System.out.printf("Updated gross salary: %.2f OMR%n", updatedGrossSalary);

        input.close();
    }
}
