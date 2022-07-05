package classwork.dataStructuresAndAlgorithms;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class MapTest {
    Map academy;
    @BeforeEach
    void setUp() {
        academy = new NewMap();
    }

    @Test
    void mapIsEmptyWhenCreated() {
        assertTrue(academy.isEmpty());
    }

    @Test
    void keyAndValueCanBeAddedToMap() {
        academy.put("Chibob", "Java");
        assertFalse(academy.isEmpty());
    }

    @Test
    void multipleKeysAndValuesCanBeAddedToMap() {
        academy.put("Chibob", "Java");
        academy.put("Anjola", "Python");
        academy.put("Grace", "Java");
        academy.put("Mofe", "Kotlin");
        assertEquals(4, academy.size());
    }

    @Test
    void keysAndValuesCanBeRemovedFromMap() {
        academy.put("Chibob", "Java");
        academy.put("Anjola", "Python");
        academy.put("Grace", "Java");
        academy.put("Mofe", "Kotlin");

        academy.remove("Chibob");

        assertEquals(3, academy.size());
    }

    @Test
    void keysAndValuesCanBeRetrievedFromMap() {
        academy.put("Chibob", "Java");
        academy.put("Anjola", "Python");
        academy.put("Grace", "Java");
        academy.put("Mofe", "Kotlin");

        assertEquals("Python", academy.get("Anjola"));
    }

    @Test
    void keysAndValuesCanBeFoundInMap() {
        academy.put("Chibob", "Java");
        academy.put("Anjola", "Python");
        academy.put("Grace", "Java");
        academy.put("Mofe", "Kotlin");

        assertTrue(academy.containsKey("Grace"));

        assertTrue(academy.containsValue("Kotlin"));
    }

    @Test
    void keysAndValuesCannotBeFoundInMapIfNotAdded() {
        academy.put("Chibob", "Java");
        academy.put("Anjola", "Python");
        academy.put("Grace", "Java");
        academy.put("Mofe", "Kotlin");

        assertFalse(academy.containsKey("Ehis"));

        assertFalse(academy.containsValue("JavaScript"));
    }

}
