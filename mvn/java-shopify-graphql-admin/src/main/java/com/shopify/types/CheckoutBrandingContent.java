package com.shopify.types;

import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.Objects;

/**
 * The content container customizations.
 */
public class CheckoutBrandingContent {
  /**
   * The content container's divider style and visibility.
   */
  private CheckoutBrandingContainerDivider divider;

  public CheckoutBrandingContent() {
  }

  /**
   * The content container's divider style and visibility.
   */
  public CheckoutBrandingContainerDivider getDivider() {
    return divider;
  }

  public void setDivider(CheckoutBrandingContainerDivider divider) {
    this.divider = divider;
  }

  @Override
  public String toString() {
    return "CheckoutBrandingContent{divider='" + divider + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    CheckoutBrandingContent that = (CheckoutBrandingContent) o;
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
     * The content container's divider style and visibility.
     */
    private CheckoutBrandingContainerDivider divider;

    public CheckoutBrandingContent build() {
      CheckoutBrandingContent result = new CheckoutBrandingContent();
      result.divider = this.divider;
      return result;
    }

    /**
     * The content container's divider style and visibility.
     */
    public Builder divider(CheckoutBrandingContainerDivider divider) {
      this.divider = divider;
      return this;
    }
  }
}
