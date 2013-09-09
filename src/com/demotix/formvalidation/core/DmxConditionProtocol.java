package com.demotix.formvalidation.core;

public interface DmxConditionProtocol {
  public boolean check(String string);
  public String localizedViolationString();
}