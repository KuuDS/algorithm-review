package me.kuuds;

/**
 * Time  Complex O(N^2)
 * Space Complex O(1)
 */
public class InsertSort {

  public static void sort(int[] data) {
    // i为未分区指针, i前为已经排序指针， n后为未排序指针
    for (int i = 1; i < data.length; ++i) {
      // 为data[i] 找到 0 - i之间的合适位置
      for (int k = 0; k < i; ++k) {
        if (data[k] > data[i]) {
          // 移动元素, 插入data[i]
          int tmp = data[i];
          for (int l = i; l > k;l--) {
            data[l] = data[l-1];
          }
          data[k] = tmp;
          break;
        }
      }
    }
  }
}