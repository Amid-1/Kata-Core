package oop;

public class Weekday {
    public static boolean isWeekend(String dayName) {
        return dayName.equals("Saturday") || dayName.equals("Sunday");
    }

    public static int weekendCount(String[] days) {
        int count = 0;
        for (String day : days) {
            if (isWeekend(day)) {
                count++;
            }
        }
        return count;
    }

    public static int weekdayCount(String[] days) {
        return days.length - weekendCount(days);
    }

    public static void main(String[] args) {
        String[] days = new String[]{"Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday"};
        System.out.println(isWeekend("Monday")); // false
        System.out.println(weekendCount(days));  // 2
        System.out.println(weekdayCount(days));  // 5
    }
}


// Одним из принципов хорошего кода является DRY — Don’t repeat yourself (не повторяй себя). Его идея
// заключается в том, что при написании кода программист не должен одинаково копировать логику/код в несколько
// разных мест, вместо этого код нужно организовывать на такие логические куски, которые можно будет переиспользовать.
// Задание:
//
//Реализуй три метода:
//
//1. boolean isWeekend(String dayName) — метод принимает строку и отвечает, является ли эта строка выходным днем.
// Выходным днем являются Sunday и Saturday. Реализацию можно взять из прошлых задач.
//
//2. int weekendCount(String[] days) — метод принимает массив строк и возвращает количество выходных дней в этом массиве.
//
//3. int weekdayCount(String[] days) — метод принимает массив строк и возвращает количество будних дней в этом массиве.
