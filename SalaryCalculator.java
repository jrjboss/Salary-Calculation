import java.util.Scanner;

public class SalaryCalculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter basic salary: ");
        double basicSalary = input.nextDouble();

        System.out.print("Enter allowance: ");
        double allowance = input.nextDouble();

        double grossSalary = basicSalary + allowance;

        System.out.print("Does the staff member have a loan? (yes/no): ");
        input.nextLine(); // consume leftover newline
        String hasLoan = input.nextLine();

        double loanDeduction = 0.0;
        if (hasLoan.trim().equalsIgnoreCase("yes")) {
            System.out.print("Enter current monthly loan deduction: ");
            loanDeduction = input.nextDouble();
        }

        double netSalary = grossSalary - loanDeduction;

        System.out.printf("Gross salary: %.2f OMR%n", grossSalary);
        System.out.printf("Loan deduction: %.2f OMR%n", loanDeduction);
        System.out.printf("Net salary after deduction: %.2f OMR%n", netSalary);

        input.close();
    }
}
