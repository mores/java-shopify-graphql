package com.shopify.admin.types;

import java.lang.Integer;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.Objects;

/**
 * The input fields for updating a condition based on integer metafield values.
 */
public class CollectionSourceInclusionConditionUpdateMetafieldIntegerInput {
  /**
   * The ID of the metafield definition.
   */
  private String definitionId;

  /**
   * The relationship between the metafield value and the condition value.
   */
  private CollectionSourceInclusionConditionMetafieldIntegerRelation relation;

  /**
   * The integer value to match against.
   */
  private Integer value;

  public CollectionSourceInclusionConditionUpdateMetafieldIntegerInput() {
  }

  /**
   * The ID of the metafield definition.
   */
  public String getDefinitionId() {
    return definitionId;
  }

  public void setDefinitionId(String definitionId) {
    this.definitionId = definitionId;
  }

  /**
   * The relationship between the metafield value and the condition value.
   */
  public CollectionSourceInclusionConditionMetafieldIntegerRelation getRelation() {
    return relation;
  }

  public void setRelation(CollectionSourceInclusionConditionMetafieldIntegerRelation relation) {
    this.relation = relation;
  }

  /**
   * The integer value to match against.
   */
  public Integer getValue() {
    return value;
  }

  public void setValue(Integer value) {
    this.value = value;
  }

  @Override
  public String toString() {
    return "CollectionSourceInclusionConditionUpdateMetafieldIntegerInput{definitionId='" + definitionId + "', relation='" + relation + "', value='" + value + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    CollectionSourceInclusionConditionUpdateMetafieldIntegerInput that = (CollectionSourceInclusionConditionUpdateMetafieldIntegerInput) o;
    return Objects.equals(definitionId, that.definitionId) &&
        Objects.equals(relation, that.relation) &&
        Objects.equals(value, that.value);
  }

  @Override
  public int hashCode() {
    return Objects.hash(definitionId, relation, value);
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public static class Builder {
    /**
     * The ID of the metafield definition.
     */
    private String definitionId;

    /**
     * The relationship between the metafield value and the condition value.
     */
    private CollectionSourceInclusionConditionMetafieldIntegerRelation relation;

    /**
     * The integer value to match against.
     */
    private Integer value;

    public CollectionSourceInclusionConditionUpdateMetafieldIntegerInput build() {
      CollectionSourceInclusionConditionUpdateMetafieldIntegerInput result = new CollectionSourceInclusionConditionUpdateMetafieldIntegerInput();
      result.definitionId = this.definitionId;
      result.relation = this.relation;
      result.value = this.value;
      return result;
    }

    /**
     * The ID of the metafield definition.
     */
    public Builder definitionId(String definitionId) {
      this.definitionId = definitionId;
      return this;
    }

    /**
     * The relationship between the metafield value and the condition value.
     */
    public Builder relation(CollectionSourceInclusionConditionMetafieldIntegerRelation relation) {
      this.relation = relation;
      return this;
    }

    /**
     * The integer value to match against.
     */
    public Builder value(Integer value) {
      this.value = value;
      return this;
    }
  }
}
