package com.shopify.admin.types;

import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.Objects;

/**
 * A shipping rate is an additional cost added to the cost of the products that were ordered.
 */
public class ShippingRate {
  /**
   * Human-readable unique identifier for this shipping rate.
   */
  private String handle;

  /**
   * The cost associated with the shipping rate.
   */
  private MoneyV2 price;

  /**
   * The name of the shipping rate.
   */
  private String title;

  public ShippingRate() {
  }

  /**
   * Human-readable unique identifier for this shipping rate.
   */
  public String getHandle() {
    return handle;
  }

  public void setHandle(String handle) {
    this.handle = handle;
  }

  /**
   * The cost associated with the shipping rate.
   */
  public MoneyV2 getPrice() {
    return price;
  }

  public void setPrice(MoneyV2 price) {
    this.price = price;
  }

  /**
   * The name of the shipping rate.
   */
  public String getTitle() {
    return title;
  }

  public void setTitle(String title) {
    this.title = title;
  }

  @Override
  public String toString() {
    return "ShippingRate{handle='" + handle + "', price='" + price + "', title='" + title + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    ShippingRate that = (ShippingRate) o;
    return Objects.equals(handle, that.handle) &&
        Objects.equals(price, that.price) &&
        Objects.equals(title, that.title);
  }

  @Override
  public int hashCode() {
    return Objects.hash(handle, price, title);
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public static class Builder {
    /**
     * Human-readable unique identifier for this shipping rate.
     */
    private String handle;

    /**
     * The cost associated with the shipping rate.
     */
    private MoneyV2 price;

    /**
     * The name of the shipping rate.
     */
    private String title;

    public ShippingRate build() {
      ShippingRate result = new ShippingRate();
      result.handle = this.handle;
      result.price = this.price;
      result.title = this.title;
      return result;
    }

    /**
     * Human-readable unique identifier for this shipping rate.
     */
    public Builder handle(String handle) {
      this.handle = handle;
      return this;
    }

    /**
     * The cost associated with the shipping rate.
     */
    public Builder price(MoneyV2 price) {
      this.price = price;
      return this;
    }

    /**
     * The name of the shipping rate.
     */
    public Builder title(String title) {
      this.title = title;
      return this;
    }
  }
}
