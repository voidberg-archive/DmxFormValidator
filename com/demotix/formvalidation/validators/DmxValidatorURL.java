package com.demotix.formvalidation.validators;

import com.demotix.formvalidation.conditions.DmxConditionURL;
import com.demotix.formvalidation.core.DmxValidator;

public class DmxValidatorURL extends DmxValidator {
  public DmxValidatorURL() {
    addCondition(new DmxConditionURL());
  }
}
