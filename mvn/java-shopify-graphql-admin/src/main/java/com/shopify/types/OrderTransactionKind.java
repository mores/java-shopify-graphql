package com.shopify.types;


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
