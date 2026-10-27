package com.shopify.admin.types;

/**
 * The set of valid sort keys for products belonging to a collection.
 */
public enum ProductCollectionSortKeys {
  /**
   * Sort by best selling.
   */
  BEST_SELLING,

  /**
   * Sort by collection default order.
   */
  COLLECTION_DEFAULT,

  /**
   * Sort by creation time.
   */
  CREATED,

  /**
   * Sort by id.
   */
  ID,

  /**
   * Sort by manual order.
   */
  MANUAL,

  /**
   * Sort by price.
   */
  PRICE,

  /**
   * Sort by relevance.
   */
  RELEVANCE,

  /**
   * Sort by title.
   */
  TITLE
}
