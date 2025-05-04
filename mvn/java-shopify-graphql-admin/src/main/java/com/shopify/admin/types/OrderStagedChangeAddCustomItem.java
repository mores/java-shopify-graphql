package com.shopify.admin.types;

import com.fasterxml.jackson.annotation.JsonTypeInfo;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.Objects;

/**
 * A change to the order representing the addition of a
 * custom line item. For example, you might want to add gift wrapping service
 * as a custom line item.
 */
@JsonTypeInfo(
    use = JsonTypeInfo.Id.NONE
)
public class OrderStagedChangeAddCustomItem implements OrderStagedChange {
  /**
   * The price of an individual item without any discounts applied. This value can't be negative.
   */
  private MoneyV2 originalUnitPrice;

  /**
   * The quantity of the custom item to add to the order. This value must be greater than zero.
   */
  private int quantity;

  /**
   * The title of the custom item.
   */
  private String title;

  public OrderStagedChangeAddCustomItem() {
  }

  /**
   * The price of an individual item without any discounts applied. This value can't be negative.
   */
  public MoneyV2 getOriginalUnitPrice() {
    return originalUnitPrice;
  }

  public void setOriginalUnitPrice(MoneyV2 originalUnitPrice) {
    this.originalUnitPrice = originalUnitPrice;
  }

  /**
   * The quantity of the custom item to add to the order. This value must be greater than zero.
   */
  public int getQuantity() {
    return quantity;
  }

  public void setQuantity(int quantity) {
    this.quantity = quantity;
  }

  /**
   * The title of the custom item.
   */
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
    /**
     * The price of an individual item without any discounts applied. This value can't be negative.
     */
    private MoneyV2 originalUnitPrice;

    /**
     * The quantity of the custom item to add to the order. This value must be greater than zero.
     */
    private int quantity;

    /**
     * The title of the custom item.
     */
    private String title;

    public OrderStagedChangeAddCustomItem build() {
      OrderStagedChangeAddCustomItem result = new OrderStagedChangeAddCustomItem();
      result.originalUnitPrice = this.originalUnitPrice;
      result.quantity = this.quantity;
      result.title = this.title;
      return result;
    }

    /**
     * The price of an individual item without any discounts applied. This value can't be negative.
     */
    public Builder originalUnitPrice(MoneyV2 originalUnitPrice) {
      this.originalUnitPrice = originalUnitPrice;
      return this;
    }

    /**
     * The quantity of the custom item to add to the order. This value must be greater than zero.
     */
    public Builder quantity(int quantity) {
      this.quantity = quantity;
      return this;
    }

    /**
     * The title of the custom item.
     */
    public Builder title(String title) {
      this.title = title;
      return this;
    }
  }
}
