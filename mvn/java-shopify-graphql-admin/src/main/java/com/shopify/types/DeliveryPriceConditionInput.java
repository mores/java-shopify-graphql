package com.shopify.types;

import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.Objects;


public class DeliveryPriceConditionInput {
  
  private MoneyInput criteria;

  
  private DeliveryConditionOperator operator;

  public DeliveryPriceConditionInput() {
  }

  
  public MoneyInput getCriteria() {
    return criteria;
  }

  public void setCriteria(MoneyInput criteria) {
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
    return "DeliveryPriceConditionInput{criteria='" + criteria + "', operator='" + operator + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    DeliveryPriceConditionInput that = (DeliveryPriceConditionInput) o;
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
    
    private MoneyInput criteria;

    
    private DeliveryConditionOperator operator;

    public DeliveryPriceConditionInput build() {
      DeliveryPriceConditionInput result = new DeliveryPriceConditionInput();
      result.criteria = this.criteria;
      result.operator = this.operator;
      return result;
    }

    
    public Builder criteria(MoneyInput criteria) {
      this.criteria = criteria;
      return this;
    }

    
    public Builder operator(DeliveryConditionOperator operator) {
      this.operator = operator;
      return this;
    }
  }
}
