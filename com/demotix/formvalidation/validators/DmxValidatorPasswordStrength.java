package com.demotix.formvalidation.validators;

import com.demotix.formvalidation.conditions.DmxConditionPasswordStrength;
import com.demotix.formvalidation.conditions.DmxPasswordStrength;
import com.demotix.formvalidation.core.DmxValidator;

public class DmxValidatorPasswordStrength extends DmxValidator {
  private DmxPasswordStrength _requiredStrength;

  public DmxValidatorPasswordStrength() {
    addCondition(new DmxConditionPasswordStrength());
  }

  public void setRequiredStrength(DmxPasswordStrength requiredStrength) {
    if(requiredStrength != _requiredStrength) {
      _requiredStrength = requiredStrength;

      // Remove all added password strength conditions
      removeConditionOfClass(DmxConditionPasswordStrength.class);

      // Add new strength condition
      DmxConditionPasswordStrength strengthCondition = new DmxConditionPasswordStrength();
      strengthCondition.requiredStrength = _requiredStrength;
      addCondition(strengthCondition);
    }
  }
}
