package com.shopify.types;

import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.Objects;


public class DeliveryWeightConditionInput {
  
  private WeightInput criteria;

  
  private DeliveryConditionOperator operator;

  public DeliveryWeightConditionInput() {
  }

  
  public WeightInput getCriteria() {
    return criteria;
  }

  public void setCriteria(WeightInput criteria) {
    this.criteria = criteria;
  }

  
  public DeliveryConditionOperator getOperator() {
    return operator;
  }

  public void setOperator(DeliveryConditionOperator operator) {
    this.operator = operator;
  }

  @Override
  public String toString() {
    return "DeliveryWeightConditionInput{criteria='" + criteria + "', operator='" + operator + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    DeliveryWeightConditionInput that = (DeliveryWeightConditionInput) o;
    return Objects.equals(criteria, that.criteria) &&
        Objects.equals(operator, that.operator);
  }

  @Override
  public int hashCode() {
    return Objects.hash(criteria, operator);
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public static class Builder {
    
    private WeightInput criteria;

    
    private DeliveryConditionOperator operator;

    public DeliveryWeightConditionInput build() {
      DeliveryWeightConditionInput result = new DeliveryWeightConditionInput();
      result.criteria = this.criteria;
      result.operator = this.operator;
      return result;
    }

    
    public Builder criteria(WeightInput criteria) {
      this.criteria = criteria;
      return this;
    }

    
    public Builder operator(DeliveryConditionOperator operator) {
      this.operator = operator;
      return this;
    }
  }
}
