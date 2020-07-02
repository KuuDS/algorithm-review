package me.kuuds;

import java.util.Arrays;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class SortTest {

  private final int[] case_1 = new int[] { 5, 4, 3, 2, 1 };
  private final int[] expected = new int[case_1.length];

  public SortTest() {
    System.arraycopy(case_1, 0, expected, 0, case_1.length);
    Arrays.sort(expected);
  }

  @Test
  public void bubbleSortTest() {
    BubbleSort.sort(case_1);
    Assertions.assertArrayEquals(expected, case_1);
  }

  @Test
  public void insertSortTest() {
    InsertSort.sort(case_1);
    Assertions.assertArrayEquals(expected, case_1);
  }

  @Test
  public void selectionSortTest() {
    SelectionSort.sort(case_1);
    Assertions.assertArrayEquals(expected, case_1);
  }
}