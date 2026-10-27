package com.shopify.admin.types;

/**
 * The type of customer account native page.
 */
public enum CustomerAccountNativePagePageType {
  /**
   * An orders page type.
   */
  NATIVE_ORDERS,

  /**
   * A settings page type.
   */
  NATIVE_SETTINGS,

  /**
   * A profile page type.
   */
  NATIVE_PROFILE,

  /**
   * An unknown page type. Represents new page types that may be added in future versions.
   */
  UNKNOWN
}
