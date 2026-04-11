package com.shopify.storefront.types;

/**
 * Controls how a discount's value is distributed across entitled lines. A discount
 * can either spread its value across all entitled lines or apply the full value to
 * each line individually.
 *
 * Used by the [`DiscountApplication`](https://shopify.dev/docs/api/storefront/current/interfaces/DiscountApplication) interface and its implementations to capture the intentions of a discount source
 * at the time of application.
 */
public enum DiscountApplicationAllocationMethod {
  ACROSS,

  EACH,

  ONE
}
