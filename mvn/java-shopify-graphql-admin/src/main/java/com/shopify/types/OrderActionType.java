package com.shopify.types;

/**
 * The possible order action types for a
 * [sales agreement](https://shopify.dev/api/admin-graphql/latest/interfaces/salesagreement).
 */
public enum OrderActionType {
  ORDER,

  ORDER_EDIT,

  REFUND,

  RETURN,

  UNKNOWN
}
