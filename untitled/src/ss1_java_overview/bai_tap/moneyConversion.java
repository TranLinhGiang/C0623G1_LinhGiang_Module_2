package ss1_java_overview.bai_tap;

import java.util.Scanner;

public class moneyConversion {
    public static void main(String[] args) {
        double vnd = 23000;
        double usd;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter the amount ");
        usd = scanner.nextDouble();
        double exchange = usd * 23000;
        System.out.println("value vnd: " + exchange);


    }
}
