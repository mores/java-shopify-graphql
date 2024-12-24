package com.shopify.types;

import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.List;
import java.util.Objects;


public class PriceListFixedPricesByProductUpdatePayload {
  
  private PriceList priceList;

  
  private List<Product> pricesToAddProducts;

  
  private List<Product> pricesToDeleteProducts;

  
  private List<PriceListFixedPricesByProductBulkUpdateUserError> userErrors;

  public PriceListFixedPricesByProductUpdatePayload() {
  }

  
  public PriceList getPriceList() {
    return priceList;
  }

  public void setPriceList(PriceList priceList) {
    this.priceList = priceList;
  }

  
  public List<Product> getPricesToAddProducts() {
    return pricesToAddProducts;
  }

  public void setPricesToAddProducts(List<Product> pricesToAddProducts) {
    this.pricesToAddProducts = pricesToAddProducts;
  }

  
  public List<Product> getPricesToDeleteProducts() {
    return pricesToDeleteProducts;
  }

  public void setPricesToDeleteProducts(List<Product> pricesToDeleteProducts) {
    this.pricesToDeleteProducts = pricesToDeleteProducts;
  }

  
  public List<PriceListFixedPricesByProductBulkUpdateUserError> getUserErrors() {
    return userErrors;
  }

  public void setUserErrors(List<PriceListFixedPricesByProductBulkUpdateUserError> userErrors) {
    this.userErrors = userErrors;
  }

  @Override
  public String toString() {
    return "PriceListFixedPricesByProductUpdatePayload{priceList='" + priceList + "', pricesToAddProducts='" + pricesToAddProducts + "', pricesToDeleteProducts='" + pricesToDeleteProducts + "', userErrors='" + userErrors + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    PriceListFixedPricesByProductUpdatePayload that = (PriceListFixedPricesByProductUpdatePayload) o;
    return Objects.equals(priceList, that.priceList) &&
        Objects.equals(pricesToAddProducts, that.pricesToAddProducts) &&
        Objects.equals(pricesToDeleteProducts, that.pricesToDeleteProducts) &&
        Objects.equals(userErrors, that.userErrors);
  }

  @Override
  public int hashCode() {
    return Objects.hash(priceList, pricesToAddProducts, pricesToDeleteProducts, userErrors);
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public static class Builder {
    
    private PriceList priceList;

    
    private List<Product> pricesToAddProducts;

    
    private List<Product> pricesToDeleteProducts;

    
    private List<PriceListFixedPricesByProductBulkUpdateUserError> userErrors;

    public PriceListFixedPricesByProductUpdatePayload build() {
      PriceListFixedPricesByProductUpdatePayload result = new PriceListFixedPricesByProductUpdatePayload();
      result.priceList = this.priceList;
      result.pricesToAddProducts = this.pricesToAddProducts;
      result.pricesToDeleteProducts = this.pricesToDeleteProducts;
      result.userErrors = this.userErrors;
      return result;
    }

    
    public Builder priceList(PriceList priceList) {
      this.priceList = priceList;
      return this;
    }

    
    public Builder pricesToAddProducts(List<Product> pricesToAddProducts) {
      this.pricesToAddProducts = pricesToAddProducts;
      return this;
    }

    
    public Builder pricesToDeleteProducts(List<Product> pricesToDeleteProducts) {
      this.pricesToDeleteProducts = pricesToDeleteProducts;
      return this;
    }

    
    public Builder userErrors(List<PriceListFixedPricesByProductBulkUpdateUserError> userErrors) {
      this.userErrors = userErrors;
      return this;
    }
  }
}
