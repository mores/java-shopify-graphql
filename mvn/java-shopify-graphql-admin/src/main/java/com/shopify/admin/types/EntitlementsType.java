package com.shopify.admin.types;

import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.Objects;

/**
 * The shop's entitlements.
 */
public class EntitlementsType {
  /**
   * Represents the markets for the shop.
   */
  private MarketsType markets;

  public EntitlementsType() {
  }

  /**
   * Represents the markets for the shop.
   */
  public MarketsType getMarkets() {
    return markets;
  }

  public void setMarkets(MarketsType markets) {
    this.markets = markets;
  }

  @Override
  public String toString() {
    return "EntitlementsType{markets='" + markets + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    EntitlementsType that = (EntitlementsType) o;
    return Objects.equals(markets, that.markets);
  }

  @Override
  public int hashCode() {
    return Objects.hash(markets);
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public static class Builder {
    /**
     * Represents the markets for the shop.
     */
    private MarketsType markets;

    public EntitlementsType build() {
      EntitlementsType result = new EntitlementsType();
      result.markets = this.markets;
      return result;
    }

    /**
     * Represents the markets for the shop.
     */
    public Builder markets(MarketsType markets) {
      this.markets = markets;
      return this;
    }
  }
}
