import java.util.Arrays;

public class MyList<E> {
    private int size = 0;
    private static final int DEFAULT_CAPACITY = 10;
    private Object[] elements;

    public MyList() {
        elements = new Object[DEFAULT_CAPACITY];
    }

    public MyList(int capacity) {
        elements = new Object[capacity];
    }

    public void add(int index, E element) {
        size++;
        if (size >= elements.length) {
            ensureCapacity(elements.length * 2);
        }
        for (int i = this.size; i > index; i--) {
            elements[i] = elements[i - 1];
        }
        elements[index] = element;
    }

    public E remove(int index) {
        E temp = (E) elements[index];
        for (int i = index; i < elements.length - 1; i++) {
            elements[i] = elements[i + 1];
        }
        size--;
        return temp;
    }

    public int size() {
        return size;
    }

//    public E clone() {
//        Object[] temp = new Object[size];
//        temp = elements;
//        return (E) temp;
//    }

    public boolean contains(E o) {
        for (Object element : elements) {
            if (o.equals(element)) {
                return true;
            }
        }
        return false;
    }

    public int indexOf(E o) {
        for (int i = 0; i < elements.length; i++) {
            if (o.equals(elements[i])) {
                return i;
            }
        }
        return -1;
    }

    public boolean add(E o) {
        if (size >= elements.length) {
            ensureCapacity(elements.length * 2);
        }
        elements[size++] = o;
        return true;
    }

    public void ensureCapacity(int minCapacity) {
        int newSize = minCapacity;
        elements = Arrays.copyOf(elements, minCapacity);
    }

    public E get(int i) {
        if (i >= size || i < 0) {
            throw new IndexOutOfBoundsException("Index " + i + ", Size " + i);
        } else {
            return (E) elements[i];
        }
    }

    public void clear() {
        for (int i = 0; i < elements.length; i++) {
            elements[i] = null;
        }
        size = 0;
    }
}