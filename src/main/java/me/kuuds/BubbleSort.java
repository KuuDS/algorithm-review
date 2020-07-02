package me.kuuds;

/**
 * Time complex O(n) Space complex O(1)
 */
class BubbleSort {

  public static void sort(int[] data) {
    for (int i = 0; i < data.length; ++i) {
      boolean flag = false;
      for (int j = 0; j < data.length - 1; ++j) {
        if (data[j] > data[j + 1]) {
          // 每次与相邻元素比较，若不符合排序规则，则交换元素
          int tmp = data[j];
          data[j] = data[j + 1];
          data[j + 1] = tmp;
          flag = true;
        }
      }
      // 当某次冒泡中没有交换任何元素，说明已经排序完成
      if (!flag)
        break;
    }
  }
}