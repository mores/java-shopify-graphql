package com.shopify.types;

import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.Objects;


public class ShippingLineInput {
  
  private MoneyInput priceWithCurrency;

  
  private String shippingRateHandle;

  
  private String title;

  public ShippingLineInput() {
  }

  
  public MoneyInput getPriceWithCurrency() {
    return priceWithCurrency;
  }

  public void setPriceWithCurrency(MoneyInput priceWithCurrency) {
    this.priceWithCurrency = priceWithCurrency;
  }

  
  public String getShippingRateHandle() {
    return shippingRateHandle;
  }

  public void setShippingRateHandle(String shippingRateHandle) {
    this.shippingRateHandle = shippingRateHandle;
  }

  
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
    
    private MoneyInput priceWithCurrency;

    
    private String shippingRateHandle;

    
    private String title;

    public ShippingLineInput build() {
      ShippingLineInput result = new ShippingLineInput();
      result.priceWithCurrency = this.priceWithCurrency;
      result.shippingRateHandle = this.shippingRateHandle;
      result.title = this.title;
      return result;
    }

    
    public Builder priceWithCurrency(MoneyInput priceWithCurrency) {
      this.priceWithCurrency = priceWithCurrency;
      return this;
    }

    
    public Builder shippingRateHandle(String shippingRateHandle) {
      this.shippingRateHandle = shippingRateHandle;
      return this;
    }

    
    public Builder title(String title) {
      this.title = title;
      return this;
    }
  }
}
