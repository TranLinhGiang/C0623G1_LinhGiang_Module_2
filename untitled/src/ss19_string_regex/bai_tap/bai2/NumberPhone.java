package ss19_string_regex.bai_tap.bai2;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class NumberPhone {
    private static Pattern pattern;

    private static Matcher matcher;

    private static final String NUMBER_PHONE_REGEX="^[(]84[)]+[-(0]+[0-9]{9}+[)]$";

    public NumberPhone(){
        pattern= Pattern.compile(NUMBER_PHONE_REGEX);
    }
    public boolean validate(String regex){
        matcher= pattern.matcher(regex);
        return matcher.matches();
    }

    public static class TestNumberPhone {
        private static NumberPhone numberPhone;
        public static final String[] validPhoneNumber= new String[]{"(84)-(0978489648)"};
        public static final String[] invalidPhoneNumber= new String[]{"(a8)-(22222222)"," (84)-(22b22222)"," (84)-(9978489648)"};

        public static void main(String[] args) {
            numberPhone= new NumberPhone();
            for (String phone:
                 validPhoneNumber) {
                boolean isValid= numberPhone.validate(phone);
                System.out.println("PhoneNumber: "+ phone + "is valid: "+ isValid);
            }
            for (String phone:
                 invalidPhoneNumber) {
                boolean isValid= numberPhone.validate(phone);
                System.out.println("PhoneNumber: "+ phone + "is valid: "+ isValid);
            }
        }
    }
}
