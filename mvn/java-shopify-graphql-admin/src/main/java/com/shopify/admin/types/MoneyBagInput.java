package com.shopify.admin.types;

import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.Objects;

/**
 * An input collection of monetary values in their respective currencies.
 * Represents an amount in the shop's currency and the amount as converted to the
 * customer's currency of choice (the presentment currency).
 */
public class MoneyBagInput {
  /**
   * Amount in shop currency.
   */
  private MoneyInput shopMoney;

  /**
   * Amount in presentment currency. If this isn't given then we assume that the
   * presentment currency is the same as the shop's currency.
   */
  private MoneyInput presentmentMoney;

  public MoneyBagInput() {
  }

  /**
   * Amount in shop currency.
   */
  public MoneyInput getShopMoney() {
    return shopMoney;
  }

  public void setShopMoney(MoneyInput shopMoney) {
    this.shopMoney = shopMoney;
  }

  /**
   * Amount in presentment currency. If this isn't given then we assume that the
   * presentment currency is the same as the shop's currency.
   */
  public MoneyInput getPresentmentMoney() {
    return presentmentMoney;
  }

  public void setPresentmentMoney(MoneyInput presentmentMoney) {
    this.presentmentMoney = presentmentMoney;
  }

  @Override
  public String toString() {
    return "MoneyBagInput{shopMoney='" + shopMoney + "', presentmentMoney='" + presentmentMoney + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    MoneyBagInput that = (MoneyBagInput) o;
    return Objects.equals(shopMoney, that.shopMoney) &&
        Objects.equals(presentmentMoney, that.presentmentMoney);
  }

  @Override
  public int hashCode() {
    return Objects.hash(shopMoney, presentmentMoney);
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public static class Builder {
    /**
     * Amount in shop currency.
     */
    private MoneyInput shopMoney;

    /**
     * Amount in presentment currency. If this isn't given then we assume that the
     * presentment currency is the same as the shop's currency.
     */
    private MoneyInput presentmentMoney;

    public MoneyBagInput build() {
      MoneyBagInput result = new MoneyBagInput();
      result.shopMoney = this.shopMoney;
      result.presentmentMoney = this.presentmentMoney;
      return result;
    }

    /**
     * Amount in shop currency.
     */
    public Builder shopMoney(MoneyInput shopMoney) {
      this.shopMoney = shopMoney;
      return this;
    }

    /**
     * Amount in presentment currency. If this isn't given then we assume that the
     * presentment currency is the same as the shop's currency.
     */
    public Builder presentmentMoney(MoneyInput presentmentMoney) {
      this.presentmentMoney = presentmentMoney;
      return this;
    }
  }
}
