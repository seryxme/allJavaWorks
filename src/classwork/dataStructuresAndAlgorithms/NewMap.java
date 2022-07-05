package classwork.dataStructuresAndAlgorithms;

import java.util.NoSuchElementException;
import java.util.Objects;

public class NewMap implements Map {

    private NewSet keys = new NewSet();
    private ArrayList values = new ArrayList();

    @Override
    public boolean isEmpty() {
        return keys.isEmpty();
    }

    @Override
    public void put(String key, String value) {
        keys.add(key);
        values.add(value);
    }

    @Override
    public int size() {
        return keys.size();
    }

    @Override
    public void remove(String key) {
        keys.remove(key);
    }

    @Override
    public String get(String key) {
        int i = 0;
        if (!containsKey(key)) throw new NoSuchElementException("Key does not exist in map.");
        else {
            for (; i < keys.size(); i++) {
                if (Objects.equals(keys.get(i), key)) break;
            }
        }
        return values.get(i);
    }

    @Override
    public boolean containsKey(String key) {
        return keys.contains(key);
    }

    @Override
    public boolean containsValue(String value) {
        boolean isInList = false;
        for (int i = 0; i < values.size(); i++) {
            if (Objects.equals(values.get(i), value)) {
                isInList = true;
                break;
            }
        }
        return isInList;
    }

    @Override
    public NewSet entrySet() {
        NewSet mySet = new NewSet();
        for (int i = 0; i < keys.size(); i++) {
            mySet.add(keys.get(i)+"="+values.get(i));
            }
        return mySet;
    }

    @Override
    public Set keySet() {
        NewSet keySet = new NewSet();
        for (int i = 0; i < keys.size(); i++) {
            keySet.add(keys.get(i));
        }
        return keySet;
    }

    @Override
    public ArrayList values() {
        ArrayList valuesArray = new ArrayList();
        for (int i = 0; i < values.size(); i++) {
            valuesArray.add(values.get(i));
        }
        return valuesArray;
    }


}
