package classwork.dataStructuresAndAlgorithms;

import java.util.Objects;

public class NewSet implements Set {
    private boolean isInList;
    private ArrayList elements = new ArrayList();

    @Override
    public boolean isEmpty() {
        return elements.isEmpty();
    }

    @Override
    public void add(String element) {
        if (!contains(element)) elements.add(element);
    }

    @Override
    public void remove(String element) {
        elements.remove(element);
    }

    @Override
    public int size() {
        return elements.size();
    }

    @Override
    public boolean contains(String element) {
        for (int i = 0; i < elements.size(); i++) {
            if (Objects.equals(elements.get(i), element)) {
                isInList = true;
                break;
            } else isInList = false;
        }
        return isInList;
    }

    @Override
    public int capacity() {
        return elements.capacity();
    }

    @Override
    public String get(int index) {
        return elements.get(index);
    }
}
