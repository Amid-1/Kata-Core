package oop;

public enum Day {
    MONDAY("Monday", "Понедельник"),
    TUESDAY("Tuesday", "Вторник"),
    WEDNESDAY("Wednesday", "Среда"),
    THURSDAY("Thursday", "Четверг"),
    FRIDAY("Friday", "Пятница"),
    SATURDAY("Saturday", "Суббота"),
    SUNDAY("Sunday", "Воскресенье");

    private final String day;
    private final String translation;

    Day(String day, String translation) {
        this.day = day;
        this.translation = translation;
    }

    public boolean isWeekend() {
        return this == SATURDAY || this == SUNDAY;
    }

    public String getRusName() {
        return translation;
    }

    @Override
    public String toString() {
        return day;
    }

    public static void main(String[] args) {
        for (Day day : Day.values()) {
            System.out.printf("%s (%s) - Выходной: %b%n", day.toString(), day.getRusName(), day.isWeekend());
        }

        // Example of equals using .toString()
        Day someDay = Day.MONDAY;
        if (someDay.toString().equals("Monday")) {
            System.out.println("Это понедельник!");
        }
    }
}

