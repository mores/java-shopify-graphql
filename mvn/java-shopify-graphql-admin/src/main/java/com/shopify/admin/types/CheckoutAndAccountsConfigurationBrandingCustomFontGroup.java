package com.shopify.admin.types;

import com.fasterxml.jackson.annotation.JsonTypeInfo;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.Objects;

/**
 * The custom font group customizations.
 */
@JsonTypeInfo(
    use = JsonTypeInfo.Id.NONE
)
public class CheckoutAndAccountsConfigurationBrandingCustomFontGroup implements CheckoutAndAccountsConfigurationBrandingFontGroup {
  /**
   * The base custom font.
   */
  private CheckoutAndAccountsConfigurationBrandingCustomFont base;

  /**
   * The bold custom font.
   */
  private CheckoutAndAccountsConfigurationBrandingCustomFont bold;

  /**
   * The font loading strategy.
   */
  private CheckoutAndAccountsConfigurationBrandingFontLoadingStrategy loadingStrategy;

  /**
   * The font group name.
   */
  private String name;

  public CheckoutAndAccountsConfigurationBrandingCustomFontGroup() {
  }

  /**
   * The base custom font.
   */
  public CheckoutAndAccountsConfigurationBrandingCustomFont getBase() {
    return base;
  }

  public void setBase(CheckoutAndAccountsConfigurationBrandingCustomFont base) {
    this.base = base;
  }

  /**
   * The bold custom font.
   */
  public CheckoutAndAccountsConfigurationBrandingCustomFont getBold() {
    return bold;
  }

  public void setBold(CheckoutAndAccountsConfigurationBrandingCustomFont bold) {
    this.bold = bold;
  }

  /**
   * The font loading strategy.
   */
  public CheckoutAndAccountsConfigurationBrandingFontLoadingStrategy getLoadingStrategy() {
    return loadingStrategy;
  }

  public void setLoadingStrategy(
      CheckoutAndAccountsConfigurationBrandingFontLoadingStrategy loadingStrategy) {
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
    return "CheckoutAndAccountsConfigurationBrandingCustomFontGroup{base='" + base + "', bold='" + bold + "', loadingStrategy='" + loadingStrategy + "', name='" + name + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    CheckoutAndAccountsConfigurationBrandingCustomFontGroup that = (CheckoutAndAccountsConfigurationBrandingCustomFontGroup) o;
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
     * The base custom font.
     */
    private CheckoutAndAccountsConfigurationBrandingCustomFont base;

    /**
     * The bold custom font.
     */
    private CheckoutAndAccountsConfigurationBrandingCustomFont bold;

    /**
     * The font loading strategy.
     */
    private CheckoutAndAccountsConfigurationBrandingFontLoadingStrategy loadingStrategy;

    /**
     * The font group name.
     */
    private String name;

    public CheckoutAndAccountsConfigurationBrandingCustomFontGroup build() {
      CheckoutAndAccountsConfigurationBrandingCustomFontGroup result = new CheckoutAndAccountsConfigurationBrandingCustomFontGroup();
      result.base = this.base;
      result.bold = this.bold;
      result.loadingStrategy = this.loadingStrategy;
      result.name = this.name;
      return result;
    }

    /**
     * The base custom font.
     */
    public Builder base(CheckoutAndAccountsConfigurationBrandingCustomFont base) {
      this.base = base;
      return this;
    }

    /**
     * The bold custom font.
     */
    public Builder bold(CheckoutAndAccountsConfigurationBrandingCustomFont bold) {
      this.bold = bold;
      return this;
    }

    /**
     * The font loading strategy.
     */
    public Builder loadingStrategy(
        CheckoutAndAccountsConfigurationBrandingFontLoadingStrategy loadingStrategy) {
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
