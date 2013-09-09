package com.demotix.formvalidation.validators;

import com.demotix.formvalidation.conditions.DmxConditionNumeric;
import com.demotix.formvalidation.core.DmxValidator;

public class DmxValidatorNumeric extends DmxValidator {
  public DmxValidatorNumeric() {
    addCondition(new DmxConditionNumeric());
  }
}
