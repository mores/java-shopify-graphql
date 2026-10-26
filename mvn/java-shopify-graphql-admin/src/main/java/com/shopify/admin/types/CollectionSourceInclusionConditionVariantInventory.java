package com.shopify.admin.types;

import com.fasterxml.jackson.annotation.JsonTypeInfo;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.Objects;

/**
 * A condition based on variant inventory quantities for including products in a collection.
 */
@JsonTypeInfo(
    use = JsonTypeInfo.Id.NONE
)
public class CollectionSourceInclusionConditionVariantInventory implements com.shopify.admin.types.CollectionSourceInclusionCondition {
  /**
   * The unique identifier for this condition.
   */
  private String id;

  /**
   * The relationship between the variant inventory and the condition values.
   */
  private CollectionSourceInclusionConditionVariantInventoryRelation relation;

  /**
   * The variant inventory to match against.
   */
  private int value;

  public CollectionSourceInclusionConditionVariantInventory() {
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
   * The relationship between the variant inventory and the condition values.
   */
  public CollectionSourceInclusionConditionVariantInventoryRelation getRelation() {
    return relation;
  }

  public void setRelation(CollectionSourceInclusionConditionVariantInventoryRelation relation) {
    this.relation = relation;
  }

  /**
   * The variant inventory to match against.
   */
  public int getValue() {
    return value;
  }

  public void setValue(int value) {
    this.value = value;
  }

  @Override
  public String toString() {
    return "CollectionSourceInclusionConditionVariantInventory{id='" + id + "', relation='" + relation + "', value='" + value + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    CollectionSourceInclusionConditionVariantInventory that = (CollectionSourceInclusionConditionVariantInventory) o;
    return Objects.equals(id, that.id) &&
        Objects.equals(relation, that.relation) &&
        value == that.value;
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
     * The relationship between the variant inventory and the condition values.
     */
    private CollectionSourceInclusionConditionVariantInventoryRelation relation;

    /**
     * The variant inventory to match against.
     */
    private int value;

    public CollectionSourceInclusionConditionVariantInventory build() {
      CollectionSourceInclusionConditionVariantInventory result = new CollectionSourceInclusionConditionVariantInventory();
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
     * The relationship between the variant inventory and the condition values.
     */
    public Builder relation(CollectionSourceInclusionConditionVariantInventoryRelation relation) {
      this.relation = relation;
      return this;
    }

    /**
     * The variant inventory to match against.
     */
    public Builder value(int value) {
      this.value = value;
      return this;
    }
  }
}
