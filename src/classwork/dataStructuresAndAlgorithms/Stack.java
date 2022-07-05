package classwork.dataStructuresAndAlgorithms;

import java.util.Objects;

public class Stack {

    ArrayList stack = new ArrayList();

    public boolean empty() {
        return stack.isEmpty();
    }


    public void push(String element) {
        stack.add(element);
    }

    public void pop(String element) {
        if (Objects.equals(peek(), element)) stack.remove(element);
    }

    public int size() {
        return stack.size();
    }

    public boolean search(String element) {
        boolean isInStack = false;
        for (int i = 0; i < stack.size(); i++) {
            if (Objects.equals(stack.get(i), element)) {
                isInStack = true;
                break;
            }
        }
        return isInStack;
    }

    public String peek() {
        return stack.get(size() - 1);
    }
}
