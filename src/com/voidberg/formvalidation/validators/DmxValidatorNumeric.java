package com.voidberg.formvalidation.validators;

import com.voidberg.formvalidation.conditions.DmxConditionNumeric;
import com.voidberg.formvalidation.core.DmxValidator;

public class DmxValidatorNumeric extends DmxValidator {
  public DmxValidatorNumeric() {
    addCondition(new DmxConditionNumeric());
  }
}
