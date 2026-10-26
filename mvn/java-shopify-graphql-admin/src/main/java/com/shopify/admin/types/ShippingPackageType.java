package com.shopify.admin.types;

/**
 * Type of a shipping package.
 */
public enum ShippingPackageType {
  /**
   * A shipping box.
   */
  BOX,

  /**
   * A flat rate packaging supplied by a carrier.
   */
  FLAT_RATE,

  /**
   * An envelope.
   */
  ENVELOPE,

  /**
   * A soft-pack, bubble-wrap or vinyl envelope.
   */
  SOFT_PACK
}
