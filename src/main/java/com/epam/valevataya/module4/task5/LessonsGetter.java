package com.epam.valevataya.module4.task5;

import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class LessonsGetter {
  public Set<String> getLessons(Map<String, List<String>> timetable) {
    Set<String> lessons = new HashSet<>();
    timetable.forEach((k, v) -> timetable.get(k).forEach(e -> lessons.add(e)));
    return lessons;
  }
}