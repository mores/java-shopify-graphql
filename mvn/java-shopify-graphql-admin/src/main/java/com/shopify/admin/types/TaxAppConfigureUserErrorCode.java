package com.shopify.admin.types;

/**
 * Possible error codes that can be returned by `TaxAppConfigureUserError`.
 */
public enum TaxAppConfigureUserErrorCode {
  /**
   * Unable to find the tax partner record.
   */
  TAX_PARTNER_NOT_FOUND,

  /**
   * Unable to update tax partner state.
   */
  TAX_PARTNER_STATE_UPDATE_FAILED,

  /**
   * Unable to update already active tax partner.
   */
  TAX_PARTNER_ALREADY_ACTIVE
}
