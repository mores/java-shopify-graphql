package com.shopify.admin.types;

/**
 * Whether a column was explicitly requested in the query or dynamically generated.
 */
public enum ShopifyqlColumnOrigin {
  /**
   * The column origin is unspecified.
   */
  UNSPECIFIED,

  /**
   * The column was explicitly requested in the query.
   */
  REQUESTED,

  /**
   * The column was dynamically generated (e.g. a comparison, total, benchmark, or attribution).
   */
  GENERATED
}
