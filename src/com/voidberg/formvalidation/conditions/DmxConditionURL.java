package com.voidberg.formvalidation.conditions;

import android.util.Patterns;
import com.voidberg.formvalidation.core.DmxCondition;

public class DmxConditionURL extends DmxCondition {
  public boolean check(String string) {
    if (null == string)
      return false;

    return Patterns.WEB_URL.matcher(string).matches();

  }

  public boolean shouldAllowViolation() {
    return true;
  }

  public String localizedViolationString() {
    String key = "DmxKeyConditionViolationURL";

    return null;
  }
}
