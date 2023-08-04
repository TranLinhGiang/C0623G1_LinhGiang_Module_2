package ss2_java_loop.bai_tap;

import java.util.Scanner;

public class primeNumberDisplay {
    public static void main(String[] args) {
        int n = 20;
//        n = new Scanner(System.in).nextInt();
        int count = 0;
        int x = 2;
        while (count<n) {
            if (isPrime(x)) {
                System.out.println(x + " ");
                count++;
            }
            if (count == n) {
                break;
            }
            if (x == 2)
                x++;
            else {
                x += 2;
            }
        }
    }
    public static boolean isPrime(int n) {
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }
}
