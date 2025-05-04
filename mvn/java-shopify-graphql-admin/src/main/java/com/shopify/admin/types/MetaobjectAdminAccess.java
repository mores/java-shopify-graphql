package com.shopify.admin.types;

/**
 * Metaobject access permissions for the Admin API. When the metaobject is app-owned, the owning app always has
 * full access.
 */
public enum MetaobjectAdminAccess {
  PRIVATE,

  MERCHANT_READ,

  MERCHANT_READ_WRITE,

  PUBLIC_READ,

  PUBLIC_READ_WRITE
}
