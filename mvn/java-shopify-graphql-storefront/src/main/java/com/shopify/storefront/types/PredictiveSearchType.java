package com.shopify.storefront.types;

/**
 * The types of search items to perform predictive search on.
 */
public enum PredictiveSearchType {
  /**
   * Returns matching collections.
   */
  COLLECTION,

  /**
   * Returns matching products.
   */
  PRODUCT,

  /**
   * Returns matching pages.
   */
  PAGE,

  /**
   * Returns matching articles.
   */
  ARTICLE,

  /**
   * Returns matching query strings.
   */
  QUERY
}
