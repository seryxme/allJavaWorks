package classwork.dataStructuresAndAlgorithms;

import java.util.EmptyStackException;
import java.util.Objects;

public class Stack {
    private int lim = 10;

    private ArrayList stack = new ArrayList();

    public boolean empty() {
        return stack.isEmpty();
    }


    public void push(String element) {
        if (size() != lim) {
            stack.add(element);
        }
        else throw new StackOverflowError();
    }

    public void pop() {
        if (empty()) throw new EmptyStackException();
        else stack.remove(size() - 1);
    }

    public int size() {
        return stack.size();
    }

    public int search(String element) {
        boolean isInStack = false;
        int i = size();
        for (; i > 0; i--) {
            if (Objects.equals(stack.get(i), element)) {
                isInStack = true;
                break;
            }
        }
        return i;
    }

    public String peek() {
        return stack.get(size() - 1);
    }
}
