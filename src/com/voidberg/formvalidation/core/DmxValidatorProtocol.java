package com.voidberg.formvalidation.core;

import com.voidberg.formvalidation.conditions.DmxConditionCollection;

public interface DmxValidatorProtocol {
  public void addCondition(DmxConditionProtocol condition);

  public void removeConditionOfClass(Class conditionClass);

  public DmxConditionCollection checkConditions(String string);
}
