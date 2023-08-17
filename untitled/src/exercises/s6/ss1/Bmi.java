package exercises.s6.ss1;

import java.util.Scanner;

public class Bmi {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double height;
        double weight;
        System.out.println("Enter height: ");
        height= scanner.nextDouble();
        System.out.println("Enter weight: ");
        weight= scanner.nextDouble();
        double bmi= weight/Math.pow(height,2);

        if(bmi < 18.5){
            System.out.println(bmi+ "Underweight");
        } else if (bmi<25.0) {
            System.out.println(bmi+ "Normal");
        } else if (bmi<30.0) {
            System.out.println(bmi+ "Overweight");
        }else {
            System.out.println(bmi+ "Obese");
        }


    }
}
