package classwork.dataStructuresAndAlgorithms;

public interface Queue {
    boolean isEmpty();

    void add(String item);

    void remove(String item);

    int size();

    boolean contains(String item);

    String get(int i);

    String peek();

    String poll();

    void clear();

    void set(int index, String item);
}
