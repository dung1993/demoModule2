package Demo;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ListNameUser {
    public static final String REGEX_NAME = "^[a-zA-Z0-9 ]{6,}$";
    public static final String REGEX_EMAIL = "^\\w+@\\w+(\\.\\w+){1,2}$";
    public static final String REGEX_NUMBER_PHONE = "^84\\d{8}$";
// ký tự đại diện cho kiểu số là d

    public static void main(String[] args) {
        Pattern pattern = Pattern.compile(REGEX_NAME);
        String input = "Duy123";
//        Pattern pattern = Pattern.compile(REGEX_EMAIL);
//        String input = "Duy123@gmail.com";
//        Pattern pattern = Pattern.compile(REGEX_NUMBER_PHONE);
//        String input = "8412345678";
        Matcher matcher = pattern.matcher(input);
        System.out.println(matcher.matches());
    }
}
