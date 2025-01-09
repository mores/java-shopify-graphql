package com.shopify.types;

import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.Objects;

/**
 * The heading level customizations.
 */
public class CheckoutBrandingHeadingLevel {
  /**
   * The typography customizations used for headings.
   */
  private CheckoutBrandingTypographyStyle typography;

  public CheckoutBrandingHeadingLevel() {
  }

  /**
   * The typography customizations used for headings.
   */
  public CheckoutBrandingTypographyStyle getTypography() {
    return typography;
  }

  public void setTypography(CheckoutBrandingTypographyStyle typography) {
    this.typography = typography;
  }

  @Override
  public String toString() {
    return "CheckoutBrandingHeadingLevel{typography='" + typography + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    CheckoutBrandingHeadingLevel that = (CheckoutBrandingHeadingLevel) o;
    return Objects.equals(typography, that.typography);
  }

  @Override
  public int hashCode() {
    return Objects.hash(typography);
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public static class Builder {
    /**
     * The typography customizations used for headings.
     */
    private CheckoutBrandingTypographyStyle typography;

    public CheckoutBrandingHeadingLevel build() {
      CheckoutBrandingHeadingLevel result = new CheckoutBrandingHeadingLevel();
      result.typography = this.typography;
      return result;
    }

    /**
     * The typography customizations used for headings.
     */
    public Builder typography(CheckoutBrandingTypographyStyle typography) {
      this.typography = typography;
      return this;
    }
  }
}
