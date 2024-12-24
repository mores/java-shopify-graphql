package com.shopify.types;

import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.Objects;


public class MoneyBag {
  
  private MoneyV2 presentmentMoney;

  
  private MoneyV2 shopMoney;

  public MoneyBag() {
  }

  
  public MoneyV2 getPresentmentMoney() {
    return presentmentMoney;
  }

  public void setPresentmentMoney(MoneyV2 presentmentMoney) {
    this.presentmentMoney = presentmentMoney;
  }

  
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
    
    private MoneyV2 presentmentMoney;

    
    private MoneyV2 shopMoney;

    public MoneyBag build() {
      MoneyBag result = new MoneyBag();
      result.presentmentMoney = this.presentmentMoney;
      result.shopMoney = this.shopMoney;
      return result;
    }

    
    public Builder presentmentMoney(MoneyV2 presentmentMoney) {
      this.presentmentMoney = presentmentMoney;
      return this;
    }

    
    public Builder shopMoney(MoneyV2 shopMoney) {
      this.shopMoney = shopMoney;
      return this;
    }
  }
}
