class Main {
  public static void main(String[] args) {
    int[] array1 = {4, 1, 6, 0, 9, 10, 5};
		BogoSort bs = new BogoSort();
		bs.print(array1);
		bs.bogoSort(array1);
		bs.printArray(array1);
  }
}