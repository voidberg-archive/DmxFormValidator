package com.voidberg.formvalidation.conditions;

import com.voidberg.formvalidation.core.DmxCondition;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class DmxConditionNumeric extends DmxCondition {
  public boolean check(String string) {
    if (null == string)
      return false;

    Pattern pattern = Pattern.compile("[0-9]");
    Matcher matcher = pattern.matcher(string);

    int count = 0;
    while (matcher.find())
      count++;

    return count == string.length();
  }

  public boolean shouldAllowViolation() {
    return true;
  }

  public String localizedViolationString() {
    String key = "DmxKeyConditionViolationNumeric";

    return null;
  }
}
