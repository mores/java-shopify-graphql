package com.shopify.types;

import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.Objects;


public class OrderEditUpdateShippingLineInput {
  
  private MoneyInput price;

  
  private String title;

  public OrderEditUpdateShippingLineInput() {
  }

  
  public MoneyInput getPrice() {
    return price;
  }

  public void setPrice(MoneyInput price) {
    this.price = price;
  }

  
  public String getTitle() {
    return title;
  }

  public void setTitle(String title) {
    this.title = title;
  }

  @Override
  public String toString() {
    return "OrderEditUpdateShippingLineInput{price='" + price + "', title='" + title + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    OrderEditUpdateShippingLineInput that = (OrderEditUpdateShippingLineInput) o;
    return Objects.equals(price, that.price) &&
        Objects.equals(title, that.title);
  }

  @Override
  public int hashCode() {
    return Objects.hash(price, title);
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public static class Builder {
    
    private MoneyInput price;

    
    private String title;

    public OrderEditUpdateShippingLineInput build() {
      OrderEditUpdateShippingLineInput result = new OrderEditUpdateShippingLineInput();
      result.price = this.price;
      result.title = this.title;
      return result;
    }

    
    public Builder price(MoneyInput price) {
      this.price = price;
      return this;
    }

    
    public Builder title(String title) {
      this.title = title;
      return this;
    }
  }
}
