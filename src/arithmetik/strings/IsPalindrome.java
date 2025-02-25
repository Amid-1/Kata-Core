package arithmetik.strings;

public class IsPalindrome {
    public static void main(String[] args) {
        String str = "Eva, Can I Stab Bats In A Cave?";
        System.out.println(isPalindrome(str));

    }

    public static boolean isPalindrome(String text) {
        String cleanedText = text.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();
        String reversedText = new StringBuilder(cleanedText).reverse().toString();
        return cleanedText.equals(reversedText);
    }
}
