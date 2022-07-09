package classwork.dataStructuresAndAlgorithms;

public class Node {
    private Object content;
    private Node next;
    private int index;

    public Node() {}

    public Node(int index, Object content) {
        this.index = index;
        this.content = content;
        next = new Node();
        next.setContent(null);
        next.setIndex(this.index + 1);
    }

    public Object getContent() {
        return content;
    }

    public void setContent(Object content) {
        this.content = content;
    }

    public Node getNext() {
        return next;
    }

    public void setNext(Node next) {
        this.next = next;
    }

    @Override
    public String toString() {
        return String.format("%s", getContent());
    }

    public void setIndex(int index) {
        this.index = index;
    }

    public int getIndex(int index) {
        return index;
    }

//    @Override
//    public boolean equals(Object obj) {
//        Node newNode = (Node) obj;
//        if(compareTo(getContent(), newNode.getContent())) return true;
//        return false;
//    }
}
