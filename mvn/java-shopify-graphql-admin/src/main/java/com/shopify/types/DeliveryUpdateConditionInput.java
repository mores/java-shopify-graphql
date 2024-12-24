package com.shopify.types;

import java.lang.Double;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.Objects;


public class DeliveryUpdateConditionInput {
  
  private String id;

  
  private Double criteria;

  
  private String criteriaUnit;

  
  private DeliveryConditionField field;

  
  private DeliveryConditionOperator operator;

  public DeliveryUpdateConditionInput() {
  }

  
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  
  public Double getCriteria() {
    return criteria;
  }

  public void setCriteria(Double criteria) {
    this.criteria = criteria;
  }

  
  public String getCriteriaUnit() {
    return criteriaUnit;
  }

  public void setCriteriaUnit(String criteriaUnit) {
    this.criteriaUnit = criteriaUnit;
  }

  
  public DeliveryConditionField getField() {
    return field;
  }

  public void setField(DeliveryConditionField field) {
    this.field = field;
  }

  
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
    
    private String id;

    
    private Double criteria;

    
    private String criteriaUnit;

    
    private DeliveryConditionField field;

    
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

    
    public Builder id(String id) {
      this.id = id;
      return this;
    }

    
    public Builder criteria(Double criteria) {
      this.criteria = criteria;
      return this;
    }

    
    public Builder criteriaUnit(String criteriaUnit) {
      this.criteriaUnit = criteriaUnit;
      return this;
    }

    
    public Builder field(DeliveryConditionField field) {
      this.field = field;
      return this;
    }

    
    public Builder operator(DeliveryConditionOperator operator) {
      this.operator = operator;
      return this;
    }
  }
}
