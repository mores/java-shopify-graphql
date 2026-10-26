package com.shopify.admin.types;

import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.List;
import java.util.Objects;

/**
 * The input fields for a condition based on string list metafield values.
 */
public class CollectionSourceInclusionConditionMetafieldStringListInput {
  /**
   * The ID of the metafield definition.
   */
  private String definitionId;

  /**
   * The relationship between the metafield value and the condition values.
   */
  private CollectionSourceInclusionConditionMetafieldStringListRelation relation;

  /**
   * The string values to match against.
   */
  private List<String> values;

  /**
   * Whether to match any or all of the values.
   */
  private CollectionConditionMatchType matchType;

  public CollectionSourceInclusionConditionMetafieldStringListInput() {
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
   * The relationship between the metafield value and the condition values.
   */
  public CollectionSourceInclusionConditionMetafieldStringListRelation getRelation() {
    return relation;
  }

  public void setRelation(CollectionSourceInclusionConditionMetafieldStringListRelation relation) {
    this.relation = relation;
  }

  /**
   * The string values to match against.
   */
  public List<String> getValues() {
    return values;
  }

  public void setValues(List<String> values) {
    this.values = values;
  }

  /**
   * Whether to match any or all of the values.
   */
  public CollectionConditionMatchType getMatchType() {
    return matchType;
  }

  public void setMatchType(CollectionConditionMatchType matchType) {
    this.matchType = matchType;
  }

  @Override
  public String toString() {
    return "CollectionSourceInclusionConditionMetafieldStringListInput{definitionId='" + definitionId + "', relation='" + relation + "', values='" + values + "', matchType='" + matchType + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    CollectionSourceInclusionConditionMetafieldStringListInput that = (CollectionSourceInclusionConditionMetafieldStringListInput) o;
    return Objects.equals(definitionId, that.definitionId) &&
        Objects.equals(relation, that.relation) &&
        Objects.equals(values, that.values) &&
        Objects.equals(matchType, that.matchType);
  }

  @Override
  public int hashCode() {
    return Objects.hash(definitionId, relation, values, matchType);
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
     * The relationship between the metafield value and the condition values.
     */
    private CollectionSourceInclusionConditionMetafieldStringListRelation relation;

    /**
     * The string values to match against.
     */
    private List<String> values;

    /**
     * Whether to match any or all of the values.
     */
    private CollectionConditionMatchType matchType;

    public CollectionSourceInclusionConditionMetafieldStringListInput build() {
      CollectionSourceInclusionConditionMetafieldStringListInput result = new CollectionSourceInclusionConditionMetafieldStringListInput();
      result.definitionId = this.definitionId;
      result.relation = this.relation;
      result.values = this.values;
      result.matchType = this.matchType;
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
     * The relationship between the metafield value and the condition values.
     */
    public Builder relation(
        CollectionSourceInclusionConditionMetafieldStringListRelation relation) {
      this.relation = relation;
      return this;
    }

    /**
     * The string values to match against.
     */
    public Builder values(List<String> values) {
      this.values = values;
      return this;
    }

    /**
     * Whether to match any or all of the values.
     */
    public Builder matchType(CollectionConditionMatchType matchType) {
      this.matchType = matchType;
      return this;
    }
  }
}
