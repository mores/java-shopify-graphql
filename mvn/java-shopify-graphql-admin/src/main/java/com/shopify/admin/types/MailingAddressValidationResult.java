package com.shopify.admin.types;

/**
 * Highest level of validation concerns identified for the address.
 */
public enum MailingAddressValidationResult {
  /**
   * Indicates that the address has been validated and no issues were found.
   */
  NO_ISSUES,

  /**
   * Indicates that the address has been validated and is very likely to contain invalid information.
   */
  ERROR,

  /**
   * Indicates that the address has been validated and might contain invalid information.
   */
  WARNING
}
