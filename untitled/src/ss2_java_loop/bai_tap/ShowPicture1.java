package ss2_java_loop.bai_tap;

import java.util.Scanner;

public class ShowPicture1 {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        double height, width;
        System.out.println("Enter height: ");
        height= scanner.nextDouble();
        System.out.println("Enter width: ");
        width= scanner.nextDouble();
        for(double i=0; i<=width;i++){
            for (double j=0; j<=height;j++){
                System.out.print("*");
            }
            System.out.println();
        }

    }
}
