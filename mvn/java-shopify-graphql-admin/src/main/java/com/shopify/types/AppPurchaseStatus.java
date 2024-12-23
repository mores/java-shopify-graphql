package com.shopify.types;

/**
 * The approval status of the app purchase.
 *
 * The merchant is charged for the purchase immediately after approval, and the status changes to `active`.
 * If the payment fails, then the app purchase remains `pending`.
 *
 * Purchases start as `pending` and can change to: `active`, `declined`, `expired`. After a purchase changes, it
 * remains in that final state.
 */
public enum AppPurchaseStatus {
  ACCEPTED,

  ACTIVE,

  DECLINED,

  EXPIRED,

  PENDING
}
