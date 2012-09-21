package com.demotix.formvalidation.validators;

import com.demotix.formvalidation.conditions.DmxConditionAlphanumeric;
import com.demotix.formvalidation.core.DmxValidator;

public class DmxValidatorAlphanumeric extends DmxValidator {
  public DmxValidatorAlphanumeric() {
    addCondition(new DmxConditionAlphanumeric());
  }
}
