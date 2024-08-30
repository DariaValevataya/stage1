package com.epam.valevataya.module3;

import java.util.*;
import java.util.function.Consumer;

public class Generics {
  public List<List<String>> boxingMethod(String name) {
    List<String> firstList = new ArrayList<>();
    firstList.add(name);
    List<List<String>> secondList = new ArrayList<>();
    secondList.add(firstList);
    return secondList;
  }

  public Date genericMethod(Date data) {
    return data;
  }

  public void cloneMethod(List<Integer> consumer, List<Integer> producer) {
    consumer.addAll(producer);
  }
}
