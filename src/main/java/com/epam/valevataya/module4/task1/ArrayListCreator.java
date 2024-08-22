package com.epam.valevataya.module4.task1;

import java.util.ArrayList;
import java.util.List;

public class ArrayListCreator {
  public ArrayList<String> createArrayList(List<String> sourceList) {
    ArrayList<String> listWithDuplicates = new ArrayList<>();
    for (String element : sourceList) {
      if ((sourceList.indexOf(element) + 1) % 3 == 0) {
        listWithDuplicates.add(element);
        listWithDuplicates.add(element);
      }
    }
    return listWithDuplicates;
  }
}