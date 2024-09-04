package com.epam.valevataya.module6.task1;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class FileReader {

  public Profile getDataFromFile(File file) {
    StringBuilder textFromFile = new StringBuilder();
    String name;
    String email;
    int age;
    long phone;
    try (BufferedReader reader = new BufferedReader(new java.io.FileReader(file))) {
      String stringLines;
      while ((stringLines = reader.readLine()) != null) {
        textFromFile.append(stringLines);
      }
    } catch (FileNotFoundException e) {
      e.printStackTrace();
    } catch (IOException e) {
      e.printStackTrace();
    }
    String[] stringArray = textFromFile.toString().split("[A-Z][a-z]+:\\s");
    List<String> list = new ArrayList<>();
    for (String string : stringArray) {
      if (!string.isEmpty()) {
        list.add(string);
      }
    }
    int index = 0;
    name = list.get(index++);
    age = Integer.parseInt(list.get(index++));
    email = list.get(index++);
    phone = Long.parseLong(list.get(index++));
    return new Profile(name, age, email, phone);
  }
}
