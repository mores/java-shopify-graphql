package com.shopify.admin.types;

/**
 * Possible error codes that can be returned by `InventoryTransferEditUserError`.
 */
public enum InventoryTransferEditUserErrorCode {
  /**
   * Unexpected internal error happened.
   */
  INTERNAL_ERROR,

  /**
   * The transfer was not found.
   */
  TRANSFER_NOT_FOUND,

  /**
   * The location of a transfer cannot be updated. Only Draft Transfers can mutate their locations.
   */
  TRANSFER_LOCATION_IMMUTABLE,

  /**
   * The origin location cannot be the same as the destination location.
   */
  TRANSFER_ORIGIN_CANNOT_BE_THE_SAME_AS_DESTINATION,

  /**
   * The location selected is not active.
   */
  LOCATION_NOT_ACTIVE,

  /**
   * The location selected can't be found.
   */
  LOCATION_NOT_FOUND,

  /**
   * The item is not stocked at the intended location.
   */
  INVENTORY_STATE_NOT_ACTIVE,

  /**
   * The tag exceeds the maximum length.
   */
  TAG_EXCEEDS_MAX_LENGTH,

  /**
   * One or more tags are not valid.
   */
  INVALID_TAG,

  /**
   * One or more metafields are not valid.
   */
  INVALID_METAFIELDS
}
