package com.epam.valevataya.module5.task1;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.function.*;
import java.util.stream.Collectors;

public class InterfaceCreator {
  public Predicate<List<String>> isValuesStartWithUpperCase() {
    return x ->
            x.stream()
                    .allMatch(v -> Character.isUpperCase(v.charAt(0)));
  }

  public Consumer<List<Integer>> addEvenValuesAtTheEnd() {
    return x -> {
      List<Integer> evenList = x.stream()
              .filter(v -> v % 2 == 0)
              .collect(Collectors.toList());
      x.addAll(evenList);
    };
  }

  public Supplier<List<String>> filterCollection(List<String> values) {
    return () -> values.stream()
            .filter(v -> Character.isUpperCase(v.charAt(0)))
            .filter(v -> v.endsWith("."))
            .filter(v -> {
              String[] list = v.split("\\s+");
              return list.length > 3;
            })
            .collect(Collectors.toList());
  }

  public Function<List<String>, Map<String, Integer>> stringSize() {
    return x -> x.stream()
            .collect(Collectors.toMap(v -> v, v -> v.length()));
  }


  public BiFunction<List<Integer>, List<Integer>, List<Integer>> concatList() {
    return (list1, list2) -> {
      List<Integer> resultList = new ArrayList<>(list1);
      resultList.addAll(list2);
      return resultList;
    };
  }
}
