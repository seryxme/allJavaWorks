package classwork.dataStructuresAndAlgorithms;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class SetTest {
    Set food;

    @BeforeEach
    void setUp() {
        food = new NewSet();
    }

    @Test
    void setIsEmpty() {
        assertTrue(food.isEmpty());
    }

    @Test
    void setCanBeAddedTo() {
        food.add("Eba");
        assertFalse(food.isEmpty());
    }

    @Test
    void setCanBeDeletedFrom() {
        food.add("Eba");
        food.remove("Eba");
        assertTrue(food.isEmpty());
    }

    @Test
    void setCanHaveMoreThanOneElement() {
        food.add("Eba");
        food.add("Fufu");
        food.add("Beans");
        assertEquals(3, food.size());
    }

    @Test
    void setSizeChangesIfElementIsDeletedAfterAdding() {
        food.add("Eba");
        food.add("Fufu");
        food.add("Beans");
        food.remove("Fufu");
        assertEquals(2, food.size());
    }

    @Test
    void verifyThatSetContainsAnItem() {
        food.add("Eba");
        food.add("Fufu");
        food.add("Beans");
        assertTrue(food.contains("Fufu"));
    }

    @Test
    void verifyThatSetDoesNotContainAnItem() {
        food.add("Eba");
        food.add("Fufu");
        food.add("Beans");
        assertFalse(food.contains("Rice"));
    }

    @Test
    void verifyThatSetDoesNotDuplicateAnItem() {
        food.add("Eba");
        food.add("Fufu");
        food.add("Beans");
        food.add("Eba");
        food.add("Fufu");
        food.add("Eba");
        assertEquals(3, food.size());
    }

    @Test
    public void addSixElements_capacityShouldDoubleTest() {
        assertEquals(5, food.capacity());
        food.add("Eba");
        food.add("Fufu");
        food.add("Beans");
        food.add("Rice");
        food.add("Garri");
        food.add("Yam");

        assertEquals(10, food.capacity());
    }

    @Test
    public void retrieveElementInsideTheSet() {
        assertEquals(5, food.capacity());
        food.add("Eba");
        food.add("Fufu");
        food.add("Beans");
        food.add("Rice");
        food.add("Garri");
        food.add("Yam");

        assertEquals("Garri", food.get(4));
    }
}
