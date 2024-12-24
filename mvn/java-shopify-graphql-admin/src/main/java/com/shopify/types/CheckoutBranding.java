package com.shopify.types;

import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.Objects;


public class CheckoutBranding {
  
  private CheckoutBrandingCustomizations customizations;

  
  private CheckoutBrandingDesignSystem designSystem;

  public CheckoutBranding() {
  }

  
  public CheckoutBrandingCustomizations getCustomizations() {
    return customizations;
  }

  public void setCustomizations(CheckoutBrandingCustomizations customizations) {
    this.customizations = customizations;
  }

  
  public CheckoutBrandingDesignSystem getDesignSystem() {
    return designSystem;
  }

  public void setDesignSystem(CheckoutBrandingDesignSystem designSystem) {
    this.designSystem = designSystem;
  }

  @Override
  public String toString() {
    return "CheckoutBranding{customizations='" + customizations + "', designSystem='" + designSystem + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    CheckoutBranding that = (CheckoutBranding) o;
    return Objects.equals(customizations, that.customizations) &&
        Objects.equals(designSystem, that.designSystem);
  }

  @Override
  public int hashCode() {
    return Objects.hash(customizations, designSystem);
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public static class Builder {
    
    private CheckoutBrandingCustomizations customizations;

    
    private CheckoutBrandingDesignSystem designSystem;

    public CheckoutBranding build() {
      CheckoutBranding result = new CheckoutBranding();
      result.customizations = this.customizations;
      result.designSystem = this.designSystem;
      return result;
    }

    
    public Builder customizations(CheckoutBrandingCustomizations customizations) {
      this.customizations = customizations;
      return this;
    }

    
    public Builder designSystem(CheckoutBrandingDesignSystem designSystem) {
      this.designSystem = designSystem;
      return this;
    }
  }
}
