package com.shopify.types;

import com.fasterxml.jackson.annotation.JsonTypeInfo;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.List;
import java.util.Objects;

/**
 * A saved search is a representation of a search query saved in the admin.
 */
@JsonTypeInfo(
    use = JsonTypeInfo.Id.NONE
)
public class SavedSearch implements com.shopify.types.LegacyInteroperability, com.shopify.types.Node {
  /**
   * The filters of a saved search.
   */
  private List<SearchFilter> filters;

  /**
   * A globally-unique ID.
   */
  private String id;

  /**
   * The ID of the corresponding resource in the REST Admin API.
   */
  private String legacyResourceId;

  /**
   * The name of a saved search.
   */
  private String name;

  /**
   * The query string of a saved search. This includes search terms and filters.
   */
  private String query;

  /**
   * The type of resource this saved search is searching in.
   */
  private SearchResultType resourceType;

  /**
   * The search terms of a saved search.
   */
  private String searchTerms;

  public SavedSearch() {
  }

  /**
   * The filters of a saved search.
   */
  public List<SearchFilter> getFilters() {
    return filters;
  }

  public void setFilters(List<SearchFilter> filters) {
    this.filters = filters;
  }

  /**
   * A globally-unique ID.
   */
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  /**
   * The ID of the corresponding resource in the REST Admin API.
   */
  public String getLegacyResourceId() {
    return legacyResourceId;
  }

  public void setLegacyResourceId(String legacyResourceId) {
    this.legacyResourceId = legacyResourceId;
  }

  /**
   * The name of a saved search.
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
   * The search terms of a saved search.
   */
  public String getSearchTerms() {
    return searchTerms;
  }

  public void setSearchTerms(String searchTerms) {
    this.searchTerms = searchTerms;
  }

  @Override
  public String toString() {
    return "SavedSearch{filters='" + filters + "', id='" + id + "', legacyResourceId='" + legacyResourceId + "', name='" + name + "', query='" + query + "', resourceType='" + resourceType + "', searchTerms='" + searchTerms + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    SavedSearch that = (SavedSearch) o;
    return Objects.equals(filters, that.filters) &&
        Objects.equals(id, that.id) &&
        Objects.equals(legacyResourceId, that.legacyResourceId) &&
        Objects.equals(name, that.name) &&
        Objects.equals(query, that.query) &&
        Objects.equals(resourceType, that.resourceType) &&
        Objects.equals(searchTerms, that.searchTerms);
  }

  @Override
  public int hashCode() {
    return Objects.hash(filters, id, legacyResourceId, name, query, resourceType, searchTerms);
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public static class Builder {
    /**
     * The filters of a saved search.
     */
    private List<SearchFilter> filters;

    /**
     * A globally-unique ID.
     */
    private String id;

    /**
     * The ID of the corresponding resource in the REST Admin API.
     */
    private String legacyResourceId;

    /**
     * The name of a saved search.
     */
    private String name;

    /**
     * The query string of a saved search. This includes search terms and filters.
     */
    private String query;

    /**
     * The type of resource this saved search is searching in.
     */
    private SearchResultType resourceType;

    /**
     * The search terms of a saved search.
     */
    private String searchTerms;

    public SavedSearch build() {
      SavedSearch result = new SavedSearch();
      result.filters = this.filters;
      result.id = this.id;
      result.legacyResourceId = this.legacyResourceId;
      result.name = this.name;
      result.query = this.query;
      result.resourceType = this.resourceType;
      result.searchTerms = this.searchTerms;
      return result;
    }

    /**
     * The filters of a saved search.
     */
    public Builder filters(List<SearchFilter> filters) {
      this.filters = filters;
      return this;
    }

    /**
     * A globally-unique ID.
     */
    public Builder id(String id) {
      this.id = id;
      return this;
    }

    /**
     * The ID of the corresponding resource in the REST Admin API.
     */
    public Builder legacyResourceId(String legacyResourceId) {
      this.legacyResourceId = legacyResourceId;
      return this;
    }

    /**
     * The name of a saved search.
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

    /**
     * The type of resource this saved search is searching in.
     */
    public Builder resourceType(SearchResultType resourceType) {
      this.resourceType = resourceType;
      return this;
    }

    /**
     * The search terms of a saved search.
     */
    public Builder searchTerms(String searchTerms) {
      this.searchTerms = searchTerms;
      return this;
    }
  }
}
