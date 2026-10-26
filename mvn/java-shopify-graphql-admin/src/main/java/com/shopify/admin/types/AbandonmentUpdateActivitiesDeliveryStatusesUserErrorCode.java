package com.shopify.admin.types;

/**
 * Possible error codes that can be returned by `AbandonmentUpdateActivitiesDeliveryStatusesUserError`.
 */
public enum AbandonmentUpdateActivitiesDeliveryStatusesUserErrorCode {
  /**
   * Unable to find an Abandonment for the provided ID.
   */
  ABANDONMENT_NOT_FOUND,

  /**
   * Unable to find a marketing activity for the provided ID.
   */
  MARKETING_ACTIVITY_NOT_FOUND,

  /**
   * Unable to find delivery status info for the provided ID.
   */
  DELIVERY_STATUS_INFO_NOT_FOUND
}
