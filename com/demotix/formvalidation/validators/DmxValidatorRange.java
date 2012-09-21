package com.demotix.formvalidation.validators;

import com.demotix.formvalidation.conditions.DmxConditionRange;
import com.demotix.formvalidation.conditions.DmxPasswordStrength;
import com.demotix.formvalidation.core.DmxValidator;

public class DmxValidatorRange extends DmxValidator {
  private DmxPasswordStrength _requiredStrength;

  public DmxValidatorRange() {
    addCondition(new DmxConditionRange());
  }

  public void setRange(int min, int max) {
    // Remove all added range conditions
    removeConditionOfClass(DmxConditionRange.class);

    // Add new range condition
    DmxConditionRange rangeCondition = new DmxConditionRange();
    rangeCondition.min= min;
    rangeCondition.max = max;
    addCondition(rangeCondition);
  }
}
