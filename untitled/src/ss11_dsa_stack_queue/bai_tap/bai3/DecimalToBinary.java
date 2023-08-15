package ss11_dsa_stack_queue.bai_tap.bai3;

public class DecimalToBinary {
    public String convertBinary(int num) {
        int Decimal[] = new int[num];
        int index = 0;
        while (num > 0) {
            Decimal[index] = num % 2;
            num = num / 2;
            index++;
        }
        String result = "";
        for (int i = index - 1; i >= 0; i--) {
            result += Decimal[i];
        }
        return result;
    }

    public static void main(String[] args) {
        DecimalToBinary decimalToBinary = new DecimalToBinary();
        String result = decimalToBinary.convertBinary(100);
        System.out.print("the binary of the number you want is : " + result);
    }
}
