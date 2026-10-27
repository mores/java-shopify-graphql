package com.shopify.admin.types;

import java.lang.Integer;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.Objects;

/**
 * The input fields for updating a condition based on variant inventory quantities.
 */
public class CollectionSourceInclusionConditionUpdateVariantInventoryInput {
  /**
   * The relationship between the variant inventory and the condition value.
   */
  private CollectionSourceInclusionConditionVariantInventoryRelation relation;

  /**
   * The variant inventory quantity to match against.
   */
  private Integer value;

  public CollectionSourceInclusionConditionUpdateVariantInventoryInput() {
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
  public Integer getValue() {
    return value;
  }

  public void setValue(Integer value) {
    this.value = value;
  }

  @Override
  public String toString() {
    return "CollectionSourceInclusionConditionUpdateVariantInventoryInput{relation='" + relation + "', value='" + value + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    CollectionSourceInclusionConditionUpdateVariantInventoryInput that = (CollectionSourceInclusionConditionUpdateVariantInventoryInput) o;
    return Objects.equals(relation, that.relation) &&
        Objects.equals(value, that.value);
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
    private Integer value;

    public CollectionSourceInclusionConditionUpdateVariantInventoryInput build() {
      CollectionSourceInclusionConditionUpdateVariantInventoryInput result = new CollectionSourceInclusionConditionUpdateVariantInventoryInput();
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
    public Builder value(Integer value) {
      this.value = value;
      return this;
    }
  }
}
