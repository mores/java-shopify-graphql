package com.shopify.admin.types;

/**
 * The set of variant strategies available for use in the `productOptionsCreate` mutation.
 */
public enum ProductOptionCreateVariantStrategy {
  /**
   * No additional variants are created in response to the added options. Existing variants are updated with the
   * first option value of each option added.
   */
  LEAVE_AS_IS,

  /**
   * Existing variants are updated with the first option value of each added option. New variants are
   * created for each combination of existing variant option values and new option values.
   */
  CREATE
}
