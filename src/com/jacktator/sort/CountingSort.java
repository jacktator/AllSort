package com.jacktator.sort;

import com.jacktator.base.Sort;

import java.util.Arrays;
import java.util.Collections;

public class CountingSort extends Sort {

  public CountingSort(int[] array) {
    super(array);
  }

  public void sort(int min, int max) {

    // Works on small array, containing discrete positive integers only

    System.out.println("################");
    System.out.println("# Running Counting Sort");
    System.out.println("# ");
    System.out.println("# Not In-place");
    System.out.println("# Not Stable");
    System.out.println("# O(n)");
    System.out.println("# Assumption 1: Range of values is roughly the same as the length");
    System.out.println("# Assumption 2: Discrete positive integers only");
    System.out.println("################");

    countingSort(array, min, max);
  }

  public void countingSort(int[] input, int min, int max) {

    int[] countArray = new int[(max - min) + 1];
    System.out.println("Created countArray of length " + countArray.length);

    for (int value : input) {
      countArray[value - min]++;
      System.out.println("Found " + value + " " + countArray[value - min] + " times");
    }

    int j = 0;
    for (int i = min; i <= max; i++) {
      while (countArray[i - min] > 0) {
        input[j++] = i;
        countArray[i - min]--;
      }
    }
  }

}
