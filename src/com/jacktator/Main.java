package com.jacktator;

import com.jacktator.sort.*;

public class Main {

    public static void main(String[] args) {
      // write your code here

//      int[] array = {20, 35, -15, 7, 55, 1, -22};
      int[] array2 = {2, 5, 9, 8, 2, 8, 7, 10, 4, 3};
//      BubbleSort sort = new BubbleSort(array);
//      SelectionSort sort = new SelectionSort(array);
//      InsertionSort sort = new InsertionSort(array);
//      ShellInsersionSort sort = new ShellInsersionSort(array);
//      MergeSort sort = new MergeSort(array);
//      QuickSort sort = new QuickSort(array);
//      sort.sort();

      CountingSort sort = new CountingSort(array2);
      sort.sort(2, 10);

      System.out.println("Final Output: ");
      sort.printArray();
    }
}
