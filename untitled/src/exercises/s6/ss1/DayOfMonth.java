package exercises.s6.ss1;

import ss1_java_overview.thuc_hanh.SystemTime;

import java.util.Scanner;

public class DayOfMonth {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter day: ");
        int month;
        month = scanner.nextInt();

        switch (month){
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                System.out.println("the month 31 day");
                break;
            case 2:
                System.out.println("the month 28-29 day");
                break;
            case 4:
            case 6:
            case 9:
            case 11:
                System.out.println("the month 30 day");
            default:
                System.out.println("please enter:  ");
        }
    }
}
