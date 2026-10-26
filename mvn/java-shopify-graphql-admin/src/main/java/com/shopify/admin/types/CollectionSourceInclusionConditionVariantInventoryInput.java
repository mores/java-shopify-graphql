package com.shopify.admin.types;

import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.Objects;

/**
 * The input fields for a condition based on variant inventory quantities.
 */
public class CollectionSourceInclusionConditionVariantInventoryInput {
  /**
   * The relationship between the variant inventory and the condition value.
   */
  private CollectionSourceInclusionConditionVariantInventoryRelation relation;

  /**
   * The variant inventory quantity to match against.
   */
  private int value;

  public CollectionSourceInclusionConditionVariantInventoryInput() {
  }

  /**
   * The relationship between the variant inventory and the condition value.
   */
  public CollectionSourceInclusionConditionVariantInventoryRelation getRelation() {
    return relation;
  }

  public void setRelation(CollectionSourceInclusionConditionVariantInventoryRelation relation) {
    this.relation = relation;
  }

  /**
   * The variant inventory quantity to match against.
   */
  public int getValue() {
    return value;
  }

  public void setValue(int value) {
    this.value = value;
  }

  @Override
  public String toString() {
    return "CollectionSourceInclusionConditionVariantInventoryInput{relation='" + relation + "', value='" + value + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    CollectionSourceInclusionConditionVariantInventoryInput that = (CollectionSourceInclusionConditionVariantInventoryInput) o;
    return Objects.equals(relation, that.relation) &&
        value == that.value;
  }

  @Override
  public int hashCode() {
    return Objects.hash(relation, value);
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public static class Builder {
    /**
     * The relationship between the variant inventory and the condition value.
     */
    private CollectionSourceInclusionConditionVariantInventoryRelation relation;

    /**
     * The variant inventory quantity to match against.
     */
    private int value;

    public CollectionSourceInclusionConditionVariantInventoryInput build() {
      CollectionSourceInclusionConditionVariantInventoryInput result = new CollectionSourceInclusionConditionVariantInventoryInput();
      result.relation = this.relation;
      result.value = this.value;
      return result;
    }

    /**
     * The relationship between the variant inventory and the condition value.
     */
    public Builder relation(CollectionSourceInclusionConditionVariantInventoryRelation relation) {
      this.relation = relation;
      return this;
    }

    /**
     * The variant inventory quantity to match against.
     */
    public Builder value(int value) {
      this.value = value;
      return this;
    }
  }
}
