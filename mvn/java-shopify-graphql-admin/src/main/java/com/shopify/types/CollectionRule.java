package com.shopify.types;

import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.Objects;


public class CollectionRule {
  
  private CollectionRuleColumn column;

  
  private String condition;

  
  private CollectionRuleConditionObject conditionObject;

  
  private CollectionRuleRelation relation;

  public CollectionRule() {
  }

  
  public CollectionRuleColumn getColumn() {
    return column;
  }

  public void setColumn(CollectionRuleColumn column) {
    this.column = column;
  }

  
  public String getCondition() {
    return condition;
  }

  public void setCondition(String condition) {
    this.condition = condition;
  }

  
  public CollectionRuleConditionObject getConditionObject() {
    return conditionObject;
  }

  public void setConditionObject(CollectionRuleConditionObject conditionObject) {
    this.conditionObject = conditionObject;
  }

  
  public CollectionRuleRelation getRelation() {
    return relation;
  }

  public void setRelation(CollectionRuleRelation relation) {
    this.relation = relation;
  }

  @Override
  public String toString() {
    return "CollectionRule{column='" + column + "', condition='" + condition + "', conditionObject='" + conditionObject + "', relation='" + relation + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    CollectionRule that = (CollectionRule) o;
    return Objects.equals(column, that.column) &&
        Objects.equals(condition, that.condition) &&
        Objects.equals(conditionObject, that.conditionObject) &&
        Objects.equals(relation, that.relation);
  }

  @Override
  public int hashCode() {
    return Objects.hash(column, condition, conditionObject, relation);
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public static class Builder {
    
    private CollectionRuleColumn column;

    
    private String condition;

    
    private CollectionRuleConditionObject conditionObject;

    
    private CollectionRuleRelation relation;

    public CollectionRule build() {
      CollectionRule result = new CollectionRule();
      result.column = this.column;
      result.condition = this.condition;
      result.conditionObject = this.conditionObject;
      result.relation = this.relation;
      return result;
    }

    
    public Builder column(CollectionRuleColumn column) {
      this.column = column;
      return this;
    }

    
    public Builder condition(String condition) {
      this.condition = condition;
      return this;
    }

    
    public Builder conditionObject(CollectionRuleConditionObject conditionObject) {
      this.conditionObject = conditionObject;
      return this;
    }

    
    public Builder relation(CollectionRuleRelation relation) {
      this.relation = relation;
      return this;
    }
  }
}
