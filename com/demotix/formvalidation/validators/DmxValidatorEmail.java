package com.demotix.formvalidation.validators;

import com.demotix.formvalidation.conditions.DmxConditionEmail;
import com.demotix.formvalidation.core.DmxValidator;

public class DmxValidatorEmail extends DmxValidator {
  public DmxValidatorEmail() {
    addCondition(new DmxConditionEmail());
  }
}
