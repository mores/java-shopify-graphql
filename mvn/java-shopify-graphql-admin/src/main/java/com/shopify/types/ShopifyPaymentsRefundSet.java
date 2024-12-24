package com.shopify.types;

import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.Objects;


public class ShopifyPaymentsRefundSet {
  
  private String acquirerReferenceNumber;

  public ShopifyPaymentsRefundSet() {
  }

  
  public String getAcquirerReferenceNumber() {
    return acquirerReferenceNumber;
  }

  public void setAcquirerReferenceNumber(String acquirerReferenceNumber) {
    this.acquirerReferenceNumber = acquirerReferenceNumber;
  }

  @Override
  public String toString() {
    return "ShopifyPaymentsRefundSet{acquirerReferenceNumber='" + acquirerReferenceNumber + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    ShopifyPaymentsRefundSet that = (ShopifyPaymentsRefundSet) o;
    return Objects.equals(acquirerReferenceNumber, that.acquirerReferenceNumber);
  }

  @Override
  public int hashCode() {
    return Objects.hash(acquirerReferenceNumber);
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public static class Builder {
    
    private String acquirerReferenceNumber;

    public ShopifyPaymentsRefundSet build() {
      ShopifyPaymentsRefundSet result = new ShopifyPaymentsRefundSet();
      result.acquirerReferenceNumber = this.acquirerReferenceNumber;
      return result;
    }

    
    public Builder acquirerReferenceNumber(String acquirerReferenceNumber) {
      this.acquirerReferenceNumber = acquirerReferenceNumber;
      return this;
    }
  }
}
