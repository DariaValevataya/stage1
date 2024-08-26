package com.epam.valevataya.module4.task4;

import java.util.*;

public class Main {
  public static void main(String[] args) {
    //PriorityQueueCreator
    List<String> firstList = new ArrayList<>();
    firstList.add("Java");
    firstList.add("PriorityQueue");
    firstList.add("class");
    List<String> secondList = new ArrayList<>();
    secondList.add("It");
    secondList.add("is");
    secondList.add("different");
    secondList.add("from");
    secondList.add("standard");
    secondList.add("queues");
    secondList.add("where");
    secondList.add("FIFO");
    PriorityQueue<String> priorityQueue = new PriorityQueueCreator().createPriorityQueue(firstList, secondList);
    priorityQueue.forEach(e -> System.out.print(e + " "));
    System.out.println();

    //ArrayDequeCreator
    Queue<Integer> firstQueue = new LinkedList<>();
    firstQueue.offer(1);
    firstQueue.offer(5);
    firstQueue.offer(7);
    firstQueue.offer(6);
    Queue<Integer> secondQueue = new LinkedList<>();
    secondQueue.offer(2);
    secondQueue.offer(5);
    secondQueue.offer(8);
    secondQueue.offer(3);
    ArrayDeque<Integer> combainedArrayDeque = new ArrayDequeCreator().createArrayDeque(firstQueue, secondQueue);
    combainedArrayDeque.forEach(e -> System.out.print(e + " "));
    System.out.println();

    //DishOrderDeterminer
    List<Integer> list = new DishOrderDeterminer().determineDishOrder(10, 3);
    System.out.println('\n' + Arrays.toString(list.toArray()));
  }
}
