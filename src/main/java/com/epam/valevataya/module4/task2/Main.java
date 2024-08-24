package com.epam.valevataya.module4.task2;

import java.util.*;

public class Main {
  public static void main(String[] args) {
    //HashSetCreator
    List<Integer> sourceList = new ArrayList<>();
    sourceList.add(2);
    sourceList.add(-1);
    sourceList.add(3);
    sourceList.add(8);
    sourceList.add(-5);
    sourceList.add(12);
    HashSet<Integer> newHashSet = new HashSetCreator().createHashSet(sourceList);
    newHashSet.forEach(e -> System.out.print(e + " "));

    //SubsetOfSquaresCreator
    List<Integer> sourceList2 = new ArrayList<>();
    sourceList2.add(2);
    sourceList2.add(-1);
    sourceList2.add(12);
    sourceList2.add(-7);
    sourceList2.add(-4);
    sourceList2.add(6);
    sourceList2.add(-9);
    Set<Integer> newTreeSet = new SubsetOfSquaresCreator().createSubsetOfSquares(sourceList2, 25, 49);
    newTreeSet.forEach(e -> System.out.print(e + " "));
    System.out.println();

    //SetCombinationCreator
    Set<String> firstSet=new HashSet<>();
    firstSet.add("Java");
    firstSet.add("Collection");
    firstSet.add("framework");
    firstSet.add("interface");
    firstSet.add("class");
    firstSet.add("Queue");
    Set<String> secondSet=new HashSet<>();
    secondSet.add("Queue");
    secondSet.add("iterator");
    secondSet.add("Java");
    secondSet.add("Collection");
    secondSet.add("comparator");
    Set<String> thirdSet=new HashSet<>();
    thirdSet.add("Set");
    thirdSet.add("Java");
    thirdSet.add("Map");
    thirdSet.add("List");
    Set<String> genericSet= new SetCombinationCreator().createSetCombination(firstSet,secondSet,thirdSet);
    genericSet.forEach((e-> System.out.print(e+" ")));
  }
}
