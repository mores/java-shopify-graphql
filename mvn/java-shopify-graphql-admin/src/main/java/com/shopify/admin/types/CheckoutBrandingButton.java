package com.shopify.admin.types;

import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.Objects;

/**
 * The buttons customizations.
 */
public class CheckoutBrandingButton {
  /**
   * The background style used for buttons.
   */
  private CheckoutBrandingBackgroundStyle background;

  /**
   * The block padding used for buttons.
   */
  private CheckoutBrandingSpacing blockPadding;

  /**
   * The border used for buttons.
   */
  private CheckoutBrandingSimpleBorder border;

  /**
   * The corner radius used for buttons.
   */
  private CheckoutBrandingCornerRadius cornerRadius;

  /**
   * The inline padding used for buttons.
   */
  private CheckoutBrandingSpacing inlinePadding;

  /**
   * The typography used for buttons.
   */
  private CheckoutBrandingTypographyStyle typography;

  public CheckoutBrandingButton() {
  }

  /**
   * The background style used for buttons.
   */
  public CheckoutBrandingBackgroundStyle getBackground() {
    return background;
  }

  public void setBackground(CheckoutBrandingBackgroundStyle background) {
    this.background = background;
  }

  /**
   * The block padding used for buttons.
   */
  public CheckoutBrandingSpacing getBlockPadding() {
    return blockPadding;
  }

  public void setBlockPadding(CheckoutBrandingSpacing blockPadding) {
    this.blockPadding = blockPadding;
  }

  /**
   * The border used for buttons.
   */
  public CheckoutBrandingSimpleBorder getBorder() {
    return border;
  }

  public void setBorder(CheckoutBrandingSimpleBorder border) {
    this.border = border;
  }

  /**
   * The corner radius used for buttons.
   */
  public CheckoutBrandingCornerRadius getCornerRadius() {
    return cornerRadius;
  }

  public void setCornerRadius(CheckoutBrandingCornerRadius cornerRadius) {
    this.cornerRadius = cornerRadius;
  }

  /**
   * The inline padding used for buttons.
   */
  public CheckoutBrandingSpacing getInlinePadding() {
    return inlinePadding;
  }

  public void setInlinePadding(CheckoutBrandingSpacing inlinePadding) {
    this.inlinePadding = inlinePadding;
  }

  /**
   * The typography used for buttons.
   */
  public CheckoutBrandingTypographyStyle getTypography() {
    return typography;
  }

  public void setTypography(CheckoutBrandingTypographyStyle typography) {
    this.typography = typography;
  }

  @Override
  public String toString() {
    return "CheckoutBrandingButton{background='" + background + "', blockPadding='" + blockPadding + "', border='" + border + "', cornerRadius='" + cornerRadius + "', inlinePadding='" + inlinePadding + "', typography='" + typography + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    CheckoutBrandingButton that = (CheckoutBrandingButton) o;
    return Objects.equals(background, that.background) &&
        Objects.equals(blockPadding, that.blockPadding) &&
        Objects.equals(border, that.border) &&
        Objects.equals(cornerRadius, that.cornerRadius) &&
        Objects.equals(inlinePadding, that.inlinePadding) &&
        Objects.equals(typography, that.typography);
  }

  @Override
  public int hashCode() {
    return Objects.hash(background, blockPadding, border, cornerRadius, inlinePadding, typography);
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public static class Builder {
    /**
     * The background style used for buttons.
     */
    private CheckoutBrandingBackgroundStyle background;

    /**
     * The block padding used for buttons.
     */
    private CheckoutBrandingSpacing blockPadding;

    /**
     * The border used for buttons.
     */
    private CheckoutBrandingSimpleBorder border;

    /**
     * The corner radius used for buttons.
     */
    private CheckoutBrandingCornerRadius cornerRadius;

    /**
     * The inline padding used for buttons.
     */
    private CheckoutBrandingSpacing inlinePadding;

    /**
     * The typography used for buttons.
     */
    private CheckoutBrandingTypographyStyle typography;

    public CheckoutBrandingButton build() {
      CheckoutBrandingButton result = new CheckoutBrandingButton();
      result.background = this.background;
      result.blockPadding = this.blockPadding;
      result.border = this.border;
      result.cornerRadius = this.cornerRadius;
      result.inlinePadding = this.inlinePadding;
      result.typography = this.typography;
      return result;
    }

    /**
     * The background style used for buttons.
     */
    public Builder background(CheckoutBrandingBackgroundStyle background) {
      this.background = background;
      return this;
    }

    /**
     * The block padding used for buttons.
     */
    public Builder blockPadding(CheckoutBrandingSpacing blockPadding) {
      this.blockPadding = blockPadding;
      return this;
    }

    /**
     * The border used for buttons.
     */
    public Builder border(CheckoutBrandingSimpleBorder border) {
      this.border = border;
      return this;
    }

    /**
     * The corner radius used for buttons.
     */
    public Builder cornerRadius(CheckoutBrandingCornerRadius cornerRadius) {
      this.cornerRadius = cornerRadius;
      return this;
    }

    /**
     * The inline padding used for buttons.
     */
    public Builder inlinePadding(CheckoutBrandingSpacing inlinePadding) {
      this.inlinePadding = inlinePadding;
      return this;
    }

    /**
     * The typography used for buttons.
     */
    public Builder typography(CheckoutBrandingTypographyStyle typography) {
      this.typography = typography;
      return this;
    }
  }
}
