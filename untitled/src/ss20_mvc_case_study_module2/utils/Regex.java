package ss20_mvc_case_study_module2.utils;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Regex {
    private static Pattern pattern;

    private static Matcher matcher;

    private static final String IDEMPLOY_REGEX="^NV-[0-9]{4}$";   // ma nhan vien
    private static final String IDCUSTOM_REGEX="^KH-[0-9]{4}$";   // ma khach hang

    private static final String NAMEEMPLOY_REGEX= "^[A-Z][a-z]*(\\s[A-Z][a-z]*)*$"; // ten nhan vien

    private static final String CMNDEMPLOY_REGEX= "^([0-9]|[0-9]{4})[0-9]{8}$"; // so chung minh nhan dan

    private static final String SDTEMPLOY_REGEX= "^0([0-9]{9})$"; //so dien thoai

    private static final String EMAIL_REGEX= "^([a-zA-Z0-9_\\.\\-])+\\@(([a-zA-Z0-9\\-])+\\.)+([a-zA-Z0-9]{2,4})+$"; // email chung

    private static final String GENDER_REGEX= "^(Nam|Nu|LGBT)$";

    private static final String TYPECUSTOMER_REGEX= "^(Diamond|Platinum|Gold|Sliver)$";
    private static final String LEVELEMPLOYEE_REGEX= "^(Trung cap|Cao dang|Dai hoc|Sau dai hoc)$";

    private static final  String POSITION_REGEX="^(Le tan|Phuc vu|Chuyen vien|Giam sat|Quan ly|Giam doc)$";

    public static boolean positionEmployee(String positionEmployee){
        pattern=Pattern.compile(POSITION_REGEX);
        matcher=pattern.matcher(positionEmployee);
        return matcher.matches();
    }

    public static boolean levelEmployee(String levelEmployee){
        pattern=Pattern.compile(LEVELEMPLOYEE_REGEX);
        matcher= pattern.matcher(levelEmployee);
        return matcher.matches();
    }
    public static boolean typeCustomer(String typeCustomer){
        pattern= Pattern.compile(TYPECUSTOMER_REGEX);
        matcher= pattern.matcher(typeCustomer);
        return matcher.matches();
    }
    public static boolean genderEmployeeAndCustomer(String gender){
        pattern= Pattern.compile(GENDER_REGEX);
        matcher=pattern.matcher(gender);
        return matcher.matches();
    }

    public static boolean idEmployeeRegex(String id){
        pattern= Pattern.compile(IDEMPLOY_REGEX);
        matcher= pattern.matcher(id);
        return matcher.matches();
    }
    public static boolean idCustomerRegex(String id){
        pattern= Pattern.compile(IDCUSTOM_REGEX);
        matcher= pattern.matcher(id);
        return matcher.matches();
    }

    public static boolean nameEmployeeRegex(String name){
        pattern= Pattern.compile(NAMEEMPLOY_REGEX);
        matcher=pattern.matcher(name);
        return matcher.matches();
    }
    public static boolean nameCustomerRegex(String name){
        pattern= Pattern.compile(NAMEEMPLOY_REGEX);
        matcher= pattern.matcher(name);
        return  matcher.matches();
    }

    public static boolean identityCardEmployee(String identityCardNumber){
        pattern= Pattern.compile(CMNDEMPLOY_REGEX);
        matcher=pattern.matcher(identityCardNumber);
        return matcher.matches();
    }

    public static boolean identityCardCustomer(String identityCardNumber){
        pattern= Pattern.compile(CMNDEMPLOY_REGEX);
        matcher=pattern.matcher(identityCardNumber);
        return matcher.matches();
    }

    public static boolean phoneNumberEmployee(String phoneNumber){
        pattern=Pattern.compile(SDTEMPLOY_REGEX);
        matcher= pattern.matcher(phoneNumber);
        return matcher.matches();
    }
    public static boolean phoneNumberCustomer(String phoneNumber){
        pattern=Pattern.compile(SDTEMPLOY_REGEX);
        matcher= pattern.matcher(phoneNumber);
        return matcher.matches();
    }
    public static boolean email(String email){
        pattern= Pattern.compile(EMAIL_REGEX);
        matcher= pattern.matcher(email);
        return matcher.matches();
    }
    public static boolean emailCustomer(String email){
        pattern= Pattern.compile(EMAIL_REGEX);
        matcher= pattern.matcher(email);
        return matcher.matches();
    }
}
