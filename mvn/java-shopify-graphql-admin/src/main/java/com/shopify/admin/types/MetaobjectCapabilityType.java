package com.shopify.admin.types;

/**
 * Metaobject Capabilities types which can be enabled.
 */
public enum MetaobjectCapabilityType {
  /**
   * Allows for a Metaobject to be conditionally publishable.
   */
  PUBLISHABLE,

  /**
   * Allows for a Metaobject to be translated using the translation api.
   */
  TRANSLATABLE,

  /**
   * Allows for a Metaobject to have attributes of a renderable page such as SEO.
   */
  RENDERABLE,

  /**
   * Allows for a Metaobject to be rendered as an Online Store page.
   */
  ONLINE_STORE
}
