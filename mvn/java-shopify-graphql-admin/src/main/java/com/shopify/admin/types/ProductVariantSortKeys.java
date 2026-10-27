package com.shopify.admin.types;

/**
 * The set of valid sort keys for the ProductVariant query.
 */
public enum ProductVariantSortKeys {
  /**
   * Sort by the `full_title` value.
   */
  FULL_TITLE,

  /**
   * Sort by the `id` value.
   */
  ID,

  /**
   * Sort by available inventory quantity in the location specified by the `query:"location_id:"` argument.
   * Don't use this sort key when no `location_id` in query is specified.
   */
  INVENTORY_LEVELS_AVAILABLE,

  /**
   * Sort by the `inventory_management` value.
   */
  INVENTORY_MANAGEMENT,

  /**
   * Sort by the `inventory_policy` value.
   */
  INVENTORY_POLICY,

  /**
   * Sort by the `inventory_quantity` value.
   */
  INVENTORY_QUANTITY,

  /**
   * Sort by the `name` value.
   */
  NAME,

  /**
   * Sort by the `popular` value.
   */
  POPULAR,

  /**
   * Sort by the `position` value.
   */
  POSITION,

  /**
   * Sort by relevance to the search terms when the `query` parameter is specified on the connection.
   * Don't use this sort key when no search query is specified.
   */
  RELEVANCE,

  /**
   * Sort by the `sku` value.
   */
  SKU,

  /**
   * Sort by the `title` value.
   */
  TITLE
}
