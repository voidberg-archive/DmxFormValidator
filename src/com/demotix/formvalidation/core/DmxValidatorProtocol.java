package com.demotix.formvalidation.core;

import com.demotix.formvalidation.conditions.DmxConditionCollection;

public interface DmxValidatorProtocol {
  public void addCondition(DmxConditionProtocol condition);

  public void removeConditionOfClass(Class conditionClass);

  public DmxConditionCollection checkConditions(String string);
}
