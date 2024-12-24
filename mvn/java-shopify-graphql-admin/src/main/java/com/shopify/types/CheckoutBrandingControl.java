package com.shopify.types;

import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.Objects;


public class CheckoutBrandingControl {
  
  private CheckoutBrandingSimpleBorder border;

  
  private CheckoutBrandingColorSelection color;

  
  private CheckoutBrandingCornerRadius cornerRadius;

  
  private CheckoutBrandingLabelPosition labelPosition;

  public CheckoutBrandingControl() {
  }

  
  public CheckoutBrandingSimpleBorder getBorder() {
    return border;
  }

  public void setBorder(CheckoutBrandingSimpleBorder border) {
    this.border = border;
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

  
  public CheckoutBrandingLabelPosition getLabelPosition() {
    return labelPosition;
  }

  public void setLabelPosition(CheckoutBrandingLabelPosition labelPosition) {
    this.labelPosition = labelPosition;
  }

  @Override
  public String toString() {
    return "CheckoutBrandingControl{border='" + border + "', color='" + color + "', cornerRadius='" + cornerRadius + "', labelPosition='" + labelPosition + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    CheckoutBrandingControl that = (CheckoutBrandingControl) o;
    return Objects.equals(border, that.border) &&
        Objects.equals(color, that.color) &&
        Objects.equals(cornerRadius, that.cornerRadius) &&
        Objects.equals(labelPosition, that.labelPosition);
  }

  @Override
  public int hashCode() {
    return Objects.hash(border, color, cornerRadius, labelPosition);
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public static class Builder {
    
    private CheckoutBrandingSimpleBorder border;

    
    private CheckoutBrandingColorSelection color;

    
    private CheckoutBrandingCornerRadius cornerRadius;

    
    private CheckoutBrandingLabelPosition labelPosition;

    public CheckoutBrandingControl build() {
      CheckoutBrandingControl result = new CheckoutBrandingControl();
      result.border = this.border;
      result.color = this.color;
      result.cornerRadius = this.cornerRadius;
      result.labelPosition = this.labelPosition;
      return result;
    }

    
    public Builder border(CheckoutBrandingSimpleBorder border) {
      this.border = border;
      return this;
    }

    
    public Builder color(CheckoutBrandingColorSelection color) {
      this.color = color;
      return this;
    }

    
    public Builder cornerRadius(CheckoutBrandingCornerRadius cornerRadius) {
      this.cornerRadius = cornerRadius;
      return this;
    }

    
    public Builder labelPosition(CheckoutBrandingLabelPosition labelPosition) {
      this.labelPosition = labelPosition;
      return this;
    }
  }
}
