package com.shopify.admin.types;

/**
 * The type of the resource that generated the event.
 */
public enum EventSubjectType {
  /**
   * A CompanyLocation resource generated the event.
   */
  COMPANY_LOCATION,

  /**
   * A Company resource generated the event.
   */
  COMPANY,

  /**
   * A Customer resource generated the event.
   */
  CUSTOMER,

  /**
   * A DraftOrder resource generated the event.
   */
  DRAFT_ORDER,

  /**
   * A InventoryTransfer resource generated the event.
   */
  INVENTORY_TRANSFER,

  /**
   * A Collection resource generated the event.
   */
  COLLECTION,

  /**
   * A Product resource generated the event.
   */
  PRODUCT,

  /**
   * A ProductVariant resource generated the event.
   */
  PRODUCT_VARIANT,

  /**
   * A Article resource generated the event.
   */
  ARTICLE,

  /**
   * A Blog resource generated the event.
   */
  BLOG,

  /**
   * A Comment resource generated the event.
   */
  COMMENT,

  /**
   * A Page resource generated the event.
   */
  PAGE,

  /**
   * A DiscountAutomaticBxgy resource generated the event.
   */
  DISCOUNT_AUTOMATIC_BXGY,

  /**
   * A DiscountAutomaticNode resource generated the event.
   */
  DISCOUNT_AUTOMATIC_NODE,

  /**
   * A DiscountCodeNode resource generated the event.
   */
  DISCOUNT_CODE_NODE,

  /**
   * A DiscountNode resource generated the event.
   */
  DISCOUNT_NODE,

  /**
   * A PriceRule resource generated the event.
   */
  PRICE_RULE,

  /**
   * A Order resource generated the event.
   */
  ORDER,

  /**
   * Subject type is not available. This usually means that the subject isn't available in the current
   *         version of the API, using a newer API version may resolve this.
   */
  UNKNOWN
}
