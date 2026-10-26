package com.shopify.admin.types;

import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.Objects;

/**
 * The input fields for a condition based on variant compare at prices.
 */
public class CollectionSourceInclusionConditionVariantCompareAtPriceInput {
  /**
   * The relationship between the variant compare at price and the condition value.
   */
  private CollectionSourceInclusionConditionVariantCompareAtPriceRelation relation;

  /**
   * The variant compare at price to match against. Required for numeric relations and must be absent for IS_SET or IS_NOT_SET.
   */
  private MoneyInput value;

  public CollectionSourceInclusionConditionVariantCompareAtPriceInput() {
  }

  /**
   * The relationship between the variant compare at price and the condition value.
   */
  public CollectionSourceInclusionConditionVariantCompareAtPriceRelation getRelation() {
    return relation;
  }

  public void setRelation(
      CollectionSourceInclusionConditionVariantCompareAtPriceRelation relation) {
    this.relation = relation;
  }

  /**
   * The variant compare at price to match against. Required for numeric relations and must be absent for IS_SET or IS_NOT_SET.
   */
  public MoneyInput getValue() {
    return value;
  }

  public void setValue(MoneyInput value) {
    this.value = value;
  }

  @Override
  public String toString() {
    return "CollectionSourceInclusionConditionVariantCompareAtPriceInput{relation='" + relation + "', value='" + value + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    CollectionSourceInclusionConditionVariantCompareAtPriceInput that = (CollectionSourceInclusionConditionVariantCompareAtPriceInput) o;
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
     * The relationship between the variant compare at price and the condition value.
     */
    private CollectionSourceInclusionConditionVariantCompareAtPriceRelation relation;

    /**
     * The variant compare at price to match against. Required for numeric relations and must be absent for IS_SET or IS_NOT_SET.
     */
    private MoneyInput value;

    public CollectionSourceInclusionConditionVariantCompareAtPriceInput build() {
      CollectionSourceInclusionConditionVariantCompareAtPriceInput result = new CollectionSourceInclusionConditionVariantCompareAtPriceInput();
      result.relation = this.relation;
      result.value = this.value;
      return result;
    }

    /**
     * The relationship between the variant compare at price and the condition value.
     */
    public Builder relation(
        CollectionSourceInclusionConditionVariantCompareAtPriceRelation relation) {
      this.relation = relation;
      return this;
    }

    /**
     * The variant compare at price to match against. Required for numeric relations and must be absent for IS_SET or IS_NOT_SET.
     */
    public Builder value(MoneyInput value) {
      this.value = value;
      return this;
    }
  }
}
