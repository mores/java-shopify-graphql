package com.shopify.storefront.types;

/**
 * The types of search items to perform search within.
 */
public enum SearchType {
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
  ARTICLE
}
