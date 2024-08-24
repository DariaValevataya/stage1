package com.epam.valevataya.module4.task3;

import java.util.HashMap;
import java.util.Map;
import java.util.StringTokenizer;

public class WordRepetitionMapCreator {
  public Map<String, Integer> createWordRepetitionMap(String sentence) {
    Map<String, Integer> wordMap = new HashMap<>();
    String strOfDelimiters = " ,.";
    StringTokenizer stringTokenizer = new StringTokenizer(sentence, strOfDelimiters, false);
    while (stringTokenizer.hasMoreTokens()) {
      wordMap.merge(stringTokenizer.nextToken().toLowerCase(), 1, Integer::sum);
    }
    return wordMap;
  }
}
