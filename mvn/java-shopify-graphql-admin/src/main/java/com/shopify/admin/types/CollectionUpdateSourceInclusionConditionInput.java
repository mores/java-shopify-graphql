package com.shopify.admin.types;

import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.Objects;

/**
 * The input fields for updating a condition in a collection source.
 */
public class CollectionUpdateSourceInclusionConditionInput {
  /**
   * The ID of the condition to update.
   */
  private String id;

  /**
   * The updated condition.
   */
  private CollectionSourceInclusionConditionUpdateInput condition;

  public CollectionUpdateSourceInclusionConditionInput() {
  }

  /**
   * The ID of the condition to update.
   */
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  /**
   * The updated condition.
   */
  public CollectionSourceInclusionConditionUpdateInput getCondition() {
    return condition;
  }

  public void setCondition(CollectionSourceInclusionConditionUpdateInput condition) {
    this.condition = condition;
  }

  @Override
  public String toString() {
    return "CollectionUpdateSourceInclusionConditionInput{id='" + id + "', condition='" + condition + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    CollectionUpdateSourceInclusionConditionInput that = (CollectionUpdateSourceInclusionConditionInput) o;
    return Objects.equals(id, that.id) &&
        Objects.equals(condition, that.condition);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, condition);
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public static class Builder {
    /**
     * The ID of the condition to update.
     */
    private String id;

    /**
     * The updated condition.
     */
    private CollectionSourceInclusionConditionUpdateInput condition;

    public CollectionUpdateSourceInclusionConditionInput build() {
      CollectionUpdateSourceInclusionConditionInput result = new CollectionUpdateSourceInclusionConditionInput();
      result.id = this.id;
      result.condition = this.condition;
      return result;
    }

    /**
     * The ID of the condition to update.
     */
    public Builder id(String id) {
      this.id = id;
      return this;
    }

    /**
     * The updated condition.
     */
    public Builder condition(CollectionSourceInclusionConditionUpdateInput condition) {
      this.condition = condition;
      return this;
    }
  }
}
