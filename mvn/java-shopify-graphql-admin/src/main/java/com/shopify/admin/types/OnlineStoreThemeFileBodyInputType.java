package com.shopify.admin.types;

/**
 * The input type for a theme file body.
 */
public enum OnlineStoreThemeFileBodyInputType {
  /**
   * The text body of the theme file.
   */
  TEXT,

  /**
   * The base64 encoded body of a theme file.
   */
  BASE64,

  /**
   * The url of the body of a theme file.
   */
  URL
}
