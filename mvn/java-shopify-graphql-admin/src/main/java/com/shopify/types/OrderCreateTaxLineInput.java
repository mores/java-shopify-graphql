package com.shopify.types;

import java.lang.Boolean;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.Objects;

/**
 * The input fields for a tax line to create for an order.
 */
public class OrderCreateTaxLineInput {
  /**
   * Whether the channel that submitted the tax line is liable for remitting. A
   * value of `null` indicates unknown liability for the tax line.
   */
  private Boolean channelLiable = false;

  /**
   * The amount of tax to be charged on the item.
   */
  private MoneyBagInput priceSet;

  /**
   * The proportion of the item price that the tax represents as a decimal.
   */
  private String rate;

  /**
   * The name of the tax line to create.
   */
  private String title;

  public OrderCreateTaxLineInput() {
  }

  /**
   * Whether the channel that submitted the tax line is liable for remitting. A
   * value of `null` indicates unknown liability for the tax line.
   */
  public Boolean getChannelLiable() {
    return channelLiable;
  }

  public void setChannelLiable(Boolean channelLiable) {
    this.channelLiable = channelLiable;
  }

  /**
   * The amount of tax to be charged on the item.
   */
  public MoneyBagInput getPriceSet() {
    return priceSet;
  }

  public void setPriceSet(MoneyBagInput priceSet) {
    this.priceSet = priceSet;
  }

  /**
   * The proportion of the item price that the tax represents as a decimal.
   */
  public String getRate() {
    return rate;
  }

  public void setRate(String rate) {
    this.rate = rate;
  }

  /**
   * The name of the tax line to create.
   */
  public String getTitle() {
    return title;
  }

  public void setTitle(String title) {
    this.title = title;
  }

  @Override
  public String toString() {
    return "OrderCreateTaxLineInput{channelLiable='" + channelLiable + "', priceSet='" + priceSet + "', rate='" + rate + "', title='" + title + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    OrderCreateTaxLineInput that = (OrderCreateTaxLineInput) o;
    return Objects.equals(channelLiable, that.channelLiable) &&
        Objects.equals(priceSet, that.priceSet) &&
        Objects.equals(rate, that.rate) &&
        Objects.equals(title, that.title);
  }

  @Override
  public int hashCode() {
    return Objects.hash(channelLiable, priceSet, rate, title);
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public static class Builder {
    /**
     * Whether the channel that submitted the tax line is liable for remitting. A
     * value of `null` indicates unknown liability for the tax line.
     */
    private Boolean channelLiable = false;

    /**
     * The amount of tax to be charged on the item.
     */
    private MoneyBagInput priceSet;

    /**
     * The proportion of the item price that the tax represents as a decimal.
     */
    private String rate;

    /**
     * The name of the tax line to create.
     */
    private String title;

    public OrderCreateTaxLineInput build() {
      OrderCreateTaxLineInput result = new OrderCreateTaxLineInput();
      result.channelLiable = this.channelLiable;
      result.priceSet = this.priceSet;
      result.rate = this.rate;
      result.title = this.title;
      return result;
    }

    /**
     * Whether the channel that submitted the tax line is liable for remitting. A
     * value of `null` indicates unknown liability for the tax line.
     */
    public Builder channelLiable(Boolean channelLiable) {
      this.channelLiable = channelLiable;
      return this;
    }

    /**
     * The amount of tax to be charged on the item.
     */
    public Builder priceSet(MoneyBagInput priceSet) {
      this.priceSet = priceSet;
      return this;
    }

    /**
     * The proportion of the item price that the tax represents as a decimal.
     */
    public Builder rate(String rate) {
      this.rate = rate;
      return this;
    }

    /**
     * The name of the tax line to create.
     */
    public Builder title(String title) {
      this.title = title;
      return this;
    }
  }
}
