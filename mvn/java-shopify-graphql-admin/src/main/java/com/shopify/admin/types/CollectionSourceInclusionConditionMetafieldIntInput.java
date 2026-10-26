package com.shopify.admin.types;

import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.Objects;

/**
 * The input fields for a condition based on integer metafield values.
 */
public class CollectionSourceInclusionConditionMetafieldIntInput {
  /**
   * The ID of the metafield definition.
   */
  private String definitionId;

  /**
   * The relationship between the metafield value and the condition value.
   */
  private CollectionSourceInclusionConditionMetafieldIntRelation relation;

  /**
   * The integer value to match against, as a string.
   */
  private String value;

  public CollectionSourceInclusionConditionMetafieldIntInput() {
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
  public CollectionSourceInclusionConditionMetafieldIntRelation getRelation() {
    return relation;
  }

  public void setRelation(CollectionSourceInclusionConditionMetafieldIntRelation relation) {
    this.relation = relation;
  }

  /**
   * The integer value to match against, as a string.
   */
  public String getValue() {
    return value;
  }

  public void setValue(String value) {
    this.value = value;
  }

  @Override
  public String toString() {
    return "CollectionSourceInclusionConditionMetafieldIntInput{definitionId='" + definitionId + "', relation='" + relation + "', value='" + value + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    CollectionSourceInclusionConditionMetafieldIntInput that = (CollectionSourceInclusionConditionMetafieldIntInput) o;
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
    private CollectionSourceInclusionConditionMetafieldIntRelation relation;

    /**
     * The integer value to match against, as a string.
     */
    private String value;

    public CollectionSourceInclusionConditionMetafieldIntInput build() {
      CollectionSourceInclusionConditionMetafieldIntInput result = new CollectionSourceInclusionConditionMetafieldIntInput();
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
    public Builder relation(CollectionSourceInclusionConditionMetafieldIntRelation relation) {
      this.relation = relation;
      return this;
    }

    /**
     * The integer value to match against, as a string.
     */
    public Builder value(String value) {
      this.value = value;
      return this;
    }
  }
}
