public class BogoSort {
	private long passes = 0;

	void bogoSort(int[] a) {
		while (isSorted(a) == false) {
			shuffle(a);
			passes++;
		}
	}

	void shuffle(int[] a) {
		for (int i = 0; i < a.length; i++) {
			swap(a, i, (int) (Math.random() * a.length));
		}
	}

	void swap(int[] a, int i, int j) {
		int temp = a[i];
		a[i] = a[j];
		a[j] = temp;
	}

	boolean isSorted(int[] a) {
		for (int i = 1; i < a.length; i++)
			if (a[i] < a[i - 1])
				return false;
		return true;
	}

	void printArray(int[] arr) {
		System.out.println("It took " + passes + " loops to sort.");
		for (int i = 0; i < arr.length; i++)
			System.out.print(arr[i] + " ");
		System.out.println();
		passes = 0;
	}
		void print(int[] arr) {
		for (int i = 0; i < arr.length; i++)
			System.out.print(arr[i] + " ");
		System.out.println();
	}
}