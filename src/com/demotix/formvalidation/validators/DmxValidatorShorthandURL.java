package com.demotix.formvalidation.validators;

import com.demotix.formvalidation.conditions.DmxConditionShorthandURL;
import com.demotix.formvalidation.core.DmxValidator;

public class DmxValidatorShorthandURL extends DmxValidator {
  public DmxValidatorShorthandURL() {
    addCondition(new DmxConditionShorthandURL());
  }
}
