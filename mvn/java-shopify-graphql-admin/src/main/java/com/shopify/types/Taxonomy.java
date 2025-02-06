package com.shopify.types;

import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.Objects;

/**
 * The Taxonomy resource lets you access the categories, attributes and values of a taxonomy tree.
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
