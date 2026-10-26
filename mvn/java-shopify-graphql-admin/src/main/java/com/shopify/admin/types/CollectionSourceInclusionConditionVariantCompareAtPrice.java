package com.shopify.admin.types;

import com.fasterxml.jackson.annotation.JsonTypeInfo;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.Objects;

/**
 * A condition based on variant compare at prices for including products in a collection.
 */
@JsonTypeInfo(
    use = JsonTypeInfo.Id.NONE
)
public class CollectionSourceInclusionConditionVariantCompareAtPrice implements com.shopify.admin.types.CollectionSourceInclusionCondition {
  /**
   * The unique identifier for this condition.
   */
  private String id;

  /**
   * The relationship between the variant compare at price and the condition values.
   */
  private CollectionSourceInclusionConditionVariantCompareAtPriceRelation relation;

  /**
   * The variant compare at price to match against. Null when the relation is IS_SET or IS_NOT_SET.
   */
  private MoneyV2 value;

  public CollectionSourceInclusionConditionVariantCompareAtPrice() {
  }

  /**
   * The unique identifier for this condition.
   */
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  /**
   * The relationship between the variant compare at price and the condition values.
   */
  public CollectionSourceInclusionConditionVariantCompareAtPriceRelation getRelation() {
    return relation;
  }

  public void setRelation(
      CollectionSourceInclusionConditionVariantCompareAtPriceRelation relation) {
    this.relation = relation;
  }

  /**
   * The variant compare at price to match against. Null when the relation is IS_SET or IS_NOT_SET.
   */
  public MoneyV2 getValue() {
    return value;
  }

  public void setValue(MoneyV2 value) {
    this.value = value;
  }

  @Override
  public String toString() {
    return "CollectionSourceInclusionConditionVariantCompareAtPrice{id='" + id + "', relation='" + relation + "', value='" + value + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    CollectionSourceInclusionConditionVariantCompareAtPrice that = (CollectionSourceInclusionConditionVariantCompareAtPrice) o;
    return Objects.equals(id, that.id) &&
        Objects.equals(relation, that.relation) &&
        Objects.equals(value, that.value);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, relation, value);
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public static class Builder {
    /**
     * The unique identifier for this condition.
     */
    private String id;

    /**
     * The relationship between the variant compare at price and the condition values.
     */
    private CollectionSourceInclusionConditionVariantCompareAtPriceRelation relation;

    /**
     * The variant compare at price to match against. Null when the relation is IS_SET or IS_NOT_SET.
     */
    private MoneyV2 value;

    public CollectionSourceInclusionConditionVariantCompareAtPrice build() {
      CollectionSourceInclusionConditionVariantCompareAtPrice result = new CollectionSourceInclusionConditionVariantCompareAtPrice();
      result.id = this.id;
      result.relation = this.relation;
      result.value = this.value;
      return result;
    }

    /**
     * The unique identifier for this condition.
     */
    public Builder id(String id) {
      this.id = id;
      return this;
    }

    /**
     * The relationship between the variant compare at price and the condition values.
     */
    public Builder relation(
        CollectionSourceInclusionConditionVariantCompareAtPriceRelation relation) {
      this.relation = relation;
      return this;
    }

    /**
     * The variant compare at price to match against. Null when the relation is IS_SET or IS_NOT_SET.
     */
    public Builder value(MoneyV2 value) {
      this.value = value;
      return this;
    }
  }
}
