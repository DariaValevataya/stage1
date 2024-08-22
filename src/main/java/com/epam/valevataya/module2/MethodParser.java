package com.epam.valevataya.module2;


import java.util.ArrayList;
import java.util.List;

public class MethodParser {
  public MethodSignature parseFunction(String signatureString) {
    List<String> listOfDelimiters = new ArrayList<>();
    listOfDelimiters.add(" ");
    listOfDelimiters.add("(");
    listOfDelimiters.add(",");
    listOfDelimiters.add(")");
    StringSplitter stringSplitter = new StringSplitter();
    List<String> listOfSignature = stringSplitter.splitByDelimiters(signatureString, listOfDelimiters);
    int index = 0;
    String accessModifier = "-", returnType, metodName;
    if (hasAccessModifier(listOfSignature.get(index))) {
      accessModifier = listOfSignature.get(index++);
    }
    returnType = listOfSignature.get(index++);
    metodName = listOfSignature.get(index++);
    List<MethodSignature.Argument> listOfArguments = new ArrayList<>();
    for (int i = index; i < listOfSignature.size(); i += 2) {
      listOfArguments.add(new MethodSignature.Argument(listOfSignature.get(i), listOfSignature.get(i + 1)));
    }
    MethodSignature methodSignature = new MethodSignature(metodName, listOfArguments);
    methodSignature.setAccessModifier(accessModifier);
    methodSignature.setReturnType(returnType);
    return methodSignature;
  }

  public static boolean hasAccessModifier(String signatureString) {
    return signatureString.equals("public") || signatureString.equals("private") || signatureString.equals("protected");
  }
}