package play.canvas;

import java.util.Scanner;

public class Main {
	private static final String INITIALIZE_CANVAS_MESSAGE = "Please initialize canvas first!";
	private static final String CANVAS_REGEX_ALLOWED_COMMANDS_PATTERN = "(\\s*[C]\\s+\\d+\\s+\\d+\\s*|\\s*[LR]\\s+\\d+\\s+\\d+\\s+\\d+\\s+\\d+\\s*|\\s*[Q]\\s*)";

	private static Canvas canvas;

	public static void main(String[] args) {
		CanvasHelper.displayAvailableMenuCommands();

		readConsoleCommandsAndDrawCanvas();
	}

	private static void readConsoleCommandsAndDrawCanvas() {
		String currentConsoleCommand = "";
		Scanner scanner = new Scanner(System.in);

		while (!"Q".equals(currentConsoleCommand.strip())) {
			System.out.println("enter command:");
			currentConsoleCommand = scanner.nextLine();

			if (currentConsoleCommand.matches(CANVAS_REGEX_ALLOWED_COMMANDS_PATTERN)) {
				String[] commands = currentConsoleCommand.strip().split("\\s+");
				executeConsoleCommands(commands);
			} else {
				System.out.println("Invalid command. Check menu!");
			}
		}

		scanner.close();
	}

	private static void executeConsoleCommands(String[] commands) {
		try {
			switch (commands[0]) {
			case "C":
				initializeCanvas(commands);
				break;

			case "L":
				drawCanvasLine(commands);
				break;

			case "R":
				drawCanvasRectangle(commands);
				break;

			case "Q":
				System.out.println("Program finished");
				break;

			default:
				break;

			}
		} catch (IllegalArgumentException ile) {
			System.out.println(ile.getMessage());
		}
	}

	private static void drawCanvasRectangle(String[] commands) {
		if (canvas != null) {
			canvas.drawRectangle(Integer.parseInt(commands[1]), Integer.parseInt(commands[2]), Integer.parseInt(commands[3]), Integer.parseInt(commands[4]));
			canvas.printCanvas();
		} else {
			System.out.println(INITIALIZE_CANVAS_MESSAGE);
		}
	}

	private static void drawCanvasLine(String[] commands) {
		if (canvas != null) {
			canvas.drawLine(Integer.parseInt(commands[1]), Integer.parseInt(commands[2]), Integer.parseInt(commands[3]), Integer.parseInt(commands[4]));
			canvas.printCanvas();
		} else {
			System.out.println(INITIALIZE_CANVAS_MESSAGE);
		}
	}

	private static void initializeCanvas(String[] commands) {
		canvas = new Canvas(Integer.parseInt(commands[1]), Integer.parseInt(commands[2]));
		canvas.printCanvas();
	}

}
