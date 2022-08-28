

public class MinValue {
	public static void main(String[] args) {
		int[] scores = { 60, 80, 95, 50, 70 };

		System.out.println(min(scores));

	}

	public static int min(int[] array) {
		int index = 0;

		for (int i = 0; i < array.length; i++)
			if (array[i] < array[index])
				index = i;

		return array[index];
	}
}
