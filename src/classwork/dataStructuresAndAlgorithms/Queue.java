package classwork.dataStructuresAndAlgorithms;

import javax.naming.LimitExceededException;

public interface Queue {
    boolean isEmpty();

    void add(String item) throws LimitExceededException;

    void remove(String item);

    int size();

    boolean contains(String item);

    String get(int i);

    String peek();

    String poll();

    void clear();

    void set(int index, String item);
}
