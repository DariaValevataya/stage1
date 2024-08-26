package com.epam.valevataya.module4.task4;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.PriorityQueue;

public class PriorityQueueCreator {
  public PriorityQueue<String> createPriorityQueue(List<String> firstList, List<String> secondList) {
    List<String> combinedList = new ArrayList<>();
    combinedList.addAll(firstList);
    combinedList.addAll(secondList);
    Collections.sort(combinedList);
    return new PriorityQueue<>(combinedList);
  }
}