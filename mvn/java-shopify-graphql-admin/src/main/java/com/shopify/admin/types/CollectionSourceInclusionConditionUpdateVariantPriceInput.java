package com.shopify.admin.types;

import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.Objects;

/**
 * The input fields for updating a condition based on variant prices.
 */
public class CollectionSourceInclusionConditionUpdateVariantPriceInput {
  /**
   * The relationship between the variant price and the condition value.
   */
  private CollectionSourceInclusionConditionVariantPriceRelation relation;

  /**
   * The variant price to match against.
   */
  private MoneyInput value;

  public CollectionSourceInclusionConditionUpdateVariantPriceInput() {
  }

  /**
   * The relationship between the variant price and the condition value.
   */
  public CollectionSourceInclusionConditionVariantPriceRelation getRelation() {
    return relation;
  }

  public void setRelation(CollectionSourceInclusionConditionVariantPriceRelation relation) {
    this.relation = relation;
  }

  /**
   * The variant price to match against.
   */
  public MoneyInput getValue() {
    return value;
  }

  public void setValue(MoneyInput value) {
    this.value = value;
  }

  @Override
  public String toString() {
    return "CollectionSourceInclusionConditionUpdateVariantPriceInput{relation='" + relation + "', value='" + value + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    CollectionSourceInclusionConditionUpdateVariantPriceInput that = (CollectionSourceInclusionConditionUpdateVariantPriceInput) o;
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
     * The relationship between the variant price and the condition value.
     */
    private CollectionSourceInclusionConditionVariantPriceRelation relation;

    /**
     * The variant price to match against.
     */
    private MoneyInput value;

    public CollectionSourceInclusionConditionUpdateVariantPriceInput build() {
      CollectionSourceInclusionConditionUpdateVariantPriceInput result = new CollectionSourceInclusionConditionUpdateVariantPriceInput();
      result.relation = this.relation;
      result.value = this.value;
      return result;
    }

    /**
     * The relationship between the variant price and the condition value.
     */
    public Builder relation(CollectionSourceInclusionConditionVariantPriceRelation relation) {
      this.relation = relation;
      return this;
    }

    /**
     * The variant price to match against.
     */
    public Builder value(MoneyInput value) {
      this.value = value;
      return this;
    }
  }
}
