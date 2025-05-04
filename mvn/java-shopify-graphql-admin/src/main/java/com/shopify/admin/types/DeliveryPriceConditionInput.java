package com.shopify.admin.types;

import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.Objects;

/**
 * The input fields for a price-based condition of a delivery method definition.
 */
public class DeliveryPriceConditionInput {
  /**
   * The monetary value to compare the price of an order to.
   */
  private MoneyInput criteria;

  /**
   * The operator to use for comparison.
   */
  private DeliveryConditionOperator operator;

  public DeliveryPriceConditionInput() {
  }

  /**
   * The monetary value to compare the price of an order to.
   */
  public MoneyInput getCriteria() {
    return criteria;
  }

  public void setCriteria(MoneyInput criteria) {
    this.criteria = criteria;
  }

  /**
   * The operator to use for comparison.
   */
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
    /**
     * The monetary value to compare the price of an order to.
     */
    private MoneyInput criteria;

    /**
     * The operator to use for comparison.
     */
    private DeliveryConditionOperator operator;

    public DeliveryPriceConditionInput build() {
      DeliveryPriceConditionInput result = new DeliveryPriceConditionInput();
      result.criteria = this.criteria;
      result.operator = this.operator;
      return result;
    }

    /**
     * The monetary value to compare the price of an order to.
     */
    public Builder criteria(MoneyInput criteria) {
      this.criteria = criteria;
      return this;
    }

    /**
     * The operator to use for comparison.
     */
    public Builder operator(DeliveryConditionOperator operator) {
      this.operator = operator;
      return this;
    }
  }
}
