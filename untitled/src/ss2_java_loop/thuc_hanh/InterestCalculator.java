package ss2_java_loop.thuc_hanh;

import java.util.Scanner;

public class InterestCalculator {
    public static void main(String[] args) {
        double money = 0;
        int month = 1;
        double interestRate = 1.0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter investment amount: ");
        money = sc.nextDouble();
        System.out.println("Enter number of months: ");
        month = sc.nextInt();
        System.out.println("Enter annual interest rate: ");
        interestRate = sc.nextDouble();
        double total_interest = 0;
        for (int i = 0; i < month; i++) {
            total_interest = money * (interestRate / 100 / 12) * 3;
        }
        System.out.println("Total of interest: "+ total_interest);

    }

}
