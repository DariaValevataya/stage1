package com.epam.valevataya.module4.task2;

import java.util.HashSet;
import java.util.Set;

public class SetCombinationCreator {
  public Set<String> createSetCombination(Set<String> firstSet, Set<String> secondSet, Set<String> thirdSet) {
    Set<String> genericSet = new HashSet<>();
    for (String e : firstSet) {
      if (firstSet.contains(e) && secondSet.contains(e) && !thirdSet.contains(e)) {
        genericSet.add(e);
      }
    }
    for (String e : thirdSet) {
      if (!firstSet.contains(e) && !secondSet.contains(e) && thirdSet.contains(e)) {
        genericSet.add(e);
      }
    }
    return genericSet;
  }
}