package classwork.dataStructuresAndAlgorithms;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class StackTest {
    Stack books;

    @BeforeEach
    void setUp() {
        books = new Stack();
    }

    @Test
    void checkThatStackIsEmpty() {
        assertTrue(books.empty());
    }

    @Test
    void stackCanBeAddedTo() {
        books.push("Physics");
        assertFalse(books.empty());
    }

    @Test
    void stackCanBeDeletedFrom() {
        books.push("Physics");
        books.pop("Physics");
        assertTrue(books.empty());
    }

    @Test
    void stackCanHaveMoreThanOneElement() {
        books.push("Physics");
        books.push("Chemistry");
        books.push("Maths");
        assertEquals(3, books.size());
    }

    @Test
    void verifyThatStackContainsAnItem() {
        books.push("Physics");
        books.push("Chemistry");
        books.push("Maths");
        assertTrue(books.search("Chemistry"));
    }

    @Test
    void verifyThatOnlyLastItemCanBePopped() {
        books.push("Physics");
        books.push("Chemistry");
        books.push("Maths");

        books.pop("Physics");
        assertEquals(3, books.size());

        books.pop("Maths");
        assertEquals(2, books.size());
    }

    @Test
    void peekWithoutPopping() {
        books.push("Physics");
        books.push("Chemistry");
        books.push("Maths");

        assertEquals("Maths", books.peek());
    }


}
