package com.shopify.types;

import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.List;
import java.util.Objects;


public class PriceListCreatePayload {
  
  private PriceList priceList;

  
  private List<PriceListUserError> userErrors;

  public PriceListCreatePayload() {
  }

  
  public PriceList getPriceList() {
    return priceList;
  }

  public void setPriceList(PriceList priceList) {
    this.priceList = priceList;
  }

  
  public List<PriceListUserError> getUserErrors() {
    return userErrors;
  }

  public void setUserErrors(List<PriceListUserError> userErrors) {
    this.userErrors = userErrors;
  }

  @Override
  public String toString() {
    return "PriceListCreatePayload{priceList='" + priceList + "', userErrors='" + userErrors + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    PriceListCreatePayload that = (PriceListCreatePayload) o;
    return Objects.equals(priceList, that.priceList) &&
        Objects.equals(userErrors, that.userErrors);
  }

  @Override
  public int hashCode() {
    return Objects.hash(priceList, userErrors);
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public static class Builder {
    
    private PriceList priceList;

    
    private List<PriceListUserError> userErrors;

    public PriceListCreatePayload build() {
      PriceListCreatePayload result = new PriceListCreatePayload();
      result.priceList = this.priceList;
      result.userErrors = this.userErrors;
      return result;
    }

    
    public Builder priceList(PriceList priceList) {
      this.priceList = priceList;
      return this;
    }

    
    public Builder userErrors(List<PriceListUserError> userErrors) {
      this.userErrors = userErrors;
      return this;
    }
  }
}
