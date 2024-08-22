package com.epam.valevataya.module1.task2;

import com.epam.valevataya.module1.task2.exception.StudentException;

public class StudentManager {

  private static final long[] IDs = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11};

  public Student find(long studentID) throws StudentException {
    Student student = Student.getValueOf(studentID);
    if (student == null) {
      throw new StudentException("Could not find student with ID " + studentID);
    }
    return student;
  }

  public static void main(String[] args) {
    StudentManager manager = new StudentManager();
    try {
      for (int i = 0; i < IDs.length; i++) {
        Student student = manager.find(IDs[i]);
        System.out.println("Student " + student.getId() + " name " + student.getName());
      }
    } catch (StudentException ex) {
      System.out.println(ex.getMessage());
    }
  }
}
