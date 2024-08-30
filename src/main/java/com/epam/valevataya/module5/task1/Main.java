package com.epam.valevataya.module5.task1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;

public class Main {
  public static void main(String[] args) {
    //isValuesStartWithUpperCase
    InterfaceCreator interfaceCreator = new InterfaceCreator();
    List<String> firtsList = new ArrayList<>();
    firtsList.add("Sun");
    firtsList.add("Sky");
    firtsList.add("Hello");
    List<String> secondList = new ArrayList<>();
    secondList.add("sun");
    secondList.add("Sky");
    secondList.add("Hello");
    System.out.println(interfaceCreator.isValuesStartWithUpperCase().test(firtsList));
    System.out.println(interfaceCreator.isValuesStartWithUpperCase().test(secondList));

    //addEvenValuesAtTheEnd
    List<Integer> integerList = new ArrayList<>();
    integerList.add(48);
    integerList.add(13);
    integerList.add(100);
    integerList.add(5);
    integerList.add(222);
    integerList.add(3);
    interfaceCreator.addEvenValuesAtTheEnd().accept(integerList);
    System.out.println(Arrays.toString(integerList.toArray()));

    //filterCollection
    List<String> values = new ArrayList<>();
    values.add("hello world in Java.");
    values.add("MJC is a great school.");
    System.out.println(interfaceCreator.filterCollection(values).get());

    //stringSize
    List<String> worldList = new ArrayList<>();
    worldList.add("Hello");
    worldList.add("MJC");
    Map<String, Integer> map = interfaceCreator.stringSize().apply(worldList);
    System.out.println(map);

    //concatList
    List<Integer> firtsIntList = new ArrayList<>();
    firtsIntList.add(2);
    firtsIntList.add(4);
    firtsIntList.add(5);
    firtsIntList.add(10);
    List<Integer> secondIntList = new ArrayList<>();
    secondIntList.add(3);
    secondIntList.add(1);
    secondIntList.add(10);
    secondIntList.add(5);
    List<Integer> list = interfaceCreator.concatList().apply(firtsIntList, secondIntList);
    System.out.println(list);
  }
}
