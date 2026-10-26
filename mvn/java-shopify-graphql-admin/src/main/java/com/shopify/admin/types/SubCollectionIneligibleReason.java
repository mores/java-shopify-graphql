package com.shopify.admin.types;

/**
 * Stable identifier for why a collection cannot be referenced as a sub-collection target.
 */
public enum SubCollectionIneligibleReason {
  /**
   * The referenced collection id does not parse as a positive integer or does not exist in the shop.
   */
  INVALID_COLLECTION_REFERENCE,

  /**
   * The referenced collection is one of the source's owning collections (a source cannot reference itself).
   */
  SELF_REFERENCE,

  /**
   * The referenced collection itself owns a sub-collection source (chains of depth > 1 are not supported).
   */
  CHAIN_REFERENCE
}
