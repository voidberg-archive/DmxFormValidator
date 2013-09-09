package com.voidberg.formvalidation.validators;

import com.voidberg.formvalidation.conditions.DmxConditionAlphabetic;
import com.voidberg.formvalidation.core.DmxValidator;

public class DmxValidatorAlphabetic extends DmxValidator {
  public DmxValidatorAlphabetic() {
    addCondition(new DmxConditionAlphabetic());
  }
}
