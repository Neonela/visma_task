package visma_practice_exercise;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		Game game = new Game();
		Menu menu = new Menu();
		game.startGame();

		while (game.isOn()) {
			String text = scanner.nextLine();
			game.onCommandEntered(text);
		}

		menu.printCount(game.getNumbers());
		menu.printNumbers(game.getNumbers());
		scanner.close();
	}
}
