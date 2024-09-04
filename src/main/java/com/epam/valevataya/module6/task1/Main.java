package com.epam.valevataya.module6.task1;

import java.io.File;

public class Main {
  public static void main(String[] args) {
    File file = new File("src/main/java/com/epam/valevataya/module6/task1/resources/Profile.txt");
    Profile profile = new FileReader().getDataFromFile(file);
    System.out.println(profile.toString());
  }
}

