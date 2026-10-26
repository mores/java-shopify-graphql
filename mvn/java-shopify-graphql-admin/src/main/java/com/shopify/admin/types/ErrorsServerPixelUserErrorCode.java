package com.shopify.admin.types;

/**
 * Possible error codes that can be returned by `ErrorsServerPixelUserError`.
 */
public enum ErrorsServerPixelUserErrorCode {
  /**
   * A server pixel doesn't exist for this app and shop.
   */
  NOT_FOUND,

  /**
   * A server pixel already exists for this app and shop. Only one server pixel can exist for any app and shop combination.
   */
  ALREADY_EXISTS,

  /**
   * PubSubProject and PubSubTopic values resulted in an address that is not a
   * valid GCP pub/sub format.Address format should be pubsub://project:topic.
   */
  PUB_SUB_ERROR,

  /**
   * Server Pixel must be configured with a valid AWS Event Bridge or GCP pub/sub endpoint address to be connected.
   */
  NEEDS_CONFIGURATION_TO_CONNECT
}
