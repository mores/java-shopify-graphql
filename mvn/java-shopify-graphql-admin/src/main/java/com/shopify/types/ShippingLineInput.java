package com.shopify.types;

import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.Objects;

/**
 * The input fields for specifying the shipping details for the draft order.
 *
 * > Note:
 * > A custom shipping line includes a title and price with `shippingRateHandle`
 * set to `nil`. A shipping line with a carrier-provided shipping rate (currently
 * set via the Shopify admin) includes the shipping rate handle.
 */
public class ShippingLineInput {
  /**
   * Price of the shipping rate with currency. If provided, `price` will be ignored.
   */
  private MoneyInput priceWithCurrency;

  /**
   * A unique identifier for the shipping rate.
   */
  private String shippingRateHandle;

  /**
   * Title of the shipping rate.
   */
  private String title;

  public ShippingLineInput() {
  }

  /**
   * Price of the shipping rate with currency. If provided, `price` will be ignored.
   */
  public MoneyInput getPriceWithCurrency() {
    return priceWithCurrency;
  }

  public void setPriceWithCurrency(MoneyInput priceWithCurrency) {
    this.priceWithCurrency = priceWithCurrency;
  }

  /**
   * A unique identifier for the shipping rate.
   */
  public String getShippingRateHandle() {
    return shippingRateHandle;
  }

  public void setShippingRateHandle(String shippingRateHandle) {
    this.shippingRateHandle = shippingRateHandle;
  }

  /**
   * Title of the shipping rate.
   */
  public String getTitle() {
    return title;
  }

  public void setTitle(String title) {
    this.title = title;
  }

  @Override
  public String toString() {
    return "ShippingLineInput{priceWithCurrency='" + priceWithCurrency + "', shippingRateHandle='" + shippingRateHandle + "', title='" + title + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    ShippingLineInput that = (ShippingLineInput) o;
    return Objects.equals(priceWithCurrency, that.priceWithCurrency) &&
        Objects.equals(shippingRateHandle, that.shippingRateHandle) &&
        Objects.equals(title, that.title);
  }

  @Override
  public int hashCode() {
    return Objects.hash(priceWithCurrency, shippingRateHandle, title);
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public static class Builder {
    /**
     * Price of the shipping rate with currency. If provided, `price` will be ignored.
     */
    private MoneyInput priceWithCurrency;

    /**
     * A unique identifier for the shipping rate.
     */
    private String shippingRateHandle;

    /**
     * Title of the shipping rate.
     */
    private String title;

    public ShippingLineInput build() {
      ShippingLineInput result = new ShippingLineInput();
      result.priceWithCurrency = this.priceWithCurrency;
      result.shippingRateHandle = this.shippingRateHandle;
      result.title = this.title;
      return result;
    }

    /**
     * Price of the shipping rate with currency. If provided, `price` will be ignored.
     */
    public Builder priceWithCurrency(MoneyInput priceWithCurrency) {
      this.priceWithCurrency = priceWithCurrency;
      return this;
    }

    /**
     * A unique identifier for the shipping rate.
     */
    public Builder shippingRateHandle(String shippingRateHandle) {
      this.shippingRateHandle = shippingRateHandle;
      return this;
    }

    /**
     * Title of the shipping rate.
     */
    public Builder title(String title) {
      this.title = title;
      return this;
    }
  }
}
