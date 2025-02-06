package com.shopify.types;

import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.Objects;

/**
 * The input fields for a rule to associate with a collection.
 */
public class CollectionRuleInput {
  /**
   * The attribute that the rule focuses on. For example, `title` or `product_type`.
   */
  private CollectionRuleColumn column;

  /**
   * The type of operator that the rule is based on. For example, `equals`, `contains`, or `not_equals`.
   */
  private CollectionRuleRelation relation;

  /**
   * The value that the operator is applied to. For example, `Hats`.
   */
  private String condition;

  /**
   * The object ID that points to additional attributes for the collection rule.
   * This is only required when using metafield definition rules.
   */
  private String conditionObjectId;

  public CollectionRuleInput() {
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
   * The type of operator that the rule is based on. For example, `equals`, `contains`, or `not_equals`.
   */
  public CollectionRuleRelation getRelation() {
    return relation;
  }

  public void setRelation(CollectionRuleRelation relation) {
    this.relation = relation;
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
   * The object ID that points to additional attributes for the collection rule.
   * This is only required when using metafield definition rules.
   */
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
    /**
     * The attribute that the rule focuses on. For example, `title` or `product_type`.
     */
    private CollectionRuleColumn column;

    /**
     * The type of operator that the rule is based on. For example, `equals`, `contains`, or `not_equals`.
     */
    private CollectionRuleRelation relation;

    /**
     * The value that the operator is applied to. For example, `Hats`.
     */
    private String condition;

    /**
     * The object ID that points to additional attributes for the collection rule.
     * This is only required when using metafield definition rules.
     */
    private String conditionObjectId;

    public CollectionRuleInput build() {
      CollectionRuleInput result = new CollectionRuleInput();
      result.column = this.column;
      result.relation = this.relation;
      result.condition = this.condition;
      result.conditionObjectId = this.conditionObjectId;
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
     * The type of operator that the rule is based on. For example, `equals`, `contains`, or `not_equals`.
     */
    public Builder relation(CollectionRuleRelation relation) {
      this.relation = relation;
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
     * The object ID that points to additional attributes for the collection rule.
     * This is only required when using metafield definition rules.
     */
    public Builder conditionObjectId(String conditionObjectId) {
      this.conditionObjectId = conditionObjectId;
      return this;
    }
  }
}
