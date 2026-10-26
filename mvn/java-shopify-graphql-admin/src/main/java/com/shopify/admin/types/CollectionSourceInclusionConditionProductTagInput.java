package com.shopify.admin.types;

import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.List;
import java.util.Objects;

/**
 * The input fields for a condition based on product tags.
 */
public class CollectionSourceInclusionConditionProductTagInput {
  /**
   * The relationship between the product tag and the condition values.
   */
  private CollectionSourceInclusionConditionProductTagRelation relation;

  /**
   * The tag values to match against.
   */
  private List<String> values;

  /**
   * Whether to match any or all of the values.
   */
  private CollectionConditionMatchType matchType;

  public CollectionSourceInclusionConditionProductTagInput() {
  }

  /**
   * The relationship between the product tag and the condition values.
   */
  public CollectionSourceInclusionConditionProductTagRelation getRelation() {
    return relation;
  }

  public void setRelation(CollectionSourceInclusionConditionProductTagRelation relation) {
    this.relation = relation;
  }

  /**
   * The tag values to match against.
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
    return "CollectionSourceInclusionConditionProductTagInput{relation='" + relation + "', values='" + values + "', matchType='" + matchType + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    CollectionSourceInclusionConditionProductTagInput that = (CollectionSourceInclusionConditionProductTagInput) o;
    return Objects.equals(relation, that.relation) &&
        Objects.equals(values, that.values) &&
        Objects.equals(matchType, that.matchType);
  }

  @Override
  public int hashCode() {
    return Objects.hash(relation, values, matchType);
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public static class Builder {
    /**
     * The relationship between the product tag and the condition values.
     */
    private CollectionSourceInclusionConditionProductTagRelation relation;

    /**
     * The tag values to match against.
     */
    private List<String> values;

    /**
     * Whether to match any or all of the values.
     */
    private CollectionConditionMatchType matchType;

    public CollectionSourceInclusionConditionProductTagInput build() {
      CollectionSourceInclusionConditionProductTagInput result = new CollectionSourceInclusionConditionProductTagInput();
      result.relation = this.relation;
      result.values = this.values;
      result.matchType = this.matchType;
      return result;
    }

    /**
     * The relationship between the product tag and the condition values.
     */
    public Builder relation(CollectionSourceInclusionConditionProductTagRelation relation) {
      this.relation = relation;
      return this;
    }

    /**
     * The tag values to match against.
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
