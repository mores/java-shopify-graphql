package com.shopify.admin.types;

import com.fasterxml.jackson.annotation.JsonTypeInfo;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.Objects;

/**
 * A condition based on variant prices for including products in a collection.
 */
@JsonTypeInfo(
    use = JsonTypeInfo.Id.NONE
)
public class CollectionSourceInclusionConditionVariantPrice implements com.shopify.admin.types.CollectionSourceInclusionCondition {
  /**
   * The unique identifier for this condition.
   */
  private String id;

  /**
   * The relationship between the variant price and the condition values.
   */
  private CollectionSourceInclusionConditionVariantPriceRelation relation;

  /**
   * The variant price to match against.
   */
  private MoneyV2 value;

  public CollectionSourceInclusionConditionVariantPrice() {
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
   * The relationship between the variant price and the condition values.
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
  public MoneyV2 getValue() {
    return value;
  }

  public void setValue(MoneyV2 value) {
    this.value = value;
  }

  @Override
  public String toString() {
    return "CollectionSourceInclusionConditionVariantPrice{id='" + id + "', relation='" + relation + "', value='" + value + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    CollectionSourceInclusionConditionVariantPrice that = (CollectionSourceInclusionConditionVariantPrice) o;
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
     * The relationship between the variant price and the condition values.
     */
    private CollectionSourceInclusionConditionVariantPriceRelation relation;

    /**
     * The variant price to match against.
     */
    private MoneyV2 value;

    public CollectionSourceInclusionConditionVariantPrice build() {
      CollectionSourceInclusionConditionVariantPrice result = new CollectionSourceInclusionConditionVariantPrice();
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
     * The relationship between the variant price and the condition values.
     */
    public Builder relation(CollectionSourceInclusionConditionVariantPriceRelation relation) {
      this.relation = relation;
      return this;
    }

    /**
     * The variant price to match against.
     */
    public Builder value(MoneyV2 value) {
      this.value = value;
      return this;
    }
  }
}
