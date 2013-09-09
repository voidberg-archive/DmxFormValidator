package com.demotix.formvalidation.core;

public class DmxCondition implements DmxConditionProtocol {
  private boolean _shouldAllowViolation;
  public boolean shouldAllowViolation;

  public boolean check(String string)  {
    return true;
  }

  public String localizedViolationString() {
    return null;
  }

  public String description() {
    StringBuilder description = new StringBuilder();
    description.append("<");
    description.append("\n <localizedViolationString: " + localizedViolationString() + ">");
    description.append("\n <shouldAllowViolation: " + (_shouldAllowViolation == true ? "YES" : "NO") + ">");
    description.append(">");

    return description.toString();
  }
}
