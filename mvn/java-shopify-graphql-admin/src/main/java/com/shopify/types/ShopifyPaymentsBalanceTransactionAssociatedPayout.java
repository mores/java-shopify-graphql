package com.shopify.types;

import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.Objects;


public class ShopifyPaymentsBalanceTransactionAssociatedPayout {
  
  private String id;

  
  private ShopifyPaymentsBalanceTransactionPayoutStatus status;

  public ShopifyPaymentsBalanceTransactionAssociatedPayout() {
  }

  
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  
  public ShopifyPaymentsBalanceTransactionPayoutStatus getStatus() {
    return status;
  }

  public void setStatus(ShopifyPaymentsBalanceTransactionPayoutStatus status) {
    this.status = status;
  }

  @Override
  public String toString() {
    return "ShopifyPaymentsBalanceTransactionAssociatedPayout{id='" + id + "', status='" + status + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    ShopifyPaymentsBalanceTransactionAssociatedPayout that = (ShopifyPaymentsBalanceTransactionAssociatedPayout) o;
    return Objects.equals(id, that.id) &&
        Objects.equals(status, that.status);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, status);
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public static class Builder {
    
    private String id;

    
    private ShopifyPaymentsBalanceTransactionPayoutStatus status;

    public ShopifyPaymentsBalanceTransactionAssociatedPayout build() {
      ShopifyPaymentsBalanceTransactionAssociatedPayout result = new ShopifyPaymentsBalanceTransactionAssociatedPayout();
      result.id = this.id;
      result.status = this.status;
      return result;
    }

    
    public Builder id(String id) {
      this.id = id;
      return this;
    }

    
    public Builder status(ShopifyPaymentsBalanceTransactionPayoutStatus status) {
      this.status = status;
      return this;
    }
  }
}
