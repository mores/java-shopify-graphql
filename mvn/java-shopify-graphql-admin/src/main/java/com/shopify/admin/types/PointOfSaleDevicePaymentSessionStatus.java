package com.shopify.admin.types;

/**
 * The status of the point of sale device payment session. Payments can't be
 * processed or refunded during a closed session, and the cash drawer balance can't
 * be adjusted or corrected.
 */
public enum PointOfSaleDevicePaymentSessionStatus {
  OPEN,

  CLOSED
}
