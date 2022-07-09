package classwork.dataStructuresAndAlgorithms;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class LinkedListTest {
    LinkedList courses;

    @BeforeEach
    void setUp (){
        courses = new LinkedList();
    }

    @Test
    void listContainsANullItem() {
        assertNull(courses.getFirst());
    }

    @Test
    void listCanAddNewItem() {
        courses.addFirst("Java");
        assertEquals("Java", courses.getFirst().getContent());
    }

    @Test
    void listCanDeleteItem_listIsEmpty() {
        courses.addFirst("Java");
        courses.removeFirst();

        assertNull(courses.get(0).getContent());
    }

    @Test
    void listCanAddMultipleItemsSizeIncreases() {
        courses.add("Java");
        courses.add("Python");
        courses.add("Database");
        courses.add("Kotlin");
        courses.add("JavaScript");
        courses.add("NodeJS");
        courses.add("Web Development");
        courses.add("Data Science");
        courses.add("Industrial Design");

        assertEquals(9, courses.size());
    }

    @Test
    void listCanAddMultipleItems_retrieveFirstItem() {
        courses.add("Java");
        courses.add("Python");
        courses.add("Database");
        courses.add("Kotlin");
        courses.add("JavaScript");
        courses.add("NodeJS");
        courses.add("Web Development");
        courses.add("Data Science");
        courses.add("Industrial Design");

        assertEquals("Java", courses.getFirst().getContent());
    }

    @Test
    void listCanAddMultipleItems_retrieveLastItem() {
        courses.add("Java");
        courses.add("Python");
        courses.add("Database");
        courses.add("Kotlin");
        courses.add("JavaScript");
        courses.add("NodeJS");
        courses.add("Web Development");
        courses.add("Data Science");
        courses.add("Industrial Design");

        assertEquals("Industrial Design", courses.getLast().getContent());
    }

    @Test
    void listCanAddMultipleItems_retrieveOtherItems() {
        courses.add("Java");
        courses.add("Python");
        courses.add("Database");
        courses.add("Kotlin");
        courses.add("JavaScript");
        courses.add("NodeJS");
        courses.add("Web Development");
        courses.add("Data Science");
        courses.add("Industrial Design");

        assertEquals("NodeJS", courses.get(5).getContent());
    }

    @Test
    void listCanUpdate_removeFirstItem() {
        courses.add("Java");
        courses.add("Python");
        courses.add("Database");
        courses.add("Kotlin");
        courses.add("JavaScript");
        courses.add("NodeJS");
        courses.add("Web Development");
        courses.add("Data Science");
        courses.add("Industrial Design");

        courses.removeFirst();

        assertEquals("Kotlin", courses.get(2).getContent());
    }

    @Test
    void listCanUpdate_removeAnyItem() {
        courses.add("Java");
        courses.add("Python");
        courses.add("Database");
        courses.add("Kotlin");
        courses.add("JavaScript");
        courses.add("NodeJS");
        courses.add("Web Development");
        courses.add("Data Science");
        courses.add("Industrial Design");

        courses.remove(5);

        assertEquals("Web Development", courses.get(5).getContent());
    }

    @Test
    void lastItemIsNullAfterRemoval() {
        courses.add("Java");
        courses.add("Python");
        courses.add("Database");
        courses.add("Kotlin");
        courses.add("JavaScript");
        courses.add("NodeJS");
        courses.add("Web Development");
        courses.add("Data Science");
        courses.add("Industrial Design");

        courses.removeLast();

        assertNull(courses.get(8).getContent());
    }



}
