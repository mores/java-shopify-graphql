package com.shopify.admin.types;

import com.fasterxml.jackson.annotation.JsonTypeInfo;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.Objects;

/**
 * A condition based on variant weights for including products in a collection.
 */
@JsonTypeInfo(
    use = JsonTypeInfo.Id.NONE
)
public class CollectionSourceInclusionConditionVariantWeight implements com.shopify.admin.types.CollectionSourceInclusionCondition {
  /**
   * The unique identifier for this condition.
   */
  private String id;

  /**
   * The relationship between the variant weight and the condition values.
   */
  private CollectionSourceInclusionConditionVariantWeightRelation relation;

  /**
   * The variant weight to match against.
   */
  private Weight value;

  public CollectionSourceInclusionConditionVariantWeight() {
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
   * The relationship between the variant weight and the condition values.
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
  public Weight getValue() {
    return value;
  }

  public void setValue(Weight value) {
    this.value = value;
  }

  @Override
  public String toString() {
    return "CollectionSourceInclusionConditionVariantWeight{id='" + id + "', relation='" + relation + "', value='" + value + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    CollectionSourceInclusionConditionVariantWeight that = (CollectionSourceInclusionConditionVariantWeight) o;
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
     * The relationship between the variant weight and the condition values.
     */
    private CollectionSourceInclusionConditionVariantWeightRelation relation;

    /**
     * The variant weight to match against.
     */
    private Weight value;

    public CollectionSourceInclusionConditionVariantWeight build() {
      CollectionSourceInclusionConditionVariantWeight result = new CollectionSourceInclusionConditionVariantWeight();
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
     * The relationship between the variant weight and the condition values.
     */
    public Builder relation(CollectionSourceInclusionConditionVariantWeightRelation relation) {
      this.relation = relation;
      return this;
    }

    /**
     * The variant weight to match against.
     */
    public Builder value(Weight value) {
      this.value = value;
      return this;
    }
  }
}
