package com.voidberg.formvalidation.validators;

import com.voidberg.formvalidation.conditions.DmxConditionEmail;
import com.voidberg.formvalidation.core.DmxValidator;

public class DmxValidatorEmail extends DmxValidator {
  public DmxValidatorEmail() {
    addCondition(new DmxConditionEmail());
  }
}
