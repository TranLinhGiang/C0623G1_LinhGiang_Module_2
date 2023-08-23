package ss17_binary_file_serialization.bai_tap.bai2.Untils;

import java.io.Serializable;

public class Student implements Serializable {
    private int id;
    private String name;
    private String classes;
    private double point;

    public Student(int id, String vũ_kiều_anh, String hà_nội, int i) {
    }

    public Student(int id, String name, String classes, double point) {
        this.id = id;
        this.name = name;
        this.classes = classes;
        this.point = point;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getClasses() {
        return classes;
    }

    public void setClasses(String classes) {
        this.classes = classes;
    }

    public double getPoint() {
        return point;
    }

    public void setPoint(double point) {
        this.point = point;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", classes='" + classes + '\'' +
                ", point='" + point + '\'' +
                '}';
    }
}
