package org.lukas.javach.item1;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by Lukas on 29.08.2016.
 *
 * @author Lukas Pecak
 */
public class ShapesTest {

    private static final String SQUARE = "square";
    private static final String TRIANGLE = "triangle";

    @Test
    public void triangle() throws Exception {
        Shape triangle = Shapes.triangle("blue");
        assertEquals(TRIANGLE, triangle.getName());
        assertNotEquals(SQUARE, triangle.getName());
    }

    @Test
    public void square() throws Exception {
        Shape square = Shapes.square("green");
        assertEquals(SQUARE, square.getName());
        assertNotEquals(TRIANGLE, square.getName());
    }

}