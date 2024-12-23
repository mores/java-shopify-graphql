package com.shopify.types;

import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.Objects;

/**
 * The input fields for a weight-based condition of a delivery method definition.
 */
public class DeliveryWeightConditionInput {
  /**
   * The weight value to compare the weight of an order to.
   */
  private WeightInput criteria;

  /**
   * The operator to use for comparison.
   */
  private DeliveryConditionOperator operator;

  public DeliveryWeightConditionInput() {
  }

  /**
   * The weight value to compare the weight of an order to.
   */
  public WeightInput getCriteria() {
    return criteria;
  }

  public void setCriteria(WeightInput criteria) {
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
    /**
     * The weight value to compare the weight of an order to.
     */
    private WeightInput criteria;

    /**
     * The operator to use for comparison.
     */
    private DeliveryConditionOperator operator;

    public DeliveryWeightConditionInput build() {
      DeliveryWeightConditionInput result = new DeliveryWeightConditionInput();
      result.criteria = this.criteria;
      result.operator = this.operator;
      return result;
    }

    /**
     * The weight value to compare the weight of an order to.
     */
    public Builder criteria(WeightInput criteria) {
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
