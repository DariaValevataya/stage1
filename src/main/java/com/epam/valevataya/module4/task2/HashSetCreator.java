package com.epam.valevataya.module4.task2;

import java.util.HashSet;
import java.util.List;

public class HashSetCreator {
  public HashSet<Integer> createHashSet(List<Integer> sourceList) {
    HashSet<Integer> newHashSet = new HashSet<>();
    for (Integer element : sourceList) {
      newHashSet.add(element);
      while (element % 2 == 0) {
        element = element / 2;
        newHashSet.add(element);
      }
    }
    return newHashSet;
  }
}
