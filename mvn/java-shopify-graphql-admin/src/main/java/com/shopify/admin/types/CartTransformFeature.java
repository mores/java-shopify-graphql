package com.shopify.admin.types;

import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.Objects;

/**
 * Provides access to the cart transform feature configuration for the merchant's
 * store. This wrapper object indicates whether cart transformation capabilities
 * are enabled and what operations are available.
 *
 * For example, when checking if your app can deploy customized bundle features,
 * you would query this object to confirm cart transforms are supported and review
 * the eligible operations.
 *
 * The feature configuration helps apps determine compatibility before attempting to create transform functions.
 *
 * Learn more about [cart transformation](https://shopify.dev/docs/api/admin-graphql/latest/objects/CartTransform).
 */
public class CartTransformFeature {
  /**
   * The cart transform operations eligible for the shop.
   */
  private CartTransformEligibleOperations eligibleOperations;

  public CartTransformFeature() {
  }

  /**
   * The cart transform operations eligible for the shop.
   */
  public CartTransformEligibleOperations getEligibleOperations() {
    return eligibleOperations;
  }

  public void setEligibleOperations(CartTransformEligibleOperations eligibleOperations) {
    this.eligibleOperations = eligibleOperations;
  }

  @Override
  public String toString() {
    return "CartTransformFeature{eligibleOperations='" + eligibleOperations + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    CartTransformFeature that = (CartTransformFeature) o;
    return Objects.equals(eligibleOperations, that.eligibleOperations);
  }

  @Override
  public int hashCode() {
    return Objects.hash(eligibleOperations);
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public static class Builder {
    /**
     * The cart transform operations eligible for the shop.
     */
    private CartTransformEligibleOperations eligibleOperations;

    public CartTransformFeature build() {
      CartTransformFeature result = new CartTransformFeature();
      result.eligibleOperations = this.eligibleOperations;
      return result;
    }

    /**
     * The cart transform operations eligible for the shop.
     */
    public Builder eligibleOperations(CartTransformEligibleOperations eligibleOperations) {
      this.eligibleOperations = eligibleOperations;
      return this;
    }
  }
}
