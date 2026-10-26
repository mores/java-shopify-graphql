package com.shopify.admin.types;

import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.Objects;

/**
 * The input fields for updating an exclusion condition in a collection source.
 */
public class CollectionUpdateSourceExclusionConditionInput {
  /**
   * The ID of the exclusion condition to update.
   */
  private String id;

  /**
   * The updated exclusion condition.
   */
  private CollectionSourceExclusionConditionUpdateInput condition;

  public CollectionUpdateSourceExclusionConditionInput() {
  }

  /**
   * The ID of the exclusion condition to update.
   */
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  /**
   * The updated exclusion condition.
   */
  public CollectionSourceExclusionConditionUpdateInput getCondition() {
    return condition;
  }

  public void setCondition(CollectionSourceExclusionConditionUpdateInput condition) {
    this.condition = condition;
  }

  @Override
  public String toString() {
    return "CollectionUpdateSourceExclusionConditionInput{id='" + id + "', condition='" + condition + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    CollectionUpdateSourceExclusionConditionInput that = (CollectionUpdateSourceExclusionConditionInput) o;
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
     * The ID of the exclusion condition to update.
     */
    private String id;

    /**
     * The updated exclusion condition.
     */
    private CollectionSourceExclusionConditionUpdateInput condition;

    public CollectionUpdateSourceExclusionConditionInput build() {
      CollectionUpdateSourceExclusionConditionInput result = new CollectionUpdateSourceExclusionConditionInput();
      result.id = this.id;
      result.condition = this.condition;
      return result;
    }

    /**
     * The ID of the exclusion condition to update.
     */
    public Builder id(String id) {
      this.id = id;
      return this;
    }

    /**
     * The updated exclusion condition.
     */
    public Builder condition(CollectionSourceExclusionConditionUpdateInput condition) {
      this.condition = condition;
      return this;
    }
  }
}
