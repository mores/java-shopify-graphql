package com.shopify.types;

import com.fasterxml.jackson.annotation.JsonTypeInfo;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.Objects;


@JsonTypeInfo(
    use = JsonTypeInfo.Id.NONE
)
public class DeliveryCondition implements com.shopify.types.Node {
  
  private DeliveryConditionCriteria conditionCriteria;

  
  private DeliveryConditionField field;

  
  private String id;

  
  private DeliveryConditionOperator operator;

  public DeliveryCondition() {
  }

  
  public DeliveryConditionCriteria getConditionCriteria() {
    return conditionCriteria;
  }

  public void setConditionCriteria(DeliveryConditionCriteria conditionCriteria) {
    this.conditionCriteria = conditionCriteria;
  }

  
  public DeliveryConditionField getField() {
    return field;
  }

  public void setField(DeliveryConditionField field) {
    this.field = field;
  }

  
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  
  public DeliveryConditionOperator getOperator() {
    return operator;
  }

  public void setOperator(DeliveryConditionOperator operator) {
    this.operator = operator;
  }

  @Override
  public String toString() {
    return "DeliveryCondition{conditionCriteria='" + conditionCriteria + "', field='" + field + "', id='" + id + "', operator='" + operator + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    DeliveryCondition that = (DeliveryCondition) o;
    return Objects.equals(conditionCriteria, that.conditionCriteria) &&
        Objects.equals(field, that.field) &&
        Objects.equals(id, that.id) &&
        Objects.equals(operator, that.operator);
  }

  @Override
  public int hashCode() {
    return Objects.hash(conditionCriteria, field, id, operator);
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public static class Builder {
    
    private DeliveryConditionCriteria conditionCriteria;

    
    private DeliveryConditionField field;

    
    private String id;

    
    private DeliveryConditionOperator operator;

    public DeliveryCondition build() {
      DeliveryCondition result = new DeliveryCondition();
      result.conditionCriteria = this.conditionCriteria;
      result.field = this.field;
      result.id = this.id;
      result.operator = this.operator;
      return result;
    }

    
    public Builder conditionCriteria(DeliveryConditionCriteria conditionCriteria) {
      this.conditionCriteria = conditionCriteria;
      return this;
    }

    
    public Builder field(DeliveryConditionField field) {
      this.field = field;
      return this;
    }

    
    public Builder id(String id) {
      this.id = id;
      return this;
    }

    
    public Builder operator(DeliveryConditionOperator operator) {
      this.operator = operator;
      return this;
    }
  }
}
