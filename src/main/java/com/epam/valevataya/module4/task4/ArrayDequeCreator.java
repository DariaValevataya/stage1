package com.epam.valevataya.module4.task4;

import java.util.*;

public class ArrayDequeCreator extends PriorityQueue<String> {
  public ArrayDeque<Integer> createArrayDeque(Queue<Integer> firstQueue, Queue<Integer> secondQueue) {
    ArrayDeque<Integer> arrayDeque = new ArrayDeque<>();
    List<Queue<Integer>> queueList = new ArrayList<>();
    queueList.add(firstQueue);
    queueList.add(secondQueue);
    for (Queue<Integer> e : queueList) {
      arrayDeque.add(e.remove());
      arrayDeque.add(e.remove());
    }
    for (Queue<Integer> e : queueList) {
      while (!e.isEmpty()) {
        e.add(arrayDeque.removeLast());
        arrayDeque.add(e.remove());
        arrayDeque.add(e.remove());
      }
    }
    return arrayDeque;
  }
}