package classwork.turtlegraphics;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;
import static classwork.turtlegraphics.Direction.*;


public class TurtleTest {

    Turtle turtle;
    SketchPad sketch;

    @BeforeEach
    public void setUp() {
        turtle = new Turtle();
        sketch = new SketchPad(5, 5);
    }

    @Test
    public void turtleCanBeCreatedTest() {
        assertNotNull(turtle);
    }

    @Test
    public void penIsUpByDefault() {
        assertTrue(turtle.isPenUp());
    }

    @Test
    public void penCanBeMovedDown() {
        assertTrue(turtle.isPenUp());

        turtle.penDown();
        assertFalse(turtle.isPenUp());
    }

    @Test
    public void penCanBeMovedBackUp() {
        assertTrue(turtle.isPenUp());

        turtle.penDown();
        assertFalse(turtle.isPenUp());

        turtle.penUp();
        assertTrue(turtle.isPenUp());
    }

    @Test
    public void whenFacingEast_turtleCanTurnRight() {
        assertSame(EAST, turtle.getCurrentDirection());

        turtle.turnRight();
        assertSame(SOUTH, turtle.getCurrentDirection());
    }

    @Test
    public void whenFacingSouth_turtleCanTurnRight() {
        turtle.turnRight();
        assertSame(SOUTH, turtle.getCurrentDirection());

        turtle.turnRight();
        assertSame(WEST, turtle.getCurrentDirection());
    }

    @Test
    public void whenFacingWest_turtleCanTurnRight() {
        turtle.turnRight();
        turtle.turnRight();
        assertSame(WEST, turtle.getCurrentDirection());

        turtle.turnRight();
        assertSame(NORTH, turtle.getCurrentDirection());
    }

    @Test
    public void whenFacingNorth_turtleCanTurnRight() {
        turtle.turnRight();
        turtle.turnRight();
        turtle.turnRight();
        assertSame(NORTH, turtle.getCurrentDirection());

        turtle.turnRight();
        assertSame(EAST, turtle.getCurrentDirection());
    }

    @Test
    public void whenFacingEast_turtleCanTurnLeft() {
        assertSame(EAST, turtle.getCurrentDirection());

        turtle.turnLeft();
        assertSame(NORTH, turtle.getCurrentDirection());
    }

    @Test
    public void whenFacingSouth_turtleCanTurnLeft() {
        turtle.turnLeft();
        assertSame(NORTH, turtle.getCurrentDirection());

        turtle.turnLeft();
        assertSame(WEST, turtle.getCurrentDirection());
    }

    @Test
    public void whenFacingWest_turtleCanTurnLeft() {
        turtle.turnLeft();
        turtle.turnLeft();
        assertSame(WEST, turtle.getCurrentDirection());

        turtle.turnLeft();
        assertSame(SOUTH, turtle.getCurrentDirection());
    }

    @Test
    public void whenFacingNorth_turtleCanTurnLeft() {
        turtle.turnLeft();
        turtle.turnLeft();
        turtle.turnLeft();
        assertSame(SOUTH, turtle.getCurrentDirection());

        turtle.turnLeft();
        assertSame(EAST, turtle.getCurrentDirection());
    }

    @Test
    public void turtleCanMoveForwardWhenFacingEast() {
        assertSame(EAST, turtle.getCurrentDirection());
        turtle.move(5, sketch);
        turtle.move(5, sketch);

        Position pos = new Position(0,10);

        assertEquals(pos, turtle.getCurrentPosition());
    }

    @Test
    public void turtleCanMoveForwardWhenFacingSouth() {
        turtle.move(5, sketch);
        turtle.turnRight();
        turtle.move(5, sketch);

        Position pos = new Position(5,5);

        assertEquals(pos, turtle.getCurrentPosition());
    }

    @Test
    public void turtleCanMoveForwardWhenFacingWest() {
        turtle.move(5, sketch);
        turtle.turnRight();
        turtle.move(5, sketch);
        turtle.turnRight();
        turtle.move(3, sketch);

        Position pos = new Position(5,2);

        assertEquals(pos, turtle.getCurrentPosition());
    }

    @Test
    public void turtleCanMoveForwardWhenFacingNorth() {
        turtle.move(5, sketch);
        turtle.turnRight();
        turtle.move(5, sketch);
        turtle.turnRight();
        turtle.move(3, sketch);
        turtle.turnRight();
        turtle.move(4, sketch);

        Position pos = new Position(1,2);

        assertEquals(pos, turtle.getCurrentPosition());
    }

    @Test
    public void turtleCanWriteWhileMovingForwardWhenFacingEast() {
        int row = turtle.getCurrentPosition().getRow();
        int column = turtle.getCurrentPosition().getColumn();

        turtle.penDown();
        turtle.move(5, sketch);

        int[][] floor = sketch.getFloor();

        System.out.println(Arrays.deepToString(floor));

        for (int i = column; i < column + 5; i++) {
            assertEquals(1, floor[row][i]);
        }
    }

    @Test
    public void turtleCanWriteWhileMovingForwardWhenFacingSouth() {
        int row = turtle.getCurrentPosition().getRow();
        int column = turtle.getCurrentPosition().getColumn();

        turtle.penDown();
        turtle.turnRight();
        turtle.move(5, sketch);

        int[][] floor = sketch.getFloor();

        System.out.println(Arrays.deepToString(floor));

        for (int i = row; i < row + 5; i++) {
            assertEquals(1, floor[i][column]);
        }
    }

//    @Test
//    public void turtleCanWriteWhileMovingForwardWhenFacingWest() {
//        turtle.move(5, sketch);
//
//        int row = turtle.getCurrentPosition().getRow();
//        int column = turtle.getCurrentPosition().getColumn();
//
//        turtle.penDown();
//        turtle.turnRight();
//        turtle.turnRight();
//        turtle.move(5, sketch);
//
//        int[][] floor = sketch.getFloor();
//
//        System.out.println(Arrays.deepToString(floor));
//
//        for (int i = column; i > column - 5; i--) {
//            assertEquals(1, floor[row][i]);
//        }
//    }

}
