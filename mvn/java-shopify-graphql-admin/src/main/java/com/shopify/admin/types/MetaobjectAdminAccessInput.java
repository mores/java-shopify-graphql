package com.shopify.admin.types;

/**
 * Metaobject access permissions for the Admin API. When the metaobject is app-owned, the owning app always has
 * full access.
 */
public enum MetaobjectAdminAccessInput {
  /**
   * The merchant has read-only access. No other apps have access.
   */
  MERCHANT_READ,

  /**
   * The merchant has read and write access. No other apps have access.
   */
  MERCHANT_READ_WRITE
}
