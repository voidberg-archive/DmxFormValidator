package com.voidberg.formvalidation.validators;

import com.voidberg.formvalidation.conditions.DmxConditionShorthandURL;
import com.voidberg.formvalidation.core.DmxValidator;

public class DmxValidatorShorthandURL extends DmxValidator {
  public DmxValidatorShorthandURL() {
    addCondition(new DmxConditionShorthandURL());
  }
}
