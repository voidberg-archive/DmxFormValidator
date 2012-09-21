package com.demotix.formvalidation.validators;

import com.demotix.formvalidation.conditions.DmxConditionPostcodeUK;
import com.demotix.formvalidation.conditions.DmxConditionRange;
import com.demotix.formvalidation.core.DmxValidator;

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
