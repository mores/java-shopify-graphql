package com.shopify.admin.types;

import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.Objects;

/**
 * The color settings for global colors and color schemes.
 */
public class CheckoutBrandingColors {
  /**
   * A group of global colors for customizing the overall look and feel of the user interface.
   */
  private CheckoutBrandingColorGlobal global;

  /**
   * A set of color schemes which apply to different areas of the user interface.
   */
  private CheckoutBrandingColorSchemes schemes;

  public CheckoutBrandingColors() {
  }

  /**
   * A group of global colors for customizing the overall look and feel of the user interface.
   */
  public CheckoutBrandingColorGlobal getGlobal() {
    return global;
  }

  public void setGlobal(CheckoutBrandingColorGlobal global) {
    this.global = global;
  }

  /**
   * A set of color schemes which apply to different areas of the user interface.
   */
  public CheckoutBrandingColorSchemes getSchemes() {
    return schemes;
  }

  public void setSchemes(CheckoutBrandingColorSchemes schemes) {
    this.schemes = schemes;
  }

  @Override
  public String toString() {
    return "CheckoutBrandingColors{global='" + global + "', schemes='" + schemes + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    CheckoutBrandingColors that = (CheckoutBrandingColors) o;
    return Objects.equals(global, that.global) &&
        Objects.equals(schemes, that.schemes);
  }

  @Override
  public int hashCode() {
    return Objects.hash(global, schemes);
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public static class Builder {
    /**
     * A group of global colors for customizing the overall look and feel of the user interface.
     */
    private CheckoutBrandingColorGlobal global;

    /**
     * A set of color schemes which apply to different areas of the user interface.
     */
    private CheckoutBrandingColorSchemes schemes;

    public CheckoutBrandingColors build() {
      CheckoutBrandingColors result = new CheckoutBrandingColors();
      result.global = this.global;
      result.schemes = this.schemes;
      return result;
    }

    /**
     * A group of global colors for customizing the overall look and feel of the user interface.
     */
    public Builder global(CheckoutBrandingColorGlobal global) {
      this.global = global;
      return this;
    }

    /**
     * A set of color schemes which apply to different areas of the user interface.
     */
    public Builder schemes(CheckoutBrandingColorSchemes schemes) {
      this.schemes = schemes;
      return this;
    }
  }
}
