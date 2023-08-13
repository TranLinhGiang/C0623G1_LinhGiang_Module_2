package ss8_mvc.model;

public class Teach extends Person{
    private String major;
    private  String id;

    public Teach(String major) {
        this.major = major;
    }

    public Teach(String id,String name, String birthday, String gender, String major) {
        super(name, birthday, gender);
        this.major = major;
        this.id= id;
    }

    public String getMajor() {
        return major;
    }

    public void setMajor(String major) {
        this.major = major;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }
}
