package com.shopify.admin.types;

import java.lang.Boolean;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.Objects;

/**
 * The input fields for customizing the header.
 */
public class CheckoutAndAccountsConfigurationBrandingHeaderInput {
  /**
   * The header alignment.
   */
  private CheckoutAndAccountsConfigurationBrandingHeaderAlignment alignment;

  /**
   * The store logo.
   */
  private CheckoutAndAccountsConfigurationBrandingLogoInput logo;

  /**
   * The divided setting.
   */
  private Boolean divided;

  /**
   * The colors customizations for the header container.
   */
  private CheckoutAndAccountsConfigurationBrandingColorsInput colors;

  /**
   * The background style of the header container.
   */
  private CheckoutAndAccountsConfigurationBrandingBackground background;

  /**
   * The padding of the header container.
   */
  private CheckoutAndAccountsConfigurationBrandingSpacingKeyword padding;

  public CheckoutAndAccountsConfigurationBrandingHeaderInput() {
  }

  /**
   * The header alignment.
   */
  public CheckoutAndAccountsConfigurationBrandingHeaderAlignment getAlignment() {
    return alignment;
  }

  public void setAlignment(CheckoutAndAccountsConfigurationBrandingHeaderAlignment alignment) {
    this.alignment = alignment;
  }

  /**
   * The store logo.
   */
  public CheckoutAndAccountsConfigurationBrandingLogoInput getLogo() {
    return logo;
  }

  public void setLogo(CheckoutAndAccountsConfigurationBrandingLogoInput logo) {
    this.logo = logo;
  }

  /**
   * The divided setting.
   */
  public Boolean getDivided() {
    return divided;
  }

  public void setDivided(Boolean divided) {
    this.divided = divided;
  }

  /**
   * The colors customizations for the header container.
   */
  public CheckoutAndAccountsConfigurationBrandingColorsInput getColors() {
    return colors;
  }

  public void setColors(CheckoutAndAccountsConfigurationBrandingColorsInput colors) {
    this.colors = colors;
  }

  /**
   * The background style of the header container.
   */
  public CheckoutAndAccountsConfigurationBrandingBackground getBackground() {
    return background;
  }

  public void setBackground(CheckoutAndAccountsConfigurationBrandingBackground background) {
    this.background = background;
  }

  /**
   * The padding of the header container.
   */
  public CheckoutAndAccountsConfigurationBrandingSpacingKeyword getPadding() {
    return padding;
  }

  public void setPadding(CheckoutAndAccountsConfigurationBrandingSpacingKeyword padding) {
    this.padding = padding;
  }

  @Override
  public String toString() {
    return "CheckoutAndAccountsConfigurationBrandingHeaderInput{alignment='" + alignment + "', logo='" + logo + "', divided='" + divided + "', colors='" + colors + "', background='" + background + "', padding='" + padding + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    CheckoutAndAccountsConfigurationBrandingHeaderInput that = (CheckoutAndAccountsConfigurationBrandingHeaderInput) o;
    return Objects.equals(alignment, that.alignment) &&
        Objects.equals(logo, that.logo) &&
        Objects.equals(divided, that.divided) &&
        Objects.equals(colors, that.colors) &&
        Objects.equals(background, that.background) &&
        Objects.equals(padding, that.padding);
  }

  @Override
  public int hashCode() {
    return Objects.hash(alignment, logo, divided, colors, background, padding);
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public static class Builder {
    /**
     * The header alignment.
     */
    private CheckoutAndAccountsConfigurationBrandingHeaderAlignment alignment;

    /**
     * The store logo.
     */
    private CheckoutAndAccountsConfigurationBrandingLogoInput logo;

    /**
     * The divided setting.
     */
    private Boolean divided;

    /**
     * The colors customizations for the header container.
     */
    private CheckoutAndAccountsConfigurationBrandingColorsInput colors;

    /**
     * The background style of the header container.
     */
    private CheckoutAndAccountsConfigurationBrandingBackground background;

    /**
     * The padding of the header container.
     */
    private CheckoutAndAccountsConfigurationBrandingSpacingKeyword padding;

    public CheckoutAndAccountsConfigurationBrandingHeaderInput build() {
      CheckoutAndAccountsConfigurationBrandingHeaderInput result = new CheckoutAndAccountsConfigurationBrandingHeaderInput();
      result.alignment = this.alignment;
      result.logo = this.logo;
      result.divided = this.divided;
      result.colors = this.colors;
      result.background = this.background;
      result.padding = this.padding;
      return result;
    }

    /**
     * The header alignment.
     */
    public Builder alignment(CheckoutAndAccountsConfigurationBrandingHeaderAlignment alignment) {
      this.alignment = alignment;
      return this;
    }

    /**
     * The store logo.
     */
    public Builder logo(CheckoutAndAccountsConfigurationBrandingLogoInput logo) {
      this.logo = logo;
      return this;
    }

    /**
     * The divided setting.
     */
    public Builder divided(Boolean divided) {
      this.divided = divided;
      return this;
    }

    /**
     * The colors customizations for the header container.
     */
    public Builder colors(CheckoutAndAccountsConfigurationBrandingColorsInput colors) {
      this.colors = colors;
      return this;
    }

    /**
     * The background style of the header container.
     */
    public Builder background(CheckoutAndAccountsConfigurationBrandingBackground background) {
      this.background = background;
      return this;
    }

    /**
     * The padding of the header container.
     */
    public Builder padding(CheckoutAndAccountsConfigurationBrandingSpacingKeyword padding) {
      this.padding = padding;
      return this;
    }
  }
}
