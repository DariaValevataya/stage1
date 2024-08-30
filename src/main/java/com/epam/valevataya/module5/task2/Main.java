package com.epam.valevataya.module5.task2;

import java.util.List;

public class Main {
  public static void main(String[] args) {
    InterfaceCreator interfaceCreator = new InterfaceCreator();
    List<Integer> numberList = List.of(3, 6, 9);
    System.out.println(numberList);
    List<Integer> resultList = interfaceCreator.divideBy(3).apply(numberList);
    System.out.println(resultList);
  }
}
