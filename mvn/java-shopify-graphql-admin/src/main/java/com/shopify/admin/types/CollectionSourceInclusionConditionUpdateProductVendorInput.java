package com.shopify.admin.types;

import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.List;
import java.util.Objects;

/**
 * The input fields for updating a condition based on product vendors.
 */
public class CollectionSourceInclusionConditionUpdateProductVendorInput {
  /**
   * The relationship between the product vendor and the condition values.
   */
  private CollectionSourceInclusionConditionProductVendorRelation relation;

  /**
   * The product vendor values to match against.
   */
  private List<String> values;

  /**
   * Whether to match any or all of the values.
   */
  private CollectionConditionMatchType matchType;

  public CollectionSourceInclusionConditionUpdateProductVendorInput() {
  }

  /**
   * The relationship between the product vendor and the condition values.
   */
  public CollectionSourceInclusionConditionProductVendorRelation getRelation() {
    return relation;
  }

  public void setRelation(CollectionSourceInclusionConditionProductVendorRelation relation) {
    this.relation = relation;
  }

  /**
   * The product vendor values to match against.
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
    return "CollectionSourceInclusionConditionUpdateProductVendorInput{relation='" + relation + "', values='" + values + "', matchType='" + matchType + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    CollectionSourceInclusionConditionUpdateProductVendorInput that = (CollectionSourceInclusionConditionUpdateProductVendorInput) o;
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
     * The relationship between the product vendor and the condition values.
     */
    private CollectionSourceInclusionConditionProductVendorRelation relation;

    /**
     * The product vendor values to match against.
     */
    private List<String> values;

    /**
     * Whether to match any or all of the values.
     */
    private CollectionConditionMatchType matchType;

    public CollectionSourceInclusionConditionUpdateProductVendorInput build() {
      CollectionSourceInclusionConditionUpdateProductVendorInput result = new CollectionSourceInclusionConditionUpdateProductVendorInput();
      result.relation = this.relation;
      result.values = this.values;
      result.matchType = this.matchType;
      return result;
    }

    /**
     * The relationship between the product vendor and the condition values.
     */
    public Builder relation(CollectionSourceInclusionConditionProductVendorRelation relation) {
      this.relation = relation;
      return this;
    }

    /**
     * The product vendor values to match against.
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
