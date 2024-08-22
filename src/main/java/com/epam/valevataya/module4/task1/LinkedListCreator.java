package com.epam.valevataya.module4.task1;

import java.util.LinkedList;
import java.util.List;

public class LinkedListCreator {
  public LinkedList<Integer> createLinkedList(List<Integer> sourceList) {
    LinkedList<Integer> createdList = new LinkedList<>();
    for (Integer element : sourceList) {
      if (element % 2 == 0) {
        createdList.addLast(element);
      } else {
        createdList.addFirst(element);
      }
    }
    return createdList;
  }
}
