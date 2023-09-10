package com.example;

import static org.junit.Assert.*;


import org.junit.Before;
import org.junit.Test;
import java.awt.event.KeyListener;
import java.util.ArrayList;

public class WindowTest {

    Window window;

    @Before
    public void setUp() {
        window = new Window();
    }

    @Test
    public void test_window_creation() {
        assertNotNull(window);
    }

    @Test
    public void test_grid_initialization() {
        ArrayList<ArrayList<DataOfSquare>> grid = window.Grid;  // Assuming Grid is public
        assertEquals(20, grid.size());
        for (ArrayList<DataOfSquare> row : grid) {
            assertEquals(20, row.size());
        }
    }

    @Test
    public void test_squares_creation() {
        ArrayList<ArrayList<DataOfSquare>> grid = window.Grid;  // Assuming Grid is public
        for (ArrayList<DataOfSquare> row : grid) {
            for (DataOfSquare square : row) {
                assertNotNull(square);
            }
        }
    }


    @Test
    public void test_single_keyboard_listener() {
        KeyListener[] listeners = window.getKeyListeners();
        assertEquals(1, listeners.length);
        assertTrue(listeners[0] instanceof KeyboardListener);  // Assuming KeyboardListener is the type
    }

}