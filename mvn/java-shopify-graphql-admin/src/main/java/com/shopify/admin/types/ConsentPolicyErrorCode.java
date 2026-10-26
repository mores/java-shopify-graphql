package com.shopify.admin.types;

/**
 * Possible error codes that can be returned by `ConsentPolicyError`.
 */
public enum ConsentPolicyErrorCode {
  /**
   * Country code is required.
   */
  COUNTRY_CODE_REQUIRED,

  /**
   * Region code is required for countries with existing regional policies.
   */
  REGION_CODE_REQUIRED,

  /**
   * Region code must match the country code.
   */
  REGION_CODE_MUST_MATCH_COUNTRY_CODE,

  /**
   * Shopify's cookie banner must be disabled.
   */
  SHOPIFY_COOKIE_BANNER_NOT_DISABLED,

  /**
   * Unsupported consent policy.
   */
  UNSUPORTED_CONSENT_POLICY
}
