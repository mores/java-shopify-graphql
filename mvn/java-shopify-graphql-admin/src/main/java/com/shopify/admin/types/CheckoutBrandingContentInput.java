package com.shopify.admin.types;

import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.Objects;

/**
 * The input fields used to update the content container customizations.
 */
public class CheckoutBrandingContentInput {
  /**
   * Divider style and visibility on the content container.
   */
  private CheckoutBrandingContainerDividerInput divider;

  public CheckoutBrandingContentInput() {
  }

  /**
   * Divider style and visibility on the content container.
   */
  public CheckoutBrandingContainerDividerInput getDivider() {
    return divider;
  }

  public void setDivider(CheckoutBrandingContainerDividerInput divider) {
    this.divider = divider;
  }

  @Override
  public String toString() {
    return "CheckoutBrandingContentInput{divider='" + divider + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    CheckoutBrandingContentInput that = (CheckoutBrandingContentInput) o;
    return Objects.equals(divider, that.divider);
  }

  @Override
  public int hashCode() {
    return Objects.hash(divider);
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public static class Builder {
    /**
     * Divider style and visibility on the content container.
     */
    private CheckoutBrandingContainerDividerInput divider;

    public CheckoutBrandingContentInput build() {
      CheckoutBrandingContentInput result = new CheckoutBrandingContentInput();
      result.divider = this.divider;
      return result;
    }

    /**
     * Divider style and visibility on the content container.
     */
    public Builder divider(CheckoutBrandingContainerDividerInput divider) {
      this.divider = divider;
      return this;
    }
  }
}
