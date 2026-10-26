package com.shopify.admin.types;

import java.lang.Boolean;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.Objects;

/**
 * The input fields for a product category value in an exclusion condition.
 */
public class CollectionSourceExclusionConditionProductCategoryValueInput {
  /**
   * The ID of the product category.
   */
  private String categoryId;

  /**
   * Whether to include descendants of the product category.
   */
  private Boolean includeDescendants = false;

  public CollectionSourceExclusionConditionProductCategoryValueInput() {
  }

  /**
   * The ID of the product category.
   */
  public String getCategoryId() {
    return categoryId;
  }

  public void setCategoryId(String categoryId) {
    this.categoryId = categoryId;
  }

  /**
   * Whether to include descendants of the product category.
   */
  public Boolean getIncludeDescendants() {
    return includeDescendants;
  }

  public void setIncludeDescendants(Boolean includeDescendants) {
    this.includeDescendants = includeDescendants;
  }

  @Override
  public String toString() {
    return "CollectionSourceExclusionConditionProductCategoryValueInput{categoryId='" + categoryId + "', includeDescendants='" + includeDescendants + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    CollectionSourceExclusionConditionProductCategoryValueInput that = (CollectionSourceExclusionConditionProductCategoryValueInput) o;
    return Objects.equals(categoryId, that.categoryId) &&
        Objects.equals(includeDescendants, that.includeDescendants);
  }

  @Override
  public int hashCode() {
    return Objects.hash(categoryId, includeDescendants);
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public static class Builder {
    /**
     * The ID of the product category.
     */
    private String categoryId;

    /**
     * Whether to include descendants of the product category.
     */
    private Boolean includeDescendants = false;

    public CollectionSourceExclusionConditionProductCategoryValueInput build() {
      CollectionSourceExclusionConditionProductCategoryValueInput result = new CollectionSourceExclusionConditionProductCategoryValueInput();
      result.categoryId = this.categoryId;
      result.includeDescendants = this.includeDescendants;
      return result;
    }

    /**
     * The ID of the product category.
     */
    public Builder categoryId(String categoryId) {
      this.categoryId = categoryId;
      return this;
    }

    /**
     * Whether to include descendants of the product category.
     */
    public Builder includeDescendants(Boolean includeDescendants) {
      this.includeDescendants = includeDescendants;
      return this;
    }
  }
}
