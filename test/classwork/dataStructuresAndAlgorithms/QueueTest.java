package classwork.dataStructuresAndAlgorithms;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class QueueTest {
    Queue line;

    @BeforeEach
    void setUp() {
        line = new NewQueue();
    }

    @Test
    void queueIsEmpty() {
        assertTrue(line.isEmpty());
    }

    @Test
    void queueCanBeAddedTo() {
        line.add("Student1");
        assertFalse(line.isEmpty());
    }

    @Test
    void queueCanBeDeletedFrom() {
        line.add("Student1");
        line.remove("Student1");
        assertTrue(line.isEmpty());
    }

    @Test
    void queueCanHaveMoreThanOneElement() {
        line.add("Student1");
        line.add("Student2");
        line.add("Student3");
        assertEquals(3, line.size());
    }

    @Test
    void queueSizeChangesIfElementIsDeletedAfterAdding() {
        line.add("Student1");
        line.add("Student2");
        line.add("Student3");
        line.remove("Student2");
        assertEquals(2, line.size());
    }

    @Test
    void verifyThatQueueContainsAnItem() {
        line.add("Student1");
        line.add("Student2");
        line.add("Student3");
        assertTrue(line.contains("Student1"));
    }

    @Test
    void verifyThatQueueDoesNotContainAnItem() {
        line.add("Student1");
        line.add("Student2");
        line.add("Student3");
        assertFalse(line.contains("Student4"));
    }

    @Test
    public void retrieveItemInsideTheQueue() {
        line.add("Student1");
        line.add("Student2");
        line.add("Student3");
        line.add("Student4");
        line.add("Student5");
        line.add("Student6");

        assertEquals("Student4", line.get(3));
    }

    @Test
    void peekWithoutRemoving() {
        line.add("Student1");
        line.add("Student2");
        line.add("Student3");

        assertEquals("Student1", line.peek());
    }

    @Test
    void pollToRetrieveAndRemoveItemFromQueue() {
        line.add("Student1");
        line.add("Student2");
        line.add("Student3");

        assertEquals("Student1", line.poll());

        assertEquals(2, line.size());

        assertEquals("Student2", line.get(0));
    }

    @Test
    public void clearItemsInsideTheQueue_queueShouldBeEmpty() {
        line.add("Student1");
        line.add("Student2");
        line.add("Student3");
        line.add("Student4");
        line.add("Student5");
        line.add("Student6");

        line.clear();

        assertTrue(line.isEmpty());
    }

}
