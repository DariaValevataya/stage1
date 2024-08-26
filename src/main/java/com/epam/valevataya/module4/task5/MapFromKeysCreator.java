package com.epam.valevataya.module4.task5;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class MapFromKeysCreator {
  public Map<Integer, Set<String>> createMap(Map<String, Integer> sourceMap) {
    Map<Integer, Set<String>> createdMap = new HashMap<>();
    for (Map.Entry<String, Integer> e : sourceMap.entrySet()) {
      if (!createdMap.containsKey(e.getKey().length())) {
        createdMap.put(e.getKey().length(), new HashSet<>());
      }
      createdMap.get(e.getKey().length()).add(e.getKey());
    }
    return createdMap;
  }
}
