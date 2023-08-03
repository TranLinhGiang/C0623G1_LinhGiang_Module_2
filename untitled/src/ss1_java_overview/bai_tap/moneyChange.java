package ss1_java_overview.bai_tap;

import java.util.Scanner;

public class moneyChange {
    public static void main(String[] args) {
        double rate = 23000;
        double usd;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Please enter the amount check usd to vnd:");
        usd = scanner.nextDouble();
        double vnd = usd * 23000;
        System.out.print("value vnd: " + vnd);






    }
}
