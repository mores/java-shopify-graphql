package com.shopify.types;

import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.Objects;


public class ShopifyPaymentsAdjustmentOrder {
  
  private MoneyV2 amount;

  
  private String link;

  
  private String name;

  
  private String orderTransactionId;

  public ShopifyPaymentsAdjustmentOrder() {
  }

  
  public MoneyV2 getAmount() {
    return amount;
  }

  public void setAmount(MoneyV2 amount) {
    this.amount = amount;
  }

  
  public String getLink() {
    return link;
  }

  public void setLink(String link) {
    this.link = link;
  }

  
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  
  public String getOrderTransactionId() {
    return orderTransactionId;
  }

  public void setOrderTransactionId(String orderTransactionId) {
    this.orderTransactionId = orderTransactionId;
  }

  @Override
  public String toString() {
    return "ShopifyPaymentsAdjustmentOrder{amount='" + amount + "', link='" + link + "', name='" + name + "', orderTransactionId='" + orderTransactionId + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    ShopifyPaymentsAdjustmentOrder that = (ShopifyPaymentsAdjustmentOrder) o;
    return Objects.equals(amount, that.amount) &&
        Objects.equals(link, that.link) &&
        Objects.equals(name, that.name) &&
        Objects.equals(orderTransactionId, that.orderTransactionId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(amount, link, name, orderTransactionId);
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public static class Builder {
    
    private MoneyV2 amount;

    
    private String link;

    
    private String name;

    
    private String orderTransactionId;

    public ShopifyPaymentsAdjustmentOrder build() {
      ShopifyPaymentsAdjustmentOrder result = new ShopifyPaymentsAdjustmentOrder();
      result.amount = this.amount;
      result.link = this.link;
      result.name = this.name;
      result.orderTransactionId = this.orderTransactionId;
      return result;
    }

    
    public Builder amount(MoneyV2 amount) {
      this.amount = amount;
      return this;
    }

    
    public Builder link(String link) {
      this.link = link;
      return this;
    }

    
    public Builder name(String name) {
      this.name = name;
      return this;
    }

    
    public Builder orderTransactionId(String orderTransactionId) {
      this.orderTransactionId = orderTransactionId;
      return this;
    }
  }
}
