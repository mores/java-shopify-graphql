package com.shopify.storefront.types;

/**
 * The code of the error that occurred during cart submit for completion.
 */
public enum SubmissionErrorCode {
  ERROR,

  NO_DELIVERY_GROUP_SELECTED,

  BUYER_IDENTITY_EMAIL_IS_INVALID,

  BUYER_IDENTITY_EMAIL_REQUIRED,

  BUYER_IDENTITY_PHONE_IS_INVALID,

  DELIVERY_ADDRESS1_INVALID,

  DELIVERY_ADDRESS1_REQUIRED,

  DELIVERY_ADDRESS1_TOO_LONG,

  DELIVERY_ADDRESS2_INVALID,

  DELIVERY_ADDRESS2_REQUIRED,

  DELIVERY_ADDRESS2_TOO_LONG,

  DELIVERY_CITY_INVALID,

  DELIVERY_CITY_REQUIRED,

  DELIVERY_CITY_TOO_LONG,

  DELIVERY_COMPANY_INVALID,

  DELIVERY_COMPANY_REQUIRED,

  DELIVERY_COMPANY_TOO_LONG,

  DELIVERY_COUNTRY_REQUIRED,

  DELIVERY_FIRST_NAME_INVALID,

  DELIVERY_FIRST_NAME_REQUIRED,

  DELIVERY_FIRST_NAME_TOO_LONG,

  DELIVERY_INVALID_POSTAL_CODE_FOR_COUNTRY,

  DELIVERY_INVALID_POSTAL_CODE_FOR_ZONE,

  DELIVERY_LAST_NAME_INVALID,

  DELIVERY_LAST_NAME_REQUIRED,

  DELIVERY_LAST_NAME_TOO_LONG,

  DELIVERY_NO_DELIVERY_AVAILABLE,

  DELIVERY_NO_DELIVERY_AVAILABLE_FOR_MERCHANDISE_LINE,

  DELIVERY_OPTIONS_PHONE_NUMBER_INVALID,

  DELIVERY_OPTIONS_PHONE_NUMBER_REQUIRED,

  DELIVERY_PHONE_NUMBER_INVALID,

  DELIVERY_PHONE_NUMBER_REQUIRED,

  DELIVERY_POSTAL_CODE_INVALID,

  DELIVERY_POSTAL_CODE_REQUIRED,

  DELIVERY_ZONE_NOT_FOUND,

  DELIVERY_ZONE_REQUIRED_FOR_COUNTRY,

  DELIVERY_ADDRESS_REQUIRED,

  MERCHANDISE_NOT_APPLICABLE,

  MERCHANDISE_LINE_LIMIT_REACHED,

  MERCHANDISE_NOT_ENOUGH_STOCK_AVAILABLE,

  MERCHANDISE_OUT_OF_STOCK,

  MERCHANDISE_PRODUCT_NOT_PUBLISHED,

  PAYMENTS_ADDRESS1_INVALID,

  PAYMENTS_ADDRESS1_REQUIRED,

  PAYMENTS_ADDRESS1_TOO_LONG,

  PAYMENTS_ADDRESS2_INVALID,

  PAYMENTS_ADDRESS2_REQUIRED,

  PAYMENTS_ADDRESS2_TOO_LONG,

  PAYMENTS_CITY_INVALID,

  PAYMENTS_CITY_REQUIRED,

  PAYMENTS_CITY_TOO_LONG,

  PAYMENTS_COMPANY_INVALID,

  PAYMENTS_COMPANY_REQUIRED,

  PAYMENTS_COMPANY_TOO_LONG,

  PAYMENTS_COUNTRY_REQUIRED,

  PAYMENTS_CREDIT_CARD_BASE_EXPIRED,

  PAYMENTS_CREDIT_CARD_BASE_GATEWAY_NOT_SUPPORTED,

  PAYMENTS_CREDIT_CARD_BASE_INVALID_START_DATE_OR_ISSUE_NUMBER_FOR_DEBIT,

  PAYMENTS_CREDIT_CARD_BRAND_NOT_SUPPORTED,

  PAYMENTS_CREDIT_CARD_FIRST_NAME_BLANK,

  PAYMENTS_CREDIT_CARD_GENERIC,

  PAYMENTS_CREDIT_CARD_LAST_NAME_BLANK,

  PAYMENTS_CREDIT_CARD_MONTH_INCLUSION,

  PAYMENTS_CREDIT_CARD_NAME_INVALID,

  PAYMENTS_CREDIT_CARD_NUMBER_INVALID,

  PAYMENTS_CREDIT_CARD_NUMBER_INVALID_FORMAT,

  PAYMENTS_CREDIT_CARD_SESSION_ID,

  PAYMENTS_CREDIT_CARD_VERIFICATION_VALUE_BLANK,

  PAYMENTS_CREDIT_CARD_VERIFICATION_VALUE_INVALID_FOR_CARD_TYPE,

  PAYMENTS_CREDIT_CARD_YEAR_EXPIRED,

  PAYMENTS_CREDIT_CARD_YEAR_INVALID_EXPIRY_YEAR,

  PAYMENTS_FIRST_NAME_INVALID,

  PAYMENTS_FIRST_NAME_REQUIRED,

  PAYMENTS_FIRST_NAME_TOO_LONG,

  PAYMENTS_INVALID_POSTAL_CODE_FOR_COUNTRY,

  PAYMENTS_INVALID_POSTAL_CODE_FOR_ZONE,

  PAYMENTS_LAST_NAME_INVALID,

  PAYMENTS_LAST_NAME_REQUIRED,

  PAYMENTS_LAST_NAME_TOO_LONG,

  PAYMENTS_METHOD_UNAVAILABLE,

  PAYMENTS_METHOD_REQUIRED,

  PAYMENTS_UNACCEPTABLE_PAYMENT_AMOUNT,

  PAYMENTS_PHONE_NUMBER_INVALID,

  PAYMENTS_PHONE_NUMBER_REQUIRED,

  PAYMENTS_POSTAL_CODE_INVALID,

  PAYMENTS_POSTAL_CODE_REQUIRED,

  PAYMENTS_SHOPIFY_PAYMENTS_REQUIRED,

  PAYMENTS_WALLET_CONTENT_MISSING,

  PAYMENTS_BILLING_ADDRESS_ZONE_NOT_FOUND,

  PAYMENTS_BILLING_ADDRESS_ZONE_REQUIRED_FOR_COUNTRY,

  REDIRECT_TO_CHECKOUT_REQUIRED,

  TAXES_MUST_BE_DEFINED,

  TAXES_LINE_ID_NOT_FOUND,

  TAXES_DELIVERY_GROUP_ID_NOT_FOUND,

  VALIDATION_CUSTOM
}
