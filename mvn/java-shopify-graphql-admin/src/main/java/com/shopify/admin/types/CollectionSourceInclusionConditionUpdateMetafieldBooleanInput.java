package com.shopify.admin.types;

import java.lang.Boolean;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.Objects;

/**
 * The input fields for updating a condition based on boolean metafield values.
 */
public class CollectionSourceInclusionConditionUpdateMetafieldBooleanInput {
  /**
   * The ID of the metafield definition.
   */
  private String definitionId;

  /**
   * The relationship between the metafield value and the condition value.
   */
  private CollectionSourceInclusionConditionMetafieldBooleanRelation relation;

  /**
   * The boolean value to match against.
   */
  private Boolean value;

  public CollectionSourceInclusionConditionUpdateMetafieldBooleanInput() {
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
  public CollectionSourceInclusionConditionMetafieldBooleanRelation getRelation() {
    return relation;
  }

  public void setRelation(CollectionSourceInclusionConditionMetafieldBooleanRelation relation) {
    this.relation = relation;
  }

  /**
   * The boolean value to match against.
   */
  public Boolean getValue() {
    return value;
  }

  public void setValue(Boolean value) {
    this.value = value;
  }

  @Override
  public String toString() {
    return "CollectionSourceInclusionConditionUpdateMetafieldBooleanInput{definitionId='" + definitionId + "', relation='" + relation + "', value='" + value + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    CollectionSourceInclusionConditionUpdateMetafieldBooleanInput that = (CollectionSourceInclusionConditionUpdateMetafieldBooleanInput) o;
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
    private CollectionSourceInclusionConditionMetafieldBooleanRelation relation;

    /**
     * The boolean value to match against.
     */
    private Boolean value;

    public CollectionSourceInclusionConditionUpdateMetafieldBooleanInput build() {
      CollectionSourceInclusionConditionUpdateMetafieldBooleanInput result = new CollectionSourceInclusionConditionUpdateMetafieldBooleanInput();
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
    public Builder relation(CollectionSourceInclusionConditionMetafieldBooleanRelation relation) {
      this.relation = relation;
      return this;
    }

    /**
     * The boolean value to match against.
     */
    public Builder value(Boolean value) {
      this.value = value;
      return this;
    }
  }
}
