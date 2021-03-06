package classwork.dataStructuresAndAlgorithms;

import java.util.Objects;

public class ArrayList implements List{
//    boolean isEmpty = true;
    int size = 0;
    String[] elements = new String[5];

    @Override
    public boolean isEmpty() {
        return size == 0;
    }

    @Override
    public void add(String myName) {
        expandArray();
        elements[size] = myName;
        size++;
    }
    public void add(int index, String myName) {
        expandArray();
        elements[index] = myName;
        size++;
    }

    private void expandArray() {
        if (size == elements.length) {
            String[] newElements = new String[elements.length * 2];
            System.arraycopy(elements, 0, newElements, 0, elements.length);
            elements = newElements;
        }
    }

    @Override
    public void remove(String myName) {
        for(int i = 0; i < elements.length; i++) {
            if (Objects.equals(elements[i], myName)) {
                if (size - i >= 0) System.arraycopy(elements, i + 1, elements, i, size - i);
            }
        }
        if (size != 0) size--;
    }

    public void remove(int index) {
        for(int i = index; i < elements.length; i++) {
            if (size - i >= 0) System.arraycopy(elements, i + 1, elements, i, size - i);
        }
        if (size != 0) size--;
    }

    @Override
    public int size() {
        return size;
    }

    @Override
    public String get(int index) {
        return elements[index];
    }

    @Override
    public int capacity() {
        return elements.length;
    }
}
