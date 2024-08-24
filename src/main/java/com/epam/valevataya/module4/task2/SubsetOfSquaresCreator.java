package com.epam.valevataya.module4.task2;

import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class SubsetOfSquaresCreator {
  public Set<Integer> createSubsetOfSquares(List<Integer> sourceList, int lowerBound, int upperBound) {
    TreeSet<Integer> squareTreeSet = new TreeSet<>();
    TreeSet<Integer> subTreeSet;
    for (Integer element : sourceList) {
      squareTreeSet.add(element * element);
    }
    subTreeSet = (TreeSet<Integer>) squareTreeSet.subSet(lowerBound, upperBound);
    System.out.println("\nlowerBound = " + lowerBound);
    System.out.println("upperBound = " + upperBound);
    return subTreeSet;
  }
}
