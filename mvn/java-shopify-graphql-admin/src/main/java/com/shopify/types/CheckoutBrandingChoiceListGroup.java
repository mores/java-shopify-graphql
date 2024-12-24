package com.shopify.types;

import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.Objects;


public class CheckoutBrandingChoiceListGroup {
  
  private CheckoutBrandingSpacingKeyword spacing;

  public CheckoutBrandingChoiceListGroup() {
  }

  
  public CheckoutBrandingSpacingKeyword getSpacing() {
    return spacing;
  }

  public void setSpacing(CheckoutBrandingSpacingKeyword spacing) {
    this.spacing = spacing;
  }

  @Override
  public String toString() {
    return "CheckoutBrandingChoiceListGroup{spacing='" + spacing + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    CheckoutBrandingChoiceListGroup that = (CheckoutBrandingChoiceListGroup) o;
    return Objects.equals(spacing, that.spacing);
  }

  @Override
  public int hashCode() {
    return Objects.hash(spacing);
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public static class Builder {
    
    private CheckoutBrandingSpacingKeyword spacing;

    public CheckoutBrandingChoiceListGroup build() {
      CheckoutBrandingChoiceListGroup result = new CheckoutBrandingChoiceListGroup();
      result.spacing = this.spacing;
      return result;
    }

    
    public Builder spacing(CheckoutBrandingSpacingKeyword spacing) {
      this.spacing = spacing;
      return this;
    }
  }
}
