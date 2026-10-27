package com.shopify.admin.types;

import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.List;
import java.util.Objects;

/**
 * The input fields for updating an exclusion condition based on product tags.
 */
public class CollectionSourceExclusionConditionUpdateProductTagInput {
  /**
   * The relationship between the product tag and the condition values.
   */
  private CollectionSourceExclusionConditionProductTagRelation relation;

  /**
   * The tag values to match against.
   */
  private List<String> values;

  /**
   * Whether to match any or all of the values.
   */
  private CollectionConditionMatchType matchType;

  public CollectionSourceExclusionConditionUpdateProductTagInput() {
  }

  /**
   * The relationship between the product tag and the condition values.
   */
  public CollectionSourceExclusionConditionProductTagRelation getRelation() {
    return relation;
  }

  public void setRelation(CollectionSourceExclusionConditionProductTagRelation relation) {
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
    return "CollectionSourceExclusionConditionUpdateProductTagInput{relation='" + relation + "', values='" + values + "', matchType='" + matchType + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    CollectionSourceExclusionConditionUpdateProductTagInput that = (CollectionSourceExclusionConditionUpdateProductTagInput) o;
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
    private CollectionSourceExclusionConditionProductTagRelation relation;

    /**
     * The tag values to match against.
     */
    private List<String> values;

    /**
     * Whether to match any or all of the values.
     */
    private CollectionConditionMatchType matchType;

    public CollectionSourceExclusionConditionUpdateProductTagInput build() {
      CollectionSourceExclusionConditionUpdateProductTagInput result = new CollectionSourceExclusionConditionUpdateProductTagInput();
      result.relation = this.relation;
      result.values = this.values;
      result.matchType = this.matchType;
      return result;
    }

    /**
     * The relationship between the product tag and the condition values.
     */
    public Builder relation(CollectionSourceExclusionConditionProductTagRelation relation) {
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
