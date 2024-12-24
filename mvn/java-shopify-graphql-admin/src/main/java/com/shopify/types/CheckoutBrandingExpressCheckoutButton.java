package com.shopify.types;

import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.Objects;


public class CheckoutBrandingExpressCheckoutButton {
  
  private CheckoutBrandingCornerRadius cornerRadius;

  public CheckoutBrandingExpressCheckoutButton() {
  }

  
  public CheckoutBrandingCornerRadius getCornerRadius() {
    return cornerRadius;
  }

  public void setCornerRadius(CheckoutBrandingCornerRadius cornerRadius) {
    this.cornerRadius = cornerRadius;
  }

  @Override
  public String toString() {
    return "CheckoutBrandingExpressCheckoutButton{cornerRadius='" + cornerRadius + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    CheckoutBrandingExpressCheckoutButton that = (CheckoutBrandingExpressCheckoutButton) o;
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

    public CheckoutBrandingExpressCheckoutButton build() {
      CheckoutBrandingExpressCheckoutButton result = new CheckoutBrandingExpressCheckoutButton();
      result.cornerRadius = this.cornerRadius;
      return result;
    }

    
    public Builder cornerRadius(CheckoutBrandingCornerRadius cornerRadius) {
      this.cornerRadius = cornerRadius;
      return this;
    }
  }
}
