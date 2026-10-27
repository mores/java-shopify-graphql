package com.shopify.admin.types;

/**
 * The reason why the merchant declined a customer's return request.
 */
public enum ReturnDeclineReason {
  /**
   * The return period has ended.
   */
  RETURN_PERIOD_ENDED,

  /**
   * The return contains final sale items.
   */
  FINAL_SALE,

  /**
   * The return is declined for another reason.
   */
  OTHER
}
