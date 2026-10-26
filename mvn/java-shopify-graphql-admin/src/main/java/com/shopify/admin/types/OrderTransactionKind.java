package com.shopify.admin.types;

/**
 * The different kinds of order transactions.
 */
public enum OrderTransactionKind {
  /**
   * An authorization and capture performed together in a single step.
   */
  SALE,

  /**
   * A transfer of the money that was reserved by an authorization.
   */
  CAPTURE,

  /**
   * An amount reserved against the cardholder's funding source.
   * Money does not change hands until the authorization is captured.
   */
  AUTHORIZATION,

  /**
   * A cancelation of an authorization transaction.
   */
  VOID,

  /**
   * A partial or full return of captured funds to the cardholder.
   * A refund can happen only after a capture is processed.
   */
  REFUND,

  /**
   * The money returned to the customer when they've paid too much during a cash transaction.
   */
  CHANGE,

  /**
   * An authorization for a payment taken with an EMV credit card reader.
   */
  EMV_AUTHORIZATION,

  /**
   * A suggested refund transaction that can be used to create a refund.
   */
  SUGGESTED_REFUND
}
