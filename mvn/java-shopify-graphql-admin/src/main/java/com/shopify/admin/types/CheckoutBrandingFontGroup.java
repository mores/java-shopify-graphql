package com.shopify.admin.types;

import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.Objects;

/**
 * A font group. To learn more about updating fonts, refer to the
 * [checkoutBrandingUpsert](https://shopify.dev/api/admin-graphql/unstable/mutations/checkoutBrandingUpsert)
 * mutation and the checkout branding [tutorial](https://shopify.dev/docs/apps/checkout/styling).
 */
public class CheckoutBrandingFontGroup {
  /**
   * The base font.
   */
  private CheckoutBrandingFont base;

  /**
   * The bold font.
   */
  private CheckoutBrandingFont bold;

  /**
   * The font loading strategy.
   */
  private CheckoutBrandingFontLoadingStrategy loadingStrategy;

  /**
   * The font group name.
   */
  private String name;

  public CheckoutBrandingFontGroup() {
  }

  /**
   * The base font.
   */
  public CheckoutBrandingFont getBase() {
    return base;
  }

  public void setBase(CheckoutBrandingFont base) {
    this.base = base;
  }

  /**
   * The bold font.
   */
  public CheckoutBrandingFont getBold() {
    return bold;
  }

  public void setBold(CheckoutBrandingFont bold) {
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

  /**
   * The font group name.
   */
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  @Override
  public String toString() {
    return "CheckoutBrandingFontGroup{base='" + base + "', bold='" + bold + "', loadingStrategy='" + loadingStrategy + "', name='" + name + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    CheckoutBrandingFontGroup that = (CheckoutBrandingFontGroup) o;
    return Objects.equals(base, that.base) &&
        Objects.equals(bold, that.bold) &&
        Objects.equals(loadingStrategy, that.loadingStrategy) &&
        Objects.equals(name, that.name);
  }

  @Override
  public int hashCode() {
    return Objects.hash(base, bold, loadingStrategy, name);
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public static class Builder {
    /**
     * The base font.
     */
    private CheckoutBrandingFont base;

    /**
     * The bold font.
     */
    private CheckoutBrandingFont bold;

    /**
     * The font loading strategy.
     */
    private CheckoutBrandingFontLoadingStrategy loadingStrategy;

    /**
     * The font group name.
     */
    private String name;

    public CheckoutBrandingFontGroup build() {
      CheckoutBrandingFontGroup result = new CheckoutBrandingFontGroup();
      result.base = this.base;
      result.bold = this.bold;
      result.loadingStrategy = this.loadingStrategy;
      result.name = this.name;
      return result;
    }

    /**
     * The base font.
     */
    public Builder base(CheckoutBrandingFont base) {
      this.base = base;
      return this;
    }

    /**
     * The bold font.
     */
    public Builder bold(CheckoutBrandingFont bold) {
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

    /**
     * The font group name.
     */
    public Builder name(String name) {
      this.name = name;
      return this;
    }
  }
}
