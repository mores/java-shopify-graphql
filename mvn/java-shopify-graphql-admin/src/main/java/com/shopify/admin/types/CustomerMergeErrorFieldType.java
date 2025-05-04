package com.shopify.admin.types;

/**
 * The types of the hard blockers preventing a customer from being merged to another customer.
 */
public enum CustomerMergeErrorFieldType {
  DELETED_AT,

  REDACTED_AT,

  SUBSCRIPTIONS,

  MERGE_IN_PROGRESS,

  GIFT_CARDS,

  STORE_CREDIT,

  COMPANY_CONTACT,

  CUSTOMER_PAYMENT_METHODS,

  PENDING_DATA_REQUEST,

  MULTIPASS_IDENTIFIER
}
