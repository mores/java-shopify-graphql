package com.shopify.admin.types;

import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.Objects;

/**
 * The input fields for heading level customizations.
 */
public class CheckoutBrandingHeadingLevelInput {
  /**
   * The typography customizations used for headings.
   */
  private CheckoutBrandingTypographyStyleInput typography;

  public CheckoutBrandingHeadingLevelInput() {
  }

  /**
   * The typography customizations used for headings.
   */
  public CheckoutBrandingTypographyStyleInput getTypography() {
    return typography;
  }

  public void setTypography(CheckoutBrandingTypographyStyleInput typography) {
    this.typography = typography;
  }

  @Override
  public String toString() {
    return "CheckoutBrandingHeadingLevelInput{typography='" + typography + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    CheckoutBrandingHeadingLevelInput that = (CheckoutBrandingHeadingLevelInput) o;
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
    private CheckoutBrandingTypographyStyleInput typography;

    public CheckoutBrandingHeadingLevelInput build() {
      CheckoutBrandingHeadingLevelInput result = new CheckoutBrandingHeadingLevelInput();
      result.typography = this.typography;
      return result;
    }

    /**
     * The typography customizations used for headings.
     */
    public Builder typography(CheckoutBrandingTypographyStyleInput typography) {
      this.typography = typography;
      return this;
    }
  }
}
