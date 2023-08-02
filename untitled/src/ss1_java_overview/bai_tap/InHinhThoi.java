package ss1_java_overview.bai_tap;

import javax.swing.plaf.IconUIResource;

public class InHinhThoi {
    public static void main(String[] args) {
        for (int i = 1; i <=5; i++) {
            for (int k = 5; k > i; k--) {
                System.out.print(" ");
            }
            System.out.print(i);
        }
        for (int i = 4; i >= 1; i--) {
        for (int k = 5; k > i; k--) {
            System.out.print(" ");
        }
        System.out.print(i);
        for (int j = 1; j <= i; j++) {
            System.out.print("  ");
        }
        System.out.println(i);
    }
}
}