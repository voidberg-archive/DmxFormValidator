package com.demotix.formvalidation.conditions;

import com.demotix.formvalidation.core.DmxCondition;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class DmxConditionPasswordStrength extends DmxCondition {
  public DmxPasswordStrength requiredStrength;

  public boolean check(String string) {
    if (null == string)
      return false;

    boolean passed = false;

    // If strength is more than or equal to the required strength to pass, the condition can pass
    if(_strengthOfPasswordString(string) >= DmxPasswordStrength.toInteger(requiredStrength)) {
      passed = true;
    }

    return passed;
  }

  public boolean shouldAllowViolation() {
    return true;
  }

  public String localizedViolationString() {
    String key = "DmxKeyConditionViolationPasswordStrength";

    return null;
  }

  public int _strengthOfPasswordString(String string) {
    int strength = 0;

    // Run regex on string to check for matches of lowercase, uppercase, numeric and special chars
    int numberMatchesCount = _numberOfNumericCharactersInString(string);
    int lowercaseMatchesCount = _numberOfLowercaseCharactersInString(string);
    int uppercaseMatchesCount = _numberOfUppercaseCharactersInString(string);
    int specialCharacterMatchesCount = _numberOfSpecialCharactersInString(string);

    // For each match of each type, move the strength value up one (higher = stronger)
    if (numberMatchesCount > 0) {
      strength ++;
    }

    if (lowercaseMatchesCount > 0) {
      strength ++;
    }

    if (uppercaseMatchesCount > 0) {
      strength ++;
    }

    if (specialCharacterMatchesCount > 0) {
      strength ++;
    }

    // Move the strength up if the length is more than 8 characters and down if it is less
    if (string.length() > 8) {
      strength ++;
    }
    else if (strength > 0) {
      strength --;
    }

    return strength;
  }

  public int _numberOfNumericCharactersInString(String string) {
    return _numberOfMatchesWithPattern("\\d", string);
  }

  public int _numberOfLowercaseCharactersInString(String string)
  {
    return _numberOfMatchesWithPattern("[a-z]", string);
  }

  public int _numberOfUppercaseCharactersInString(String string) {
    return _numberOfMatchesWithPattern("[A-Z]", string);
  }

  public int _numberOfSpecialCharactersInString(String string) {
    return _numberOfMatchesWithPattern("[^a-zA-Z\\d]", string);
  }

  public int _numberOfMatchesWithPattern(String pattern, String string) {
    Pattern p = Pattern.compile(pattern);
    Matcher matcher = p.matcher(string);

    int count = 0;
    while (matcher.find())
      count++;

    return count;
  }
}
