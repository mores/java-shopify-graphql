package com.shopify.admin.types;

/**
 * Possible error codes that can be returned by `PubSubWebhookSubscriptionCreateUserError`.
 */
public enum PubSubWebhookSubscriptionCreateUserErrorCode {
  /**
   * Invalid parameters provided.
   */
  INVALID_PARAMETERS,

  /**
   * Address for this topic has already been taken.
   */
  TAKEN
}
