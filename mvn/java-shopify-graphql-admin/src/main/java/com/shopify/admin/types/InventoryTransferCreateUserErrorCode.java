package com.shopify.admin.types;

/**
 * Possible error codes that can be returned by `InventoryTransferCreateUserError`.
 */
public enum InventoryTransferCreateUserErrorCode {
  /**
   * The transfer was not found.
   */
  TRANSFER_NOT_FOUND,

  /**
   * The location selected can't be found.
   */
  LOCATION_NOT_FOUND,

  /**
   * The location selected is not active.
   */
  LOCATION_NOT_ACTIVE,

  /**
   * The origin location cannot be the same as the destination location.
   */
  TRANSFER_ORIGIN_CANNOT_BE_THE_SAME_AS_DESTINATION,

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
  INVALID_METAFIELDS,

  /**
   * This request is currently in progress, please try again.
   */
  IDEMPOTENCY_CONCURRENT_REQUEST,

  /**
   * A previous request with this idempotency key failed. Retry with a new idempotency key.
   */
  IDEMPOTENCY_PREVIOUS_ATTEMPT_FAILED,

  /**
   * The same idempotency key cannot be used with different operation parameters.
   */
  IDEMPOTENCY_KEY_PARAMETER_MISMATCH,

  /**
   * Bundled items cannot be used for this operation.
   */
  BUNDLED_ITEM,

  /**
   * The item does not track inventory.
   */
  UNTRACKED_ITEM,

  /**
   * The item was not found.
   */
  ITEM_NOT_FOUND,

  /**
   * The quantity is invalid.
   */
  INVALID_QUANTITY,

  /**
   * A single item can't be listed twice.
   */
  DUPLICATE_ITEM,

  /**
   * The item is not stocked at the intended location.
   */
  INVENTORY_STATE_NOT_ACTIVE
}
