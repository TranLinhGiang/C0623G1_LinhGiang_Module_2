package ss20_mvc_case_study_module2.utils;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class FileUtils {
    public static List<String> readFile (String path){  // tạo một list để đọc file.
        List<String> strings= new ArrayList<>();
        try {
            BufferedReader bufferedReader= new BufferedReader(new FileReader(path));
            String str;
            while ((str = bufferedReader.readLine()) != null ){
                strings.add(str);
            }
        } catch (FileNotFoundException e) {
            System.out.println(e.getMessage());
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
        return strings;
    }

    public static void writeFile (String path,List<String> strings){      // tạo ghi file.
        try {
            BufferedWriter bufferedWriter= new BufferedWriter(new FileWriter(path));
            for (String str: strings) {
                bufferedWriter.write(str);
                bufferedWriter.newLine();
            }
            bufferedWriter.close();
        } catch (FileNotFoundException e) {
            System.out.println(e.getMessage());
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }
}
