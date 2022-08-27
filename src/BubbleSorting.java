
public class BubbleSorting {

	public static void main(String[] args) {
		int[] items = { 60, 50, 95, 80, 70 };

		BubbleSorting.sort(items);

		for (int i = 0; i < items.length; i++) {
			System.out.println(items[i]);
		}
	}

	public static void bubble(int[] array) {

		for (int i = 0; i < array.length; i++) {
			for (int j = i + 1; j < array.length; j++) {
				if (array[i] > array[j]) {
					BubbleSorting.swap(array, i, j);
				}
			}
		}
	}

	public static void swap(int[] array, int i, int j) {
		int temp = array[i];

		array[i] = array[j];
		array[j] = temp;
	}

	public static void sort(int[] array) {
		for (int i = 0; i < array.length - 1; i++) {
			boolean isSwap = false;
			for (int j = 0; j < array.length - i - 1; j++) {
				if(array[j] > array[j + 1]) {
					BubbleSorting.swap(array, j, j + 1);
					isSwap = true;
				}
			}
			if(!isSwap) break;
		}
	}
}
