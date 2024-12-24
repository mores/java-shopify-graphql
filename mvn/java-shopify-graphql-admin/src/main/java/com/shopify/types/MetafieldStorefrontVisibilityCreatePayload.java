package com.shopify.types;

import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.List;
import java.util.Objects;


public class MetafieldStorefrontVisibilityCreatePayload {
  
  private MetafieldStorefrontVisibility metafieldStorefrontVisibility;

  
  private List<UserError> userErrors;

  public MetafieldStorefrontVisibilityCreatePayload() {
  }

  
  public MetafieldStorefrontVisibility getMetafieldStorefrontVisibility() {
    return metafieldStorefrontVisibility;
  }

  public void setMetafieldStorefrontVisibility(
      MetafieldStorefrontVisibility metafieldStorefrontVisibility) {
    this.metafieldStorefrontVisibility = metafieldStorefrontVisibility;
  }

  
  public List<UserError> getUserErrors() {
    return userErrors;
  }

  public void setUserErrors(List<UserError> userErrors) {
    this.userErrors = userErrors;
  }

  @Override
  public String toString() {
    return "MetafieldStorefrontVisibilityCreatePayload{metafieldStorefrontVisibility='" + metafieldStorefrontVisibility + "', userErrors='" + userErrors + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    MetafieldStorefrontVisibilityCreatePayload that = (MetafieldStorefrontVisibilityCreatePayload) o;
    return Objects.equals(metafieldStorefrontVisibility, that.metafieldStorefrontVisibility) &&
        Objects.equals(userErrors, that.userErrors);
  }

  @Override
  public int hashCode() {
    return Objects.hash(metafieldStorefrontVisibility, userErrors);
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public static class Builder {
    
    private MetafieldStorefrontVisibility metafieldStorefrontVisibility;

    
    private List<UserError> userErrors;

    public MetafieldStorefrontVisibilityCreatePayload build() {
      MetafieldStorefrontVisibilityCreatePayload result = new MetafieldStorefrontVisibilityCreatePayload();
      result.metafieldStorefrontVisibility = this.metafieldStorefrontVisibility;
      result.userErrors = this.userErrors;
      return result;
    }

    
    public Builder metafieldStorefrontVisibility(
        MetafieldStorefrontVisibility metafieldStorefrontVisibility) {
      this.metafieldStorefrontVisibility = metafieldStorefrontVisibility;
      return this;
    }

    
    public Builder userErrors(List<UserError> userErrors) {
      this.userErrors = userErrors;
      return this;
    }
  }
}
