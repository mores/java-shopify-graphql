package com.shopify.admin.types;

/**
 * Specifies the sort order for the products in the collection.
 */
public enum CollectionSortOrder {
  /**
   * Alphabetically, in ascending order (A - Z).
   */
  ALPHA_ASC,

  /**
   * Alphabetically, in descending order (Z - A).
   */
  ALPHA_DESC,

  /**
   * By best-selling products.
   */
  BEST_SELLING,

  /**
   * By most relevant products.
   */
  MOST_RELEVANT,

  /**
   * By date created, in ascending order (oldest - newest).
   */
  CREATED,

  /**
   * By date created, in descending order (newest - oldest).
   */
  CREATED_DESC,

  /**
   * In the order set manually by the merchant.
   */
  MANUAL,

  /**
   * By price, in ascending order (lowest - highest).
   */
  PRICE_ASC,

  /**
   * By price, in descending order (highest - lowest).
   */
  PRICE_DESC
}
