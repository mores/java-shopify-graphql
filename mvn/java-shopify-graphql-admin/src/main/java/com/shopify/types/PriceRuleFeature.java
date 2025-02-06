package com.shopify.types;

/**
 * The list of features that can be supported by a price rule.
 */
public enum PriceRuleFeature {
  BUY_ONE_GET_ONE,

  BUY_ONE_GET_ONE_WITH_ALLOCATION_LIMIT,

  BULK,

  SPECIFIC_CUSTOMERS,

  QUANTITY_DISCOUNTS
}
