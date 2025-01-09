package com.shopify.types;

import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.List;
import java.util.Objects;

/**
 * Return type for `savedSearchCreate` mutation.
 */
public class SavedSearchCreatePayload {
  /**
   * The saved search that was created.
   */
  private SavedSearch savedSearch;

  /**
   * The list of errors that occurred from executing the mutation.
   */
  private List<UserError> userErrors;

  public SavedSearchCreatePayload() {
  }

  /**
   * The saved search that was created.
   */
  public SavedSearch getSavedSearch() {
    return savedSearch;
  }

  public void setSavedSearch(SavedSearch savedSearch) {
    this.savedSearch = savedSearch;
  }

  /**
   * The list of errors that occurred from executing the mutation.
   */
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
    /**
     * The saved search that was created.
     */
    private SavedSearch savedSearch;

    /**
     * The list of errors that occurred from executing the mutation.
     */
    private List<UserError> userErrors;

    public SavedSearchCreatePayload build() {
      SavedSearchCreatePayload result = new SavedSearchCreatePayload();
      result.savedSearch = this.savedSearch;
      result.userErrors = this.userErrors;
      return result;
    }

    /**
     * The saved search that was created.
     */
    public Builder savedSearch(SavedSearch savedSearch) {
      this.savedSearch = savedSearch;
      return this;
    }

    /**
     * The list of errors that occurred from executing the mutation.
     */
    public Builder userErrors(List<UserError> userErrors) {
      this.userErrors = userErrors;
      return this;
    }
  }
}
