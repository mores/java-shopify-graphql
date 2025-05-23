package com.shopify.admin.types;

/**
 * Possible error codes that can be returned by `TranslationUserError`.
 */
public enum TranslationErrorCode {
  BLANK,

  INVALID,

  RESOURCE_NOT_FOUND,

  RESOURCE_NOT_TRANSLATABLE,

  TOO_MANY_KEYS_FOR_RESOURCE,

  INVALID_KEY_FOR_MODEL,

  FAILS_RESOURCE_VALIDATION,

  INVALID_TRANSLATABLE_CONTENT,

  INVALID_MARKET_LOCALIZABLE_CONTENT,

  INVALID_LOCALE_FOR_SHOP,

  INVALID_CODE,

  INVALID_FORMAT,

  MARKET_CUSTOM_CONTENT_NOT_ALLOWED,

  MARKET_DOES_NOT_EXIST,

  MARKET_LOCALE_CREATION_FAILED,

  RESOURCE_NOT_MARKET_CUSTOMIZABLE,

  INVALID_LOCALE_FOR_MARKET,

  INVALID_VALUE_FOR_HANDLE_TRANSLATION
}
