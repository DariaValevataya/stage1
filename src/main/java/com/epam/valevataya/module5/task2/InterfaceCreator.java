package com.epam.valevataya.module5.task2;

public class InterfaceCreator {
  public Operation<Integer> divideBy(Integer divider) {
    return list -> list.stream()
            .map(v -> v / divider)
            .toList();
  }
}
