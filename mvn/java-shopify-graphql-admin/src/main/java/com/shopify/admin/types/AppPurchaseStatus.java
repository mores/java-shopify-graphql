package com.shopify.admin.types;

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
  /**
   * The app purchase has been approved by the merchant and is ready to be
   * activated by the app. App purchases created through the GraphQL Admin API are
   * activated upon approval.
   */
  ACCEPTED,

  /**
   * The app purchase was approved by the merchant and has been activated by the
   * app. Active app purchases are charged to the merchant and are paid out to the partner.
   */
  ACTIVE,

  /**
   * The app purchase was declined by the merchant.
   */
  DECLINED,

  /**
   * The app purchase was not accepted within two days of being created.
   */
  EXPIRED,

  /**
   * The app purchase is pending approval by the merchant.
   */
  PENDING
}
