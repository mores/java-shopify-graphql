package com.shopify.admin.types;

import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.Objects;

/**
 * The input fields for customizing the buttons.
 */
public class CheckoutAndAccountsConfigurationBrandingButtonInput {
  /**
   * The border.
   */
  private CheckoutAndAccountsConfigurationBrandingSimpleBorder border;

  /**
   * The corner radius.
   */
  private CheckoutAndAccountsConfigurationBrandingCornerRadius cornerRadius;

  /**
   * The block padding.
   */
  private CheckoutAndAccountsConfigurationBrandingSpacing blockPadding;

  /**
   * The inline padding.
   */
  private CheckoutAndAccountsConfigurationBrandingSpacing inlinePadding;

  /**
   * The typography style.
   */
  private CheckoutAndAccountsConfigurationBrandingTypographyStyleInput typography;

  public CheckoutAndAccountsConfigurationBrandingButtonInput() {
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
   * The block padding.
   */
  public CheckoutAndAccountsConfigurationBrandingSpacing getBlockPadding() {
    return blockPadding;
  }

  public void setBlockPadding(CheckoutAndAccountsConfigurationBrandingSpacing blockPadding) {
    this.blockPadding = blockPadding;
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
   * The typography style.
   */
  public CheckoutAndAccountsConfigurationBrandingTypographyStyleInput getTypography() {
    return typography;
  }

  public void setTypography(
      CheckoutAndAccountsConfigurationBrandingTypographyStyleInput typography) {
    this.typography = typography;
  }

  @Override
  public String toString() {
    return "CheckoutAndAccountsConfigurationBrandingButtonInput{border='" + border + "', cornerRadius='" + cornerRadius + "', blockPadding='" + blockPadding + "', inlinePadding='" + inlinePadding + "', typography='" + typography + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    CheckoutAndAccountsConfigurationBrandingButtonInput that = (CheckoutAndAccountsConfigurationBrandingButtonInput) o;
    return Objects.equals(border, that.border) &&
        Objects.equals(cornerRadius, that.cornerRadius) &&
        Objects.equals(blockPadding, that.blockPadding) &&
        Objects.equals(inlinePadding, that.inlinePadding) &&
        Objects.equals(typography, that.typography);
  }

  @Override
  public int hashCode() {
    return Objects.hash(border, cornerRadius, blockPadding, inlinePadding, typography);
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public static class Builder {
    /**
     * The border.
     */
    private CheckoutAndAccountsConfigurationBrandingSimpleBorder border;

    /**
     * The corner radius.
     */
    private CheckoutAndAccountsConfigurationBrandingCornerRadius cornerRadius;

    /**
     * The block padding.
     */
    private CheckoutAndAccountsConfigurationBrandingSpacing blockPadding;

    /**
     * The inline padding.
     */
    private CheckoutAndAccountsConfigurationBrandingSpacing inlinePadding;

    /**
     * The typography style.
     */
    private CheckoutAndAccountsConfigurationBrandingTypographyStyleInput typography;

    public CheckoutAndAccountsConfigurationBrandingButtonInput build() {
      CheckoutAndAccountsConfigurationBrandingButtonInput result = new CheckoutAndAccountsConfigurationBrandingButtonInput();
      result.border = this.border;
      result.cornerRadius = this.cornerRadius;
      result.blockPadding = this.blockPadding;
      result.inlinePadding = this.inlinePadding;
      result.typography = this.typography;
      return result;
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
     * The block padding.
     */
    public Builder blockPadding(CheckoutAndAccountsConfigurationBrandingSpacing blockPadding) {
      this.blockPadding = blockPadding;
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
     * The typography style.
     */
    public Builder typography(
        CheckoutAndAccountsConfigurationBrandingTypographyStyleInput typography) {
      this.typography = typography;
      return this;
    }
  }
}
