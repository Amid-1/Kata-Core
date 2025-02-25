package genericscollection.programmaystem;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Scanner;

//public class System {
//    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//        String input = scanner.nextLine();
//        String[] numbers = input.split(" ");
//
//        Deque<Integer> deque = new ArrayDeque<>();
//        for (int i = 1; i < numbers.length; i += 2) {
//            deque.addFirst(Integer.parseInt(numbers[i])); // Добавляем в начало (имитируем реверс)
//        }
//
//        for (int number : deque) {
//            System.out.print(number + " ");
//        }
//    }
//}

// Напишите программу, которая прочитает из System.in последовательность целых чисел, разделенных пробелами,
// затем удалит из них все числа, стоящие на четных позициях, и затем выведет получившуюся последовательность
// в обратном порядке в System.out.
//
//Все числа влезают в int. Позиции чисел в последовательности нумеруются с нуля.
//
//Все import объявлены за вас.
//
//Пример ввода: 1 2 3 4 5 6 7 8 9 10
//
//Пример вывода: 10 8 6 4 2
//
//
//
//Требования:
//
//1. Необходимо наличие метода public static void main(String[] args)
//
//2. Программа должна читать данные из консоли
//
//3. Программа должна выводить текст в консоль