package com.shopify.types;

import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.Objects;


public class SavedSearchUpdateInput {
  
  private String id;

  
  private String name;

  
  private String query;

  public SavedSearchUpdateInput() {
  }

  
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
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
    
    private String id;

    
    private String name;

    
    private String query;

    public SavedSearchUpdateInput build() {
      SavedSearchUpdateInput result = new SavedSearchUpdateInput();
      result.id = this.id;
      result.name = this.name;
      result.query = this.query;
      return result;
    }

    
    public Builder id(String id) {
      this.id = id;
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
