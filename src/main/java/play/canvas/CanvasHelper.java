package play.canvas;

public class CanvasHelper {
	
	static final char LINE_CHAR = '-';
	static final char COL_CHAR = '|';
	static final char SPACE = ' ';
	public static final char X_CHAR = 'X';
	
	private static final String MENU_LINE_SEPARATOR = "============================================";

	private CanvasHelper() {
	}

	public static void displayAvailableMenuCommands() {
		System.out.println(MENU_LINE_SEPARATOR);
		System.out.println("=   Program which draws canvas on screen   =");
		System.out.println(MENU_LINE_SEPARATOR);

		System.out.println("Available commands are:");

		System.out.println("C w h - Create a new canvas of width w and height h");
		System.out.println("L x1 y1 x2 y2 - Draw a new line from coordinates (x1, y1) to (x2, y2) horizontally or vertically. Lines are made up of the x character");
		System.out.println("R x1 y1 x2 y2 - Draw a new rectangle, with upper left corner at coordinate (x1, y1) and lower right coordinate at (x2, y2). Lines are made up of the x character");
		System.out.println("Q - Quit the program");

		System.out.println(MENU_LINE_SEPARATOR);
	}

}
