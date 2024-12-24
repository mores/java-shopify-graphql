package com.shopify.types;

import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.Objects;


public class CheckoutBrandingColorScheme {
  
  private CheckoutBrandingColorRoles base;

  
  private CheckoutBrandingControlColorRoles control;

  
  private CheckoutBrandingButtonColorRoles primaryButton;

  
  private CheckoutBrandingButtonColorRoles secondaryButton;

  public CheckoutBrandingColorScheme() {
  }

  
  public CheckoutBrandingColorRoles getBase() {
    return base;
  }

  public void setBase(CheckoutBrandingColorRoles base) {
    this.base = base;
  }

  
  public CheckoutBrandingControlColorRoles getControl() {
    return control;
  }

  public void setControl(CheckoutBrandingControlColorRoles control) {
    this.control = control;
  }

  
  public CheckoutBrandingButtonColorRoles getPrimaryButton() {
    return primaryButton;
  }

  public void setPrimaryButton(CheckoutBrandingButtonColorRoles primaryButton) {
    this.primaryButton = primaryButton;
  }

  
  public CheckoutBrandingButtonColorRoles getSecondaryButton() {
    return secondaryButton;
  }

  public void setSecondaryButton(CheckoutBrandingButtonColorRoles secondaryButton) {
    this.secondaryButton = secondaryButton;
  }

  @Override
  public String toString() {
    return "CheckoutBrandingColorScheme{base='" + base + "', control='" + control + "', primaryButton='" + primaryButton + "', secondaryButton='" + secondaryButton + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    CheckoutBrandingColorScheme that = (CheckoutBrandingColorScheme) o;
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
    
    private CheckoutBrandingColorRoles base;

    
    private CheckoutBrandingControlColorRoles control;

    
    private CheckoutBrandingButtonColorRoles primaryButton;

    
    private CheckoutBrandingButtonColorRoles secondaryButton;

    public CheckoutBrandingColorScheme build() {
      CheckoutBrandingColorScheme result = new CheckoutBrandingColorScheme();
      result.base = this.base;
      result.control = this.control;
      result.primaryButton = this.primaryButton;
      result.secondaryButton = this.secondaryButton;
      return result;
    }

    
    public Builder base(CheckoutBrandingColorRoles base) {
      this.base = base;
      return this;
    }

    
    public Builder control(CheckoutBrandingControlColorRoles control) {
      this.control = control;
      return this;
    }

    
    public Builder primaryButton(CheckoutBrandingButtonColorRoles primaryButton) {
      this.primaryButton = primaryButton;
      return this;
    }

    
    public Builder secondaryButton(CheckoutBrandingButtonColorRoles secondaryButton) {
      this.secondaryButton = secondaryButton;
      return this;
    }
  }
}
