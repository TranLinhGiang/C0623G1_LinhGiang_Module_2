package ss11_dsa_stack_queue.bai_tap.bai3;

public class DecimalToBinary {
    public void convertBinary(int num) {
        int Decimal[] = new int[30];
        int index= 0;
        while (num > 0) {
            Decimal[index++] = num % 2;
            num= num/2;
        }
        for (int i = index; i >=0 ; i--) {
            System.out.println(Decimal[i]);
        }
    }

    public static void main(String[] args) {
        DecimalToBinary decimalToBinary = new DecimalToBinary();
        System.out.print("the binary of 30 is: ");
        decimalToBinary.convertBinary(30);
    }
}
