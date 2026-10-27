package com.shopify.admin.types;

import com.fasterxml.jackson.annotation.JsonTypeInfo;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.Objects;

/**
 * Markets where the discount is available.
 */
@JsonTypeInfo(
    use = JsonTypeInfo.Id.NONE
)
public class DiscountMarkets implements DiscountContext {
  /**
   * The list of markets where the discount is available.
   */
  private MarketConnection markets;

  /**
   * The number of markets where the discount is available.
   */
  private int marketsCount;

  public DiscountMarkets() {
  }

  /**
   * The list of markets where the discount is available.
   */
  public MarketConnection getMarkets() {
    return markets;
  }

  public void setMarkets(MarketConnection markets) {
    this.markets = markets;
  }

  /**
   * The number of markets where the discount is available.
   */
  public int getMarketsCount() {
    return marketsCount;
  }

  public void setMarketsCount(int marketsCount) {
    this.marketsCount = marketsCount;
  }

  @Override
  public String toString() {
    return "DiscountMarkets{markets='" + markets + "', marketsCount='" + marketsCount + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    DiscountMarkets that = (DiscountMarkets) o;
    return Objects.equals(markets, that.markets) &&
        marketsCount == that.marketsCount;
  }

  @Override
  public int hashCode() {
    return Objects.hash(markets, marketsCount);
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public static class Builder {
    /**
     * The list of markets where the discount is available.
     */
    private MarketConnection markets;

    /**
     * The number of markets where the discount is available.
     */
    private int marketsCount;

    public DiscountMarkets build() {
      DiscountMarkets result = new DiscountMarkets();
      result.markets = this.markets;
      result.marketsCount = this.marketsCount;
      return result;
    }

    /**
     * The list of markets where the discount is available.
     */
    public Builder markets(MarketConnection markets) {
      this.markets = markets;
      return this;
    }

    /**
     * The number of markets where the discount is available.
     */
    public Builder marketsCount(int marketsCount) {
      this.marketsCount = marketsCount;
      return this;
    }
  }
}
