package ss16_io_text_file.thuc_hanh.bai1;

import java.io.*;
import java.util.Scanner;

public class ReadFileExample {
    public void readFileText (String filePath) throws IOException {
        try {


            File file = new File(filePath);

            if (!file.exists()) {
                throw new FileNotFoundException();
            }
            BufferedReader br = new BufferedReader(new FileReader(file));
            String line = "";
            int sum = 0;
            while ((line = br.readLine()) != null) {
                System.out.println(line);
                sum += Integer.parseInt(line);
            }
            br.close();

            System.out.println("Tổng = " + sum);
        }catch (Exception e){
            System.out.println("file không tồn tại or nội dung có lỗi !");
        }
    }

    public static void main(String[] args) throws IOException {
        System.out.println("Nhập đường dẫn file: ");
        Scanner scanner = new Scanner(System.in);
        String path = scanner.nextLine();

        ReadFileExample readFileEx = new ReadFileExample();
        readFileEx.readFileText(path);
    }
}
