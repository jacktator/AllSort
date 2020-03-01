package com.jacktator.sort;

import com.jacktator.base.Sort;

public class SelectionSort extends Sort {

  SelectionSort(int[] array) {
    super(array);
  }

  public void sort() {

    System.out.println("################");
    System.out.println("# Running Selection Sort");
    System.out.println("# ");
    System.out.println("# In-place");
    System.out.println("# Unstable");
    System.out.println("# O(n^2)");
    System.out.println("################");
    printArray();

    for (int sortedIndex = array.length - 1; sortedIndex > 0; sortedIndex--) {
      System.out.println("> sortedIndex: " + sortedIndex);

      int highestIndex = 0;
      for (int i = 0; i < sortedIndex; i++) {
        int currentNumber = array[i];
        int highestNumber = array[highestIndex];
        System.out.println("  > Compare: " + currentNumber + " <=> " + highestNumber);
        if (currentNumber > highestNumber) {
          System.out.println("  > New highestNumber " + highestNumber + ", highestIndex: " + i);
          highestIndex = i;
        }
      }
      swap(sortedIndex, highestIndex);
      printArray();
    }
  }

  private void swap(int p, int q) {
    System.out.println("    > Swap!");
    int temp = array[p];
    array[p] = array[q];
    array[q] = temp;
  }
}
