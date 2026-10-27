package com.shopify.admin.types;

/**
 * The type of resources that are market localizable.
 */
public enum MarketLocalizableResourceType {
  /**
   * A metafield. Market localizable fields: `value`.
   */
  METAFIELD,

  /**
   * A Metaobject. Market Localizable fields are determined by the Metaobject type.
   */
  METAOBJECT
}
