package com.shopify.types;

import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.Objects;


public class OrderEditAddShippingLineInput {
  
  private MoneyInput price;

  
  private String title;

  public OrderEditAddShippingLineInput() {
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
    return "OrderEditAddShippingLineInput{price='" + price + "', title='" + title + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    OrderEditAddShippingLineInput that = (OrderEditAddShippingLineInput) o;
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

    public OrderEditAddShippingLineInput build() {
      OrderEditAddShippingLineInput result = new OrderEditAddShippingLineInput();
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
