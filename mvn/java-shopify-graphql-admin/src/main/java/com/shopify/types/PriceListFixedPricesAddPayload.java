package com.shopify.types;

import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.List;
import java.util.Objects;


public class PriceListFixedPricesAddPayload {
  
  private List<PriceListPrice> prices;

  
  private List<PriceListPriceUserError> userErrors;

  public PriceListFixedPricesAddPayload() {
  }

  
  public List<PriceListPrice> getPrices() {
    return prices;
  }

  public void setPrices(List<PriceListPrice> prices) {
    this.prices = prices;
  }

  
  public List<PriceListPriceUserError> getUserErrors() {
    return userErrors;
  }

  public void setUserErrors(List<PriceListPriceUserError> userErrors) {
    this.userErrors = userErrors;
  }

  @Override
  public String toString() {
    return "PriceListFixedPricesAddPayload{prices='" + prices + "', userErrors='" + userErrors + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    PriceListFixedPricesAddPayload that = (PriceListFixedPricesAddPayload) o;
    return Objects.equals(prices, that.prices) &&
        Objects.equals(userErrors, that.userErrors);
  }

  @Override
  public int hashCode() {
    return Objects.hash(prices, userErrors);
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public static class Builder {
    
    private List<PriceListPrice> prices;

    
    private List<PriceListPriceUserError> userErrors;

    public PriceListFixedPricesAddPayload build() {
      PriceListFixedPricesAddPayload result = new PriceListFixedPricesAddPayload();
      result.prices = this.prices;
      result.userErrors = this.userErrors;
      return result;
    }

    
    public Builder prices(List<PriceListPrice> prices) {
      this.prices = prices;
      return this;
    }

    
    public Builder userErrors(List<PriceListPriceUserError> userErrors) {
      this.userErrors = userErrors;
      return this;
    }
  }
}
