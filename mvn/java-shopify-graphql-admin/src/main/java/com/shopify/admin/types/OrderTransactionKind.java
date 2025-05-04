package com.shopify.admin.types;

/**
 * The different kinds of order transactions.
 */
public enum OrderTransactionKind {
  SALE,

  CAPTURE,

  AUTHORIZATION,

  VOID,

  REFUND,

  CHANGE,

  EMV_AUTHORIZATION,

  SUGGESTED_REFUND
}
