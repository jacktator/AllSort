package com.jacktator.sort;

import com.jacktator.base.Sort;

public class QuickSort extends Sort {

  public QuickSort(int[] array) {
    super(array);
  }

  public void sort() {

    System.out.println("################");
    System.out.println("# Running Quick Sort");
    System.out.println("# ");
    System.out.println("# In-place");
    System.out.println("# Unstable");
    System.out.println("# O(nlogn)");
    System.out.println("################");
    printArray();

    quickSort(array, 0, array.length);
  }

  public void quickSort(int[] input, int start, int end) {

    System.out.println("> quickSort start: " + start + ", end: " + end);
    if (end - start < 2) {
      return;
    }

    int pivotIndex = partition(input, start, end);

    quickSort(input, start, pivotIndex);
    quickSort(input, pivotIndex + 1, end);
  }

  public int partition(int[] input, int start, int end) {
    // This is using the first element as the pivot
    int pivot = input[start];
    System.out.println("  > pivot:" + pivot);

    int i = start;
    int j = end;

    while (i < j) {

      // NOTE: empty loop body
      while (i < j && input[--j] >= pivot);
      if (i < j) {
        System.out.println("Assigning j'th " + input[j] + " to i " + i);
        input[i] = input[j];
      }

      // NOTE: empty loop body
      while ( i < j && input[++i] <= pivot);
      if (i < j) {
        System.out.println("Assigning i'th " + input[i] + " to j " + j);
        input[j] = input[i];
      }
    }

    System.out.println("Assigning pivot " + pivot + " to i " + i);
    input[i] = pivot;

    printArray();

    return j;
  }
}
