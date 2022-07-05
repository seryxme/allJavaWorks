package classwork.dataStructuresAndAlgorithms;

import java.util.Objects;

public class NewQueue implements Queue {

    ArrayList queue = new ArrayList();

    @Override
    public boolean isEmpty() {
        return queue.isEmpty();
    }

    @Override
    public void add(String item) {
        queue.add(item);
    }

    @Override
    public void remove(String item) {
        queue.remove(item);
    }

    @Override
    public int size() {
        return queue.size();
    }

    @Override
    public boolean contains(String item) {
        boolean isInQueue = false;
        for (int i = 0; i < queue.size(); i++) {
            if (Objects.equals(get(i), item)) {
                isInQueue = true;
                break;
            }
        }
        return isInQueue;
    }

    @Override
    public String get(int index) {
        return queue.get(index);
    }

    @Override
    public String peek() {
        return get(0);
    }

    @Override
    public String poll() {
        String item = peek();
        remove(peek());
        return item;
    }

    @Override
    public void clear() {
        for (int i = 0; i < queue.capacity(); i++) {
            remove(get(0));
        }
    }

    @Override
    public void set(int index, String item) {
        queue.add(index, item);
    }
}
