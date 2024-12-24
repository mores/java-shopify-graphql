package com.shopify.types;

import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.List;
import java.util.Objects;


public class SavedSearchDeletePayload {
  
  private String deletedSavedSearchId;

  
  private Shop shop;

  
  private List<UserError> userErrors;

  public SavedSearchDeletePayload() {
  }

  
  public String getDeletedSavedSearchId() {
    return deletedSavedSearchId;
  }

  public void setDeletedSavedSearchId(String deletedSavedSearchId) {
    this.deletedSavedSearchId = deletedSavedSearchId;
  }

  
  public Shop getShop() {
    return shop;
  }

  public void setShop(Shop shop) {
    this.shop = shop;
  }

  
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
    
    private String deletedSavedSearchId;

    
    private Shop shop;

    
    private List<UserError> userErrors;

    public SavedSearchDeletePayload build() {
      SavedSearchDeletePayload result = new SavedSearchDeletePayload();
      result.deletedSavedSearchId = this.deletedSavedSearchId;
      result.shop = this.shop;
      result.userErrors = this.userErrors;
      return result;
    }

    
    public Builder deletedSavedSearchId(String deletedSavedSearchId) {
      this.deletedSavedSearchId = deletedSavedSearchId;
      return this;
    }

    
    public Builder shop(Shop shop) {
      this.shop = shop;
      return this;
    }

    
    public Builder userErrors(List<UserError> userErrors) {
      this.userErrors = userErrors;
      return this;
    }
  }
}
