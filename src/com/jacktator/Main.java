package com.jacktator;

import com.jacktator.sort.*;

public class Main {

    public static void main(String[] args) {
      // write your code here

      int[] array = {20, 35, -15, 7, 55, 1, -22};

//      BubbleSort sort = new BubbleSort(array);
//      SelectionSort sort = new SelectionSort(array);
//      InsertionSort sort = new InsertionSort(array);
//      ShellInsersionSort sort = new ShellInsersionSort(array);
//      MergeSort sort = new MergeSort(array);
      QuickSort sort = new QuickSort(array);
      sort.sort();

      System.out.println("Final Output: ");
      sort.printArray();
    }
}
