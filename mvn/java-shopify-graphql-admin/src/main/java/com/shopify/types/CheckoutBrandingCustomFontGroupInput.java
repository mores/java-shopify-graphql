package com.shopify.types;

import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.Objects;

/**
 * The input fields required to update a custom font group.
 */
public class CheckoutBrandingCustomFontGroupInput {
  /**
   * The base font.
   */
  private CheckoutBrandingCustomFontInput base;

  /**
   * The bold font.
   */
  private CheckoutBrandingCustomFontInput bold;

  /**
   * The font loading strategy.
   */
  private CheckoutBrandingFontLoadingStrategy loadingStrategy;

  public CheckoutBrandingCustomFontGroupInput() {
  }

  /**
   * The base font.
   */
  public CheckoutBrandingCustomFontInput getBase() {
    return base;
  }

  public void setBase(CheckoutBrandingCustomFontInput base) {
    this.base = base;
  }

  /**
   * The bold font.
   */
  public CheckoutBrandingCustomFontInput getBold() {
    return bold;
  }

  public void setBold(CheckoutBrandingCustomFontInput bold) {
    this.bold = bold;
  }

  /**
   * The font loading strategy.
   */
  public CheckoutBrandingFontLoadingStrategy getLoadingStrategy() {
    return loadingStrategy;
  }

  public void setLoadingStrategy(CheckoutBrandingFontLoadingStrategy loadingStrategy) {
    this.loadingStrategy = loadingStrategy;
  }

  @Override
  public String toString() {
    return "CheckoutBrandingCustomFontGroupInput{base='" + base + "', bold='" + bold + "', loadingStrategy='" + loadingStrategy + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    CheckoutBrandingCustomFontGroupInput that = (CheckoutBrandingCustomFontGroupInput) o;
    return Objects.equals(base, that.base) &&
        Objects.equals(bold, that.bold) &&
        Objects.equals(loadingStrategy, that.loadingStrategy);
  }

  @Override
  public int hashCode() {
    return Objects.hash(base, bold, loadingStrategy);
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public static class Builder {
    /**
     * The base font.
     */
    private CheckoutBrandingCustomFontInput base;

    /**
     * The bold font.
     */
    private CheckoutBrandingCustomFontInput bold;

    /**
     * The font loading strategy.
     */
    private CheckoutBrandingFontLoadingStrategy loadingStrategy;

    public CheckoutBrandingCustomFontGroupInput build() {
      CheckoutBrandingCustomFontGroupInput result = new CheckoutBrandingCustomFontGroupInput();
      result.base = this.base;
      result.bold = this.bold;
      result.loadingStrategy = this.loadingStrategy;
      return result;
    }

    /**
     * The base font.
     */
    public Builder base(CheckoutBrandingCustomFontInput base) {
      this.base = base;
      return this;
    }

    /**
     * The bold font.
     */
    public Builder bold(CheckoutBrandingCustomFontInput bold) {
      this.bold = bold;
      return this;
    }

    /**
     * The font loading strategy.
     */
    public Builder loadingStrategy(CheckoutBrandingFontLoadingStrategy loadingStrategy) {
      this.loadingStrategy = loadingStrategy;
      return this;
    }
  }
}
