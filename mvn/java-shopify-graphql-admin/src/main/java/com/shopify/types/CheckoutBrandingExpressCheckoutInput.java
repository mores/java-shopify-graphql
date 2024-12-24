package com.shopify.types;

import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.Objects;


public class CheckoutBrandingExpressCheckoutInput {
  
  private CheckoutBrandingExpressCheckoutButtonInput button;

  public CheckoutBrandingExpressCheckoutInput() {
  }

  
  public CheckoutBrandingExpressCheckoutButtonInput getButton() {
    return button;
  }

  public void setButton(CheckoutBrandingExpressCheckoutButtonInput button) {
    this.button = button;
  }

  @Override
  public String toString() {
    return "CheckoutBrandingExpressCheckoutInput{button='" + button + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    CheckoutBrandingExpressCheckoutInput that = (CheckoutBrandingExpressCheckoutInput) o;
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
    
    private CheckoutBrandingExpressCheckoutButtonInput button;

    public CheckoutBrandingExpressCheckoutInput build() {
      CheckoutBrandingExpressCheckoutInput result = new CheckoutBrandingExpressCheckoutInput();
      result.button = this.button;
      return result;
    }

    
    public Builder button(CheckoutBrandingExpressCheckoutButtonInput button) {
      this.button = button;
      return this;
    }
  }
}
