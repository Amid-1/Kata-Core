package arithmetik.strings;

import java.util.regex.Pattern;

public class IsGmailOrOutlook {
    public static void main(String[] args) {
        String email = "kata12@gmail.com";
        System.out.println(isGmailOrOutlook("kata12@gmail.com")); // true
        System.out.println(isGmailOrOutlook("@outlook.com")); // false
        System.out.println(isGmailOrOutlook("user@other.com")); // false
        System.out.println(isGmailOrOutlook("user123@outlook.com")); // true
    }

    public static boolean isGmailOrOutlook(String email) {
        Pattern emailPattern = Pattern.compile("^[a-zA-Z0-9]+@(gmail\\.com|outlook\\.com)$");
        return emailPattern.matcher(email).matches();
    }
}
