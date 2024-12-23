package com.shopify.types;

import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.Objects;

/**
 * The color schemes.
 */
public class CheckoutBrandingColorSchemes {
  /**
   * The primary scheme. By default, it’s used for the main area of the interface.
   */
  private CheckoutBrandingColorScheme scheme1;

  /**
   * The secondary scheme. By default, it’s used for secondary areas, like Checkout’s Order Summary.
   */
  private CheckoutBrandingColorScheme scheme2;

  /**
   * An extra scheme available to customize more surfaces, components or specific states of the user interface.
   */
  private CheckoutBrandingColorScheme scheme3;

  /**
   * An extra scheme available to customize more surfaces, components or specific states of the user interface.
   */
  private CheckoutBrandingColorScheme scheme4;

  public CheckoutBrandingColorSchemes() {
  }

  /**
   * The primary scheme. By default, it’s used for the main area of the interface.
   */
  public CheckoutBrandingColorScheme getScheme1() {
    return scheme1;
  }

  public void setScheme1(CheckoutBrandingColorScheme scheme1) {
    this.scheme1 = scheme1;
  }

  /**
   * The secondary scheme. By default, it’s used for secondary areas, like Checkout’s Order Summary.
   */
  public CheckoutBrandingColorScheme getScheme2() {
    return scheme2;
  }

  public void setScheme2(CheckoutBrandingColorScheme scheme2) {
    this.scheme2 = scheme2;
  }

  /**
   * An extra scheme available to customize more surfaces, components or specific states of the user interface.
   */
  public CheckoutBrandingColorScheme getScheme3() {
    return scheme3;
  }

  public void setScheme3(CheckoutBrandingColorScheme scheme3) {
    this.scheme3 = scheme3;
  }

  /**
   * An extra scheme available to customize more surfaces, components or specific states of the user interface.
   */
  public CheckoutBrandingColorScheme getScheme4() {
    return scheme4;
  }

  public void setScheme4(CheckoutBrandingColorScheme scheme4) {
    this.scheme4 = scheme4;
  }

  @Override
  public String toString() {
    return "CheckoutBrandingColorSchemes{scheme1='" + scheme1 + "', scheme2='" + scheme2 + "', scheme3='" + scheme3 + "', scheme4='" + scheme4 + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    CheckoutBrandingColorSchemes that = (CheckoutBrandingColorSchemes) o;
    return Objects.equals(scheme1, that.scheme1) &&
        Objects.equals(scheme2, that.scheme2) &&
        Objects.equals(scheme3, that.scheme3) &&
        Objects.equals(scheme4, that.scheme4);
  }

  @Override
  public int hashCode() {
    return Objects.hash(scheme1, scheme2, scheme3, scheme4);
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public static class Builder {
    /**
     * The primary scheme. By default, it’s used for the main area of the interface.
     */
    private CheckoutBrandingColorScheme scheme1;

    /**
     * The secondary scheme. By default, it’s used for secondary areas, like Checkout’s Order Summary.
     */
    private CheckoutBrandingColorScheme scheme2;

    /**
     * An extra scheme available to customize more surfaces, components or specific states of the user interface.
     */
    private CheckoutBrandingColorScheme scheme3;

    /**
     * An extra scheme available to customize more surfaces, components or specific states of the user interface.
     */
    private CheckoutBrandingColorScheme scheme4;

    public CheckoutBrandingColorSchemes build() {
      CheckoutBrandingColorSchemes result = new CheckoutBrandingColorSchemes();
      result.scheme1 = this.scheme1;
      result.scheme2 = this.scheme2;
      result.scheme3 = this.scheme3;
      result.scheme4 = this.scheme4;
      return result;
    }

    /**
     * The primary scheme. By default, it’s used for the main area of the interface.
     */
    public Builder scheme1(CheckoutBrandingColorScheme scheme1) {
      this.scheme1 = scheme1;
      return this;
    }

    /**
     * The secondary scheme. By default, it’s used for secondary areas, like Checkout’s Order Summary.
     */
    public Builder scheme2(CheckoutBrandingColorScheme scheme2) {
      this.scheme2 = scheme2;
      return this;
    }

    /**
     * An extra scheme available to customize more surfaces, components or specific states of the user interface.
     */
    public Builder scheme3(CheckoutBrandingColorScheme scheme3) {
      this.scheme3 = scheme3;
      return this;
    }

    /**
     * An extra scheme available to customize more surfaces, components or specific states of the user interface.
     */
    public Builder scheme4(CheckoutBrandingColorScheme scheme4) {
      this.scheme4 = scheme4;
      return this;
    }
  }
}
