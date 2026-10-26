package com.shopify.admin.types;

/**
 * Metafield access permissions for the Admin API.
 */
public enum MetafieldAdminAccess {
  /**
   * The merchant and other apps have no access.
   */
  PRIVATE,

  /**
   * The merchant and other apps have read-only access.
   */
  PUBLIC_READ,

  /**
   * The merchant and other apps have read and write access.
   */
  PUBLIC_READ_WRITE,

  /**
   * The merchant has read-only access. No other apps have access.
   */
  MERCHANT_READ,

  /**
   * The merchant has read and write access. No other apps have access.
   */
  MERCHANT_READ_WRITE
}
