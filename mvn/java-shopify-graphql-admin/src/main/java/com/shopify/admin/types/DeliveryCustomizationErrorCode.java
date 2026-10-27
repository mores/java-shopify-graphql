package com.shopify.admin.types;

/**
 * Possible error codes that can be returned by `DeliveryCustomizationError`.
 */
public enum DeliveryCustomizationErrorCode {
  /**
   * The input value is invalid.
   */
  INVALID,

  /**
   * Function not found.
   */
  FUNCTION_NOT_FOUND,

  /**
   * Delivery customization not found.
   */
  DELIVERY_CUSTOMIZATION_NOT_FOUND,

  /**
   * Shop must be on a Shopify Plus plan to activate delivery customizations from a custom app.
   */
  DELIVERY_CUSTOMIZATION_FUNCTION_NOT_ELIGIBLE,

  /**
   * Unauthorized app scope.
   */
  UNAUTHORIZED_APP_SCOPE,

  /**
   * Maximum delivery customizations are already enabled.
   */
  MAXIMUM_ACTIVE_DELIVERY_CUSTOMIZATIONS,

  /**
   * The maximum number of delivery customizations per shop has been reached.
   */
  MAXIMUM_DELIVERY_CUSTOMIZATIONS,

  /**
   * Shop must be on a Shopify Plus plan to activate functions from a custom app.
   */
  CUSTOM_APP_FUNCTION_NOT_ELIGIBLE,

  /**
   * Function does not implement the required interface for this delivery customization.
   */
  FUNCTION_DOES_NOT_IMPLEMENT,

  /**
   * Function is pending deletion.
   */
  FUNCTION_PENDING_DELETION,

  /**
   * Function ID cannot be changed.
   */
  FUNCTION_ID_CANNOT_BE_CHANGED,

  /**
   * Required input field must be present.
   */
  REQUIRED_INPUT_FIELD,

  /**
   * Could not create or update metafields.
   */
  INVALID_METAFIELDS,

  /**
   * Either function_id or function_handle must be provided.
   */
  MISSING_FUNCTION_IDENTIFIER,

  /**
   * Only one of function_id or function_handle can be provided, not both.
   */
  MULTIPLE_FUNCTION_IDENTIFIERS
}
