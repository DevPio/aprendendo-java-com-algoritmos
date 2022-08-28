
public class SelectSort {

	public static void main(String[] args) {
		int[] scores = { 60, 80, 95, 50, 70 };

		sort(scores);

		for (int i = 0; i < scores.length; i++) {
			System.out.println(scores[i]);

		}
	}

	public static void sort(int[] array) {

		for (int i = 0; i < array.length; i++) {
			int minValue = i;

			for (int j = i + 1; j < array.length; j++) {
				if (array[j] < array[minValue])
					minValue = j;
			}

			if (minValue != i) {
				int temp = array[i];

				array[i] = array[minValue];

				array[minValue] = temp;
			}
		}

	}
}
