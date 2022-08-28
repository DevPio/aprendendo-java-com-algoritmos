
public class LinearTable {
	public static void main(String[] args) {
		int[] elements = { 50, 60, 70, 80, 90 };

		reverse(elements);
		for (int i = 0; i < elements.length; i++) {
			System.out.println(elements[i]);

		}
	}

	public static void reverse(int[] array) {
		int lenght = array.length;
		int middle = (int) Math.ceil(array.length / 2);

		for (int i = 0; i <= middle; i++) {
			int temp = array[i];

			array[i] = array[lenght - i - 1];
			array[lenght - i - 1] = temp;

		}
	}
}
