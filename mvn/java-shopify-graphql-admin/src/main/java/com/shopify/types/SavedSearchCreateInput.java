package com.shopify.types;

import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.Objects;


public class SavedSearchCreateInput {
  
  private SearchResultType resourceType;

  
  private String name;

  
  private String query;

  public SavedSearchCreateInput() {
  }

  
  public SearchResultType getResourceType() {
    return resourceType;
  }

  public void setResourceType(SearchResultType resourceType) {
    this.resourceType = resourceType;
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
    
    private SearchResultType resourceType;

    
    private String name;

    
    private String query;

    public SavedSearchCreateInput build() {
      SavedSearchCreateInput result = new SavedSearchCreateInput();
      result.resourceType = this.resourceType;
      result.name = this.name;
      result.query = this.query;
      return result;
    }

    
    public Builder resourceType(SearchResultType resourceType) {
      this.resourceType = resourceType;
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
  }
}
