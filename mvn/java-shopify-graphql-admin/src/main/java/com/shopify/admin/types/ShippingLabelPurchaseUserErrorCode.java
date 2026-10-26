package com.shopify.admin.types;

/**
 * Possible error codes that can be returned by `ShippingLabelPurchaseUserError`.
 */
public enum ShippingLabelPurchaseUserErrorCode {
  /**
   * The record with the ID used as the input value couldn't be found.
   */
  NOT_FOUND,

  /**
   * Non-zero total weight is required for purchase.
   */
  TOTAL_WEIGHT_ZERO,

  /**
   * Shipping date has already passed.
   */
  SHIPPING_DATE_IN_THE_PAST,

  /**
   * Shipping rate selection is required for purchase.
   */
  MISSING_SHIPPING_RATE,

  /**
   * Shipping date is required for purchase.
   */
  MISSING_SHIPPING_DATE,

  /**
   * Missing insurance coverage amount.
   */
  MISSING_INSURANCE_COVERAGE_AMOUNT,

  /**
   * Missing insurance coverage currency.
   */
  MISSING_INSURANCE_COVERAGE_CURRENCY,

  /**
   * Package dimensions must be greater than zero.
   */
  INVALID_PACKAGE_DIMENSIONS,

  /**
   * Missing harmonized system code.
   */
  MISSING_HS_CODE,

  /**
   * Missing country of origin.
   */
  MISSING_COUNTRY_OF_ORIGIN,

  /**
   * At least 1 item should be fulfilled.
   */
  AT_LEAST_1_ITEM_REQUIRED,

  /**
   * The shipping intent has a phone number that is not fully qualified for the origin address.
   */
  PHONE_NUMBER_NOT_FULLY_QUALIFIED_ORIGIN,

  /**
   * The shipping intent has a phone number that is not fully qualified for the destination address.
   */
  PHONE_NUMBER_NOT_FULLY_QUALIFIED_DESTINATION,

  /**
   * The intent is trying to set an adaptive shipping state on a non-adaptive shipping order.
   */
  ADAPTIVE_SHIPPING_STATE_INVALID,

  /**
   * The fulfillment order is not eligible for label purchase. Review the fulfillment order details and try again.
   */
  FULFILLMENT_ORDER_INVALID,

  /**
   * Shipping labels may not be purchased at this time. Please try again later.
   */
  KILL_SWITCH,

  /**
   * The label purchase failed. Please review the shipment details and try again.
   */
  PURCHASE_FAILED,

  /**
   * Rates for the shipping label were not found. Please review the shipment details and try again.
   */
  RATES_NOT_FOUND,

  /**
   * Shopify Shipping terms of service have not been accepted. Purchase a shipping label through the Shopify admin first.
   */
  TERMS_OF_SERVICE_NOT_ACCEPTED,

  /**
   * The selected shipping carrier cannot be purchased through this API.
   */
  CARRIER_NOT_SUPPORTED,

  /**
   * The API client lacks write access to the provided fulfillment order.
   */
  ACCESS_DENIED,

  /**
   * The requested carrier package does not match the preferred rate selection carrier.
   */
  PACKAGE_CARRIER_MISMATCH,

  /**
   * Pickup point orders cannot be purchased through this API. Purchase the shipping label through the Shopify admin.
   */
  PICKUP_POINT_NOT_SUPPORTED
}
