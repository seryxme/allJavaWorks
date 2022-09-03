package classwork.regexPractice;

public class RegexSample {

    public static boolean isValidPhoneNumber(String phoneNumber) {
        return phoneNumber.matches("[+]234[-]?0?[7-9][0-1]\\d{8}|0[7-9][0-1]\\d{8}");
    }

    public static boolean isValidEmail(String email) {
        return email.matches("[a-z]+\\d*(.[a-z]+)?[a-z]*\\d*@[a-z]+[.][a-z]+");
    }

    public static boolean isValidPassword(String password) {
        return password.matches("");
    }
}
