package com.shopify.admin.types;

/**
 * Metafield definition constraint criteria to filter metafield definitions by.
 */
public enum MetafieldDefinitionConstraintStatus {
  /**
   * Returns both constrained and unconstrained metafield definitions.
   */
  CONSTRAINED_AND_UNCONSTRAINED,

  /**
   * Only returns metafield definitions that are constrained to a resource subtype.
   */
  CONSTRAINED_ONLY,

  /**
   * Only returns metafield definitions that are not constrained to a resource subtype.
   */
  UNCONSTRAINED_ONLY
}
