package play.canvas.test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.Test;

import play.canvas.Canvas;

public class TestCanvasDrawLineValidaty {
	
	@Test
	void testDrawLineOutOfCanvasInvalidFirstIndex() {
		Canvas canvas = new Canvas(4, 2);
		Throwable exception = assertThrows(IllegalArgumentException.class, () -> canvas.drawLine(5, 1, 1, 1));
		assertEquals("Coordinates out of entered canvas size. Check indexes!", exception.getMessage());
	}

	@Test
	void testDrawLineOutOfCanvasInvalidSecondIndex() {
		Canvas canvas = new Canvas(4, 2);
		Throwable exception = assertThrows(IllegalArgumentException.class, () -> canvas.drawLine(1, 5, 1, 1));
		assertEquals("Coordinates out of entered canvas size. Check indexes!", exception.getMessage());
	}

	@Test
	void testDrawLineOutOfCanvasInvalidThirdIndex() {
		Canvas canvas = new Canvas(4, 2);
		Throwable exception = assertThrows(IllegalArgumentException.class, () -> canvas.drawLine(1, 1, 5, 1));
		assertEquals("Coordinates out of entered canvas size. Check indexes!", exception.getMessage());
	}

	@Test
	void testDrawLineOutOfCanvasInvalidForthIndex() {
		Canvas canvas = new Canvas(4, 2);
		Throwable exception = assertThrows(IllegalArgumentException.class, () -> canvas.drawLine(1, 1, 5, 1));
		assertEquals("Coordinates out of entered canvas size. Check indexes!", exception.getMessage());
	}

	@Test
	void testDrawLineWithNegativeIndexes1() {
		Canvas canvas = new Canvas(4, 2);
		Throwable exception = assertThrows(IllegalArgumentException.class, () -> canvas.drawLine(-1, 1, 5, 1));
		assertEquals("Coordinates must be positive numbers", exception.getMessage());
	}

	@Test
	void testDrawLineWithNegativeIndexes2() {
		Canvas canvas = new Canvas(4, 2);
		Throwable exception = assertThrows(IllegalArgumentException.class, () -> canvas.drawLine(1, -2, 5, 1));
		assertEquals("Coordinates must be positive numbers", exception.getMessage());
	}

	@Test
	void testDrawLineWithNegativeIndexes3() {
		Canvas canvas = new Canvas(4, 2);
		Throwable exception = assertThrows(IllegalArgumentException.class, () -> canvas.drawLine(1, 1, -2, 1));
		assertEquals("Coordinates must be positive numbers", exception.getMessage());
	}

	@Test
	void testDrawLineWithNegativeIndexes4() {
		Canvas canvas = new Canvas(4, 2);
		Throwable exception = assertThrows(IllegalArgumentException.class, () -> canvas.drawLine(1, 1, 1, -2));
		assertEquals("Coordinates must be positive numbers", exception.getMessage());
	}

	@Test
	void testBiggerFirstXCoordinateIndex() {
		Canvas canvas = new Canvas(4, 2);
		Throwable exception = assertThrows(IllegalArgumentException.class, () -> canvas.drawLine(4, 1, 3, 1));
		assertEquals("First indexes must be lower or equal than the second ones!", exception.getMessage());
	}
	
	@Test
	void testBiggerFirstYCoordinateIndex() {
		Canvas canvas = new Canvas(4, 2);
		Throwable exception = assertThrows(IllegalArgumentException.class, () -> canvas.drawLine(2, 2, 3, 1));
		assertEquals("First indexes must be lower or equal than the second ones!", exception.getMessage());
	}
	
	@Test
	void testDrawLineDifferentLineIndex() {
		Canvas canvas = new Canvas(6, 4);
		Throwable exception = assertThrows(IllegalArgumentException.class, () -> canvas.drawLine(2, 1, 3, 4));
		assertEquals("Line indexes or column indexes must be equal to draw horizontal or vertical line!", exception.getMessage());
	}
	
	@Test
	void testDrawLineDifferentColumnIndex() {
		Canvas canvas = new Canvas(6, 4);
		Throwable exception = assertThrows(IllegalArgumentException.class, () -> canvas.drawLine(2, 1, 3, 4));
		assertEquals("Line indexes or column indexes must be equal to draw horizontal or vertical line!", exception.getMessage());
	}

}
