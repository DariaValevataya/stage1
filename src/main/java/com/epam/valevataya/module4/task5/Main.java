package com.epam.valevataya.module4.task5;

import java.util.*;

public class Main {
  public static void main(String[] args) {
    //LessonsGetter
    Map<String, List<String>> timetable = new HashMap<>();
    List<String> lessonsOnMonday = new ArrayList<>();
    lessonsOnMonday.add("Math");
    lessonsOnMonday.add("English");
    List<String> lessonsOnTuesday = new ArrayList<>();
    lessonsOnTuesday.add("English");
    List<String> lessonsOnWednesday = new ArrayList<>();
    lessonsOnWednesday.add("Chemistry");
    lessonsOnWednesday.add("Math");
    List<String> lessonsOnThursday = new ArrayList<>();
    lessonsOnThursday.add("Literature");
    lessonsOnThursday.add("Physics");
    List<String> lessonsOnFriday = new ArrayList<>();
    lessonsOnFriday.add("Physics");
    timetable.put("Monday", lessonsOnMonday);
    timetable.put("Tuesday", lessonsOnTuesday);
    timetable.put("Wednesday", lessonsOnWednesday);
    timetable.put("Thursday", lessonsOnThursday);
    timetable.put("Friday", lessonsOnFriday);
    Set<String> lessons = new LessonsGetter().getLessons(timetable);
    lessons.forEach(e -> System.out.print(e + " "));
    System.out.println();

    //MapFromKeysCreator
    Map<String, Integer> sourceMap = new HashMap<>();
    sourceMap.put("one", 1);
    sourceMap.put("two", 2);
    sourceMap.put("three", 3);
    sourceMap.put("five", 5);
    sourceMap.put("ten", 10);
    Map<Integer, Set<String>> createdMap = new MapFromKeysCreator().createMap(sourceMap);
    createdMap.forEach((k, v) -> System.out.println(k + " - " + v.stream().toList()));

    //DeveloperProjectFinder
    Map<String, Set<String>> projects = new HashMap<>();
    Set<String> firstProject = new HashSet<>();
    firstProject.add("Ivan");
    firstProject.add("Anna");
    firstProject.add("Lidia");
    firstProject.add("Antony");
    Set<String> secondProject = new HashSet<>();
    secondProject.add("Mary");
    secondProject.add("Ben");
    secondProject.add("Max");
    Set<String> thirdProject = new HashSet<>();
    thirdProject.add("Oleg");
    thirdProject.add("Ivan");
    thirdProject.add("Alex");
    projects.put("CSO", firstProject);
    projects.put("VVaS", secondProject);
    projects.put("LJA", thirdProject);
    List<String> projectList = new DeveloperProjectFinder().findDeveloperProject(projects, "Ivan");
    System.out.println(Arrays.toString(projectList.toArray()));

  }
}
