package com.shopify.admin.types;

/**
 * Possible error codes that can be returned by `PublicationUserError`.
 */
public enum PublicationUserErrorCode {
  /**
   * Can't perform this action on a publication.
   */
  UNSUPPORTED_PUBLICATION_ACTION,

  /**
   * Publication not found.
   */
  PUBLICATION_NOT_FOUND,

  /**
   * The publication is currently being modified. Please try again later.
   */
  PUBLICATION_LOCKED,

  /**
   * A catalog publication can only contain products.
   */
  UNSUPPORTED_PUBLISHABLE_TYPE,

  /**
   * Publishable ID not found.
   */
  INVALID_PUBLISHABLE_ID,

  /**
   * Market does not exist.
   */
  MARKET_NOT_FOUND,

  /**
   * Catalog does not exist.
   */
  CATALOG_NOT_FOUND,

  /**
   * Can't modify a publication that belongs to an app catalog.
   */
  CANNOT_MODIFY_APP_CATALOG_PUBLICATION,

  /**
   * Can't modify a publication that belongs to a market catalog.
   */
  CANNOT_MODIFY_MARKET_CATALOG_PUBLICATION,

  /**
   * Cannot modify a catalog for an app.
   */
  CANNOT_MODIFY_APP_CATALOG,

  /**
   * Cannot modify a catalog for a market.
   */
  CANNOT_MODIFY_MARKET_CATALOG,

  /**
   * The input value is invalid.
   */
  INVALID,

  /**
   * The input value is already taken.
   */
  TAKEN,

  /**
   * The input value is too long.
   */
  TOO_LONG,

  /**
   * The input value is too short.
   */
  TOO_SHORT,

  /**
   * The input value is blank.
   */
  BLANK,

  /**
   * A product publication cannot be created because the catalog type associated
   * with this publication does not permit publications of this product type.
   */
  PRODUCT_TYPE_INCOMPATIBLE_WITH_CATALOG_TYPE,

  /**
   * The limit for simultaneous publication updates has been exceeded.
   */
  PUBLICATION_UPDATE_LIMIT_EXCEEDED,

  /**
   * Products and variants cannot be updated together.
   */
  CANNOT_COMBINE_PRODUCTS_AND_VARIANTS,

  /**
   * Variants in a single operation must belong to the same product.
   */
  VARIANTS_BELONG_TO_MULTIPLE_PRODUCTS,

  /**
   * The product is currently being modified. Please try again later.
   */
  PRODUCT_LOCK_ERROR,

  /**
   * Variant publishing is not supported for this product type.
   */
  VARIANT_PUBLISHING_UNSUPPORTED_PRODUCT_TYPE
}
