package com.epam.valevataya.module1.task2.exception;

public class StudentException extends IllegalArgumentException {
  public StudentException() {
  }

  public StudentException(String s) {
    super(s);
  }

  public StudentException(String message, Throwable cause) {
    super(message, cause);
  }

  public StudentException(Throwable cause) {
    super(cause);
  }
}
