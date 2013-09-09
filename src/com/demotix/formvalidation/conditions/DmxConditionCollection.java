package com.demotix.formvalidation.conditions;

import com.demotix.formvalidation.core.DmxCondition;
import com.demotix.formvalidation.core.DmxConditionProtocol;
import java.util.ArrayList;
import java.util.Iterator;

public class DmxConditionCollection implements Iterable<DmxCondition> {
  private ArrayList<DmxCondition> _array;

  public DmxConditionCollection() {
    _array = new ArrayList<DmxCondition>();
  }

  public void addCondition(DmxConditionProtocol condition) {
    _array.add((DmxCondition) condition);
  }

  public void removeCondition(DmxConditionProtocol condition) {
    _array.remove(condition);
  }

  public void removeConditionAtIndex(int index) {
    _array.remove(index);
  }

  DmxCondition conditionAtIndex(int index) {
    return (DmxCondition) _array.get(index);
  }

  public int count() {
    return _array.size();
  }

  public String description() {
    StringBuilder description = new StringBuilder();

    for (DmxCondition condition : _array) {
      description.append(condition.description());
    }

    return description.toString();
  }

  public Iterator<DmxCondition> iterator() {
    Iterator<DmxCondition> iterator = _array.iterator();
    return iterator;
  }
}
