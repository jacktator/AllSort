package com.jacktator.sort;

import com.jacktator.base.Sort;

public class RadixSort extends Sort {

  // Data must have same radix and same width, works with String and Integers
  public RadixSort(int[] array) {
    super(array);
  }

  public void sort() {

    System.out.println("################");
    System.out.println("# Running Radis Sort");
    System.out.println("# ");
    System.out.println("# In-place");
    System.out.println("# Stable");
    System.out.println("# O(n)");
    System.out.println("# O(n)");
    System.out.println("################");
    printArray();

  }

}
