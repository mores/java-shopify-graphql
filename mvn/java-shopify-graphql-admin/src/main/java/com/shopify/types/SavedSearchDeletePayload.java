package com.shopify.types;

import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.List;
import java.util.Objects;

/**
 * Return type for `savedSearchDelete` mutation.
 */
public class SavedSearchDeletePayload {
  /**
   * The ID of the saved search that was deleted.
   */
  private String deletedSavedSearchId;

  /**
   * The shop of the saved search that was deleted.
   */
  private Shop shop;

  /**
   * The list of errors that occurred from executing the mutation.
   */
  private List<UserError> userErrors;

  public SavedSearchDeletePayload() {
  }

  /**
   * The ID of the saved search that was deleted.
   */
  public String getDeletedSavedSearchId() {
    return deletedSavedSearchId;
  }

  public void setDeletedSavedSearchId(String deletedSavedSearchId) {
    this.deletedSavedSearchId = deletedSavedSearchId;
  }

  /**
   * The shop of the saved search that was deleted.
   */
  public Shop getShop() {
    return shop;
  }

  public void setShop(Shop shop) {
    this.shop = shop;
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
    return "SavedSearchDeletePayload{deletedSavedSearchId='" + deletedSavedSearchId + "', shop='" + shop + "', userErrors='" + userErrors + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    SavedSearchDeletePayload that = (SavedSearchDeletePayload) o;
    return Objects.equals(deletedSavedSearchId, that.deletedSavedSearchId) &&
        Objects.equals(shop, that.shop) &&
        Objects.equals(userErrors, that.userErrors);
  }

  @Override
  public int hashCode() {
    return Objects.hash(deletedSavedSearchId, shop, userErrors);
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public static class Builder {
    /**
     * The ID of the saved search that was deleted.
     */
    private String deletedSavedSearchId;

    /**
     * The shop of the saved search that was deleted.
     */
    private Shop shop;

    /**
     * The list of errors that occurred from executing the mutation.
     */
    private List<UserError> userErrors;

    public SavedSearchDeletePayload build() {
      SavedSearchDeletePayload result = new SavedSearchDeletePayload();
      result.deletedSavedSearchId = this.deletedSavedSearchId;
      result.shop = this.shop;
      result.userErrors = this.userErrors;
      return result;
    }

    /**
     * The ID of the saved search that was deleted.
     */
    public Builder deletedSavedSearchId(String deletedSavedSearchId) {
      this.deletedSavedSearchId = deletedSavedSearchId;
      return this;
    }

    /**
     * The shop of the saved search that was deleted.
     */
    public Builder shop(Shop shop) {
      this.shop = shop;
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
