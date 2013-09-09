package com.voidberg.formvalidation.validators;

import com.voidberg.formvalidation.conditions.DmxConditionAlphanumeric;
import com.voidberg.formvalidation.core.DmxValidator;

public class DmxValidatorAlphanumeric extends DmxValidator {
  public DmxValidatorAlphanumeric() {
    addCondition(new DmxConditionAlphanumeric());
  }
}
