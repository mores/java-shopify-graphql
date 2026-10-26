package com.shopify.admin.types;

/**
 * The types of the hard blockers preventing a customer from being merged to another customer.
 */
public enum CustomerMergeErrorFieldType {
  /**
   * The customer does not exist.
   */
  DELETED_AT,

  /**
   * The customer has a pending or completed redaction.
   */
  REDACTED_AT,

  /**
   * The customer has a subscription history.
   */
  SUBSCRIPTIONS,

  /**
   * The customer has a merge in progress.
   */
  MERGE_IN_PROGRESS,

  /**
   * The customer has gift cards.
   */
  GIFT_CARDS,

  /**
   * The override fields are invalid.
   */
  OVERRIDE_FIELDS,

  /**
   * The customer has store credit.
   */
  STORE_CREDIT,

  /**
   * The customer is a company contact.
   */
  COMPANY_CONTACT,

  /**
   * The customer has payment methods.
   */
  CUSTOMER_PAYMENT_METHODS,

  /**
   * The customer has a pending data request.
   */
  PENDING_DATA_REQUEST,

  /**
   * The customer has a multipass identifier.
   */
  MULTIPASS_IDENTIFIER
}
