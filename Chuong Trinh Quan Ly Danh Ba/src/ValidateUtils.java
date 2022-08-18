import java.util.regex.Pattern;

public class ValidateUtils {
    public static final String PHONE_REGEX = "^[0][1-9]\\d{8}$";
    public static final String EMAIL_REGRX = "^[a-z]+[a-z0-9]*@[a-z]+\\.[a-z]{2,3}$";
    public static boolean isPhoneVaild(String phone) {
        return Pattern.compile(PHONE_REGEX).matcher(phone).matches();
    }

    public static boolean isEmailVaild(String email) {
        return Pattern.compile(EMAIL_REGRX).matcher(email).matches();
    }
}
