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
   * The shop's B2B entitlements.
   */
  private B2BType b2b;

  /**
   * Represents the markets for the shop.
   */
  private MarketsType markets;

  public EntitlementsType() {
  }

  /**
   * The shop's B2B entitlements.
   */
  public B2BType getB2b() {
    return b2b;
  }

  public void setB2b(B2BType b2b) {
    this.b2b = b2b;
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
    return "EntitlementsType{b2b='" + b2b + "', markets='" + markets + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    EntitlementsType that = (EntitlementsType) o;
    return Objects.equals(b2b, that.b2b) &&
        Objects.equals(markets, that.markets);
  }

  @Override
  public int hashCode() {
    return Objects.hash(b2b, markets);
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public static class Builder {
    /**
     * The shop's B2B entitlements.
     */
    private B2BType b2b;

    /**
     * Represents the markets for the shop.
     */
    private MarketsType markets;

    public EntitlementsType build() {
      EntitlementsType result = new EntitlementsType();
      result.b2b = this.b2b;
      result.markets = this.markets;
      return result;
    }

    /**
     * The shop's B2B entitlements.
     */
    public Builder b2b(B2BType b2b) {
      this.b2b = b2b;
      return this;
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
