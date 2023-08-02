package ss1_java_overview.thuc_hanh;

import java.util.Scanner;

public class LeapYearCalculator {
    public static void main(String[] args) {
        Scanner Scanner = new Scanner(System.in);
        int year;
        System.out.println(" Enter year: ");
        year = Scanner.nextInt();
        if (year % 4 == 0) {
            if (year % 100 == 0) {
                if (year % 400 == 0) {
                    System.out.println("is a leap year" + year);
                } else {
                    System.out.println("is Not a leap year" + year);
                }
            } else {
                System.out.println("is a leap year" + year);
            }
        } else {
            System.out.println("is Not a leap year" + year);
        }
    }
}
