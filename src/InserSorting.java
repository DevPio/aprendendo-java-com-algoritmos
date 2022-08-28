
public class InserSorting {
	public static void main(String[] args) {
		int[] scores = { 60, 80, 95, 50, 70 };

		sort(scores);

		for (int i = 0; i < scores.length; i++) {
			System.out.println(scores[i]);

		}
	}

	public static void sort(int[] array) {
		for (int i = 1; i < array.length; i++) {
			int insertElement = array[i];
			int insertPosition = i;

			for (int j = i - 1; j >= 0; j--) {
				if (insertElement < array[j]) {
					array[j + 1] = array[j];
					insertPosition--;
				} else {
					break;
				}
			}

			array[insertPosition] = insertElement;
		}
	}
}
