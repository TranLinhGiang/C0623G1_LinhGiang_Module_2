package ss10_dsa_list.bai_tap.bai1;

import java.util.Arrays;

public class MyList<E> {
    private int size = 0;
    private static final int DEFAULT_CAPACITY = 10;
    private Object elements[];
    private Object[] array;

    public MyList() {
        elements = new Object[DEFAULT_CAPACITY];
    }

    public MyList(int capacity) {
        if (capacity < 0) {
            throw new IllegalArgumentException("capacity: " + capacity);
        }
        elements = new Object[capacity];
    }

    public int size() {
        return size;
    }

    public void add(int index, E element) {
        if (index < 0 || index >= size()) {
            throw new IndexOutOfBoundsException();
        } else {
            for (int i = size - 1; i > index; i--) {
                elements[i] = elements[i - 1];
            }
            elements[index] = element;
            size++;
        }
    }

    public void remove(int index) {
        if (index < 0 || index >= size()) {
            throw new IndexOutOfBoundsException();
        } else {
            for (int i = index; i < size; i++) {
                elements[i] = elements[i + 1];
            }
            elements[size - 1] = null;
        }
    }

    public E clone() {
        MyList<E> clones = new MyList<>();
        clones.size = size;
        clones.elements = Arrays.copyOf(elements, size);
        return (E) clones;
    }

    public void ensureCapacity(int minCapacity) {
        if (minCapacity <= 0) {
            throw new IllegalArgumentException();
        }
        int newSize = size * minCapacity;
        elements = Arrays.copyOf(elements, newSize);
    }

    public boolean add(E e) {
        if (size == size()) {
            ensureCapacity(3 / 2);
        }
        elements[size] = e;
        size++;
        return true;
    }

    public int indexOf(E e) {
        int index = -1;
        for (int i = 0; i < size; i++) {
            if (this.array[i].equals(e)) {
                index = i;
                break;
            }
        }
        return index;
    }

    public void clear() {
        size = 0;
        for (int i = 0; i < array.length; i++) {
            array[i] = null;
        }
    }

    public E get(int i) {
        return (E) elements[i];
    }
}


