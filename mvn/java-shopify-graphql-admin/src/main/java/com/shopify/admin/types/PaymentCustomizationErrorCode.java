package com.shopify.admin.types;

/**
 * Possible error codes that can be returned by `PaymentCustomizationError`.
 */
public enum PaymentCustomizationErrorCode {
  /**
   * Shop plan not eligible to use Functions from a custom app.
   */
  CUSTOM_APP_FUNCTION_NOT_ELIGIBLE,

  /**
   * Function does not implement the required interface.
   */
  FUNCTION_DOES_NOT_IMPLEMENT,

  /**
   * Function not found.
   */
  FUNCTION_NOT_FOUND,

  /**
   * Function is pending deletion.
   */
  FUNCTION_PENDING_DELETION,

  /**
   * The input value is invalid.
   */
  INVALID,

  /**
   * Payment customization not found.
   */
  PAYMENT_CUSTOMIZATION_NOT_FOUND,

  /**
   * Shop must be on a Shopify Plus plan to activate payment customizations from a custom app.
   */
  PAYMENT_CUSTOMIZATION_FUNCTION_NOT_ELIGIBLE,

  /**
   * Maximum payment customizations are already enabled.
   */
  MAXIMUM_ACTIVE_PAYMENT_CUSTOMIZATIONS,

  /**
   * Required input field must be present.
   */
  REQUIRED_INPUT_FIELD,

  /**
   * Could not create or update metafields.
   */
  INVALID_METAFIELDS,

  /**
   * The maximum number of payment customizations per shop has been reached.
   */
  MAXIMUM_PAYMENT_CUSTOMIZATIONS,

  /**
   * Function ID cannot be changed.
   */
  FUNCTION_ID_CANNOT_BE_CHANGED,

  /**
   * Either function_id or function_handle must be provided.
   */
  MISSING_FUNCTION_IDENTIFIER,

  /**
   * Only one of function_id or function_handle can be provided, not both.
   */
  MULTIPLE_FUNCTION_IDENTIFIERS
}
