package com.shopify.types;

import java.lang.Double;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.Objects;

/**
 * The input fields for updating the condition of a delivery method definition.
 */
public class DeliveryUpdateConditionInput {
  /**
   * A globally-unique ID of the condition.
   */
  private String id;

  /**
   * The value that will be used in comparison.
   */
  private Double criteria;

  /**
   * The unit associated with the value that will be used in comparison.
   */
  private String criteriaUnit;

  /**
   * The property of an order that will be used in comparison.
   */
  private DeliveryConditionField field;

  /**
   * The operator to use for comparison.
   */
  private DeliveryConditionOperator operator;

  public DeliveryUpdateConditionInput() {
  }

  /**
   * A globally-unique ID of the condition.
   */
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  /**
   * The value that will be used in comparison.
   */
  public Double getCriteria() {
    return criteria;
  }

  public void setCriteria(Double criteria) {
    this.criteria = criteria;
  }

  /**
   * The unit associated with the value that will be used in comparison.
   */
  public String getCriteriaUnit() {
    return criteriaUnit;
  }

  public void setCriteriaUnit(String criteriaUnit) {
    this.criteriaUnit = criteriaUnit;
  }

  /**
   * The property of an order that will be used in comparison.
   */
  public DeliveryConditionField getField() {
    return field;
  }

  public void setField(DeliveryConditionField field) {
    this.field = field;
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
    return "DeliveryUpdateConditionInput{id='" + id + "', criteria='" + criteria + "', criteriaUnit='" + criteriaUnit + "', field='" + field + "', operator='" + operator + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    DeliveryUpdateConditionInput that = (DeliveryUpdateConditionInput) o;
    return Objects.equals(id, that.id) &&
        Objects.equals(criteria, that.criteria) &&
        Objects.equals(criteriaUnit, that.criteriaUnit) &&
        Objects.equals(field, that.field) &&
        Objects.equals(operator, that.operator);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, criteria, criteriaUnit, field, operator);
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public static class Builder {
    /**
     * A globally-unique ID of the condition.
     */
    private String id;

    /**
     * The value that will be used in comparison.
     */
    private Double criteria;

    /**
     * The unit associated with the value that will be used in comparison.
     */
    private String criteriaUnit;

    /**
     * The property of an order that will be used in comparison.
     */
    private DeliveryConditionField field;

    /**
     * The operator to use for comparison.
     */
    private DeliveryConditionOperator operator;

    public DeliveryUpdateConditionInput build() {
      DeliveryUpdateConditionInput result = new DeliveryUpdateConditionInput();
      result.id = this.id;
      result.criteria = this.criteria;
      result.criteriaUnit = this.criteriaUnit;
      result.field = this.field;
      result.operator = this.operator;
      return result;
    }

    /**
     * A globally-unique ID of the condition.
     */
    public Builder id(String id) {
      this.id = id;
      return this;
    }

    /**
     * The value that will be used in comparison.
     */
    public Builder criteria(Double criteria) {
      this.criteria = criteria;
      return this;
    }

    /**
     * The unit associated with the value that will be used in comparison.
     */
    public Builder criteriaUnit(String criteriaUnit) {
      this.criteriaUnit = criteriaUnit;
      return this;
    }

    /**
     * The property of an order that will be used in comparison.
     */
    public Builder field(DeliveryConditionField field) {
      this.field = field;
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
