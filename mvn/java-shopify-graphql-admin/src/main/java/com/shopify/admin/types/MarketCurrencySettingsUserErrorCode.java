package com.shopify.admin.types;

/**
 * Possible error codes that can be returned by `MarketCurrencySettingsUserError`.
 */
public enum MarketCurrencySettingsUserErrorCode {
  /**
   * The specified market wasn't found.
   */
  MARKET_NOT_FOUND,

  /**
   * The currency settings of the given market cannot be changed because the market manager has exclusive control of pricing.
   */
  MANAGED_MARKET,

  /**
   * This action is restricted if unified markets is enabled.
   */
  UNIFIED_MARKETS_ENABLED,

  /**
   * The shop's payment gateway does not support enabling more than one currency.
   */
  MULTIPLE_CURRENCIES_NOT_SUPPORTED,

  /**
   * Can't enable or disable local currencies on a single country market.
   */
  NO_LOCAL_CURRENCIES_ON_SINGLE_COUNTRY_MARKET,

  /**
   * The specified currency is not supported.
   */
  UNSUPPORTED_CURRENCY,

  /**
   * The primary market must use the shop currency.
   */
  PRIMARY_MARKET_USES_SHOP_CURRENCY,

  /**
   * Local currencies must be enabled when adaptive pricing is active.
   */
  ADAPTIVE_PRICING_REQUIRES_LOCAL_CURRENCIES
}
