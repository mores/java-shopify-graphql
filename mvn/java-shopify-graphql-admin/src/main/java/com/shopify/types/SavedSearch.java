package com.shopify.types;

import com.fasterxml.jackson.annotation.JsonTypeInfo;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.List;
import java.util.Objects;


@JsonTypeInfo(
    use = JsonTypeInfo.Id.NONE
)
public class SavedSearch implements com.shopify.types.LegacyInteroperability, com.shopify.types.Node {
  
  private List<SearchFilter> filters;

  
  private String id;

  
  private String legacyResourceId;

  
  private String name;

  
  private String query;

  
  private SearchResultType resourceType;

  
  private String searchTerms;

  public SavedSearch() {
  }

  
  public List<SearchFilter> getFilters() {
    return filters;
  }

  public void setFilters(List<SearchFilter> filters) {
    this.filters = filters;
  }

  
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  
  public String getLegacyResourceId() {
    return legacyResourceId;
  }

  public void setLegacyResourceId(String legacyResourceId) {
    this.legacyResourceId = legacyResourceId;
  }

  
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  
  public String getQuery() {
    return query;
  }

  public void setQuery(String query) {
    this.query = query;
  }

  
  public SearchResultType getResourceType() {
    return resourceType;
  }

  public void setResourceType(SearchResultType resourceType) {
    this.resourceType = resourceType;
  }

  
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
    
    private List<SearchFilter> filters;

    
    private String id;

    
    private String legacyResourceId;

    
    private String name;

    
    private String query;

    
    private SearchResultType resourceType;

    
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

    
    public Builder filters(List<SearchFilter> filters) {
      this.filters = filters;
      return this;
    }

    
    public Builder id(String id) {
      this.id = id;
      return this;
    }

    
    public Builder legacyResourceId(String legacyResourceId) {
      this.legacyResourceId = legacyResourceId;
      return this;
    }

    
    public Builder name(String name) {
      this.name = name;
      return this;
    }

    
    public Builder query(String query) {
      this.query = query;
      return this;
    }

    
    public Builder resourceType(SearchResultType resourceType) {
      this.resourceType = resourceType;
      return this;
    }

    
    public Builder searchTerms(String searchTerms) {
      this.searchTerms = searchTerms;
      return this;
    }
  }
}
