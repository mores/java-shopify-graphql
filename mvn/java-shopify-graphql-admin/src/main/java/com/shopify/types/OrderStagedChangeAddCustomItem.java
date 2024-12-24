package com.shopify.types;

import com.fasterxml.jackson.annotation.JsonTypeInfo;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.Objects;


@JsonTypeInfo(
    use = JsonTypeInfo.Id.NONE
)
public class OrderStagedChangeAddCustomItem implements OrderStagedChange {
  
  private MoneyV2 originalUnitPrice;

  
  private int quantity;

  
  private String title;

  public OrderStagedChangeAddCustomItem() {
  }

  
  public MoneyV2 getOriginalUnitPrice() {
    return originalUnitPrice;
  }

  public void setOriginalUnitPrice(MoneyV2 originalUnitPrice) {
    this.originalUnitPrice = originalUnitPrice;
  }

  
  public int getQuantity() {
    return quantity;
  }

  public void setQuantity(int quantity) {
    this.quantity = quantity;
  }

  
  public String getTitle() {
    return title;
  }

  public void setTitle(String title) {
    this.title = title;
  }

  @Override
  public String toString() {
    return "OrderStagedChangeAddCustomItem{originalUnitPrice='" + originalUnitPrice + "', quantity='" + quantity + "', title='" + title + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    OrderStagedChangeAddCustomItem that = (OrderStagedChangeAddCustomItem) o;
    return Objects.equals(originalUnitPrice, that.originalUnitPrice) &&
        quantity == that.quantity &&
        Objects.equals(title, that.title);
  }

  @Override
  public int hashCode() {
    return Objects.hash(originalUnitPrice, quantity, title);
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public static class Builder {
    
    private MoneyV2 originalUnitPrice;

    
    private int quantity;

    
    private String title;

    public OrderStagedChangeAddCustomItem build() {
      OrderStagedChangeAddCustomItem result = new OrderStagedChangeAddCustomItem();
      result.originalUnitPrice = this.originalUnitPrice;
      result.quantity = this.quantity;
      result.title = this.title;
      return result;
    }

    
    public Builder originalUnitPrice(MoneyV2 originalUnitPrice) {
      this.originalUnitPrice = originalUnitPrice;
      return this;
    }

    
    public Builder quantity(int quantity) {
      this.quantity = quantity;
      return this;
    }

    
    public Builder title(String title) {
      this.title = title;
      return this;
    }
  }
}
