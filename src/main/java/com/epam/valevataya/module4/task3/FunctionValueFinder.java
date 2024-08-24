package com.epam.valevataya.module4.task3;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class FunctionValueFinder {
  public boolean isFunctionValuePresent(List<Integer> sourceList, int requiredValue) {
    Map<Integer, Integer> functionMap = calculateFunctionMap(sourceList);
    boolean isPresent = false;
    if (functionMap.containsValue(requiredValue)) {
      isPresent = true;
    }
    return isPresent;
  }

  private Map<Integer, Integer> calculateFunctionMap(List<Integer> sourceList) {
    Map<Integer, Integer> functionMap = new HashMap<>();
    for (Integer x : sourceList) {
      functionMap.put(x, 5 * x + 2);
    }
    return functionMap;
  }
}
