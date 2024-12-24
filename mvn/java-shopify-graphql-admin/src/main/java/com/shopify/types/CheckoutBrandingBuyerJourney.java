package com.shopify.types;

import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.Objects;


public class CheckoutBrandingBuyerJourney {
  
  private CheckoutBrandingVisibility visibility;

  public CheckoutBrandingBuyerJourney() {
  }

  
  public CheckoutBrandingVisibility getVisibility() {
    return visibility;
  }

  public void setVisibility(CheckoutBrandingVisibility visibility) {
    this.visibility = visibility;
  }

  @Override
  public String toString() {
    return "CheckoutBrandingBuyerJourney{visibility='" + visibility + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    CheckoutBrandingBuyerJourney that = (CheckoutBrandingBuyerJourney) o;
    return Objects.equals(visibility, that.visibility);
  }

  @Override
  public int hashCode() {
    return Objects.hash(visibility);
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public static class Builder {
    
    private CheckoutBrandingVisibility visibility;

    public CheckoutBrandingBuyerJourney build() {
      CheckoutBrandingBuyerJourney result = new CheckoutBrandingBuyerJourney();
      result.visibility = this.visibility;
      return result;
    }

    
    public Builder visibility(CheckoutBrandingVisibility visibility) {
      this.visibility = visibility;
      return this;
    }
  }
}
