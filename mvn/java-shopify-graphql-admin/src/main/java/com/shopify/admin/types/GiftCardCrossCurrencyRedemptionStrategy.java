package com.shopify.admin.types;

/**
 * The strategy used to convert the gift card's balance when it is redeemed in a currency other than the one it was issued in.
 */
public enum GiftCardCrossCurrencyRedemptionStrategy {
  /**
   * The gift card can only be redeemed in the currency it was issued in. It cannot be used for purchases in other currencies.
   */
  NONE,

  /**
   * The gift card is redeemed using the automatic or manual exchange rate
   * configured in the market's currency setting when converting from shop
   * currency. Only applicable for gift cards issued in the shop currency.
   */
  MARKET_FX,

  /**
   * The gift card is redeemed using standard spot exchange rates between the redemption currency and the gift card currency.
   */
  SPOT_FX
}
