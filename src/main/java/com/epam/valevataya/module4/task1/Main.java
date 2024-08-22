package com.epam.valevataya.module4.task1;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Main {
  public static void main(String[] args) {
    //ArrayListCreator
    ArrayList<String> sourceStringList = new ArrayList<>();
    sourceStringList.add("the");
    sourceStringList.add("ArrayList");
    sourceStringList.add("class");
    sourceStringList.add("has");
    sourceStringList.add("many");
    sourceStringList.add("useful");
    sourceStringList.add("methods");
    ArrayList<String> listWithDuplicates = new ArrayListCreator().createArrayList(sourceStringList);
    listWithDuplicates.forEach(e -> System.out.print(e + " "));
    System.out.println();

    //LinkedListCreator
    List<Integer> sourceIntegerList = new ArrayList<>();
    sourceIntegerList.add(2);
    sourceIntegerList.add(14);
    sourceIntegerList.add(3);
    sourceIntegerList.add(6);
    sourceIntegerList.add(5);
    sourceIntegerList.add(7);
    LinkedList<Integer> createdList = new LinkedListCreator().createLinkedList(sourceIntegerList);
    createdList.forEach(e -> System.out.print(e + " "));
    System.out.println();

    //ListSorter
    List<String> listBeforeSort = new ArrayList<>();
    listBeforeSort.add("-5");
    listBeforeSort.add("-12");
    listBeforeSort.add("0");
    listBeforeSort.add("20");
    listBeforeSort.add("9");
    listBeforeSort.add("-20");
    listBeforeSort.add("37");
    new ListSorter().sort(listBeforeSort);
    listBeforeSort.forEach(e -> System.out.print(e + " "));

  }
}
