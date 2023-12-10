import java.util.regex.Pattern;

public class UkrainianPhoneNumberValidator {
    public static void main(String[] args) {
        String phoneNumber = "+380636521988";

        boolean isValid = isValidUkrainianPhoneNumber(phoneNumber);

        if (isValid) {
            System.out.println("Number " + phoneNumber + " is ukrainian valid phone number.");
        } else {
            System.out.println("Number " + phoneNumber + " is not a valid Ukrainian number.");
        }
    }

    public static boolean isValidUkrainianPhoneNumber(String phoneNumber) {
        String regex = "\\+380\\d{9}";

        return Pattern.matches(regex, phoneNumber);
    }
}
