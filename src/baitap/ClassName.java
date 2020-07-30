package baitap;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ClassName {
    private static final String CLASS_NAME_STANDARD="^[ACP]\\d{4}[GHIKLM]$";
    private Pattern pattern;
    private Matcher matcher;

    public ClassName() {
        pattern=Pattern.compile(CLASS_NAME_STANDARD);
    }

    public boolean validate(String name) {
        matcher=pattern.matcher(name);
        return matcher.matches();
    }

    public static void main(String[] args) {
        ClassName className=new ClassName();
        String[] validName={"C0318G","A0246M"};
        String[] invalidName={"M038G","P0@23A"};

        for (String valid: validName) {
            boolean isValid=className.validate(valid);
            System.out.println("Classname "+valid+" is valid: "+isValid);
        }

        for (String invalid: invalidName) {
            boolean isInvalid=className.validate(invalid);
            System.out.println("Classname "+invalid+" is valid: "+isInvalid);
        }
    }
}
