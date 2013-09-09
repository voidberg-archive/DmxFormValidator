package com.voidberg.formvalidation.validators;

import com.voidberg.formvalidation.conditions.DmxConditionPasswordStrength;
import com.voidberg.formvalidation.conditions.DmxPasswordStrength;
import com.voidberg.formvalidation.core.DmxValidator;

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
