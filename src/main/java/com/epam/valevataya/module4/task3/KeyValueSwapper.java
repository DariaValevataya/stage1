package com.epam.valevataya.module4.task3;

import java.util.HashMap;
import java.util.Map;

public class KeyValueSwapper {
  public Map<String, Integer> swap(Map<Integer, String> sourceMap) {
    Map<String, Integer> reverseSourceMap = new HashMap<>();
    for (Map.Entry<Integer, String> e : sourceMap.entrySet()) {
      reverseSourceMap.merge(e.getValue(), e.getKey(), Integer::min);
    }
    return reverseSourceMap;
  }
}
