package arithmetik.strings;

public class ParseAndPrintNumber {

    public static void main(String[] args) {
        ParseAndPrintNumber parseAndPrintNumber = new ParseAndPrintNumber();
        parseAndPrintNumber.parseAndPrintNumber("111");

    }

    public void parseAndPrintNumber(String str) {
        int number = Integer.parseInt(str);
        System.out.println(number / 2);
    }
}
