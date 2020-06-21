package play.canvas;

public class Canvas {

	private final int width;
	private final int height;

	private char[][] canvasMatrix;

	public Canvas(int width, int height) {
		this.width = width;
		this.height = height;

		if (width <= 0 || height <= 0) {
			throw new IllegalArgumentException("Width/Height must be a positive number!");
		}

		initializeAndFillCanvas(width, height);
	}

	private void initializeAndFillCanvas(int width, int height) {
		canvasMatrix = new char[height + 2][width + 2];

		for (int i = 0; i < height + 2; i++)
			for (int j = 0; j < width + 2; j++) {
				if (i == 0 || i == height + 1) {
					canvasMatrix[i][j] = CanvasHelper.LINE_CHAR;
				} else if (j == 0 || j == width + 1) {
					canvasMatrix[i][j] = CanvasHelper.COL_CHAR;
				} else {
					canvasMatrix[i][j] = CanvasHelper.SPACE;
				}
			}
	}

	public void drawLine(int x1, int y1, int x2, int y2) {
		genericValidateGivenIndexes(x1, y1, x2, y2);
		validateLineIndexes(x1, y1, x2, y2);

		if (y1 == y2) {
			drawHorizontalLine(y1, x1, x2);
		} else {
			drawVerticalLine(x1, y1, y2);
		}
	}

	public void validateLineIndexes(int x1, int y1, int x2, int y2) {
		if (x1 != x2 && y1 != y2) {
			throw new IllegalArgumentException("Line indexes or column indexes must be equal to draw horizontal or vertical line!");
		}
	}

	private void genericValidateGivenIndexes(int x1, int y1, int x2, int y2) {
		if (x1 <= 0 || x2 <= 0 || y1 <= 0 || y2 <= 0) {
			throw new IllegalArgumentException("Coordinates must be positive numbers");
		}

		if (x1 > width || x2 > width || y1 > height || y2 > height) {
			throw new IllegalArgumentException("Coordinates out of entered canvas size. Check indexes!");
		}

		if ((x1 > x2 || y1 > y2)) {
			throw new IllegalArgumentException("First indexes must be lower or equal than the second ones!");
		}
	}

	private void drawHorizontalLine(int y1, int x1, int x2) {
		for (int j = x1; j <= x2; j++) {
			canvasMatrix[y1][j] = CanvasHelper.X_CHAR;
		}
	}

	private void drawVerticalLine(int x1, int y1, int y2) {
		for (int i = y1; i <= y2; i++) {
			canvasMatrix[i][x1] = CanvasHelper.X_CHAR;
		}
	}

	public void drawRectangle(int x1, int y1, int x2, int y2) {
		genericValidateGivenIndexes(x1, y1, x2, y2);

		drawHorizontalLine(y1, x1, x2);
		drawHorizontalLine(y2, x1, x2);
		drawVerticalLine(x1, y1, y2);
		drawVerticalLine(x2, y1, y2);
	}

	public char[][] getCanvasMatrix() {
		return this.canvasMatrix;
	}

	public void printCanvas() {
		for (int i = 0; i < height + 2; i++) {
			for (int j = 0; j < width + 2; j++) {
				System.out.print(canvasMatrix[i][j]);
			}
			System.out.println();
		}
	}

}
