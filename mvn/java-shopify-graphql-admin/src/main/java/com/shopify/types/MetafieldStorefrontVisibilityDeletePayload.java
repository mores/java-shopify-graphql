package com.shopify.types;

import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.List;
import java.util.Objects;


public class MetafieldStorefrontVisibilityDeletePayload {
  
  private String deletedMetafieldStorefrontVisibilityId;

  
  private List<UserError> userErrors;

  public MetafieldStorefrontVisibilityDeletePayload() {
  }

  
  public String getDeletedMetafieldStorefrontVisibilityId() {
    return deletedMetafieldStorefrontVisibilityId;
  }

  public void setDeletedMetafieldStorefrontVisibilityId(
      String deletedMetafieldStorefrontVisibilityId) {
    this.deletedMetafieldStorefrontVisibilityId = deletedMetafieldStorefrontVisibilityId;
  }

  
  public List<UserError> getUserErrors() {
    return userErrors;
  }

  public void setUserErrors(List<UserError> userErrors) {
    this.userErrors = userErrors;
  }

  @Override
  public String toString() {
    return "MetafieldStorefrontVisibilityDeletePayload{deletedMetafieldStorefrontVisibilityId='" + deletedMetafieldStorefrontVisibilityId + "', userErrors='" + userErrors + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    MetafieldStorefrontVisibilityDeletePayload that = (MetafieldStorefrontVisibilityDeletePayload) o;
    return Objects.equals(deletedMetafieldStorefrontVisibilityId, that.deletedMetafieldStorefrontVisibilityId) &&
        Objects.equals(userErrors, that.userErrors);
  }

  @Override
  public int hashCode() {
    return Objects.hash(deletedMetafieldStorefrontVisibilityId, userErrors);
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public static class Builder {
    
    private String deletedMetafieldStorefrontVisibilityId;

    
    private List<UserError> userErrors;

    public MetafieldStorefrontVisibilityDeletePayload build() {
      MetafieldStorefrontVisibilityDeletePayload result = new MetafieldStorefrontVisibilityDeletePayload();
      result.deletedMetafieldStorefrontVisibilityId = this.deletedMetafieldStorefrontVisibilityId;
      result.userErrors = this.userErrors;
      return result;
    }

    
    public Builder deletedMetafieldStorefrontVisibilityId(
        String deletedMetafieldStorefrontVisibilityId) {
      this.deletedMetafieldStorefrontVisibilityId = deletedMetafieldStorefrontVisibilityId;
      return this;
    }

    
    public Builder userErrors(List<UserError> userErrors) {
      this.userErrors = userErrors;
      return this;
    }
  }
}
