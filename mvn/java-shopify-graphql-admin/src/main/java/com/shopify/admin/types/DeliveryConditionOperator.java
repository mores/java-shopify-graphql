package com.shopify.admin.types;

/**
 * The operator to use to determine if the condition passes.
 */
public enum DeliveryConditionOperator {
  /**
   * The condition will check whether the field is greater than or equal to the criterion.
   */
  GREATER_THAN_OR_EQUAL_TO,

  /**
   * The condition will check if the field is less than or equal to the criterion.
   */
  LESS_THAN_OR_EQUAL_TO
}
