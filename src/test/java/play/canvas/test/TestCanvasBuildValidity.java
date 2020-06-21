package play.canvas.test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import play.canvas.Canvas;

class TestCanvasBuildValidity {

	@Test
	void testInvalid0WidthAndHeight() {
		Throwable exception = assertThrows(IllegalArgumentException.class, () -> new Canvas(0, 0));
		assertEquals("Width/Height must be a positive number!", exception.getMessage());
	}

	@Test
	void testInvalidNegativeWidth() {
		Throwable exception = assertThrows(IllegalArgumentException.class, () -> new Canvas(-1, 1));
		assertEquals("Width/Height must be a positive number!", exception.getMessage());
	}

	@Test
	void testInvalidNegativeHeight() {
		Throwable exception = assertThrows(IllegalArgumentException.class, () -> new Canvas(1, -2));
		assertEquals("Width/Height must be a positive number!", exception.getMessage());
	}

	@Test
	void testInvalidNegativeHeightAndWidth() {
		Throwable exception = assertThrows(IllegalArgumentException.class, () -> new Canvas(1, 0));
		assertEquals("Width/Height must be a positive number!", exception.getMessage());
	}


	
}
