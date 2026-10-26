package com.shopify.storefront.types;

/**
 * The preferred delivery methods such as shipping, local pickup or through pickup points.
 */
public enum PreferenceDeliveryMethodType {
  /**
   * A delivery method used to send items directly to a buyer’s specified address.
   */
  SHIPPING,

  /**
   * A delivery method used to let buyers receive items directly from a specific location within an area.
   */
  PICK_UP,

  /**
   * A delivery method used to let buyers collect purchases at designated locations like parcel lockers.
   */
  PICKUP_POINT
}
