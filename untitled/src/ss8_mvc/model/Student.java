package ss8_mvc.model;

public class Student extends Person {
    private String id;
    private String name;
    private String classes;
    private double point;



    public Student() {
    }

    public Student(String id, String name, String birthday, String classes, double point, String gender) {
        super(name,birthday,gender);
        this.id = id;
        this.classes = classes;
        this.point = point;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
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

}
