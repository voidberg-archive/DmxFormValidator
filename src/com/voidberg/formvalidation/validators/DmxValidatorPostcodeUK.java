package com.voidberg.formvalidation.validators;

import com.voidberg.formvalidation.conditions.DmxConditionPostcodeUK;
import com.voidberg.formvalidation.conditions.DmxConditionRange;
import com.voidberg.formvalidation.core.DmxValidator;

public class DmxValidatorPostcodeUK extends DmxValidator {
  public DmxValidatorPostcodeUK() {
    DmxConditionRange rangeCondition   = new DmxConditionRange();
    rangeCondition.min = 0;
    rangeCondition.max = 8;
    rangeCondition.shouldAllowViolation = false;

    addCondition(rangeCondition);
    addCondition(new DmxConditionPostcodeUK());
  }
}
