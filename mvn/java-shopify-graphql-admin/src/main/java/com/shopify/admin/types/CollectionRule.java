package com.shopify.admin.types;

import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.Objects;

/**
 * Represents at rule that's used to assign products to a collection.
 */
public class CollectionRule {
  /**
   * The attribute that the rule focuses on. For example, `title` or `product_type`.
   */
  private CollectionRuleColumn column;

  /**
   * The value that the operator is applied to. For example, `Hats`.
   */
  private String condition;

  /**
   * The value that the operator is applied to.
   */
  private CollectionRuleConditionObject conditionObject;

  /**
   * The type of operator that the rule is based on. For example, `equals`, `contains`, or `not_equals`.
   */
  private CollectionRuleRelation relation;

  public CollectionRule() {
  }

  /**
   * The attribute that the rule focuses on. For example, `title` or `product_type`.
   */
  public CollectionRuleColumn getColumn() {
    return column;
  }

  public void setColumn(CollectionRuleColumn column) {
    this.column = column;
  }

  /**
   * The value that the operator is applied to. For example, `Hats`.
   */
  public String getCondition() {
    return condition;
  }

  public void setCondition(String condition) {
    this.condition = condition;
  }

  /**
   * The value that the operator is applied to.
   */
  public CollectionRuleConditionObject getConditionObject() {
    return conditionObject;
  }

  public void setConditionObject(CollectionRuleConditionObject conditionObject) {
    this.conditionObject = conditionObject;
  }

  /**
   * The type of operator that the rule is based on. For example, `equals`, `contains`, or `not_equals`.
   */
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
    /**
     * The attribute that the rule focuses on. For example, `title` or `product_type`.
     */
    private CollectionRuleColumn column;

    /**
     * The value that the operator is applied to. For example, `Hats`.
     */
    private String condition;

    /**
     * The value that the operator is applied to.
     */
    private CollectionRuleConditionObject conditionObject;

    /**
     * The type of operator that the rule is based on. For example, `equals`, `contains`, or `not_equals`.
     */
    private CollectionRuleRelation relation;

    public CollectionRule build() {
      CollectionRule result = new CollectionRule();
      result.column = this.column;
      result.condition = this.condition;
      result.conditionObject = this.conditionObject;
      result.relation = this.relation;
      return result;
    }

    /**
     * The attribute that the rule focuses on. For example, `title` or `product_type`.
     */
    public Builder column(CollectionRuleColumn column) {
      this.column = column;
      return this;
    }

    /**
     * The value that the operator is applied to. For example, `Hats`.
     */
    public Builder condition(String condition) {
      this.condition = condition;
      return this;
    }

    /**
     * The value that the operator is applied to.
     */
    public Builder conditionObject(CollectionRuleConditionObject conditionObject) {
      this.conditionObject = conditionObject;
      return this;
    }

    /**
     * The type of operator that the rule is based on. For example, `equals`, `contains`, or `not_equals`.
     */
    public Builder relation(CollectionRuleRelation relation) {
      this.relation = relation;
      return this;
    }
  }
}
