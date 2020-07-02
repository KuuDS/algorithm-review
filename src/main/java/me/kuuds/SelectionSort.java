package me.kuuds;

/**
 * Time Complex  O(N^2)
 * Space Complex O(1)
 */
public class SelectionSort {

  public static void sort(int[] data) {
    for (int i = 0; i < data.length; ++i) {
      int min = i;
      for (int j = i + 1; j < data.length; ++j) {
        if (data[j] < data[min]) {
          min = j;
        }
      }

      // 交换时，破坏元素的原始顺序，非稳定算法
      if (min != i) {
        int tmp = data[min];
        data[min] = data[i];
        data[i] = tmp;
      }
    }
  }
}