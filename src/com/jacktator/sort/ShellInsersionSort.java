package com.jacktator.sort;

import com.jacktator.base.Sort;

public class ShellInsersionSort extends Sort {

  public ShellInsersionSort(int[] array) {
    super(array);
  }

  public void sort() {

    System.out.println("################");
    System.out.println("# Running Shell Insertion Sort");
    System.out.println("# ");
    System.out.println("# In-place");
    System.out.println("# Unstable");
    System.out.println("# O(n^2)");
    System.out.println("################");
    printArray();

    for (int gap = array.length / 2; gap > 0 ; gap/=2) {
      System.out.println("> Gap: " + gap);

      for (int i = gap;i < array.length; i++) {
        System.out.println("  > UnsortedIndex: " + i);
        int unsortedNumber = array[i];

        int j = i;

        while (j >= gap && array[j - gap] > unsortedNumber) {
          System.out.println("    > Inserted " + array[j - gap] + " to " + j);
          array[j] = array[j - gap];
          j -= gap;
          printArray();
        }

        System.out.println("  > Insert " + unsortedNumber+ " to " + j);
        array[j] = unsortedNumber;
        printArray();
      }
    }
  }

}
