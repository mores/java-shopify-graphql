package com.shopify.admin.types;

import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.Objects;

/**
 * The input fields for updating a condition based on variant weights.
 */
public class CollectionSourceInclusionConditionUpdateVariantWeightInput {
  /**
   * The relationship between the variant weight and the condition value.
   */
  private CollectionSourceInclusionConditionVariantWeightRelation relation;

  /**
   * The variant weight to match against.
   */
  private WeightInput value;

  public CollectionSourceInclusionConditionUpdateVariantWeightInput() {
  }

  /**
   * The relationship between the variant weight and the condition value.
   */
  public CollectionSourceInclusionConditionVariantWeightRelation getRelation() {
    return relation;
  }

  public void setRelation(CollectionSourceInclusionConditionVariantWeightRelation relation) {
    this.relation = relation;
  }

  /**
   * The variant weight to match against.
   */
  public WeightInput getValue() {
    return value;
  }

  public void setValue(WeightInput value) {
    this.value = value;
  }

  @Override
  public String toString() {
    return "CollectionSourceInclusionConditionUpdateVariantWeightInput{relation='" + relation + "', value='" + value + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    CollectionSourceInclusionConditionUpdateVariantWeightInput that = (CollectionSourceInclusionConditionUpdateVariantWeightInput) o;
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
     * The relationship between the variant weight and the condition value.
     */
    private CollectionSourceInclusionConditionVariantWeightRelation relation;

    /**
     * The variant weight to match against.
     */
    private WeightInput value;

    public CollectionSourceInclusionConditionUpdateVariantWeightInput build() {
      CollectionSourceInclusionConditionUpdateVariantWeightInput result = new CollectionSourceInclusionConditionUpdateVariantWeightInput();
      result.relation = this.relation;
      result.value = this.value;
      return result;
    }

    /**
     * The relationship between the variant weight and the condition value.
     */
    public Builder relation(CollectionSourceInclusionConditionVariantWeightRelation relation) {
      this.relation = relation;
      return this;
    }

    /**
     * The variant weight to match against.
     */
    public Builder value(WeightInput value) {
      this.value = value;
      return this;
    }
  }
}
