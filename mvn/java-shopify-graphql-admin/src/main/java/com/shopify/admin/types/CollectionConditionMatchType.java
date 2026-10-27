package com.shopify.admin.types;

/**
 * Specifies whether products must match any or all conditions to be included in the collection.
 */
public enum CollectionConditionMatchType {
  /**
   * Products match if they satisfy one or more of the conditions.
   */
  ANY,

  /**
   * Products match only if they satisfy all of the conditions.
   */
  ALL
}
