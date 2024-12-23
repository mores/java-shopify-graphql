package com.shopify.types;

/**
 * Defines how the metaobjects of a definition can be accessed in admin API surface areas.
 */
public enum MetaobjectAdminAccess {
  PRIVATE,

  MERCHANT_READ,

  MERCHANT_READ_WRITE,

  PUBLIC_READ,

  PUBLIC_READ_WRITE
}
