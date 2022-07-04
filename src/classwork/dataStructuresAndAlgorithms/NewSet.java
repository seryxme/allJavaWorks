package classwork.dataStructuresAndAlgorithms;

import java.util.Objects;

public class NewSet implements Set {
    private boolean isEmpty = true;
    private boolean isInList;
    private ArrayList elements = new ArrayList();

    @Override
    public boolean isEmpty() {
        if (elements.size() != 0) isEmpty = false;
        return isEmpty;
    }

    @Override
    public void add(String food) {
        if (!contains(food)) elements.add(food);
    }

    @Override
    public void remove(String food) {
        elements.remove(food);
    }

    @Override
    public int size() {
        return elements.size();
    }

    @Override
    public boolean contains(String food) {
        for (int i = 0; i < elements.size(); i++) {
            if (Objects.equals(elements.get(i), food)) {
                isInList = true;
                break;
            } else isInList = false;
        }
        return isInList;
    }
}
