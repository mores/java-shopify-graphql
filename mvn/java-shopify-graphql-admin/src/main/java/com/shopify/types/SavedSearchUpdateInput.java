package com.shopify.types;

import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.Objects;

/**
 * The input fields to update a saved search.
 */
public class SavedSearchUpdateInput {
  /**
   * ID of the saved search to update.
   */
  private String id;

  /**
   * A descriptive name of the saved search.
   */
  private String name;

  /**
   * The query string of a saved search. This included search terms and filters.
   */
  private String query;

  public SavedSearchUpdateInput() {
  }

  /**
   * ID of the saved search to update.
   */
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
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
   * The query string of a saved search. This included search terms and filters.
   */
  public String getQuery() {
    return query;
  }

  public void setQuery(String query) {
    this.query = query;
  }

  @Override
  public String toString() {
    return "SavedSearchUpdateInput{id='" + id + "', name='" + name + "', query='" + query + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    SavedSearchUpdateInput that = (SavedSearchUpdateInput) o;
    return Objects.equals(id, that.id) &&
        Objects.equals(name, that.name) &&
        Objects.equals(query, that.query);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, name, query);
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public static class Builder {
    /**
     * ID of the saved search to update.
     */
    private String id;

    /**
     * A descriptive name of the saved search.
     */
    private String name;

    /**
     * The query string of a saved search. This included search terms and filters.
     */
    private String query;

    public SavedSearchUpdateInput build() {
      SavedSearchUpdateInput result = new SavedSearchUpdateInput();
      result.id = this.id;
      result.name = this.name;
      result.query = this.query;
      return result;
    }

    /**
     * ID of the saved search to update.
     */
    public Builder id(String id) {
      this.id = id;
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
     * The query string of a saved search. This included search terms and filters.
     */
    public Builder query(String query) {
      this.query = query;
      return this;
    }
  }
}
