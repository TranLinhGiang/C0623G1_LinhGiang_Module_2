package ss11_dsa_stack_queue.bai_tap.bai4;

import java.util.LinkedList;
import java.util.Queue;

public class Palindrome {
    public static void main(String[] args) {
        String arrST = "Able was I ere I saw elbA";
        System.out.println(arrST);
        Queue queue = new LinkedList();
        for (int i = arrST.length()-1; i >= 0; i--) {
            queue.add(arrST.charAt(i));
        }
        String reverseString = "";
        while (!queue.isEmpty()) {
            reverseString = reverseString + queue.remove();
        }
        if(arrST.equals(reverseString)){
            System.out.println("chuoi doi xung");
        }else {
            System.out.println("khong phai chuoi doi xung");
        }
    }
}
