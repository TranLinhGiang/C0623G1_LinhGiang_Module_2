package ss1_java_overview.bai_tap;

import java.util.Scanner;

public class numbersIntoWords {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] arr = {"zero", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine"};
        String[] arr2 = {"", "", "twenty", "thirty", "forty", "fifty", "sixty", "seventy", "eighty", "ninety"};
        String[] arr3 = {"", "one hundred", "two hundred", "three hundred", "four hundred", "five hundred", "six hundred", "seven hundred", "eight hundred", "nine hundred"};
        String[] arr4 = {"ten", "eleven", "twelve", "thirteen", "fourteen", "fifteen", "sixteen", "seventeen", "eighteen", "nineteen"};
        int number;
        System.out.println(" Enter number ");
        number = scanner.nextInt();
        int integerTens = number / 10; // số nguyên hàng chục
        int balanceTens = number % 10;  // số dư hàng chục
        int hundreds = number / 100; // số nguyên hàng trăm
        int hundredTens = number % 100; // chia một trăm lấy dư

        System.out.println(integerTens);
        System.out.println(balanceTens);
        if (number >= 0 && number < 10) {
            System.out.println(arr[number]);
        }
        if (number >= 10 && number < 20) {
            System.out.println(arr4[balanceTens]);
        }
        if (number > 20 && number < 100) {
            System.out.println(arr2[integerTens] + " " + arr[balanceTens]);
        }
        if (number > 100 && number < 1000) {
            if (hundredTens > 10 && hundredTens < 20) {
                System.out.println(arr3[hundreds] +" "+ arr4[hundredTens % 10]);
            } else {
                System.out.println(arr3[hundreds] +" "+ arr2[hundredTens / 10] +" "+ arr[hundredTens % 10]);
            }
        }

    }
}