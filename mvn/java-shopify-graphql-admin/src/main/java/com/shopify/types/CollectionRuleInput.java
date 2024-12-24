package com.shopify.types;

import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.Objects;


public class CollectionRuleInput {
  
  private CollectionRuleColumn column;

  
  private CollectionRuleRelation relation;

  
  private String condition;

  
  private String conditionObjectId;

  public CollectionRuleInput() {
  }

  
  public CollectionRuleColumn getColumn() {
    return column;
  }

  public void setColumn(CollectionRuleColumn column) {
    this.column = column;
  }

  
  public CollectionRuleRelation getRelation() {
    return relation;
  }

  public void setRelation(CollectionRuleRelation relation) {
    this.relation = relation;
  }

  
  public String getCondition() {
    return condition;
  }

  public void setCondition(String condition) {
    this.condition = condition;
  }

  
  public String getConditionObjectId() {
    return conditionObjectId;
  }

  public void setConditionObjectId(String conditionObjectId) {
    this.conditionObjectId = conditionObjectId;
  }

  @Override
  public String toString() {
    return "CollectionRuleInput{column='" + column + "', relation='" + relation + "', condition='" + condition + "', conditionObjectId='" + conditionObjectId + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    CollectionRuleInput that = (CollectionRuleInput) o;
    return Objects.equals(column, that.column) &&
        Objects.equals(relation, that.relation) &&
        Objects.equals(condition, that.condition) &&
        Objects.equals(conditionObjectId, that.conditionObjectId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(column, relation, condition, conditionObjectId);
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public static class Builder {
    
    private CollectionRuleColumn column;

    
    private CollectionRuleRelation relation;

    
    private String condition;

    
    private String conditionObjectId;

    public CollectionRuleInput build() {
      CollectionRuleInput result = new CollectionRuleInput();
      result.column = this.column;
      result.relation = this.relation;
      result.condition = this.condition;
      result.conditionObjectId = this.conditionObjectId;
      return result;
    }

    
    public Builder column(CollectionRuleColumn column) {
      this.column = column;
      return this;
    }

    
    public Builder relation(CollectionRuleRelation relation) {
      this.relation = relation;
      return this;
    }

    
    public Builder condition(String condition) {
      this.condition = condition;
      return this;
    }

    
    public Builder conditionObjectId(String conditionObjectId) {
      this.conditionObjectId = conditionObjectId;
      return this;
    }
  }
}
