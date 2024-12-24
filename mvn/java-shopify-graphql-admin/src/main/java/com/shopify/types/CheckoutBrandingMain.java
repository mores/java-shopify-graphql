package com.shopify.types;

import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.Objects;


public class CheckoutBrandingMain {
  
  private CheckoutBrandingImage backgroundImage;

  
  private CheckoutBrandingColorSchemeSelection colorScheme;

  
  private CheckoutBrandingContainerDivider divider;

  
  private CheckoutBrandingMainSection section;

  public CheckoutBrandingMain() {
  }

  
  public CheckoutBrandingImage getBackgroundImage() {
    return backgroundImage;
  }

  public void setBackgroundImage(CheckoutBrandingImage backgroundImage) {
    this.backgroundImage = backgroundImage;
  }

  
  public CheckoutBrandingColorSchemeSelection getColorScheme() {
    return colorScheme;
  }

  public void setColorScheme(CheckoutBrandingColorSchemeSelection colorScheme) {
    this.colorScheme = colorScheme;
  }

  
  public CheckoutBrandingContainerDivider getDivider() {
    return divider;
  }

  public void setDivider(CheckoutBrandingContainerDivider divider) {
    this.divider = divider;
  }

  
  public CheckoutBrandingMainSection getSection() {
    return section;
  }

  public void setSection(CheckoutBrandingMainSection section) {
    this.section = section;
  }

  @Override
  public String toString() {
    return "CheckoutBrandingMain{backgroundImage='" + backgroundImage + "', colorScheme='" + colorScheme + "', divider='" + divider + "', section='" + section + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    CheckoutBrandingMain that = (CheckoutBrandingMain) o;
    return Objects.equals(backgroundImage, that.backgroundImage) &&
        Objects.equals(colorScheme, that.colorScheme) &&
        Objects.equals(divider, that.divider) &&
        Objects.equals(section, that.section);
  }

  @Override
  public int hashCode() {
    return Objects.hash(backgroundImage, colorScheme, divider, section);
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public static class Builder {
    
    private CheckoutBrandingImage backgroundImage;

    
    private CheckoutBrandingColorSchemeSelection colorScheme;

    
    private CheckoutBrandingContainerDivider divider;

    
    private CheckoutBrandingMainSection section;

    public CheckoutBrandingMain build() {
      CheckoutBrandingMain result = new CheckoutBrandingMain();
      result.backgroundImage = this.backgroundImage;
      result.colorScheme = this.colorScheme;
      result.divider = this.divider;
      result.section = this.section;
      return result;
    }

    
    public Builder backgroundImage(CheckoutBrandingImage backgroundImage) {
      this.backgroundImage = backgroundImage;
      return this;
    }

    
    public Builder colorScheme(CheckoutBrandingColorSchemeSelection colorScheme) {
      this.colorScheme = colorScheme;
      return this;
    }

    
    public Builder divider(CheckoutBrandingContainerDivider divider) {
      this.divider = divider;
      return this;
    }

    
    public Builder section(CheckoutBrandingMainSection section) {
      this.section = section;
      return this;
    }
  }
}
