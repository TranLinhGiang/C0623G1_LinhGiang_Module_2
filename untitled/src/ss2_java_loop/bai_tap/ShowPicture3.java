package ss2_java_loop.bai_tap;

import java.util.Scanner;

public class ShowPicture3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double height;
        System.out.println("Enter height: ");
        height= scanner.nextDouble();
        for(double i=height; i>=1;i--){
            for(double j=1;j<=i;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
