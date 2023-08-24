package ss19_string_regex.thuc_hanh.bai2;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class AccountExample {
    private  static final String ACCOUNT_REGEX="^[_a-z0-9]{6,}$";
    public AccountExample(){
    }
    public boolean validate(String regex){
        Pattern pattern= Pattern.compile(ACCOUNT_REGEX);
        Matcher matcher= pattern.matcher(regex);
        return matcher.matches();
    }
    private static AccountExample accountExample;
    private static final String[] validAccount= new String[]{"123abc_","123abc_","123abc_","abcdefg"};
    private static final String[] invalidAccount= new String[]{".@","12345","1234_","abcde "};

    public static void main(String[] args) {
        accountExample = new AccountExample();
        for (String account: validAccount) {
            boolean isValid = accountExample.validate(account);
            System.out.println("Account is" + account+"is valid: "+ isValid);
        }
        for (String account: invalidAccount) {
            boolean isValid= accountExample.validate(account);
            System.out.println("Account is" +account+ "is valid: "+ isValid);
        }
    }
}
