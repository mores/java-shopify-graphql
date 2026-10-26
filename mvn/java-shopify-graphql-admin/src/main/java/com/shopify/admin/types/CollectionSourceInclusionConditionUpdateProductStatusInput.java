package com.shopify.admin.types;

import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.List;
import java.util.Objects;

/**
 * The input fields for updating a condition based on product status.
 */
public class CollectionSourceInclusionConditionUpdateProductStatusInput {
  /**
   * The relationship between the product status and the condition values.
   */
  private CollectionSourceInclusionConditionProductStatusRelation relation;

  /**
   * The product status values to match against.
   */
  private List<ProductStatus> values;

  /**
   * Whether to match any or all of the values.
   */
  private CollectionConditionMatchType matchType;

  public CollectionSourceInclusionConditionUpdateProductStatusInput() {
  }

  /**
   * The relationship between the product status and the condition values.
   */
  public CollectionSourceInclusionConditionProductStatusRelation getRelation() {
    return relation;
  }

  public void setRelation(CollectionSourceInclusionConditionProductStatusRelation relation) {
    this.relation = relation;
  }

  /**
   * The product status values to match against.
   */
  public List<ProductStatus> getValues() {
    return values;
  }

  public void setValues(List<ProductStatus> values) {
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
    return "CollectionSourceInclusionConditionUpdateProductStatusInput{relation='" + relation + "', values='" + values + "', matchType='" + matchType + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    CollectionSourceInclusionConditionUpdateProductStatusInput that = (CollectionSourceInclusionConditionUpdateProductStatusInput) o;
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
     * The relationship between the product status and the condition values.
     */
    private CollectionSourceInclusionConditionProductStatusRelation relation;

    /**
     * The product status values to match against.
     */
    private List<ProductStatus> values;

    /**
     * Whether to match any or all of the values.
     */
    private CollectionConditionMatchType matchType;

    public CollectionSourceInclusionConditionUpdateProductStatusInput build() {
      CollectionSourceInclusionConditionUpdateProductStatusInput result = new CollectionSourceInclusionConditionUpdateProductStatusInput();
      result.relation = this.relation;
      result.values = this.values;
      result.matchType = this.matchType;
      return result;
    }

    /**
     * The relationship between the product status and the condition values.
     */
    public Builder relation(CollectionSourceInclusionConditionProductStatusRelation relation) {
      this.relation = relation;
      return this;
    }

    /**
     * The product status values to match against.
     */
    public Builder values(List<ProductStatus> values) {
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
