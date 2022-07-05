package classwork.dataStructuresAndAlgorithms;

public interface Map {


    boolean isEmpty();

    void put(String key, String value);

    int size();

    void remove(String key);

    String get(String key);

    boolean containsKey(String key);

    boolean containsValue(String value);

    Set entrySet();

    Set keySet();

    ArrayList values();
}

