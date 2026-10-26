package com.shopify.storefront.types;

/**
 * For page and article results, specifies whether to match partial words on the
 * last search term. Product results match partial words automatically.
 */
public enum SearchPrefixQueryType {
  /**
   * For page and article results, match partial words on the last search term.
   */
  LAST,

  /**
   * For page and article results, don't match partial words on the last search term.
   */
  NONE
}
