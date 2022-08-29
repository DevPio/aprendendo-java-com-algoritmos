import java.util.Arrays;

public class Search {
	public static void main(String[] args) {
		int[] array = { 90, 70, 50, 80, 60, 85 };

		Arrays.sort(array);
		int index = BinarySearch(array, 50);
		int otherIndex = BinarySearchLoop(array, 90);

		System.out.println(index);
		System.out.println(otherIndex);

	}

	public static int LinearSearch(int[] array, int searchValue) {

		for (int i = 0; i < array.length; i++) {
			if (array[i] == searchValue)
				return i;
		}
		return -1;
	}

	public static int BinarySearch(int[] array, int searchValue) {

		return BinarySearchHelper(array, searchValue, 0, array.length - 1);
	}

	public static int BinarySearchHelper(int[] array, int searchValue, int lowParam, int hightParam) {
		int low = lowParam;
		int high = hightParam;

		if (high < 0 || low > array.length)
			return -1;

		var middle = (int) Math.floor((low + high) / 2);

		if (array[middle] == searchValue)
			return middle;

		if (array[middle] > searchValue)
			return BinarySearchHelper(array, searchValue, lowParam, middle - 1);

		return BinarySearchHelper(array, searchValue, middle + 1, hightParam);

	}

	public static int BinarySearchLoop(int[] array, int searchValue) {

		int low = 0;

		int high = array.length - 1;

		int middle;
		while (low <= high) {
			middle = (low + high) / 2;

			if (array[middle] == searchValue)
				return middle;
			if (array[middle] < searchValue)
				low++;
			else
				high--;
		}

		return -1;
	}
}
