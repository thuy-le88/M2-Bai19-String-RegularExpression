package thuchanh;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class EmailExample {
    private static String emailStandard="^[A-Za-z0-9]+[A-Za-z0-9]*@[A-Za-z0-9]+(\\.[A-Za-z0-9]+)$";
    private Pattern pattern;
    private Matcher matcher;

    public EmailExample() {
        pattern=Pattern.compile(emailStandard);
    }

    public boolean emailValidate(String email) {
        matcher=pattern.matcher(email);
        return matcher.matches();
    }

    public static void main(String[] args) {
        String emailValid1="a@gmail.com";
        String emailValid2="ab@yahoo.com";
        String emailValid3="abc@hotmail.com";
        String emailInvalid1="@gmail.com";
        String emailInvalid2="ab@gmail";
        String emailInvalid3="@#abc@gmail.com";

        EmailExample emailExample=new EmailExample();
        String[] validEmail={emailValid1,emailValid2,emailValid3};
        String[] invalidEmail={emailInvalid1,emailInvalid2,emailInvalid3};

        for (String valid: validEmail) {
            boolean isValid=emailExample.emailValidate(valid);
            System.out.println("Email is "+valid+" is valid: "+isValid);
        }
        System.out.println("-----------");
        for (String invalid: invalidEmail) {
            boolean isInvalid=emailExample.emailValidate(invalid);
            System.out.println("Email is "+invalid+" is valid: "+false);
        }
    }
}
