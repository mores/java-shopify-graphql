package com.shopify.admin.types;

import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.Objects;

/**
 * Represents Shopify's [standardized product taxonomy](https://shopify.github.io/product-taxonomy/releases/unstable/?categoryId=sg-4-17-2-17)
 * tree. Provides categories that you can filter by search criteria or hierarchical relationships.
 *
 * You can search categories globally, retrieve children of a specific category,
 * find siblings, or get descendants. When you specify no filter arguments, you get
 * all top-level categories in the taxonomy.
 */
public class Taxonomy {
  /**
   * Returns the categories of the product taxonomy based on the arguments provided.
   * If a `search` argument is provided, then all categories that match the search query globally are returned.
   * If a `children_of` argument is provided, then all children of the specified category are returned.
   * If a `siblings_of` argument is provided, then all siblings of the specified category are returned.
   * If a `decendents_of` argument is provided, then all descendents of the specified category are returned.
   * If no arguments are provided, then all the top-level categories of the taxonomy are returned.
   */
  private TaxonomyCategoryConnection categories;

  public Taxonomy() {
  }

  /**
   * Returns the categories of the product taxonomy based on the arguments provided.
   * If a `search` argument is provided, then all categories that match the search query globally are returned.
   * If a `children_of` argument is provided, then all children of the specified category are returned.
   * If a `siblings_of` argument is provided, then all siblings of the specified category are returned.
   * If a `decendents_of` argument is provided, then all descendents of the specified category are returned.
   * If no arguments are provided, then all the top-level categories of the taxonomy are returned.
   */
  public TaxonomyCategoryConnection getCategories() {
    return categories;
  }

  public void setCategories(TaxonomyCategoryConnection categories) {
    this.categories = categories;
  }

  @Override
  public String toString() {
    return "Taxonomy{categories='" + categories + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    Taxonomy that = (Taxonomy) o;
    return Objects.equals(categories, that.categories);
  }

  @Override
  public int hashCode() {
    return Objects.hash(categories);
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public static class Builder {
    /**
     * Returns the categories of the product taxonomy based on the arguments provided.
     * If a `search` argument is provided, then all categories that match the search query globally are returned.
     * If a `children_of` argument is provided, then all children of the specified category are returned.
     * If a `siblings_of` argument is provided, then all siblings of the specified category are returned.
     * If a `decendents_of` argument is provided, then all descendents of the specified category are returned.
     * If no arguments are provided, then all the top-level categories of the taxonomy are returned.
     */
    private TaxonomyCategoryConnection categories;

    public Taxonomy build() {
      Taxonomy result = new Taxonomy();
      result.categories = this.categories;
      return result;
    }

    /**
     * Returns the categories of the product taxonomy based on the arguments provided.
     * If a `search` argument is provided, then all categories that match the search query globally are returned.
     * If a `children_of` argument is provided, then all children of the specified category are returned.
     * If a `siblings_of` argument is provided, then all siblings of the specified category are returned.
     * If a `decendents_of` argument is provided, then all descendents of the specified category are returned.
     * If no arguments are provided, then all the top-level categories of the taxonomy are returned.
     */
    public Builder categories(TaxonomyCategoryConnection categories) {
      this.categories = categories;
      return this;
    }
  }
}
