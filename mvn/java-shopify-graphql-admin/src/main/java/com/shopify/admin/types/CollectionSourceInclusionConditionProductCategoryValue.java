package com.shopify.admin.types;

import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.Objects;

/**
 * A value for a product category condition.
 */
public class CollectionSourceInclusionConditionProductCategoryValue {
  /**
   * The product category to match against.
   */
  private TaxonomyCategory category;

  /**
   * Whether to include descendants of the product category.
   */
  private boolean includeDescendants;

  public CollectionSourceInclusionConditionProductCategoryValue() {
  }

  /**
   * The product category to match against.
   */
  public TaxonomyCategory getCategory() {
    return category;
  }

  public void setCategory(TaxonomyCategory category) {
    this.category = category;
  }

  /**
   * Whether to include descendants of the product category.
   */
  public boolean getIncludeDescendants() {
    return includeDescendants;
  }

  public void setIncludeDescendants(boolean includeDescendants) {
    this.includeDescendants = includeDescendants;
  }

  @Override
  public String toString() {
    return "CollectionSourceInclusionConditionProductCategoryValue{category='" + category + "', includeDescendants='" + includeDescendants + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    CollectionSourceInclusionConditionProductCategoryValue that = (CollectionSourceInclusionConditionProductCategoryValue) o;
    return Objects.equals(category, that.category) &&
        includeDescendants == that.includeDescendants;
  }

  @Override
  public int hashCode() {
    return Objects.hash(category, includeDescendants);
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public static class Builder {
    /**
     * The product category to match against.
     */
    private TaxonomyCategory category;

    /**
     * Whether to include descendants of the product category.
     */
    private boolean includeDescendants;

    public CollectionSourceInclusionConditionProductCategoryValue build() {
      CollectionSourceInclusionConditionProductCategoryValue result = new CollectionSourceInclusionConditionProductCategoryValue();
      result.category = this.category;
      result.includeDescendants = this.includeDescendants;
      return result;
    }

    /**
     * The product category to match against.
     */
    public Builder category(TaxonomyCategory category) {
      this.category = category;
      return this;
    }

    /**
     * Whether to include descendants of the product category.
     */
    public Builder includeDescendants(boolean includeDescendants) {
      this.includeDescendants = includeDescendants;
      return this;
    }
  }
}
