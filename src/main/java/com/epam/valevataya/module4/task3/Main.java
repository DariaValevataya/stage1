package com.epam.valevataya.module4.task3;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Main {
  public static void main(String[] args) {
    //WordRepetitionMapCreator
    String sentence = "sentence in loWER caSE, SENTENCE IN UPper CAse.";
    Map<String, Integer> wordMap = new WordRepetitionMapCreator().createWordRepetitionMap(sentence);
    wordMap.forEach((k, v) -> System.out.println(k + " - " + v));

    //KeyValueSwapper
    Map<Integer, String> sourceMap = new HashMap<>();
    sourceMap.put(10, "one");
    sourceMap.put(2, "two");
    sourceMap.put(3, "three");
    sourceMap.put(1, "one");
    Map<String, Integer> reverseSourceMap = new KeyValueSwapper().swap(sourceMap);
    reverseSourceMap.forEach((k, v) -> System.out.println(k + " - " + v));

    //FunctionValueFinder
    List<Integer> sourceList = new ArrayList<>();
    sourceList.add(-1);
    sourceList.add(5);
    sourceList.add(4);
    sourceList.add(8);
    System.out.println(new FunctionValueFinder().isFunctionValuePresent(sourceList, 27));
  }
}
