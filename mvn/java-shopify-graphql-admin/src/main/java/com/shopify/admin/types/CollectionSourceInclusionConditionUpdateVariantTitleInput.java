package com.shopify.admin.types;

import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.List;
import java.util.Objects;

/**
 * The input fields for updating a condition based on variant titles.
 */
public class CollectionSourceInclusionConditionUpdateVariantTitleInput {
  /**
   * The relationship between the variant title and the condition values.
   */
  private CollectionSourceInclusionConditionVariantTitleRelation relation;

  /**
   * The variant title values to match against.
   */
  private List<String> values;

  /**
   * Whether to match any or all of the values.
   */
  private CollectionConditionMatchType matchType;

  public CollectionSourceInclusionConditionUpdateVariantTitleInput() {
  }

  /**
   * The relationship between the variant title and the condition values.
   */
  public CollectionSourceInclusionConditionVariantTitleRelation getRelation() {
    return relation;
  }

  public void setRelation(CollectionSourceInclusionConditionVariantTitleRelation relation) {
    this.relation = relation;
  }

  /**
   * The variant title values to match against.
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
    return "CollectionSourceInclusionConditionUpdateVariantTitleInput{relation='" + relation + "', values='" + values + "', matchType='" + matchType + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    CollectionSourceInclusionConditionUpdateVariantTitleInput that = (CollectionSourceInclusionConditionUpdateVariantTitleInput) o;
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
     * The relationship between the variant title and the condition values.
     */
    private CollectionSourceInclusionConditionVariantTitleRelation relation;

    /**
     * The variant title values to match against.
     */
    private List<String> values;

    /**
     * Whether to match any or all of the values.
     */
    private CollectionConditionMatchType matchType;

    public CollectionSourceInclusionConditionUpdateVariantTitleInput build() {
      CollectionSourceInclusionConditionUpdateVariantTitleInput result = new CollectionSourceInclusionConditionUpdateVariantTitleInput();
      result.relation = this.relation;
      result.values = this.values;
      result.matchType = this.matchType;
      return result;
    }

    /**
     * The relationship between the variant title and the condition values.
     */
    public Builder relation(CollectionSourceInclusionConditionVariantTitleRelation relation) {
      this.relation = relation;
      return this;
    }

    /**
     * The variant title values to match against.
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
