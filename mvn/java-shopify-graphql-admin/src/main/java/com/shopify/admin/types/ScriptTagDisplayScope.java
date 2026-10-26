package com.shopify.admin.types;

/**
 * The page or pages on the online store where the script should be included.
 */
public enum ScriptTagDisplayScope {
  /**
   * Include the script on both the web storefront and the <b>Order status</b> page.
   */
  ALL,

  /**
   * Include the script only on the <b>Order status</b> page.
   */
  ORDER_STATUS,

  /**
   * Include the script only on the web storefront.
   */
  ONLINE_STORE
}
