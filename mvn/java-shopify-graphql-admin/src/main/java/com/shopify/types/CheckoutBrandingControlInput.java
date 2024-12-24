package com.shopify.types;

import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.Objects;


public class CheckoutBrandingControlInput {
  
  private CheckoutBrandingColorSelection color;

  
  private CheckoutBrandingCornerRadius cornerRadius;

  
  private CheckoutBrandingSimpleBorder border;

  
  private CheckoutBrandingLabelPosition labelPosition;

  public CheckoutBrandingControlInput() {
  }

  
  public CheckoutBrandingColorSelection getColor() {
    return color;
  }

  public void setColor(CheckoutBrandingColorSelection color) {
    this.color = color;
  }

  
  public CheckoutBrandingCornerRadius getCornerRadius() {
    return cornerRadius;
  }

  public void setCornerRadius(CheckoutBrandingCornerRadius cornerRadius) {
    this.cornerRadius = cornerRadius;
  }

  
  public CheckoutBrandingSimpleBorder getBorder() {
    return border;
  }

  public void setBorder(CheckoutBrandingSimpleBorder border) {
    this.border = border;
  }

  
  public CheckoutBrandingLabelPosition getLabelPosition() {
    return labelPosition;
  }

  public void setLabelPosition(CheckoutBrandingLabelPosition labelPosition) {
    this.labelPosition = labelPosition;
  }

  @Override
  public String toString() {
    return "CheckoutBrandingControlInput{color='" + color + "', cornerRadius='" + cornerRadius + "', border='" + border + "', labelPosition='" + labelPosition + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    CheckoutBrandingControlInput that = (CheckoutBrandingControlInput) o;
    return Objects.equals(color, that.color) &&
        Objects.equals(cornerRadius, that.cornerRadius) &&
        Objects.equals(border, that.border) &&
        Objects.equals(labelPosition, that.labelPosition);
  }

  @Override
  public int hashCode() {
    return Objects.hash(color, cornerRadius, border, labelPosition);
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public static class Builder {
    
    private CheckoutBrandingColorSelection color;

    
    private CheckoutBrandingCornerRadius cornerRadius;

    
    private CheckoutBrandingSimpleBorder border;

    
    private CheckoutBrandingLabelPosition labelPosition;

    public CheckoutBrandingControlInput build() {
      CheckoutBrandingControlInput result = new CheckoutBrandingControlInput();
      result.color = this.color;
      result.cornerRadius = this.cornerRadius;
      result.border = this.border;
      result.labelPosition = this.labelPosition;
      return result;
    }

    
    public Builder color(CheckoutBrandingColorSelection color) {
      this.color = color;
      return this;
    }

    
    public Builder cornerRadius(CheckoutBrandingCornerRadius cornerRadius) {
      this.cornerRadius = cornerRadius;
      return this;
    }

    
    public Builder border(CheckoutBrandingSimpleBorder border) {
      this.border = border;
      return this;
    }

    
    public Builder labelPosition(CheckoutBrandingLabelPosition labelPosition) {
      this.labelPosition = labelPosition;
      return this;
    }
  }
}
