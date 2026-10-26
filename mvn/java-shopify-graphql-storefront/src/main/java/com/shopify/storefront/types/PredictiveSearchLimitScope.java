package com.shopify.storefront.types;

/**
 * Decides the distribution of results.
 */
public enum PredictiveSearchLimitScope {
  /**
   * Return results up to limit across all types.
   */
  ALL,

  /**
   * Return results up to limit per type.
   */
  EACH
}
