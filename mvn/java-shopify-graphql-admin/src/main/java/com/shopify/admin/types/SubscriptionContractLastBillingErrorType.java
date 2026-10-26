package com.shopify.admin.types;

/**
 * The possible values of the last billing error on a subscription contract.
 */
public enum SubscriptionContractLastBillingErrorType {
  /**
   * Subscription billing attempt error due to payment error.
   */
  PAYMENT_ERROR,

  /**
   * Subscription billing attempt error due to customer error.
   */
  CUSTOMER_ERROR,

  /**
   * Subscription billing attempt error due to inventory error.
   */
  INVENTORY_ERROR,

  /**
   * All other billing attempt errors.
   */
  OTHER
}
