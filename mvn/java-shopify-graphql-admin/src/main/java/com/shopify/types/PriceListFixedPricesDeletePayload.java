package com.shopify.types;

import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.List;
import java.util.Objects;


public class PriceListFixedPricesDeletePayload {
  
  private List<String> deletedFixedPriceVariantIds;

  
  private List<PriceListPriceUserError> userErrors;

  public PriceListFixedPricesDeletePayload() {
  }

  
  public List<String> getDeletedFixedPriceVariantIds() {
    return deletedFixedPriceVariantIds;
  }

  public void setDeletedFixedPriceVariantIds(List<String> deletedFixedPriceVariantIds) {
    this.deletedFixedPriceVariantIds = deletedFixedPriceVariantIds;
  }

  
  public List<PriceListPriceUserError> getUserErrors() {
    return userErrors;
  }

  public void setUserErrors(List<PriceListPriceUserError> userErrors) {
    this.userErrors = userErrors;
  }

  @Override
  public String toString() {
    return "PriceListFixedPricesDeletePayload{deletedFixedPriceVariantIds='" + deletedFixedPriceVariantIds + "', userErrors='" + userErrors + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    PriceListFixedPricesDeletePayload that = (PriceListFixedPricesDeletePayload) o;
    return Objects.equals(deletedFixedPriceVariantIds, that.deletedFixedPriceVariantIds) &&
        Objects.equals(userErrors, that.userErrors);
  }

  @Override
  public int hashCode() {
    return Objects.hash(deletedFixedPriceVariantIds, userErrors);
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public static class Builder {
    
    private List<String> deletedFixedPriceVariantIds;

    
    private List<PriceListPriceUserError> userErrors;

    public PriceListFixedPricesDeletePayload build() {
      PriceListFixedPricesDeletePayload result = new PriceListFixedPricesDeletePayload();
      result.deletedFixedPriceVariantIds = this.deletedFixedPriceVariantIds;
      result.userErrors = this.userErrors;
      return result;
    }

    
    public Builder deletedFixedPriceVariantIds(List<String> deletedFixedPriceVariantIds) {
      this.deletedFixedPriceVariantIds = deletedFixedPriceVariantIds;
      return this;
    }

    
    public Builder userErrors(List<PriceListPriceUserError> userErrors) {
      this.userErrors = userErrors;
      return this;
    }
  }
}
