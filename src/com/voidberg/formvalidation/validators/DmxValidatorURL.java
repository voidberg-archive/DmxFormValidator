package com.voidberg.formvalidation.validators;

import com.voidberg.formvalidation.conditions.DmxConditionURL;
import com.voidberg.formvalidation.core.DmxValidator;

public class DmxValidatorURL extends DmxValidator {
  public DmxValidatorURL() {
    addCondition(new DmxConditionURL());
  }
}
