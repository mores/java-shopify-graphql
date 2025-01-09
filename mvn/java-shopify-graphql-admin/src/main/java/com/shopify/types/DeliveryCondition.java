package com.shopify.types;

import com.fasterxml.jackson.annotation.JsonTypeInfo;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.Objects;

/**
 * A condition that must pass for a delivery method definition to be applied to an order.
 */
@JsonTypeInfo(
    use = JsonTypeInfo.Id.NONE
)
public class DeliveryCondition implements com.shopify.types.Node {
  /**
   * The value (weight or price) that the condition field is compared to.
   */
  private DeliveryConditionCriteria conditionCriteria;

  /**
   * The field to compare the criterion value against, using the operator.
   */
  private DeliveryConditionField field;

  /**
   * A globally-unique ID.
   */
  private String id;

  /**
   * The operator to compare the field and criterion value.
   */
  private DeliveryConditionOperator operator;

  public DeliveryCondition() {
  }

  /**
   * The value (weight or price) that the condition field is compared to.
   */
  public DeliveryConditionCriteria getConditionCriteria() {
    return conditionCriteria;
  }

  public void setConditionCriteria(DeliveryConditionCriteria conditionCriteria) {
    this.conditionCriteria = conditionCriteria;
  }

  /**
   * The field to compare the criterion value against, using the operator.
   */
  public DeliveryConditionField getField() {
    return field;
  }

  public void setField(DeliveryConditionField field) {
    this.field = field;
  }

  /**
   * A globally-unique ID.
   */
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  /**
   * The operator to compare the field and criterion value.
   */
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
    /**
     * The value (weight or price) that the condition field is compared to.
     */
    private DeliveryConditionCriteria conditionCriteria;

    /**
     * The field to compare the criterion value against, using the operator.
     */
    private DeliveryConditionField field;

    /**
     * A globally-unique ID.
     */
    private String id;

    /**
     * The operator to compare the field and criterion value.
     */
    private DeliveryConditionOperator operator;

    public DeliveryCondition build() {
      DeliveryCondition result = new DeliveryCondition();
      result.conditionCriteria = this.conditionCriteria;
      result.field = this.field;
      result.id = this.id;
      result.operator = this.operator;
      return result;
    }

    /**
     * The value (weight or price) that the condition field is compared to.
     */
    public Builder conditionCriteria(DeliveryConditionCriteria conditionCriteria) {
      this.conditionCriteria = conditionCriteria;
      return this;
    }

    /**
     * The field to compare the criterion value against, using the operator.
     */
    public Builder field(DeliveryConditionField field) {
      this.field = field;
      return this;
    }

    /**
     * A globally-unique ID.
     */
    public Builder id(String id) {
      this.id = id;
      return this;
    }

    /**
     * The operator to compare the field and criterion value.
     */
    public Builder operator(DeliveryConditionOperator operator) {
      this.operator = operator;
      return this;
    }
  }
}
