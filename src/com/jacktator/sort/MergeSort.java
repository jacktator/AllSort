package com.jacktator.sort;

import com.jacktator.base.Sort;
import com.sun.tools.javac.util.Pair;

public class MergeSort extends Sort {

  public MergeSort(int[] array) {
    super(array);
  }

  public void sort() {

    System.out.println("################");
    System.out.println("# Running Merge Sort");
    System.out.println("# ");
    System.out.println("# Not In-place");
    System.out.println("# Stable");
    System.out.println("# O(nlogn)");
    System.out.println("################");
    printArray();

    mergeSort(array, 0, array.length);
  }

  public void mergeSort(int[] input, int start, int end) {

    System.out.println("> mergeSort start: " + start + ", end: " + end);
    if (end - start < 2) {
      return;
    }

    int mid = (start + end) / 2;
    mergeSort(input, start, mid); // Keep partitioning left array
    mergeSort(input, mid, end); // Keep partitioning right array
    merge(input, start, mid, end);
  }

  public void merge(int[] input, int start, int mid, int end) {

    System.out.println("  > merge start: " + start + ", mid: " + mid + ", end: " + end);
    if (input[mid -1] <= input[mid]) {
      return; // Skip if two already sorted
    }

    int i = start;
    int j = mid;
    int tempIndex = 0;

    int[] temp = new int[end - start];
    while (i < mid && j < end) {
      System.out.println("    > merge: " + input[i] + " and " + input[j]);
      temp[tempIndex++] = input[i] <= input[j] ? input[i++] : input[j++];
    }

    System.arraycopy(input, i, input, start + tempIndex, mid - i);

    System.arraycopy(temp, 0, input, start, tempIndex);

    printArray();
  }
}
