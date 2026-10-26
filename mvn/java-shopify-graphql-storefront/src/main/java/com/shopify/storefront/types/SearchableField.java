package com.shopify.storefront.types;

/**
 * Specifies the list of resource fields to search.
 */
public enum SearchableField {
  /**
   * Author of the page or article.
   */
  AUTHOR,

  /**
   * Body of the page or article or product description or collection description.
   */
  BODY,

  /**
   * Product type.
   */
  PRODUCT_TYPE,

  /**
   * Tag associated with the product or article.
   */
  TAG,

  /**
   * Title of the page or article or product title or collection title.
   */
  TITLE,

  /**
   * Variant barcode.
   */
  VARIANTS_BARCODE,

  /**
   * Variant SKU.
   */
  VARIANTS_SKU,

  /**
   * Variant title.
   */
  VARIANTS_TITLE,

  /**
   * Product vendor.
   */
  VENDOR
}
