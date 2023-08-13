package ss5_Access_modifier_static_method_static_property.bai_tap;

public class Student {
    private String name = "Join";
    private String classes = "C02";

    public Student() {
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setClasses(String classes) {
        this.classes = classes;
    }


    public static class TestStudent {
        public static void main(String[] args) {
            Student student = new Student();
            student.setName("after retesting the name: " + " " + "Giang");
            student.setClasses("after retesting the class: " + " " + "C0623G1");

        }
    }
}
