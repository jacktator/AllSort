package com.jacktator.sort;

import com.jacktator.base.Sort;

public class BubbleSort extends Sort {

  public BubbleSort(int[] array) {
    super(array);
  }

  public void sort() {

    System.out.println("################");
    System.out.println("# Running Bubble Sort");
    System.out.println("# ");
    System.out.println("# In-place");
    System.out.println("# Stable");
    System.out.println("# O(n^2)");
    System.out.println("################");
    printArray();

    for (int sortedIndex = array.length - 1; sortedIndex > 0; sortedIndex--) {
      System.out.println("> sortedIndex: " + sortedIndex);

      for (int i = 0; i < sortedIndex; i++) {
        int firstNumber = array[i];
        int secondNumber = array[i + 1];
        System.out.println("  > Compare: " + firstNumber + " <=> " + secondNumber);
        if (secondNumber < firstNumber) {
          swap(i, i + 1);
        }
      }
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
