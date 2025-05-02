package com.shopify.storefront.types;

import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.Objects;

/**
 * A filter used to view a subset of products in a collection matching a specific category value.
 */
public class CategoryFilter {
  /**
   * The id of the category to filter on.
   */
  private String id;

  public CategoryFilter() {
  }

  /**
   * The id of the category to filter on.
   */
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  @Override
  public String toString() {
    return "CategoryFilter{id='" + id + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    CategoryFilter that = (CategoryFilter) o;
    return Objects.equals(id, that.id);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id);
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public static class Builder {
    /**
     * The id of the category to filter on.
     */
    private String id;

    public CategoryFilter build() {
      CategoryFilter result = new CategoryFilter();
      result.id = this.id;
      return result;
    }

    /**
     * The id of the category to filter on.
     */
    public Builder id(String id) {
      this.id = id;
      return this;
    }
  }
}
