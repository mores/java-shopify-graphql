package com.shopify.types;

import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.Objects;


public class CheckoutBrandingColorSchemeInput {
  
  private CheckoutBrandingColorRolesInput base;

  
  private CheckoutBrandingControlColorRolesInput control;

  
  private CheckoutBrandingButtonColorRolesInput primaryButton;

  
  private CheckoutBrandingButtonColorRolesInput secondaryButton;

  public CheckoutBrandingColorSchemeInput() {
  }

  
  public CheckoutBrandingColorRolesInput getBase() {
    return base;
  }

  public void setBase(CheckoutBrandingColorRolesInput base) {
    this.base = base;
  }

  
  public CheckoutBrandingControlColorRolesInput getControl() {
    return control;
  }

  public void setControl(CheckoutBrandingControlColorRolesInput control) {
    this.control = control;
  }

  
  public CheckoutBrandingButtonColorRolesInput getPrimaryButton() {
    return primaryButton;
  }

  public void setPrimaryButton(CheckoutBrandingButtonColorRolesInput primaryButton) {
    this.primaryButton = primaryButton;
  }

  
  public CheckoutBrandingButtonColorRolesInput getSecondaryButton() {
    return secondaryButton;
  }

  public void setSecondaryButton(CheckoutBrandingButtonColorRolesInput secondaryButton) {
    this.secondaryButton = secondaryButton;
  }

  @Override
  public String toString() {
    return "CheckoutBrandingColorSchemeInput{base='" + base + "', control='" + control + "', primaryButton='" + primaryButton + "', secondaryButton='" + secondaryButton + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    CheckoutBrandingColorSchemeInput that = (CheckoutBrandingColorSchemeInput) o;
    return Objects.equals(base, that.base) &&
        Objects.equals(control, that.control) &&
        Objects.equals(primaryButton, that.primaryButton) &&
        Objects.equals(secondaryButton, that.secondaryButton);
  }

  @Override
  public int hashCode() {
    return Objects.hash(base, control, primaryButton, secondaryButton);
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public static class Builder {
    
    private CheckoutBrandingColorRolesInput base;

    
    private CheckoutBrandingControlColorRolesInput control;

    
    private CheckoutBrandingButtonColorRolesInput primaryButton;

    
    private CheckoutBrandingButtonColorRolesInput secondaryButton;

    public CheckoutBrandingColorSchemeInput build() {
      CheckoutBrandingColorSchemeInput result = new CheckoutBrandingColorSchemeInput();
      result.base = this.base;
      result.control = this.control;
      result.primaryButton = this.primaryButton;
      result.secondaryButton = this.secondaryButton;
      return result;
    }

    
    public Builder base(CheckoutBrandingColorRolesInput base) {
      this.base = base;
      return this;
    }

    
    public Builder control(CheckoutBrandingControlColorRolesInput control) {
      this.control = control;
      return this;
    }

    
    public Builder primaryButton(CheckoutBrandingButtonColorRolesInput primaryButton) {
      this.primaryButton = primaryButton;
      return this;
    }

    
    public Builder secondaryButton(CheckoutBrandingButtonColorRolesInput secondaryButton) {
      this.secondaryButton = secondaryButton;
      return this;
    }
  }
}
