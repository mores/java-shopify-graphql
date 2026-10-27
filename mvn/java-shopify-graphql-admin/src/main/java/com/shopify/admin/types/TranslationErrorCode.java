package com.shopify.admin.types;

/**
 * Possible error codes that can be returned by `TranslationUserError`.
 */
public enum TranslationErrorCode {
  /**
   * The input value is blank.
   */
  BLANK,

  /**
   * The input value is invalid.
   */
  INVALID,

  /**
   * Resource does not exist.
   */
  RESOURCE_NOT_FOUND,

  /**
   * Resource is not translatable.
   */
  RESOURCE_NOT_TRANSLATABLE,

  /**
   * Too many translation keys for the resource.
   */
  TOO_MANY_KEYS_FOR_RESOURCE,

  /**
   * Translation key is invalid.
   */
  INVALID_KEY_FOR_MODEL,

  /**
   * Translation value is invalid.
   */
  FAILS_RESOURCE_VALIDATION,

  /**
   * Translatable content is invalid.
   */
  INVALID_TRANSLATABLE_CONTENT,

  /**
   * Market localizable content is invalid.
   */
  INVALID_MARKET_LOCALIZABLE_CONTENT,

  /**
   * Locale is invalid for the shop.
   */
  INVALID_LOCALE_FOR_SHOP,

  /**
   * Locale language code is invalid.
   */
  INVALID_CODE,

  /**
   * Locale code format is invalid.
   */
  INVALID_FORMAT,

  /**
   * The shop isn't allowed to operate on market custom content.
   */
  MARKET_CUSTOM_CONTENT_NOT_ALLOWED,

  /**
   * The market corresponding to the `marketId` argument doesn't exist.
   */
  MARKET_DOES_NOT_EXIST,

  /**
   * The market override locale creation failed.
   */
  MARKET_LOCALE_CREATION_FAILED,

  /**
   * The specified resource can't be customized for a market.
   */
  RESOURCE_NOT_MARKET_CUSTOMIZABLE,

  /**
   * The locale is missing on the market corresponding to the `marketId` argument.
   */
  INVALID_LOCALE_FOR_MARKET,

  /**
   * The handle is already taken for this resource.
   */
  INVALID_VALUE_FOR_HANDLE_TRANSLATION
}
