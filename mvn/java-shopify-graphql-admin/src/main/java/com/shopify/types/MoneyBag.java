package com.shopify.types;

import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.Objects;

/**
 * A collection of monetary values in their respective currencies. Typically used
 * in the context of multi-currency pricing and transactions,
 * when an amount in the shop's currency is converted to the customer's currency of choice (the presentment currency).
 */
public class MoneyBag {
  /**
   * Amount in presentment currency.
   */
  private MoneyV2 presentmentMoney;

  /**
   * Amount in shop currency.
   */
  private MoneyV2 shopMoney;

  public MoneyBag() {
  }

  /**
   * Amount in presentment currency.
   */
  public MoneyV2 getPresentmentMoney() {
    return presentmentMoney;
  }

  public void setPresentmentMoney(MoneyV2 presentmentMoney) {
    this.presentmentMoney = presentmentMoney;
  }

  /**
   * Amount in shop currency.
   */
  public MoneyV2 getShopMoney() {
    return shopMoney;
  }

  public void setShopMoney(MoneyV2 shopMoney) {
    this.shopMoney = shopMoney;
  }

  @Override
  public String toString() {
    return "MoneyBag{presentmentMoney='" + presentmentMoney + "', shopMoney='" + shopMoney + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    MoneyBag that = (MoneyBag) o;
    return Objects.equals(presentmentMoney, that.presentmentMoney) &&
        Objects.equals(shopMoney, that.shopMoney);
  }

  @Override
  public int hashCode() {
    return Objects.hash(presentmentMoney, shopMoney);
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public static class Builder {
    /**
     * Amount in presentment currency.
     */
    private MoneyV2 presentmentMoney;

    /**
     * Amount in shop currency.
     */
    private MoneyV2 shopMoney;

    public MoneyBag build() {
      MoneyBag result = new MoneyBag();
      result.presentmentMoney = this.presentmentMoney;
      result.shopMoney = this.shopMoney;
      return result;
    }

    /**
     * Amount in presentment currency.
     */
    public Builder presentmentMoney(MoneyV2 presentmentMoney) {
      this.presentmentMoney = presentmentMoney;
      return this;
    }

    /**
     * Amount in shop currency.
     */
    public Builder shopMoney(MoneyV2 shopMoney) {
      this.shopMoney = shopMoney;
      return this;
    }
  }
}
