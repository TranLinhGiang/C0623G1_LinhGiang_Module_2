package ss16_io_text_file.bai_tap.bai1.Untils;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class FileUtils {
    public static List<String> readFile (String pathName){
        File file = null;
        FileReader fileReader= null;
        BufferedReader bufferedReader= null;
        List<String> result = new ArrayList<>();

        try {

            file = new File(pathName);
            fileReader= new FileReader(file);
            bufferedReader= new BufferedReader(fileReader);

            String str;
            while ((str = bufferedReader.readLine()) != null){
                result.add(str);
            }
            return result;
        }catch (IOException ex){
            ex.printStackTrace();
            return result;
        }finally {
            try {
                if (bufferedReader != null){
                    bufferedReader.close();
                }
            }catch (IOException e){
                e.printStackTrace();
            }
        }
    }
    public  static  void writeFile(String pathName, List<String> data){
        File file = null;
        FileWriter fileWriter= null;
        BufferedWriter bufferedWriter= null;

        try {
            file= new File(pathName);
            fileWriter= new FileWriter(file);
            bufferedWriter= new BufferedWriter(fileWriter);
            for (String d: data) {
                bufferedWriter.write(d);
                bufferedWriter.newLine();
            }
        }catch (IOException ex){
            ex.printStackTrace();
        }finally {
            try {
                if (bufferedWriter != null){
                    bufferedWriter.close();
                }
                if (fileWriter != null){
                    fileWriter.close();
                }
            }catch (IOException ex){
                ex.printStackTrace();
            }
        }
    }

    public static void main(String[] args) {
        System.out.println("Nhap duong dan file read: ");
        Scanner scanner = new Scanner(System.in);
        String path = scanner.nextLine();
        List<String> dataSourceFile = FileUtils.readFile(path);

        String pathCopy= "F:\\C0623G1_LinhGiang_Module_2\\untitled\\src\\ss16_io_text_file\\bai_tap\\bai1\\Data\\targetFile.txt";
        FileUtils.writeFile(pathCopy,dataSourceFile);

    }
}
