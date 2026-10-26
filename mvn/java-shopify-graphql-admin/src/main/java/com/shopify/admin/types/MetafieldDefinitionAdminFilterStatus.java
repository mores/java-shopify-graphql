package com.shopify.admin.types;

/**
 * Possible filter statuses associated with a metafield definition for use in admin filtering.
 */
public enum MetafieldDefinitionAdminFilterStatus {
  /**
   * The metafield definition cannot be used for admin filtering.
   */
  NOT_FILTERABLE,

  /**
   * The metafield definition's metafields are currently being processed for admin filtering.
   */
  IN_PROGRESS,

  /**
   * The metafield definition allows admin filtering by matching metafield values.
   */
  FILTERABLE,

  /**
   * The metafield definition has failed to be enabled for admin filtering.
   */
  FAILED
}
