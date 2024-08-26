package com.epam.valevataya.module4.task5;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class DeveloperProjectFinder {
  public List<String> findDeveloperProject(Map<String, Set<String>> projects, String developer) {
    List<String> projectList = new ArrayList<>();
    for (Map.Entry<String, Set<String>> e : projects.entrySet()) {
      if (e.getValue().contains(developer)) {
        projectList.add(e.getKey());
      }
    }
    return projectList;
  }
}
