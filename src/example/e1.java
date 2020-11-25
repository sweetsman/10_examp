package example;
//class TestLoanClass
import java.util.Scanner;
public class e1 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter annual interest rate, for example, 8.2S:");
        double annualInterestRate = input.nextDouble();
        System.out.print("Enter number of years as an integer:");
        int numberOfYears = input.nextInt();
        System.out.print("Enter loan amount, for example, 120000.95:");
        double loanAmount = input.nextDouble();
        e2 loan = new e2(annualInterestRate, numberOfYears, loanAmount);
        System.out.printf("The loan was created on %s\n" +
                "The monthly payment is %.2f\nThe total payment is %.2f\n",
                loan.getLoanDate().toString(),
                loan.getMonthlyPayment(),loan.getTotalPayment());
    }
}
