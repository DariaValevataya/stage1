package com.epam.valevataya.module5.task3;

import java.util.List;
import java.util.Optional;

public class CollectionService {
  public List<Integer> filterEvenNumbers(List<Integer> list) {
    return list.stream()
            .filter(e -> e % 2 == 0)
            .toList();
  }

  public List<String> toUpperCaseCollection(List<String> list) {
    return list.stream()
            .map(e -> e.toUpperCase())
            .toList();
  }

  public Optional<Integer> findMax(List<Integer> list) {
    return list.stream()
            .max(Integer::compareTo);
  }

  public Optional<Integer> findMin(List<List<Integer>> list) {
    return list.stream()
            .flatMap(sublist -> sublist.stream())
            .min(Integer::compareTo);
  }

  public Integer sum(List<Integer> list) {
    return list.stream()
            .reduce((x, y) -> x + y)
            .get();
  }
}
