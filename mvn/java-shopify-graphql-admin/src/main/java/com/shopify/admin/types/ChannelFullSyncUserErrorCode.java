package com.shopify.admin.types;

/**
 * Possible error codes that can be returned by `ChannelFullSyncUserError`.
 */
public enum ChannelFullSyncUserErrorCode {
  /**
   * The input value is invalid.
   */
  INVALID,

  /**
   * The record with the ID used as the input value couldn't be found.
   */
  NOT_FOUND
}
