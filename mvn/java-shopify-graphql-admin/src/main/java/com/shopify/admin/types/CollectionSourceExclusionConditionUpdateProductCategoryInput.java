package com.shopify.admin.types;

import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.List;
import java.util.Objects;

/**
 * The input fields for updating an exclusion condition based on product categories.
 */
public class CollectionSourceExclusionConditionUpdateProductCategoryInput {
  /**
   * The relationship between the product category and the condition values.
   */
  private CollectionSourceExclusionConditionProductCategoryRelation relation;

  /**
   * The product category values to match against.
   */
  private List<CollectionSourceExclusionConditionProductCategoryValueInput> values;

  /**
   * Whether to match any or all of the values.
   */
  private CollectionConditionMatchType matchType;

  public CollectionSourceExclusionConditionUpdateProductCategoryInput() {
  }

  /**
   * The relationship between the product category and the condition values.
   */
  public CollectionSourceExclusionConditionProductCategoryRelation getRelation() {
    return relation;
  }

  public void setRelation(CollectionSourceExclusionConditionProductCategoryRelation relation) {
    this.relation = relation;
  }

  /**
   * The product category values to match against.
   */
  public List<CollectionSourceExclusionConditionProductCategoryValueInput> getValues() {
    return values;
  }

  public void setValues(List<CollectionSourceExclusionConditionProductCategoryValueInput> values) {
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
    return "CollectionSourceExclusionConditionUpdateProductCategoryInput{relation='" + relation + "', values='" + values + "', matchType='" + matchType + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    CollectionSourceExclusionConditionUpdateProductCategoryInput that = (CollectionSourceExclusionConditionUpdateProductCategoryInput) o;
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
     * The relationship between the product category and the condition values.
     */
    private CollectionSourceExclusionConditionProductCategoryRelation relation;

    /**
     * The product category values to match against.
     */
    private List<CollectionSourceExclusionConditionProductCategoryValueInput> values;

    /**
     * Whether to match any or all of the values.
     */
    private CollectionConditionMatchType matchType;

    public CollectionSourceExclusionConditionUpdateProductCategoryInput build() {
      CollectionSourceExclusionConditionUpdateProductCategoryInput result = new CollectionSourceExclusionConditionUpdateProductCategoryInput();
      result.relation = this.relation;
      result.values = this.values;
      result.matchType = this.matchType;
      return result;
    }

    /**
     * The relationship between the product category and the condition values.
     */
    public Builder relation(CollectionSourceExclusionConditionProductCategoryRelation relation) {
      this.relation = relation;
      return this;
    }

    /**
     * The product category values to match against.
     */
    public Builder values(
        List<CollectionSourceExclusionConditionProductCategoryValueInput> values) {
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
