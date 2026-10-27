package com.shopify.admin.types;

/**
 * Metaobject access permissions for the Admin API. When the metaobject is app-owned, the owning app always has
 * full access.
 */
public enum MetaobjectAdminAccess {
  /**
   * The merchant and other apps have no access.
   */
  PRIVATE,

  /**
   * The merchant has read-only access. No other apps have access.
   */
  MERCHANT_READ,

  /**
   * The merchant has read and write access. No other apps have access.
   */
  MERCHANT_READ_WRITE,

  /**
   * The merchant and other apps have read-only access.
   */
  PUBLIC_READ,

  /**
   * The merchant and other apps have read and write access.
   */
  PUBLIC_READ_WRITE
}
