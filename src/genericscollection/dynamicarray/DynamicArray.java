package genericscollection.dynamicarray;

import java.util.Arrays;

public class DynamicArray<T> {

    public static final int DEFAULT_SIZE = 10;
    public T[] elements;
    public int size;

    public DynamicArray() {
        this.elements = (T[]) new Object[DEFAULT_SIZE];
        this.size = 0;
    }

    private void grow() {
        int newSize = elements.length * 2; // Увеличиваем размер в 2 раза
        elements = Arrays.copyOf(elements, newSize);
    }

    public void add(T el) {
        if (size == elements.length) {
            grow();
        }
        elements[size++] = el;
    }

    public void remove(int index) {
        if (index < 0 || index >= size) {
            throw new ArrayIndexOutOfBoundsException("Индекс за пределами массива.");
        }
        for (int i = index; i < size - 1; i++) {
            elements[i] = elements[i + 1];
        }
        elements[size - 1] = null;
        size--;
    }

    public T get(int index) {
        if (index < 0 || index >= size) {
            throw new ArrayIndexOutOfBoundsException("Индекс за пределами массива.");
        }
        return elements[index];
    }

    public static void main(String[] args) {
        DynamicArray<Integer> array = new DynamicArray<>();

        array.add(1);
        array.add(2);
        array.add(3);
        System.out.println(array.get(1));

        array.remove(1);
        System.out.println(array.get(1));

        for (int i = 0; i < 15; i++) {
            array.add(i);
        }
        System.out.println(array.get(12));
    }
}




