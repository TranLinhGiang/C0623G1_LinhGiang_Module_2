package ss1_java_overview.thuc_hanh;

import java.util.Scanner;

public class OperatorExpression {
    public static void main(String[] args) {
        float width;
        float height;

        Scanner sacnner = new Scanner(System.in);// khai bao doi tuong Scanner

        System.out.println("Enter width: ");
        width= sacnner.nextFloat();// nhap chieu rong

        System.out.println("Enter height: ");
        height= sacnner.nextFloat();// nhap chieu dai

        float area= width*height;
        System.out.println("area is :"+ area);
    }
}
