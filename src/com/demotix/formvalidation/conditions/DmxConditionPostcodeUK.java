package com.demotix.formvalidation.conditions;

import com.demotix.formvalidation.core.DmxCondition;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class DmxConditionPostcodeUK extends DmxCondition {
  public boolean check(String string) {
    if (null == string)
      return false;

    Pattern pattern = Pattern.compile("^([A-PR-UWYZa-pr-uwyz]([0-9]{1,2}|([A-HK-Ya-hk-y][0-9]|[A-HK-Ya-hk-y][0-9]([0-9]|[ABEHMNPRV-Yabehmnprv-y]))|[0-9][A-HJKS-UWa-hjks-uw])\\\\ {0,1}[0-9][ABD-HJLNP-UW-Zabd-hjlnp-uw-z]{2}|([Gg][Ii][Rr]\\\\ 0[Aa][Aa])|([Ss][Aa][Nn]\\\\ {0,1}[Tt][Aa]1)|([Bb][Ff][Pp][Oo]\\\\ {0,1}([Cc]\\\\/[Oo]\\\\ )?[0-9]{1,4})|(([Aa][Ss][Cc][Nn]|[Bb][Bb][Nn][Dd]|[BFSbfs][Ii][Qq][Qq]|[Pp][Cc][Rr][Nn]|[Ss][Tt][Hh][Ll]|[Tt][Dd][Cc][Uu]|[Tt][Kk][Cc][Aa])\\\\ {0,1}1[Zz][Zz]))$");
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
    String key = "DmxKeyConditionViolationPostcodeUK";

    return null;
  }
}
