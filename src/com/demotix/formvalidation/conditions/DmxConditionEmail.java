package com.demotix.formvalidation.conditions;

import com.demotix.formvalidation.core.DmxCondition;

public class DmxConditionEmail extends DmxCondition {
  public boolean check(String string) {
    if (null == string)
      return false;

    return android.util.Patterns.EMAIL_ADDRESS.matcher(string).matches();
  }

  public boolean shouldAllowViolation() {
    return true;
  }

  public String localizedViolationString() {
    String key = "DmxKeyConditionViolationEmail";

    return null;
  }
}
