package classwork.dataStructuresAndAlgorithms;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class ListTest {
    List list;

    @BeforeEach
    public void setUp() {
        list = new ArrayList();
    }

    @Test
    public void listIsEmpty() {
        assertTrue(list.isEmpty());
    }

    @Test
    public void addItem_listIsNotEmpty() {
        list.add("MyName");
        assertFalse(list.isEmpty());
    }

    @Test
    public void addItem_removeItem_listIsEmpty() {
        list.add("MyName");
        list.remove("MyName");
        assertTrue(list.isEmpty());
    }

    @Test
    public void addItem_sizeIncreases() {
        list.add("MyName");

        assertEquals(1, list.size());
    }

    @Test
    public void addX_addY_sizeIsTwo(){
        list.add("MyName");
        list.add("YourName");

        assertEquals(2, list.size());
    }

    @Test
    public void addX_addY_removeX_sizeIsOne() {
        list.add("MyName");
        list.add("YourName");
        list.remove("MyName");

        assertEquals(1, list.size());
    }

    @Test
    public void addX_addY_removeX_listIsNotEmpty() {
        list.add("MyName");
        list.add("YourName");
        list.remove("MyName");

        assertEquals(1, list.size());
    }

    @Test
    public void addX_retrieveXTest() {
        list.add("MyName");

        String item = list.get(0);

        assertEquals("MyName", item);
    }

    @Test
    public void addX_addY_retrieveYTest() {
        list.add("MyName");
        list.add("YourName");
        String item = list.get(1);

        assertEquals("YourName", item);
    }

    @Test
    public void addX_addY_retrieveXTest() {
        list.add("MyName");
        list.add("YourName");
        String item = list.get(0);

        assertEquals("MyName", item);
    }

    @Test
    public void addX_YandZ_getXShouldRetrieveYTest() {
        list.add("MyName");
        list.add("YourName");
        list.add("HerName");
        list.remove("HerName");
        String item = list.get(1);

        assertEquals("YourName", item);
    }

    @Test
    public void addSixElements_capacityShouldDoubleTest() {
        assertEquals(5, list.capacity());
        list.add("MyName");
        list.add("YourName");
        list.add("HerName");
        list.add("HisName");
        list.add("TheirName");
        list.add("OurName");

        assertEquals(10, list.capacity());
    }

}
