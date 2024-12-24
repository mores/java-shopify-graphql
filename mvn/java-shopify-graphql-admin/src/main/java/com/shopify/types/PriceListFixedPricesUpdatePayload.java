package com.shopify.types;

import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.List;
import java.util.Objects;


public class PriceListFixedPricesUpdatePayload {
  
  private List<String> deletedFixedPriceVariantIds;

  
  private PriceList priceList;

  
  private List<PriceListPrice> pricesAdded;

  
  private List<PriceListPriceUserError> userErrors;

  public PriceListFixedPricesUpdatePayload() {
  }

  
  public List<String> getDeletedFixedPriceVariantIds() {
    return deletedFixedPriceVariantIds;
  }

  public void setDeletedFixedPriceVariantIds(List<String> deletedFixedPriceVariantIds) {
    this.deletedFixedPriceVariantIds = deletedFixedPriceVariantIds;
  }

  
  public PriceList getPriceList() {
    return priceList;
  }

  public void setPriceList(PriceList priceList) {
    this.priceList = priceList;
  }

  
  public List<PriceListPrice> getPricesAdded() {
    return pricesAdded;
  }

  public void setPricesAdded(List<PriceListPrice> pricesAdded) {
    this.pricesAdded = pricesAdded;
  }

  
  public List<PriceListPriceUserError> getUserErrors() {
    return userErrors;
  }

  public void setUserErrors(List<PriceListPriceUserError> userErrors) {
    this.userErrors = userErrors;
  }

  @Override
  public String toString() {
    return "PriceListFixedPricesUpdatePayload{deletedFixedPriceVariantIds='" + deletedFixedPriceVariantIds + "', priceList='" + priceList + "', pricesAdded='" + pricesAdded + "', userErrors='" + userErrors + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    PriceListFixedPricesUpdatePayload that = (PriceListFixedPricesUpdatePayload) o;
    return Objects.equals(deletedFixedPriceVariantIds, that.deletedFixedPriceVariantIds) &&
        Objects.equals(priceList, that.priceList) &&
        Objects.equals(pricesAdded, that.pricesAdded) &&
        Objects.equals(userErrors, that.userErrors);
  }

  @Override
  public int hashCode() {
    return Objects.hash(deletedFixedPriceVariantIds, priceList, pricesAdded, userErrors);
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public static class Builder {
    
    private List<String> deletedFixedPriceVariantIds;

    
    private PriceList priceList;

    
    private List<PriceListPrice> pricesAdded;

    
    private List<PriceListPriceUserError> userErrors;

    public PriceListFixedPricesUpdatePayload build() {
      PriceListFixedPricesUpdatePayload result = new PriceListFixedPricesUpdatePayload();
      result.deletedFixedPriceVariantIds = this.deletedFixedPriceVariantIds;
      result.priceList = this.priceList;
      result.pricesAdded = this.pricesAdded;
      result.userErrors = this.userErrors;
      return result;
    }

    
    public Builder deletedFixedPriceVariantIds(List<String> deletedFixedPriceVariantIds) {
      this.deletedFixedPriceVariantIds = deletedFixedPriceVariantIds;
      return this;
    }

    
    public Builder priceList(PriceList priceList) {
      this.priceList = priceList;
      return this;
    }

    
    public Builder pricesAdded(List<PriceListPrice> pricesAdded) {
      this.pricesAdded = pricesAdded;
      return this;
    }

    
    public Builder userErrors(List<PriceListPriceUserError> userErrors) {
      this.userErrors = userErrors;
      return this;
    }
  }
}
