package com.epam.valevataya.module4.task1;

import java.util.Comparator;
import java.util.List;

public class ListSorter {
  public void sort(List<String> sourceList) {
    sourceList.sort(new ListComparator());
  }
}

class ListComparator implements Comparator<String> {
  @Override
  public int compare(String a, String b) {
    int intA = Integer.parseInt(a);
    int intB = Integer.parseInt(b);
    int functionA = calculate(intA);
    int functionB = calculate(intB);
    if (functionA != functionB) {
      return Integer.compare(functionA, functionB);
    } else {
      return Integer.compare(intA, intB);
    }
  }

  public int calculate(int x) {
    return 5 * x * x + 3;
  }
}