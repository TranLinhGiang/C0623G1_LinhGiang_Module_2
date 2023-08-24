package ss19_string_regex.bai_tap.bai1;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ClassStudent {
    private static Pattern pattern;

    private static Matcher matcher;

    private static final String CLASS_REGEX="^[C|A|P]+[0-9]{4}+[G|H|I|K]$";

    public ClassStudent(){
        pattern= Pattern.compile(CLASS_REGEX);
    }
    public boolean validate(String regex){
        matcher= pattern.matcher(regex);
        return matcher.matches();
    }

    public static class ClassStudentTest {
        private static ClassStudent classStudent;
        public static final  String[] validClass= new String[]{"C0223G","A0323K"};
        public static final String[] invalidClass= new String[]{"M0318G","P0323A"};

        public static void main(String[] args) {
            classStudent= new ClassStudent();
            for (String classes: validClass) {
                boolean isValid= classStudent.validate(classes);
                System.out.println("Classes is: "+classes+ "is valid: "+ isValid);
            }

            for (String classes: invalidClass) {
                boolean isValid= classStudent.validate(classes);
                System.out.println("Classes is: "+classes+ "is valid: "+ isValid);
            }
        }
    }
}
