package com.shopify.types;

import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.Objects;


public class CheckoutBrandingExpressCheckout {
  
  private CheckoutBrandingExpressCheckoutButton button;

  public CheckoutBrandingExpressCheckout() {
  }

  
  public CheckoutBrandingExpressCheckoutButton getButton() {
    return button;
  }

  public void setButton(CheckoutBrandingExpressCheckoutButton button) {
    this.button = button;
  }

  @Override
  public String toString() {
    return "CheckoutBrandingExpressCheckout{button='" + button + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    CheckoutBrandingExpressCheckout that = (CheckoutBrandingExpressCheckout) o;
    return Objects.equals(button, that.button);
  }

  @Override
  public int hashCode() {
    return Objects.hash(button);
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public static class Builder {
    
    private CheckoutBrandingExpressCheckoutButton button;

    public CheckoutBrandingExpressCheckout build() {
      CheckoutBrandingExpressCheckout result = new CheckoutBrandingExpressCheckout();
      result.button = this.button;
      return result;
    }

    
    public Builder button(CheckoutBrandingExpressCheckoutButton button) {
      this.button = button;
      return this;
    }
  }
}
