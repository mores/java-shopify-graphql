package com.shopify.types;

import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.Objects;


public class SavedSearchDeleteInput {
  
  private String id;

  public SavedSearchDeleteInput() {
  }

  
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  @Override
  public String toString() {
    return "SavedSearchDeleteInput{id='" + id + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    SavedSearchDeleteInput that = (SavedSearchDeleteInput) o;
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
    
    private String id;

    public SavedSearchDeleteInput build() {
      SavedSearchDeleteInput result = new SavedSearchDeleteInput();
      result.id = this.id;
      return result;
    }

    
    public Builder id(String id) {
      this.id = id;
      return this;
    }
  }
}
