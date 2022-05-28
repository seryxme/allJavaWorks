package classwork;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RectangleTest {
    Rectangle quad;
    @BeforeEach
    void setUp() {
        quad = new Rectangle();
    }

    @Test
    void calculatePerimeterTest() {
        double perimeter = quad.calculatePerimeter(10, 6);

        assertEquals(32, perimeter);
    }

    @Test
    void calculateAreaTest() {
        double area = quad.calculateArea(10, 6);

        assertEquals(60, area);
    }

    @Test
    void valueChangeTest() {
        quad.setLength(15.0);
        quad.setWidth(8.0);

        assertEquals(15.0, quad.getLength());

        assertEquals(8.0, quad.getWidth());
    }
}