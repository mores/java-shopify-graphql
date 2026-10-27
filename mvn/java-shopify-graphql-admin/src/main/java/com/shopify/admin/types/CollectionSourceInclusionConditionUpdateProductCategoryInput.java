package com.shopify.admin.types;

import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.List;
import java.util.Objects;

/**
 * The input fields for updating a condition based on product categories.
 */
public class CollectionSourceInclusionConditionUpdateProductCategoryInput {
  /**
   * The relationship between the product category and the condition values.
   */
  private CollectionSourceInclusionConditionProductCategoryRelation relation;

  /**
   * The product category values to match against.
   */
  private List<CollectionSourceInclusionConditionProductCategoryValueInput> values;

  /**
   * Whether to match any or all of the values.
   */
  private CollectionConditionMatchType matchType;

  public CollectionSourceInclusionConditionUpdateProductCategoryInput() {
  }

  /**
   * The relationship between the product category and the condition values.
   */
  public CollectionSourceInclusionConditionProductCategoryRelation getRelation() {
    return relation;
  }

  public void setRelation(CollectionSourceInclusionConditionProductCategoryRelation relation) {
    this.relation = relation;
  }

  /**
   * The product category values to match against.
   */
  public List<CollectionSourceInclusionConditionProductCategoryValueInput> getValues() {
    return values;
  }

  public void setValues(List<CollectionSourceInclusionConditionProductCategoryValueInput> values) {
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
    return "CollectionSourceInclusionConditionUpdateProductCategoryInput{relation='" + relation + "', values='" + values + "', matchType='" + matchType + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    CollectionSourceInclusionConditionUpdateProductCategoryInput that = (CollectionSourceInclusionConditionUpdateProductCategoryInput) o;
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
    private CollectionSourceInclusionConditionProductCategoryRelation relation;

    /**
     * The product category values to match against.
     */
    private List<CollectionSourceInclusionConditionProductCategoryValueInput> values;

    /**
     * Whether to match any or all of the values.
     */
    private CollectionConditionMatchType matchType;

    public CollectionSourceInclusionConditionUpdateProductCategoryInput build() {
      CollectionSourceInclusionConditionUpdateProductCategoryInput result = new CollectionSourceInclusionConditionUpdateProductCategoryInput();
      result.relation = this.relation;
      result.values = this.values;
      result.matchType = this.matchType;
      return result;
    }

    /**
     * The relationship between the product category and the condition values.
     */
    public Builder relation(CollectionSourceInclusionConditionProductCategoryRelation relation) {
      this.relation = relation;
      return this;
    }

    /**
     * The product category values to match against.
     */
    public Builder values(
        List<CollectionSourceInclusionConditionProductCategoryValueInput> values) {
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
