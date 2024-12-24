package com.shopify.types;

import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.Objects;


public class CheckoutBrandingInput {
  
  private CheckoutBrandingDesignSystemInput designSystem;

  
  private CheckoutBrandingCustomizationsInput customizations;

  public CheckoutBrandingInput() {
  }

  
  public CheckoutBrandingDesignSystemInput getDesignSystem() {
    return designSystem;
  }

  public void setDesignSystem(CheckoutBrandingDesignSystemInput designSystem) {
    this.designSystem = designSystem;
  }

  
  public CheckoutBrandingCustomizationsInput getCustomizations() {
    return customizations;
  }

  public void setCustomizations(CheckoutBrandingCustomizationsInput customizations) {
    this.customizations = customizations;
  }

  @Override
  public String toString() {
    return "CheckoutBrandingInput{designSystem='" + designSystem + "', customizations='" + customizations + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    CheckoutBrandingInput that = (CheckoutBrandingInput) o;
    return Objects.equals(designSystem, that.designSystem) &&
        Objects.equals(customizations, that.customizations);
  }

  @Override
  public int hashCode() {
    return Objects.hash(designSystem, customizations);
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public static class Builder {
    
    private CheckoutBrandingDesignSystemInput designSystem;

    
    private CheckoutBrandingCustomizationsInput customizations;

    public CheckoutBrandingInput build() {
      CheckoutBrandingInput result = new CheckoutBrandingInput();
      result.designSystem = this.designSystem;
      result.customizations = this.customizations;
      return result;
    }

    
    public Builder designSystem(CheckoutBrandingDesignSystemInput designSystem) {
      this.designSystem = designSystem;
      return this;
    }

    
    public Builder customizations(CheckoutBrandingCustomizationsInput customizations) {
      this.customizations = customizations;
      return this;
    }
  }
}
