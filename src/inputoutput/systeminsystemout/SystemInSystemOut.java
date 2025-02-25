package inputoutput.systeminsystemout;

import java.util.Scanner;

public class SystemInSystemOut {

    public static void main(String[] args) {
        // Создаем Scanner для чтения ввода с System.in
        Scanner scanner = new Scanner(System.in);

        double sum = 0.0;

        // Читаем входной поток, пока есть новые данные
        while (scanner.hasNext()) {
            String token = scanner.next();
            try {
                // Преобразуем строку в число и добавляем к сумме
                sum += Double.parseDouble(token);
            } catch (NumberFormatException e) {
                // Игнорируем слова, которые не являются числами
            }
        }

        // Выводим результат с точностью до 6 знаков после запятой
        System.out.printf("%.6f\n", sum);

        // Закрываем scanner
        scanner.close();
    }

    //public class Main {
    //    public static void main(String[] args) {
    //        Scanner scanner = new Scanner(System.in);
    //        double sum = 0;
    //        while (scanner.hasNext()) {
    //            String token = scanner.next();
    //            if (token.matches("-?\\d*\\.?\\d+([eE][-+]?\\d+)?")) {  // Регулярное выражение для вещественных чисел
    //                sum += Double.valueOf(token);  // Преобразуем в Double и добавляем к сумме
    //            }
    //        }
    //        System.out.printf("%.6f\n", sum);  // Выводим результат с точностью до 6 знаков
    //    }
    //}

}


