package baitap;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PhoneNumber {
    private static final String PHONE_NUMBER_STANDARD="^[(]\\d{2}[)][-][(][0]\\d{9}[)]";
    private Pattern pattern;
    private Matcher matcher;

    public PhoneNumber() {
        pattern=Pattern.compile(PHONE_NUMBER_STANDARD);
    }

    public boolean validate(String number) {
        matcher=pattern.matcher(number);
        return matcher.matches();
    }

    public static void main(String[] args) {
        PhoneNumber phoneNumber=new PhoneNumber();
        String validPhoneNumber="(84)-(0978489648)";
        String invalidPhoneNumber="(a8)-(22222222)";

        System.out.println("Phone number "+validPhoneNumber+" is valid: "+phoneNumber.validate(validPhoneNumber));
        System.out.println("Phone number "+invalidPhoneNumber+" is valid: "+phoneNumber.validate(invalidPhoneNumber));
    }
}
