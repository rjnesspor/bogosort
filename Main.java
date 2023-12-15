import java.util.ArrayList;
import java.util.List;

/**
 * Tests the BogoSort class.
 * @author rjnesspor
 * @version 12/14/2023
 */

class Main {

  public static void main(String[] args) {

    List<Double> arr = new ArrayList<>();
    arr.add(8.2);
    arr.add(1.4);
    arr.add(4.1);
    arr.add(5.5);
    arr.add(5.6);
    arr.add(0.2);
    arr.add(3.4);

    BogoSort bogoSort = new BogoSort(arr);
    System.out.println(bogoSort);
    long startTime = System.currentTimeMillis();

    bogoSort.bogoSort();

    long endTime = System.currentTimeMillis();
    long elapsed = endTime - startTime;

    System.out.println(bogoSort);
    System.out.println("Sort complete in " + elapsed);


  }

}