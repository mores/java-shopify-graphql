package com.shopify.admin.types;

import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.Objects;

/**
 * The buttons customizations.
 */
public class CheckoutAndAccountsConfigurationBrandingButton {
  /**
   * The block padding.
   */
  private CheckoutAndAccountsConfigurationBrandingSpacing blockPadding;

  /**
   * The border.
   */
  private CheckoutAndAccountsConfigurationBrandingSimpleBorder border;

  /**
   * The corner radius.
   */
  private CheckoutAndAccountsConfigurationBrandingCornerRadius cornerRadius;

  /**
   * The inline padding.
   */
  private CheckoutAndAccountsConfigurationBrandingSpacing inlinePadding;

  /**
   * The typography.
   */
  private CheckoutAndAccountsConfigurationBrandingTypographyStyle typography;

  public CheckoutAndAccountsConfigurationBrandingButton() {
  }

  /**
   * The block padding.
   */
  public CheckoutAndAccountsConfigurationBrandingSpacing getBlockPadding() {
    return blockPadding;
  }

  public void setBlockPadding(CheckoutAndAccountsConfigurationBrandingSpacing blockPadding) {
    this.blockPadding = blockPadding;
  }

  /**
   * The border.
   */
  public CheckoutAndAccountsConfigurationBrandingSimpleBorder getBorder() {
    return border;
  }

  public void setBorder(CheckoutAndAccountsConfigurationBrandingSimpleBorder border) {
    this.border = border;
  }

  /**
   * The corner radius.
   */
  public CheckoutAndAccountsConfigurationBrandingCornerRadius getCornerRadius() {
    return cornerRadius;
  }

  public void setCornerRadius(CheckoutAndAccountsConfigurationBrandingCornerRadius cornerRadius) {
    this.cornerRadius = cornerRadius;
  }

  /**
   * The inline padding.
   */
  public CheckoutAndAccountsConfigurationBrandingSpacing getInlinePadding() {
    return inlinePadding;
  }

  public void setInlinePadding(CheckoutAndAccountsConfigurationBrandingSpacing inlinePadding) {
    this.inlinePadding = inlinePadding;
  }

  /**
   * The typography.
   */
  public CheckoutAndAccountsConfigurationBrandingTypographyStyle getTypography() {
    return typography;
  }

  public void setTypography(CheckoutAndAccountsConfigurationBrandingTypographyStyle typography) {
    this.typography = typography;
  }

  @Override
  public String toString() {
    return "CheckoutAndAccountsConfigurationBrandingButton{blockPadding='" + blockPadding + "', border='" + border + "', cornerRadius='" + cornerRadius + "', inlinePadding='" + inlinePadding + "', typography='" + typography + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    CheckoutAndAccountsConfigurationBrandingButton that = (CheckoutAndAccountsConfigurationBrandingButton) o;
    return Objects.equals(blockPadding, that.blockPadding) &&
        Objects.equals(border, that.border) &&
        Objects.equals(cornerRadius, that.cornerRadius) &&
        Objects.equals(inlinePadding, that.inlinePadding) &&
        Objects.equals(typography, that.typography);
  }

  @Override
  public int hashCode() {
    return Objects.hash(blockPadding, border, cornerRadius, inlinePadding, typography);
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public static class Builder {
    /**
     * The block padding.
     */
    private CheckoutAndAccountsConfigurationBrandingSpacing blockPadding;

    /**
     * The border.
     */
    private CheckoutAndAccountsConfigurationBrandingSimpleBorder border;

    /**
     * The corner radius.
     */
    private CheckoutAndAccountsConfigurationBrandingCornerRadius cornerRadius;

    /**
     * The inline padding.
     */
    private CheckoutAndAccountsConfigurationBrandingSpacing inlinePadding;

    /**
     * The typography.
     */
    private CheckoutAndAccountsConfigurationBrandingTypographyStyle typography;

    public CheckoutAndAccountsConfigurationBrandingButton build() {
      CheckoutAndAccountsConfigurationBrandingButton result = new CheckoutAndAccountsConfigurationBrandingButton();
      result.blockPadding = this.blockPadding;
      result.border = this.border;
      result.cornerRadius = this.cornerRadius;
      result.inlinePadding = this.inlinePadding;
      result.typography = this.typography;
      return result;
    }

    /**
     * The block padding.
     */
    public Builder blockPadding(CheckoutAndAccountsConfigurationBrandingSpacing blockPadding) {
      this.blockPadding = blockPadding;
      return this;
    }

    /**
     * The border.
     */
    public Builder border(CheckoutAndAccountsConfigurationBrandingSimpleBorder border) {
      this.border = border;
      return this;
    }

    /**
     * The corner radius.
     */
    public Builder cornerRadius(CheckoutAndAccountsConfigurationBrandingCornerRadius cornerRadius) {
      this.cornerRadius = cornerRadius;
      return this;
    }

    /**
     * The inline padding.
     */
    public Builder inlinePadding(CheckoutAndAccountsConfigurationBrandingSpacing inlinePadding) {
      this.inlinePadding = inlinePadding;
      return this;
    }

    /**
     * The typography.
     */
    public Builder typography(CheckoutAndAccountsConfigurationBrandingTypographyStyle typography) {
      this.typography = typography;
      return this;
    }
  }
}
