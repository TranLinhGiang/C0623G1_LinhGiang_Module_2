package ss20_mvc_case_study_module2.utils;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Regex {
    private static Pattern pattern;

    private static Matcher matcher;

    private static final String IDEMPLOY_REGEX="^NV-[0-9]{4}$";   // ma nhan vien

    private static final String NAMEEMPLOY_REGEX= "^[A-Z][a-z]*(\\s[A-Z][a-z]*)*$"; // ten nhan vien

    private static final String CMNDEMPLOY_REGEX= "^([0-9]|[0-9]{4})[0-9]{8}$"; // so chung minh nhan dan

    private static final String SDTEMPLOY_REGEX= "^0([0-9]{9})$"; //so dien thoai

    private static final String EMAIL_REGEX= "^([a-zA-Z0-9_\\.\\-])+\\@(([a-zA-Z0-9\\-])+\\.)+([a-zA-Z0-9]{2,4})+$"; // email chung


    public static boolean idEmployeeRegex(String id){
        pattern= Pattern.compile(IDEMPLOY_REGEX);
        matcher= pattern.matcher(id);
        return matcher.matches();
    }

    public static boolean nameEmployeeRegex(String name){
        pattern= Pattern.compile(NAMEEMPLOY_REGEX);
        matcher=pattern.matcher(name);
        return matcher.matches();
    }

    public static boolean identityCardEmployee(String identityCardNumber){
        pattern= Pattern.compile(CMNDEMPLOY_REGEX);
        matcher=pattern.matcher(identityCardNumber);
        return matcher.matches();
    }
    public static boolean phoneNumberEmployee(String phoneNumber){
        pattern=Pattern.compile(SDTEMPLOY_REGEX);
        matcher= pattern.matcher(phoneNumber);
        return matcher.matches();
    }
    public static boolean email(String email){
        pattern= Pattern.compile(EMAIL_REGEX);
        matcher= pattern.matcher(email);
        return matcher.matches();
    }
}
