package thuchanh;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class AccountExample {
    private static String ACCOUNT_STANDARD_FORMAT="^[_a-z0-9]{6,}$";
    private Pattern pattern;
    private Matcher matcher;

    public AccountExample() {
        pattern=Pattern.compile(ACCOUNT_STANDARD_FORMAT);
    }

    public boolean validate(String account) {
        matcher=pattern.matcher(account);
        return matcher.matches();
    }

    public static void main(String[] args) {
        AccountExample accountExample=new AccountExample();
        String[] validAccount={"123abc_","_abc123","______","123456","abcdefg"};
        String[] invalidAccount={".@","12345","1234_","abcde"};

        for (String valid: validAccount) {
            boolean isValid=accountExample.validate(valid);
            System.out.println("Account "+valid+" is valid: "+isValid);
        }
        System.out.println("------------------");;
        for (String invalid: invalidAccount) {
            boolean isInvalid=accountExample.validate(invalid);
            System.out.println("Account "+invalid+" is valid: "+isInvalid);
        }
    }
}
