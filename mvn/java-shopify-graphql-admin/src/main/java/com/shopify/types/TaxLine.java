package com.shopify.types;

import java.lang.Boolean;
import java.lang.Double;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.Objects;

/**
 * Represents a single tax applied to the associated line item.
 */
public class TaxLine {
  /**
   * Whether the channel that submitted the tax line is liable for remitting. A
   * value of null indicates unknown liability for this tax line.
   */
  private Boolean channelLiable;

  /**
   * The amount of tax, in shop currency, after discounts and before returns.
   */
  private String price;

  /**
   * The amount of tax, in shop and presentment currencies, after discounts and before returns.
   */
  private MoneyBag priceSet;

  /**
   * The proportion of the line item price that the tax represents as a decimal.
   */
  private Double rate;

  /**
   * The proportion of the line item price that the tax represents as a percentage.
   */
  private Double ratePercentage;

  /**
   * The source of the tax.
   */
  private String source;

  /**
   * The name of the tax.
   */
  private String title;

  public TaxLine() {
  }

  /**
   * Whether the channel that submitted the tax line is liable for remitting. A
   * value of null indicates unknown liability for this tax line.
   */
  public Boolean getChannelLiable() {
    return channelLiable;
  }

  public void setChannelLiable(Boolean channelLiable) {
    this.channelLiable = channelLiable;
  }

  /**
   * The amount of tax, in shop currency, after discounts and before returns.
   */
  public String getPrice() {
    return price;
  }

  public void setPrice(String price) {
    this.price = price;
  }

  /**
   * The amount of tax, in shop and presentment currencies, after discounts and before returns.
   */
  public MoneyBag getPriceSet() {
    return priceSet;
  }

  public void setPriceSet(MoneyBag priceSet) {
    this.priceSet = priceSet;
  }

  /**
   * The proportion of the line item price that the tax represents as a decimal.
   */
  public Double getRate() {
    return rate;
  }

  public void setRate(Double rate) {
    this.rate = rate;
  }

  /**
   * The proportion of the line item price that the tax represents as a percentage.
   */
  public Double getRatePercentage() {
    return ratePercentage;
  }

  public void setRatePercentage(Double ratePercentage) {
    this.ratePercentage = ratePercentage;
  }

  /**
   * The source of the tax.
   */
  public String getSource() {
    return source;
  }

  public void setSource(String source) {
    this.source = source;
  }

  /**
   * The name of the tax.
   */
  public String getTitle() {
    return title;
  }

  public void setTitle(String title) {
    this.title = title;
  }

  @Override
  public String toString() {
    return "TaxLine{channelLiable='" + channelLiable + "', price='" + price + "', priceSet='" + priceSet + "', rate='" + rate + "', ratePercentage='" + ratePercentage + "', source='" + source + "', title='" + title + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    TaxLine that = (TaxLine) o;
    return Objects.equals(channelLiable, that.channelLiable) &&
        Objects.equals(price, that.price) &&
        Objects.equals(priceSet, that.priceSet) &&
        Objects.equals(rate, that.rate) &&
        Objects.equals(ratePercentage, that.ratePercentage) &&
        Objects.equals(source, that.source) &&
        Objects.equals(title, that.title);
  }

  @Override
  public int hashCode() {
    return Objects.hash(channelLiable, price, priceSet, rate, ratePercentage, source, title);
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public static class Builder {
    /**
     * Whether the channel that submitted the tax line is liable for remitting. A
     * value of null indicates unknown liability for this tax line.
     */
    private Boolean channelLiable;

    /**
     * The amount of tax, in shop currency, after discounts and before returns.
     */
    private String price;

    /**
     * The amount of tax, in shop and presentment currencies, after discounts and before returns.
     */
    private MoneyBag priceSet;

    /**
     * The proportion of the line item price that the tax represents as a decimal.
     */
    private Double rate;

    /**
     * The proportion of the line item price that the tax represents as a percentage.
     */
    private Double ratePercentage;

    /**
     * The source of the tax.
     */
    private String source;

    /**
     * The name of the tax.
     */
    private String title;

    public TaxLine build() {
      TaxLine result = new TaxLine();
      result.channelLiable = this.channelLiable;
      result.price = this.price;
      result.priceSet = this.priceSet;
      result.rate = this.rate;
      result.ratePercentage = this.ratePercentage;
      result.source = this.source;
      result.title = this.title;
      return result;
    }

    /**
     * Whether the channel that submitted the tax line is liable for remitting. A
     * value of null indicates unknown liability for this tax line.
     */
    public Builder channelLiable(Boolean channelLiable) {
      this.channelLiable = channelLiable;
      return this;
    }

    /**
     * The amount of tax, in shop currency, after discounts and before returns.
     */
    public Builder price(String price) {
      this.price = price;
      return this;
    }

    /**
     * The amount of tax, in shop and presentment currencies, after discounts and before returns.
     */
    public Builder priceSet(MoneyBag priceSet) {
      this.priceSet = priceSet;
      return this;
    }

    /**
     * The proportion of the line item price that the tax represents as a decimal.
     */
    public Builder rate(Double rate) {
      this.rate = rate;
      return this;
    }

    /**
     * The proportion of the line item price that the tax represents as a percentage.
     */
    public Builder ratePercentage(Double ratePercentage) {
      this.ratePercentage = ratePercentage;
      return this;
    }

    /**
     * The source of the tax.
     */
    public Builder source(String source) {
      this.source = source;
      return this;
    }

    /**
     * The name of the tax.
     */
    public Builder title(String title) {
      this.title = title;
      return this;
    }
  }
}
