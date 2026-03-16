package com.shopify.admin.types;

import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.Objects;

/**
 * Controls the spacing between options in the 'group' variant of [`ChoiceList`](https://shopify.dev/docs/api/admin-graphql/latest/objects/CheckoutBrandingChoiceList) components.
 *
 * This setting adjusts the vertical spacing between choice options to improve
 * readability and visual organization. The spacing value helps create clear
 * separation between options, making it easier for customers to scan and select
 * from available choices.
 *
 * Learn more about [checkout customization](https://shopify.dev/docs/api/admin-graphql/latest/objects/CheckoutBranding).
 */
public class CheckoutBrandingChoiceListGroup {
  /**
   * The spacing between UI elements in the list.
   */
  private CheckoutBrandingSpacingKeyword spacing;

  public CheckoutBrandingChoiceListGroup() {
  }

  /**
   * The spacing between UI elements in the list.
   */
  public CheckoutBrandingSpacingKeyword getSpacing() {
    return spacing;
  }

  public void setSpacing(CheckoutBrandingSpacingKeyword spacing) {
    this.spacing = spacing;
  }

  @Override
  public String toString() {
    return "CheckoutBrandingChoiceListGroup{spacing='" + spacing + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    CheckoutBrandingChoiceListGroup that = (CheckoutBrandingChoiceListGroup) o;
    return Objects.equals(spacing, that.spacing);
  }

  @Override
  public int hashCode() {
    return Objects.hash(spacing);
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public static class Builder {
    /**
     * The spacing between UI elements in the list.
     */
    private CheckoutBrandingSpacingKeyword spacing;

    public CheckoutBrandingChoiceListGroup build() {
      CheckoutBrandingChoiceListGroup result = new CheckoutBrandingChoiceListGroup();
      result.spacing = this.spacing;
      return result;
    }

    /**
     * The spacing between UI elements in the list.
     */
    public Builder spacing(CheckoutBrandingSpacingKeyword spacing) {
      this.spacing = spacing;
      return this;
    }
  }
}
