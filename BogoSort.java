import java.util.Comparator;
import java.util.List;

/**
 * Allows the BogoSort sorting method to be performed on a List of numbers.
 * @param <T> Generic type to be sorted.
 * @author rjnesspor
 * @version 12/14/2023
 */

public class BogoSort<T extends Number & Comparable<T>> {

	private long passes = 0;

	private List<T> arr;

	public BogoSort(List<T> arr) {
		this.arr = arr;
	}

	public void bogoSort() {
		while (!isSorted()) {
			shuffle();
			passes++;
		}
	}

	private void shuffle() {
		for (int i = 0; i < arr.size(); i++) {
			swap(i, (int) (Math.random() * arr.size()));
		}
	}

	private void swap(int i, int j) {
		T temp = arr.get(i);
		arr.set(i, arr.get(j));
		arr.set(j, temp);
	}

	private boolean isSorted() {
		for (int i = 1; i < arr.size(); i++)
			if (arr.get(i).compareTo(arr.get(i - 1)) < 0) {
				return false;
			}
		return true;
	}

	@Override
	public String toString() {
		return "Passes: " + passes + " Array: " + arr.toString();
	}

}