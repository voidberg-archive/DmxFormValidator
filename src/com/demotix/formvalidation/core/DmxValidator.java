package com.demotix.formvalidation.core;

import com.demotix.formvalidation.conditions.DmxConditionCollection;

public class DmxValidator {
  DmxConditionCollection _conditionCollection;

  public DmxValidator() {
    _conditionCollection = new DmxConditionCollection();
  }

  public void addCondition(DmxConditionProtocol condition) {
    _conditionCollection.addCondition(condition);
  }

  public void removeConditionOfClass(Class c) {
    for (DmxCondition condition : _conditionCollection) {
      if (condition.getClass().getName().equals(c.getName())) {
        _conditionCollection.removeCondition(condition);
      }
    }
  }

  public DmxConditionCollection checkConditions(String string) {
    DmxConditionCollection violatedConditions = new DmxConditionCollection();
    for (DmxCondition condition : _conditionCollection) {
      if (false == condition.check(string)) {
        violatedConditions.addCondition(condition);
      }
    }

    return violatedConditions;
  }
}
