package com.epam.valevataya.module5.task3;

import java.util.ArrayList;
import java.util.List;

public class Main {
  public static void main(String[] args) {
    CollectionService collectionService = new CollectionService();
    List<Integer> numberList = List.of(3, 4, 5, 6, 65, -8, 34);
    List<Integer> resultIntList = collectionService.filterEvenNumbers(numberList);
    System.out.println(resultIntList);

    System.out.println(collectionService.findMax(numberList));

    List<String> stringList = List.of("hello", "stream", "java", "collections");
    System.out.println(collectionService.toUpperCaseCollection(stringList));

    List<List<Integer>> numberList2 = new ArrayList<>();
    numberList2.add(List.of(3, 4, 5, 6, 44, 5, 6, 3, -8, 84, 54));
    numberList2.add(List.of(31, 14, 25, -26, 4, -45));
    numberList2.add(List.of(-18, 83, 24));
    System.out.println(collectionService.findMin(numberList2));

    System.out.println(collectionService.sum(numberList));


  }
}
