package com.shopify.admin.types;

import java.lang.Boolean;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.Objects;

/**
 * The input fields to claim ownership for Product features such as Bundles.
 */
public class ProductClaimOwnershipInput {
  /**
   * Claiming ownership of bundles lets the app render a custom UI for the bundles' card on the
   * products details page in the Shopify admin.
   *   
   * Bundle ownership can only be claimed when creating the product. If you create `ProductVariantComponents`
   * in any of its product variants, then the bundle ownership is automatically assigned to the app making the call.
   *   
   * [Learn more](https://shopify.dev/docs/apps/selling-strategies/bundles/product-config).
   */
  private Boolean bundles;

  public ProductClaimOwnershipInput() {
  }

  /**
   * Claiming ownership of bundles lets the app render a custom UI for the bundles' card on the
   * products details page in the Shopify admin.
   *   
   * Bundle ownership can only be claimed when creating the product. If you create `ProductVariantComponents`
   * in any of its product variants, then the bundle ownership is automatically assigned to the app making the call.
   *   
   * [Learn more](https://shopify.dev/docs/apps/selling-strategies/bundles/product-config).
   */
  public Boolean getBundles() {
    return bundles;
  }

  public void setBundles(Boolean bundles) {
    this.bundles = bundles;
  }

  @Override
  public String toString() {
    return "ProductClaimOwnershipInput{bundles='" + bundles + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    ProductClaimOwnershipInput that = (ProductClaimOwnershipInput) o;
    return Objects.equals(bundles, that.bundles);
  }

  @Override
  public int hashCode() {
    return Objects.hash(bundles);
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public static class Builder {
    /**
     * Claiming ownership of bundles lets the app render a custom UI for the bundles' card on the
     * products details page in the Shopify admin.
     *   
     * Bundle ownership can only be claimed when creating the product. If you create `ProductVariantComponents`
     * in any of its product variants, then the bundle ownership is automatically assigned to the app making the call.
     *   
     * [Learn more](https://shopify.dev/docs/apps/selling-strategies/bundles/product-config).
     */
    private Boolean bundles;

    public ProductClaimOwnershipInput build() {
      ProductClaimOwnershipInput result = new ProductClaimOwnershipInput();
      result.bundles = this.bundles;
      return result;
    }

    /**
     * Claiming ownership of bundles lets the app render a custom UI for the bundles' card on the
     * products details page in the Shopify admin.
     *   
     * Bundle ownership can only be claimed when creating the product. If you create `ProductVariantComponents`
     * in any of its product variants, then the bundle ownership is automatically assigned to the app making the call.
     *   
     * [Learn more](https://shopify.dev/docs/apps/selling-strategies/bundles/product-config).
     */
    public Builder bundles(Boolean bundles) {
      this.bundles = bundles;
      return this;
    }
  }
}
