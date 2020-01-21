package visma_practice_exercise;

import java.util.List;

public class Menu {

	public void printCount(List<Integer> numbers) {
		System.out.print("Collection size: ");
		if (numbers != null) {
			System.out.println(numbers.size());
		} else {
			System.out.println("none");
		}
	}

	public void printNumbers(List<Integer> numbers) {
		System.out.print("Numbers in collection: ");
		if (numbers != null && !numbers.isEmpty()) {
			for (int i = 0; i < numbers.size(); i++) {
				System.out.print(numbers.get(i));
				if (i != numbers.size() - 1) {
					System.out.print(", ");
				}
			}
		} else {
			System.out.print("none");
		}
		System.out.println();
	}
}
