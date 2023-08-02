package ss1_java_overview.bai_tap;

import java.util.Scanner;

public class numbersIntoWords {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] arr = {"zero","one", "two", "three", "four", "five", "six", "seven", "eight", "nine"};
        int number;
        System.out.println(" Enter number ");
        number = scanner.nextInt();
        if (number < 10 && number >= 0) {
           for(int i=0;i<arr.length;i++){
               if(number==i){
                   System.out.println(arr[i]);
               }
           }
        }
    if(number>13 && number<20){
        for (int i=4;i<arr.length;i++){
                System.out.println(arr[i]+"teen");
            }
        }
    if(number>=10 && number<=13){
        switch (number){
            case 10:
                System.out.println("ten");
                break;
            case 11:
                System.out.println("eleven");
                break;
            case 12:
                System.out.println("twelve");
                break;
            case 13:
                System.out.println("thirteen");
        }
    }
        }




    }
