import java.util.Arrays;

public class MyArrayList<T> {

    private T[] elements;
    private int size;
    private final int DEFAULT_SIZE = 10;

    public MyArrayList() {
        elements = (T[]) new Object[DEFAULT_SIZE];
    }

    public void add(T e) {
        if (size == elements.length) {
            resize();
        }
        elements[size++] = e;
    }

    private void resize() {
        int newSize = elements.length * 2;
        elements = Arrays.copyOf(elements, newSize);
    }

    public T get(int i) {
        if (i >= size) {
            throw new IndexOutOfBoundsException("Index: " + i + ", Size " + i);
        }
        return elements[i];
    }

    public int size() {
        return size;
    }
}
