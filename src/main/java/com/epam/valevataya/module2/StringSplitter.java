package com.epam.valevataya.module2;


import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.StringTokenizer;

public class StringSplitter {

  /**
   * Splits given string applying all delimeters to it. Keeps order of result substrings as in source string.
   *
   * @param source     source string
   * @param delimiters collection of delimiter strings
   * @return List of substrings
   */
  public List<String> splitByDelimiters(String source, Collection<String> delimiters) {
    StringBuilder stringBuilder = new StringBuilder();
    for (String d : delimiters) {
      stringBuilder.append(d);
    }
    List<String> listOfSignature = new ArrayList<>();
    StringTokenizer stringTokenizer = new StringTokenizer(source, stringBuilder.toString(), false);
    while (stringTokenizer.hasMoreTokens()) {
      listOfSignature.add(stringTokenizer.nextToken());
    }
    return listOfSignature;
  }
}