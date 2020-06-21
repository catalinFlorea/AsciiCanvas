package play.canvas.test;

import static org.junit.Assert.assertEquals;

import org.junit.jupiter.api.Test;

import play.canvas.Canvas;
import play.canvas.CanvasHelper;

class TestCanvasDrawLineAndRectangle {

	@Test
	void testDrawHorizontalLine() {
		Canvas canvas = new Canvas(20, 5);
		canvas.drawLine(1, 3, 7, 3);

		for (int j = 1; j <= 7; j++) {
			assertEquals(CanvasHelper.X_CHAR, canvas.getCanvasMatrix()[3][j]);
		}
	}

	@Test
	void testDrawVerticalLine() {
		Canvas canvas = new Canvas(20, 5);
		canvas.drawLine(7, 1, 7, 3);

		for (int i = 1; i <= 3; i++) {
			assertEquals(CanvasHelper.X_CHAR, canvas.getCanvasMatrix()[i][7]);
		}
	}

	@Test
	void testDrawRectangle() {
		Canvas canvas = new Canvas(20, 5);
		canvas.drawRectangle(15, 2, 20, 5);

		for (int j = 15; j <= 20; j++) {
			assertEquals(CanvasHelper.X_CHAR, canvas.getCanvasMatrix()[2][j]);
		}

		for (int j = 15; j <= 20; j++) {
			assertEquals(CanvasHelper.X_CHAR, canvas.getCanvasMatrix()[5][j]);
		}

		for (int i = 2; i <= 5; i++) {
			assertEquals(CanvasHelper.X_CHAR, canvas.getCanvasMatrix()[i][15]);
		}

		for (int i = 2; i <= 5; i++) {
			assertEquals(CanvasHelper.X_CHAR, canvas.getCanvasMatrix()[i][20]);
		}
	}

}
