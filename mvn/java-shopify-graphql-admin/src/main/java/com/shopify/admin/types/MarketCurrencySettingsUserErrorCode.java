package com.shopify.admin.types;

/**
 * Possible error codes that can be returned by `MarketCurrencySettingsUserError`.
 */
public enum MarketCurrencySettingsUserErrorCode {
  MARKET_NOT_FOUND,

  MANAGED_MARKET,

  UNIFIED_MARKETS_ENABLED,

  MULTIPLE_CURRENCIES_NOT_SUPPORTED,

  NO_LOCAL_CURRENCIES_ON_SINGLE_COUNTRY_MARKET,

  UNSUPPORTED_CURRENCY,

  PRIMARY_MARKET_USES_SHOP_CURRENCY
}
