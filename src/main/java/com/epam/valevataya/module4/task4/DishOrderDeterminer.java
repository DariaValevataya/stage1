package com.epam.valevataya.module4.task4;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class DishOrderDeterminer {
  public List<Integer> determineDishOrder(int numberOfDishes, int everyDishNumberToEat) {
    Queue<Integer> queue = new LinkedList<>();
    List<Integer> dishesList = new ArrayList<>();
    int dish = 1;
    while (dish <= numberOfDishes) {
      queue.add(dish++);
    }
    queue.forEach(e -> System.out.print(e + " "));
    int index = 1;
    while (!queue.isEmpty()) {
      Integer element = queue.poll();
      if (index % everyDishNumberToEat == 0) {
        dishesList.add(element);
        index = 1;
      } else {
        queue.offer(element);
        index++;
      }
    }
    return dishesList;
  }
}