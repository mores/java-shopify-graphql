package com.shopify.admin.types;

/**
 * The category of the selling plan. For the `OTHER` category,
 *          you must fill out our [request form](https://docs.google.com/forms/d/e/1FAIpQLSeU18Xmw0Q61V8wdH-dfGafFqIBfRchQKUO8WAF3yJTvgyyZQ/viewform),
 *          where we'll review your request for a new purchase option.
 */
public enum SellingPlanCategory {
  /**
   * The selling plan is for anything not in one of the other categories.
   */
  OTHER,

  /**
   * The selling plan is for pre-orders.
   */
  PRE_ORDER,

  /**
   * The selling plan is for subscriptions.
   */
  SUBSCRIPTION,

  /**
   * The selling plan is for try before you buy purchases.
   */
  TRY_BEFORE_YOU_BUY
}
