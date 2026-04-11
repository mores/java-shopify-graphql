package com.shopify.admin.types;

import java.lang.Boolean;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.Objects;

/**
 * The input fields for customizing the checkout footer.
 */
public class CheckoutAndAccountsConfigurationBrandingFooterInput {
  /**
   * The divided setting.
   */
  private Boolean divided;

  /**
   * The footer alignment settings. You can set the footer native content alignment to the left, center, or right.
   */
  private CheckoutAndAccountsConfigurationBrandingFooterAlignment alignment;

  /**
   * The input field for setting the footer content customizations.
   */
  private CheckoutAndAccountsConfigurationBrandingFooterContentInput content;

  /**
   * The colors customizations.
   */
  private CheckoutAndAccountsConfigurationBrandingColorsInput colors;

  /**
   * The background style of the footer container.
   */
  private CheckoutAndAccountsConfigurationBrandingBackground background;

  /**
   * The padding of the footer container.
   */
  private CheckoutAndAccountsConfigurationBrandingSpacingKeyword padding;

  public CheckoutAndAccountsConfigurationBrandingFooterInput() {
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
   * The footer alignment settings. You can set the footer native content alignment to the left, center, or right.
   */
  public CheckoutAndAccountsConfigurationBrandingFooterAlignment getAlignment() {
    return alignment;
  }

  public void setAlignment(CheckoutAndAccountsConfigurationBrandingFooterAlignment alignment) {
    this.alignment = alignment;
  }

  /**
   * The input field for setting the footer content customizations.
   */
  public CheckoutAndAccountsConfigurationBrandingFooterContentInput getContent() {
    return content;
  }

  public void setContent(CheckoutAndAccountsConfigurationBrandingFooterContentInput content) {
    this.content = content;
  }

  /**
   * The colors customizations.
   */
  public CheckoutAndAccountsConfigurationBrandingColorsInput getColors() {
    return colors;
  }

  public void setColors(CheckoutAndAccountsConfigurationBrandingColorsInput colors) {
    this.colors = colors;
  }

  /**
   * The background style of the footer container.
   */
  public CheckoutAndAccountsConfigurationBrandingBackground getBackground() {
    return background;
  }

  public void setBackground(CheckoutAndAccountsConfigurationBrandingBackground background) {
    this.background = background;
  }

  /**
   * The padding of the footer container.
   */
  public CheckoutAndAccountsConfigurationBrandingSpacingKeyword getPadding() {
    return padding;
  }

  public void setPadding(CheckoutAndAccountsConfigurationBrandingSpacingKeyword padding) {
    this.padding = padding;
  }

  @Override
  public String toString() {
    return "CheckoutAndAccountsConfigurationBrandingFooterInput{divided='" + divided + "', alignment='" + alignment + "', content='" + content + "', colors='" + colors + "', background='" + background + "', padding='" + padding + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    CheckoutAndAccountsConfigurationBrandingFooterInput that = (CheckoutAndAccountsConfigurationBrandingFooterInput) o;
    return Objects.equals(divided, that.divided) &&
        Objects.equals(alignment, that.alignment) &&
        Objects.equals(content, that.content) &&
        Objects.equals(colors, that.colors) &&
        Objects.equals(background, that.background) &&
        Objects.equals(padding, that.padding);
  }

  @Override
  public int hashCode() {
    return Objects.hash(divided, alignment, content, colors, background, padding);
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public static class Builder {
    /**
     * The divided setting.
     */
    private Boolean divided;

    /**
     * The footer alignment settings. You can set the footer native content alignment to the left, center, or right.
     */
    private CheckoutAndAccountsConfigurationBrandingFooterAlignment alignment;

    /**
     * The input field for setting the footer content customizations.
     */
    private CheckoutAndAccountsConfigurationBrandingFooterContentInput content;

    /**
     * The colors customizations.
     */
    private CheckoutAndAccountsConfigurationBrandingColorsInput colors;

    /**
     * The background style of the footer container.
     */
    private CheckoutAndAccountsConfigurationBrandingBackground background;

    /**
     * The padding of the footer container.
     */
    private CheckoutAndAccountsConfigurationBrandingSpacingKeyword padding;

    public CheckoutAndAccountsConfigurationBrandingFooterInput build() {
      CheckoutAndAccountsConfigurationBrandingFooterInput result = new CheckoutAndAccountsConfigurationBrandingFooterInput();
      result.divided = this.divided;
      result.alignment = this.alignment;
      result.content = this.content;
      result.colors = this.colors;
      result.background = this.background;
      result.padding = this.padding;
      return result;
    }

    /**
     * The divided setting.
     */
    public Builder divided(Boolean divided) {
      this.divided = divided;
      return this;
    }

    /**
     * The footer alignment settings. You can set the footer native content alignment to the left, center, or right.
     */
    public Builder alignment(CheckoutAndAccountsConfigurationBrandingFooterAlignment alignment) {
      this.alignment = alignment;
      return this;
    }

    /**
     * The input field for setting the footer content customizations.
     */
    public Builder content(CheckoutAndAccountsConfigurationBrandingFooterContentInput content) {
      this.content = content;
      return this;
    }

    /**
     * The colors customizations.
     */
    public Builder colors(CheckoutAndAccountsConfigurationBrandingColorsInput colors) {
      this.colors = colors;
      return this;
    }

    /**
     * The background style of the footer container.
     */
    public Builder background(CheckoutAndAccountsConfigurationBrandingBackground background) {
      this.background = background;
      return this;
    }

    /**
     * The padding of the footer container.
     */
    public Builder padding(CheckoutAndAccountsConfigurationBrandingSpacingKeyword padding) {
      this.padding = padding;
      return this;
    }
  }
}
