package visma_practice_exercise;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

public class Game {

	private List<Integer> numbers;
	private boolean isGameOn = false;

	public Game() {
		numbers = new ArrayList<>();
	}

	public void startGame() {
		isGameOn = true;
		System.out.println("Game started. Enter any number, 0 - ends game.");
	}

	public List<Integer> getNumbers() {
		return numbers;
	}

	public boolean isOn() {
		return isGameOn;
	}

	public void onCommandEntered(String text) {
		Integer numberFromText = null;
		try {
			numberFromText = Integer.parseInt(text);
		} catch (NumberFormatException e) {
			printException(text);
			return;
		}

		if (numberFromText == 0) {
			onGameEnded();
		} else {
			numbers.add(numberFromText);
			System.out.println("Added number: " + numberFromText);
		}
	}

	private void printException(String text) {
		System.out.println("Unable to read integer from text: " + text);
	}

	private void onGameEnded() {
		isGameOn = false;
		double calculatedResult = calculateResult();
		System.out.println("Got 0, game ended. Result: " + calculatedResult);
	}

	private double calculateResult() {
		int sum = 0;
		for (int number : numbers) {
			sum += number;
		}
		int numberOfToday = getNumberOfToday();
		double result = (double) sum / numberOfToday;
		return result;
	}

	private int getNumberOfToday() {
		Calendar calendar = Calendar.getInstance();
		int calendarDayOfWeek = calendar.get(Calendar.DAY_OF_WEEK);
		int numberOfToday = 0;
		switch (calendarDayOfWeek) {
		case Calendar.SUNDAY:
			numberOfToday = 7;
			break;
		case Calendar.MONDAY:
			numberOfToday = 1;
			break;
		case Calendar.TUESDAY:
			numberOfToday = 2;
			break;
		case Calendar.WEDNESDAY:
			numberOfToday = 3;
			break;
		case Calendar.THURSDAY:
			numberOfToday = 4;
			break;
		case Calendar.FRIDAY:
			numberOfToday = 5;
			break;
		case Calendar.SATURDAY:
			numberOfToday = 6;
			break;
		}
		return numberOfToday;
	}
}
