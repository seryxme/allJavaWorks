package classwork.dataStructuresAndAlgorithms;

public interface Set {

    boolean isEmpty();

    void add(String name);

    void remove(String name);

    int size();

    boolean contains(String name);

    int capacity();

    String get(int index);
}
