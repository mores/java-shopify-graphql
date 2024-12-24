package com.shopify.types;

import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.List;
import java.util.Objects;


public class SavedSearchCreatePayload {
  
  private SavedSearch savedSearch;

  
  private List<UserError> userErrors;

  public SavedSearchCreatePayload() {
  }

  
  public SavedSearch getSavedSearch() {
    return savedSearch;
  }

  public void setSavedSearch(SavedSearch savedSearch) {
    this.savedSearch = savedSearch;
  }

  
  public List<UserError> getUserErrors() {
    return userErrors;
  }

  public void setUserErrors(List<UserError> userErrors) {
    this.userErrors = userErrors;
  }

  @Override
  public String toString() {
    return "SavedSearchCreatePayload{savedSearch='" + savedSearch + "', userErrors='" + userErrors + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    SavedSearchCreatePayload that = (SavedSearchCreatePayload) o;
    return Objects.equals(savedSearch, that.savedSearch) &&
        Objects.equals(userErrors, that.userErrors);
  }

  @Override
  public int hashCode() {
    return Objects.hash(savedSearch, userErrors);
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public static class Builder {
    
    private SavedSearch savedSearch;

    
    private List<UserError> userErrors;

    public SavedSearchCreatePayload build() {
      SavedSearchCreatePayload result = new SavedSearchCreatePayload();
      result.savedSearch = this.savedSearch;
      result.userErrors = this.userErrors;
      return result;
    }

    
    public Builder savedSearch(SavedSearch savedSearch) {
      this.savedSearch = savedSearch;
      return this;
    }

    
    public Builder userErrors(List<UserError> userErrors) {
      this.userErrors = userErrors;
      return this;
    }
  }
}
