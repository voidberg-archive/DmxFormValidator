package com.voidberg.formvalidation.conditions;

import com.voidberg.formvalidation.core.DmxCondition;

public class DmxConditionRange extends DmxCondition {
  public int min;
  public int max;

  public DmxConditionRange() {
    min = 0;
    max = 0;
  }

  public boolean check(String string) {
    if (null == string)
      return false;

    if (min == 0 && max == 0) {
      return true;
    }

    int len = string.length();
    if (len >= min && len <= max) {
      return true;
    }

    return false;
  }

  public boolean shouldAllowViolation() {
    return true;
  }

  public String localizedViolationString() {
    String key = "DmxKeyConditionViolationRange";

    return null;
  }
}
