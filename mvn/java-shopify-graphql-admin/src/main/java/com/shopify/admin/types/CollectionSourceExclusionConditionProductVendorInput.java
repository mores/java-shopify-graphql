package com.shopify.admin.types;

import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.List;
import java.util.Objects;

/**
 * The input fields for an exclusion condition based on product vendors.
 */
public class CollectionSourceExclusionConditionProductVendorInput {
  /**
   * The relationship between the product vendor and the condition values.
   */
  private CollectionSourceExclusionConditionProductVendorRelation relation;

  /**
   * The product vendor values to match against.
   */
  private List<String> values;

  /**
   * Whether to match any or all of the values.
   */
  private CollectionConditionMatchType matchType;

  public CollectionSourceExclusionConditionProductVendorInput() {
  }

  /**
   * The relationship between the product vendor and the condition values.
   */
  public CollectionSourceExclusionConditionProductVendorRelation getRelation() {
    return relation;
  }

  public void setRelation(CollectionSourceExclusionConditionProductVendorRelation relation) {
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
    return "CollectionSourceExclusionConditionProductVendorInput{relation='" + relation + "', values='" + values + "', matchType='" + matchType + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    CollectionSourceExclusionConditionProductVendorInput that = (CollectionSourceExclusionConditionProductVendorInput) o;
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
    private CollectionSourceExclusionConditionProductVendorRelation relation;

    /**
     * The product vendor values to match against.
     */
    private List<String> values;

    /**
     * Whether to match any or all of the values.
     */
    private CollectionConditionMatchType matchType;

    public CollectionSourceExclusionConditionProductVendorInput build() {
      CollectionSourceExclusionConditionProductVendorInput result = new CollectionSourceExclusionConditionProductVendorInput();
      result.relation = this.relation;
      result.values = this.values;
      result.matchType = this.matchType;
      return result;
    }

    /**
     * The relationship between the product vendor and the condition values.
     */
    public Builder relation(CollectionSourceExclusionConditionProductVendorRelation relation) {
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
