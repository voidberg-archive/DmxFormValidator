package com.demotix.formvalidation.conditions;

public enum DmxPasswordStrength {
  DmxPasswordStrengthVeryWeak,
  DmxPasswordStrengthWeak,
  DmxPasswordStrengthMedium,
  DmxPasswordStrengthStrong,
  DmxPasswordStrengthVeryStrong;

  public static int toInteger(DmxPasswordStrength s) {
    switch(s) {
      case DmxPasswordStrengthVeryWeak:
        return 0;
      case DmxPasswordStrengthWeak:
        return 1;
      case DmxPasswordStrengthMedium:
        return 2;
      case DmxPasswordStrengthStrong:
        return 3;
      case DmxPasswordStrengthVeryStrong:
      default:
        return 4;
    }
  }
}
