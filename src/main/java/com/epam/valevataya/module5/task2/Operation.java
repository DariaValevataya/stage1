package com.epam.valevataya.module5.task2;

import java.util.List;

@FunctionalInterface
public interface Operation<T> {
  List<T> apply(List<T> arg);
}
