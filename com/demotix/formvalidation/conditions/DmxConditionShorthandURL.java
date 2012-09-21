package com.demotix.formvalidation.conditions;

import com.demotix.formvalidation.core.DmxCondition;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class DmxConditionShorthandURL extends DmxCondition {
  public boolean check(String string) {
    if (null == string)
      return false;

    Pattern pattern = Pattern.compile("^((https?)://)?[a-z0-9-]+(\\\\.[a-z0-9-]+)+([/?].*)?$");
    Matcher matcher = pattern.matcher(string);

    int count = 0;
    while (matcher.find())
      count++;

    return count == 1;
  }

  public boolean shouldAllowViolation() {
    return true;
  }

  public String localizedViolationString() {
    String key = "DmxKeyConditionViolationShorthandURL";

    return null;
  }
}
