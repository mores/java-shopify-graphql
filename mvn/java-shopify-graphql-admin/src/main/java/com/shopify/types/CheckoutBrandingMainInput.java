package com.shopify.types;

import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.Objects;


public class CheckoutBrandingMainInput {
  
  private CheckoutBrandingColorSchemeSelection colorScheme;

  
  private CheckoutBrandingImageInput backgroundImage;

  
  private CheckoutBrandingContainerDividerInput divider;

  
  private CheckoutBrandingMainSectionInput section;

  public CheckoutBrandingMainInput() {
  }

  
  public CheckoutBrandingColorSchemeSelection getColorScheme() {
    return colorScheme;
  }

  public void setColorScheme(CheckoutBrandingColorSchemeSelection colorScheme) {
    this.colorScheme = colorScheme;
  }

  
  public CheckoutBrandingImageInput getBackgroundImage() {
    return backgroundImage;
  }

  public void setBackgroundImage(CheckoutBrandingImageInput backgroundImage) {
    this.backgroundImage = backgroundImage;
  }

  
  public CheckoutBrandingContainerDividerInput getDivider() {
    return divider;
  }

  public void setDivider(CheckoutBrandingContainerDividerInput divider) {
    this.divider = divider;
  }

  
  public CheckoutBrandingMainSectionInput getSection() {
    return section;
  }

  public void setSection(CheckoutBrandingMainSectionInput section) {
    this.section = section;
  }

  @Override
  public String toString() {
    return "CheckoutBrandingMainInput{colorScheme='" + colorScheme + "', backgroundImage='" + backgroundImage + "', divider='" + divider + "', section='" + section + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    CheckoutBrandingMainInput that = (CheckoutBrandingMainInput) o;
    return Objects.equals(colorScheme, that.colorScheme) &&
        Objects.equals(backgroundImage, that.backgroundImage) &&
        Objects.equals(divider, that.divider) &&
        Objects.equals(section, that.section);
  }

  @Override
  public int hashCode() {
    return Objects.hash(colorScheme, backgroundImage, divider, section);
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public static class Builder {
    
    private CheckoutBrandingColorSchemeSelection colorScheme;

    
    private CheckoutBrandingImageInput backgroundImage;

    
    private CheckoutBrandingContainerDividerInput divider;

    
    private CheckoutBrandingMainSectionInput section;

    public CheckoutBrandingMainInput build() {
      CheckoutBrandingMainInput result = new CheckoutBrandingMainInput();
      result.colorScheme = this.colorScheme;
      result.backgroundImage = this.backgroundImage;
      result.divider = this.divider;
      result.section = this.section;
      return result;
    }

    
    public Builder colorScheme(CheckoutBrandingColorSchemeSelection colorScheme) {
      this.colorScheme = colorScheme;
      return this;
    }

    
    public Builder backgroundImage(CheckoutBrandingImageInput backgroundImage) {
      this.backgroundImage = backgroundImage;
      return this;
    }

    
    public Builder divider(CheckoutBrandingContainerDividerInput divider) {
      this.divider = divider;
      return this;
    }

    
    public Builder section(CheckoutBrandingMainSectionInput section) {
      this.section = section;
      return this;
    }
  }
}
