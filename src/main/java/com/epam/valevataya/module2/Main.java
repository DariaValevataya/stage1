package com.epam.valevataya.module2;

public class Main {
  public static void main(String[] args) {
    MethodParser methodParser = new MethodParser();
    MethodSignature methodSignature = methodParser.parseFunction("public int findMax(int a, int b, int c, int d)");
    System.out.println(methodSignature.toString());
  }
}
