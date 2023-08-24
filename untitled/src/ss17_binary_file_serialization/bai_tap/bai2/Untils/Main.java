package ss17_binary_file_serialization.bai_tap.bai2.Untils;

import ss16_io_text_file.bai_tap.bai1.Untils.FileUtils;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    /// đọc ghi sang file nhị phân.
    public static void writeDataToFie(String path, List<Student> students) {
        FileOutputStream fos = null;
        ObjectOutputStream oos = null;
        try {
            fos = new FileOutputStream(path);
            oos = new ObjectOutputStream(fos);
            oos.writeObject(students);
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                if (oos != null) {
                    oos.close();

                }
                if (fos != null) {
                    fos.close();

                }
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        }
    }


    // Gọi phương thức writeToFile trong hàm main để ghi danh sách học viên trên ra file có tên là sourceFile.txt
    public static void main(String[] args) {
        List<Student> students = new ArrayList<>();
        students.add(new Student(1, "Nguyen Van A", "Ha Noi", (double) 7.9));
        students.add(new Student(2, "Nguyen Van B", "Da Nang", (double) 7.0));
        students.add(new Student(3, "Nguyen Van C", "Quang Binh", (double) 6.9));
        students.add(new Student(4, "Nguyen Van D", "Hue", (double) 5.9));
        students.add(new Student(5, "Nguyen Van E", "TP.HCM", (double) 9.9));
        writeDataToFie("F:\\C0623G1_LinhGiang_Module_2\\untitled\\src\\ss17_binary_file_serialization\\bai_tap\\bai2\\Data\\sourceFile.txt", students);
        List<Student> studentDataFromFile = readDataFromFile("F:\\C0623G1_LinhGiang_Module_2\\untitled\\src\\ss17_binary_file_serialization\\bai_tap\\bai2\\Data\\sourceFile.txt");
        for (Student student : studentDataFromFile) {
            System.out.println(student);
        }

        System.out.println("Nhập đường dẫn file read: ");
        Scanner scanner = new Scanner(System.in);
        String path = scanner.nextLine();
        List<String> dataSourceFile = FileUtils.readFile(path);

        String pathCopy = "F:\\C0623G1_LinhGiang_Module_2\\untitled\\src\\ss17_binary_file_serialization\\bai_tap\\bai2\\Data\\targetFile.txt";
        FileUtils.writeFile(pathCopy, dataSourceFile);
    }

    // Tạo phương thức readDataFromFile(String path) trong lớp Main để lấy ra danh sách học viên đang có trong file sourceFile.txt
    public static List<Student> readDataFromFile(String path) {
        List<Student> students = new ArrayList<>();
        FileInputStream fis = null;
        ObjectInputStream ois = null;
        try {
            fis = new FileInputStream(path);
            ois = new ObjectInputStream(fis);
            students = (List<Student>) ois.readObject();

        } catch (Exception ex) {
            ex.printStackTrace();
        } finally {
            try {
                if (fis != null) {
                    fis.close();
                }
                if (ois != null) {
                    ois.close();
                }
            } catch (Exception ex) {
                System.out.println(ex.getMessage());
            }

        }
        return students;
    }

    // sao chep =================================================================
    public static List<String> readFile(String pathName) {
        File file = null;
        FileReader fileReader = null;
        BufferedReader bufferedReader = null;
        List<String> result = new ArrayList<>();

        try {

            file = new File(pathName);
            fileReader = new FileReader(file);
            bufferedReader = new BufferedReader(fileReader);

            String str;
            while ((str = bufferedReader.readLine()) != null) {
                result.add(str);
            }
            return result;
        } catch (IOException ex) {
            ex.printStackTrace();
            return result;
        } finally {
            try {
                if (bufferedReader != null) {
                    bufferedReader.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    public static void WriteFile(String pathName, List<String> data) {
        File file = null;
        FileWriter fileWriter = null;
        BufferedWriter bufferedWriter = null;

        try {
            file = new File(pathName);
            fileWriter = new FileWriter(file);
            bufferedWriter = new BufferedWriter(fileWriter);
            for (String d : data) {
                bufferedWriter.write(d);
                bufferedWriter.newLine();
            }
        } catch (IOException ex) {
            ex.printStackTrace();
        } finally {
            try {
                if (bufferedWriter != null) {
                    bufferedWriter.close();
                }
                if (fileWriter != null) {
                    fileWriter.close();
                }
            } catch (IOException ex) {
                ex.printStackTrace();
            }
        }
    }
}



