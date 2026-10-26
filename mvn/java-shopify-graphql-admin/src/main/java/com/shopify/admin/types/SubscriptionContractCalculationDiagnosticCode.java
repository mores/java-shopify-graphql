package com.shopify.admin.types;

/**
 * Diagnostic codes for subscription contract calculation errors and warnings.
 */
public enum SubscriptionContractCalculationDiagnosticCode {
  /**
   * The input value is invalid.
   */
  INVALID,

  /**
   * The merchandise product variant could not be found.
   */
  MERCHANDISE_NOT_FOUND,

  /**
   * The delivery address is not valid.
   */
  DELIVERY_ADDRESS_INVALID,

  /**
   * The subscription contract currency is not supported by the shop.
   */
  CURRENCY_NOT_SUPPORTED,

  /**
   * No location can ship the contract's merchandise to the delivery address.
   * Delivery may still proceed at billing time by falling back to a default location.
   */
  DELIVERY_NO_LOCATION_SHIPS_TO_ADDRESS,

  /**
   * The contract's pickup location can no longer fulfil the order — it was
   * removed, disabled, or does not support pickup for the merchandise.
   */
  DELIVERY_PICKUP_LOCATION_UNAVAILABLE,

  /**
   * The payment method could not be found.
   */
  PAYMENT_METHOD_NOT_FOUND,

  /**
   * A cart validation function produced a message.
   */
  CUSTOM_VALIDATION,

  /**
   * The contract has items that require shipping, so a delivery method is required.
   */
  DELIVERY_METHOD_REQUIRED,

  /**
   * The contract has a delivery method but no items that require shipping.
   */
  DELIVERY_METHOD_UNUSED,

  /**
   * The customer has no contact method (email or phone) but the shop requires one to bill the contract.
   */
  CUSTOMER_CONTACT_METHOD_REQUIRED,

  /**
   * The contract contains a bundle that could not be expanded; bundles are only
   * supported when merchandise customizations are enabled.
   */
  BUNDLE_REQUIRES_MERCHANDISE_CUSTOMIZATIONS,

  /**
   * A gift card merchandise line is invalid because its price is not greater than zero.
   */
  MERCHANDISE_GIFT_CARD_INVALID,

  /**
   * A requested discount code was not applied: it doesn't exist, isn't active, or
   * isn't applicable to this subscription contract.
   */
  DISCOUNT_CODE_NOT_APPLIED,

  /**
   * The calculation did not resolve in time. The calculation can be safely retried.
   */
  CALCULATION_TIMEOUT,

  /**
   * A line's price was adjusted so it divides evenly across the fulfillments in each billing cycle.
   */
  LINE_PRICE_ADJUSTED_FOR_FULFILLMENTS,

  /**
   * The calculation could not be completed due to an unexpected error.
   */
  PROCESSING_ERROR
}
