package com.shopify.types;

import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.Objects;


public class CheckoutBrandingExpressCheckoutButtonInput {
  
  private CheckoutBrandingCornerRadius cornerRadius;

  public CheckoutBrandingExpressCheckoutButtonInput() {
  }

  
  public CheckoutBrandingCornerRadius getCornerRadius() {
    return cornerRadius;
  }

  public void setCornerRadius(CheckoutBrandingCornerRadius cornerRadius) {
    this.cornerRadius = cornerRadius;
  }

  @Override
  public String toString() {
    return "CheckoutBrandingExpressCheckoutButtonInput{cornerRadius='" + cornerRadius + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    CheckoutBrandingExpressCheckoutButtonInput that = (CheckoutBrandingExpressCheckoutButtonInput) o;
    return Objects.equals(cornerRadius, that.cornerRadius);
  }

  @Override
  public int hashCode() {
    return Objects.hash(cornerRadius);
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public static class Builder {
    
    private CheckoutBrandingCornerRadius cornerRadius;

    public CheckoutBrandingExpressCheckoutButtonInput build() {
      CheckoutBrandingExpressCheckoutButtonInput result = new CheckoutBrandingExpressCheckoutButtonInput();
      result.cornerRadius = this.cornerRadius;
      return result;
    }

    
    public Builder cornerRadius(CheckoutBrandingCornerRadius cornerRadius) {
      this.cornerRadius = cornerRadius;
      return this;
    }
  }
}
