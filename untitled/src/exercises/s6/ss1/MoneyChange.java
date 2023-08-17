package exercises.s6.ss1;

import ss1_java_overview.thuc_hanh.SystemTime;

import java.util.Scanner;

public class MoneyChange {
    public static void main(String[] args) {
        double vnd = 23000;
        double usd;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter usd: ");
        usd = scanner.nextDouble();

        double rate = usd * vnd;

        System.out.println("usd to vnd: " + rate + "vnd");
        System.out.println("vnd to usd: " + rate / 23000 + "usd");
    }
}
