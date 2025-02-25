package arithmetik;

public class CharExpression {
    public static void main(String[] args) {
        System.out.println(charExpression(92));
    }

    public static char charExpression(int a) {
        return (char) ('\\' + a);
    } // возвращает символ, соответствующий коду a в таблице ASCII
}
