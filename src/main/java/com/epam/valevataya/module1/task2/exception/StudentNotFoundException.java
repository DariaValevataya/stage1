package com.epam.valevataya.module1.task2.exception;

public class StudentNotFoundException extends IllegalArgumentException {
  public StudentNotFoundException() {
  }

  public StudentNotFoundException(String s) {
    super(s);
  }

  public StudentNotFoundException(String message, Throwable cause) {
    super(message, cause);
  }

  public StudentNotFoundException(Throwable cause) {
    super(cause);
  }
}
