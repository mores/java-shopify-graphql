package com.shopify.admin.types;

/**
 * Specifies the type of resources to be returned from a search.
 */
public enum SearchResultType {
  CUSTOMER,

  DRAFT_ORDER,

  /**
   * An inventory transfer.
   */
  INVENTORY_TRANSFER,

  PRODUCT,

  COLLECTION,

  /**
   * A file.
   */
  FILE,

  /**
   * A page.
   */
  PAGE,

  /**
   * A blog.
   */
  BLOG,

  /**
   * An article.
   */
  ARTICLE,

  /**
   * A URL redirect.
   */
  URL_REDIRECT,

  PRICE_RULE,

  /**
   * A code discount redeem code.
   */
  DISCOUNT_REDEEM_CODE,

  ORDER,

  /**
   * A balance transaction.
   */
  BALANCE_TRANSACTION
}
