import java.util.Arrays;

public class MyArrayList<T> {

    private T[] elements;
    private int size;
    private static final int DEFAULT_SIZE = 10;

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

    @Override
    public String toString() {
        return "MyArrayList{" +
                "elements=" + Arrays.toString(elements) +
                '}';
    }

    public void removeByIndex(int index) {
        if (index == 0) {
            System.arraycopy(elements, 1, elements, 0, elements.length - 1);
        } else if (index == elements.length - 1) {
            elements[index] = null;
        } else {
            T[] newarr1 = (T[]) new Object[elements.length];
            System.arraycopy(elements, 0, newarr1, 0, index);
            System.arraycopy(elements, index + 1, newarr1, index, elements.length - index - 1);
            elements = newarr1;
        }
    }
}
