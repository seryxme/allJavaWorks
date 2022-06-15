package chapter8;

import chapter8.Diary.Entry;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class EntryTest {
    Entry entry;

    @BeforeEach
    void setUp() {
        entry = new Entry();
    }

    @Test
    void objectCreatedTest() {
        int id = entry.getId();
        assertEquals(0, id);

        String title = entry.getTitle();
        assertEquals(null, title);

        String body = entry.getBody();
        assertEquals(null, body);

    }

    @Test
    void idChangeTest() {
        entry.setId(4);
        int index = entry.getId();

        assertEquals(4, index);
    }

    @Test
    void titleChangeTest() {
        entry.setTitle("My Diary");
        String title = entry.getTitle();

        assertEquals("My Diary", title);
    }

    @Test
    void bodyChangeTest() {
        entry.setBody("I am a boy.");
        String body = entry.getBody();

        assertEquals("I am a boy.", body);
    }
}