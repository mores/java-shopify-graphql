package com.shopify.admin.types;

import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.List;
import java.util.Objects;

/**
 * Return type for `savedSearchUpdate` mutation.
 */
public class SavedSearchUpdatePayload {
  /**
   * The saved search that was updated.
   */
  private SavedSearch savedSearch;

  /**
   * The list of errors that occurred from executing the mutation.
   */
  private List<UserError> userErrors;

  public SavedSearchUpdatePayload() {
  }

  /**
   * The saved search that was updated.
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
    return "SavedSearchUpdatePayload{savedSearch='" + savedSearch + "', userErrors='" + userErrors + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    SavedSearchUpdatePayload that = (SavedSearchUpdatePayload) o;
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
     * The saved search that was updated.
     */
    private SavedSearch savedSearch;

    /**
     * The list of errors that occurred from executing the mutation.
     */
    private List<UserError> userErrors;

    public SavedSearchUpdatePayload build() {
      SavedSearchUpdatePayload result = new SavedSearchUpdatePayload();
      result.savedSearch = this.savedSearch;
      result.userErrors = this.userErrors;
      return result;
    }

    /**
     * The saved search that was updated.
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
