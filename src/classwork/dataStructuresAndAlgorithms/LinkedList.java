package classwork.dataStructuresAndAlgorithms;

public class LinkedList {
    private Node thisNode;
    private int size;

    public Node getFirst() {
        return thisNode;
    }

    public void addFirst(Object element) {
        thisNode = new Node(0, element);
        size++;
    }

    public void add(Object element) {
        if (size == 0) addFirst(element);
        else addLast(element);
    }

    public void addLast(Object element) {
        Node newNode = new Node(size, element);
        getLast().setNext(newNode);
        size++;
    }

    public void add(int index, Object element) {
        Node newNode = new Node(index, element);
        newNode.setNext(get(index));
        get(index-1).setNext(newNode);
        size++;
    }

    public void removeFirst() {
        thisNode = thisNode.getNext();

        for (int i = 0; i < size; i++) {
            get(i).setNext(get(i+1));
        }
        size--;
    }

    public void removeLast() {
        get(size - 2).setNext(get(size - 1).getNext());
        size--;
    }

    public void remove(int index) {
        get(index - 1).setNext(get(index).getNext());
        for (int i = index; i < size; i++) {
            get(i).setNext(get(i+1));
        }
        size--;
    }

    public int size() {
        return  size;
    }

    public Node getLast() {
        return get(size - 1);
    }

    public Node get(int index) {
        Node retrievedNode = null;

        if (index == 0) retrievedNode = thisNode;
        else if (index == 1) retrievedNode = thisNode.getNext();
        else {
            retrievedNode = thisNode.getNext();
            for (int i = 1; i < index; i++) {
                retrievedNode = retrievedNode.getNext() ;
            }
        }
        return retrievedNode;
    }
}
