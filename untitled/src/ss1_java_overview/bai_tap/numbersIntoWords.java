package ss1_java_overview.bai_tap;

import java.util.Scanner;

public class numbersIntoWords {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] arr = {"one", "two", "three", "four", "five", "six", "seven", "eight", "nine"};
        int count;
        int number;
        System.out.println(" Enter number ");
        number = scanner.nextInt();
        if (number <= 1000 && number >= 0) {
            switch (number) {
                case 0:
                    System.out.println("zero");
                    break;
                case 1:
                    System.out.println("one");
                    break;
                case 2:
                    System.out.println("two");
                    break;
                case 3:
                    System.out.println("three");
                    break;
                case 4:
                    System.out.println("for");
                    break;
                case 5:
                    System.out.println("five");
                    break;
                case 6:
                    System.out.println("six");
                    break;
                case 7:
                    System.out.println("seven");
                    break;
                case 8:
                    System.out.println("eight");
                    break;
                case 9:
                    System.out.println("nine");
                    break;
                case 10:
                    System.out.println("ten");
                    break;
                case 11:
                    System.out.println("eleven");
                    break;
                case 12:
                    System.out.println("twelve");
                    break;
                case 20:
                    System.out.println("twenty");
                    break;
                case 30:
                    System.out.println("thirty");
                    break;
                case 40:
                    System.out.println("forty");
                    break;
                case 50:
                    System.out.println("fifty");
                    break;
                case 60:
                    System.out.println("sixty");
                    break;
                case 70:
                    System.out.println("seventy");
                    break;
                case 80:
                    System.out.println("eightty");
                    break;
                case 90:
                    System.out.println("ninety");
                    break;
                case 100:
                    System.out.println("one hundered");
                    break;
                case 200:
                    System.out.println("two hundered");
                    break;
                case 300:
                    System.out.println("three hundered");
                    break;
                case 400:
                    System.out.println("four hundered");
                    break;
                case 500:
                    System.out.println("five hundered");
                    break;
                case 600:
                    System.out.println("six hundered");
                    break;
                case 700:
                    System.out.println("seven hundered");
                    break;
                case 800:
                    System.out.println("eight hundered");
                    break;
                case 900:
                    System.out.println("nine hundered");
                    break;

            }


        }
    }
}



