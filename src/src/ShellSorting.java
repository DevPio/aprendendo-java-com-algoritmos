package src;

public class ShellSorting {

	public static void main(String[] args) {

		int[] scores = {9,6,5,8,0,7,4,3,1,2,10};
		
		sort(scores);
		
		for(int i = 0; i < scores.length; i++) {
			System.out.println(scores[i]);
		}
	}

	public static void swap(int[] array, int a, int b) {
		array[a] = array[a] + array[b];

		array[b] = array[a] - array[b];

		array[a] = array[a] - array[b];
	}

	public static void sort(int[] array) {

		for (int gap = array.length / 2; gap > 0; gap = gap / 2) {
			for (int i = gap; i < array.length; i++) {
				int j = i;

				while (j - gap >= 0 && array[j] < array[j - gap]) {
					swap(array, j, j - gap);
					j = j - gap;
				}
			}
		}
	}
}
