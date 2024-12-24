package com.shopify.types;

import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.List;
import java.util.Objects;


public class CheckoutBrandingUpsertPayload {
  
  private CheckoutBranding checkoutBranding;

  
  private List<CheckoutBrandingUpsertUserError> userErrors;

  public CheckoutBrandingUpsertPayload() {
  }

  
  public CheckoutBranding getCheckoutBranding() {
    return checkoutBranding;
  }

  public void setCheckoutBranding(CheckoutBranding checkoutBranding) {
    this.checkoutBranding = checkoutBranding;
  }

  
  public List<CheckoutBrandingUpsertUserError> getUserErrors() {
    return userErrors;
  }

  public void setUserErrors(List<CheckoutBrandingUpsertUserError> userErrors) {
    this.userErrors = userErrors;
  }

  @Override
  public String toString() {
    return "CheckoutBrandingUpsertPayload{checkoutBranding='" + checkoutBranding + "', userErrors='" + userErrors + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    CheckoutBrandingUpsertPayload that = (CheckoutBrandingUpsertPayload) o;
    return Objects.equals(checkoutBranding, that.checkoutBranding) &&
        Objects.equals(userErrors, that.userErrors);
  }

  @Override
  public int hashCode() {
    return Objects.hash(checkoutBranding, userErrors);
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public static class Builder {
    
    private CheckoutBranding checkoutBranding;

    
    private List<CheckoutBrandingUpsertUserError> userErrors;

    public CheckoutBrandingUpsertPayload build() {
      CheckoutBrandingUpsertPayload result = new CheckoutBrandingUpsertPayload();
      result.checkoutBranding = this.checkoutBranding;
      result.userErrors = this.userErrors;
      return result;
    }

    
    public Builder checkoutBranding(CheckoutBranding checkoutBranding) {
      this.checkoutBranding = checkoutBranding;
      return this;
    }

    
    public Builder userErrors(List<CheckoutBrandingUpsertUserError> userErrors) {
      this.userErrors = userErrors;
      return this;
    }
  }
}
