package com.jacktator.sort;

import com.jacktator.base.Sort;

public class InsertionSort extends Sort {

  public InsertionSort(int[] array) {
    super(array);
  }

  public void sort() {

    System.out.println("################");
    System.out.println("# Running Insertion Sort");
    System.out.println("# ");
    System.out.println("# In-place");
    System.out.println("# Stable");
    System.out.println("# O(n^2)");
    System.out.println("################");
    printArray();

    for (int unsortedIndex = 1; unsortedIndex < array.length; unsortedIndex++) {
      System.out.println("> UnsortedIndex: " + unsortedIndex);

      int unsortedNumber = array[unsortedIndex];

      int i = unsortedIndex;

      for (; i > 0 && unsortedNumber < array[i - 1]; i--) {
        System.out.println("  > Inserted " + array[i - 1] + " to " + (i+1));
        array[i] = array[i - 1];

        printArray();
      }

      System.out.println("> Insert " + unsortedNumber+ " to " + i);
      array[i] = unsortedNumber;
      printArray();
    }
  }
}
