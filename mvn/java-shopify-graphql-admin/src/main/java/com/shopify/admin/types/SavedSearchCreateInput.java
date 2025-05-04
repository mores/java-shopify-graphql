package com.shopify.admin.types;

import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.Objects;

/**
 * The input fields to create a saved search.
 */
public class SavedSearchCreateInput {
  /**
   * The type of resource this saved search is searching in.
   */
  private SearchResultType resourceType;

  /**
   * A descriptive name of the saved search.
   */
  private String name;

  /**
   * The query string of a saved search. This includes search terms and filters.
   */
  private String query;

  public SavedSearchCreateInput() {
  }

  /**
   * The type of resource this saved search is searching in.
   */
  public SearchResultType getResourceType() {
    return resourceType;
  }

  public void setResourceType(SearchResultType resourceType) {
    this.resourceType = resourceType;
  }

  /**
   * A descriptive name of the saved search.
   */
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  /**
   * The query string of a saved search. This includes search terms and filters.
   */
  public String getQuery() {
    return query;
  }

  public void setQuery(String query) {
    this.query = query;
  }

  @Override
  public String toString() {
    return "SavedSearchCreateInput{resourceType='" + resourceType + "', name='" + name + "', query='" + query + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    SavedSearchCreateInput that = (SavedSearchCreateInput) o;
    return Objects.equals(resourceType, that.resourceType) &&
        Objects.equals(name, that.name) &&
        Objects.equals(query, that.query);
  }

  @Override
  public int hashCode() {
    return Objects.hash(resourceType, name, query);
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public static class Builder {
    /**
     * The type of resource this saved search is searching in.
     */
    private SearchResultType resourceType;

    /**
     * A descriptive name of the saved search.
     */
    private String name;

    /**
     * The query string of a saved search. This includes search terms and filters.
     */
    private String query;

    public SavedSearchCreateInput build() {
      SavedSearchCreateInput result = new SavedSearchCreateInput();
      result.resourceType = this.resourceType;
      result.name = this.name;
      result.query = this.query;
      return result;
    }

    /**
     * The type of resource this saved search is searching in.
     */
    public Builder resourceType(SearchResultType resourceType) {
      this.resourceType = resourceType;
      return this;
    }

    /**
     * A descriptive name of the saved search.
     */
    public Builder name(String name) {
      this.name = name;
      return this;
    }

    /**
     * The query string of a saved search. This includes search terms and filters.
     */
    public Builder query(String query) {
      this.query = query;
      return this;
    }
  }
}
