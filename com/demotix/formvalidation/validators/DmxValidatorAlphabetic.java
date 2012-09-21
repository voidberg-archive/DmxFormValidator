package com.demotix.formvalidation.validators;

import com.demotix.formvalidation.conditions.DmxConditionAlphabetic;
import com.demotix.formvalidation.core.DmxValidator;

public class DmxValidatorAlphabetic extends DmxValidator {
  public DmxValidatorAlphabetic() {
    addCondition(new DmxConditionAlphabetic());
  }
}
