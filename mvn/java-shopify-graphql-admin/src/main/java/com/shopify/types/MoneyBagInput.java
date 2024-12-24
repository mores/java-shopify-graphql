package com.shopify.types;

import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.Objects;


public class MoneyBagInput {
  
  private MoneyInput shopMoney;

  
  private MoneyInput presentmentMoney;

  public MoneyBagInput() {
  }

  
  public MoneyInput getShopMoney() {
    return shopMoney;
  }

  public void setShopMoney(MoneyInput shopMoney) {
    this.shopMoney = shopMoney;
  }

  
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
    
    private MoneyInput shopMoney;

    
    private MoneyInput presentmentMoney;

    public MoneyBagInput build() {
      MoneyBagInput result = new MoneyBagInput();
      result.shopMoney = this.shopMoney;
      result.presentmentMoney = this.presentmentMoney;
      return result;
    }

    
    public Builder shopMoney(MoneyInput shopMoney) {
      this.shopMoney = shopMoney;
      return this;
    }

    
    public Builder presentmentMoney(MoneyInput presentmentMoney) {
      this.presentmentMoney = presentmentMoney;
      return this;
    }
  }
}
