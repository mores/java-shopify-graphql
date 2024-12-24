package com.shopify.types;

import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.Objects;


public class ShopifyPaymentsDisputeReasonDetails {
  
  private String networkReasonCode;

  
  private ShopifyPaymentsDisputeReason reason;

  public ShopifyPaymentsDisputeReasonDetails() {
  }

  
  public String getNetworkReasonCode() {
    return networkReasonCode;
  }

  public void setNetworkReasonCode(String networkReasonCode) {
    this.networkReasonCode = networkReasonCode;
  }

  
  public ShopifyPaymentsDisputeReason getReason() {
    return reason;
  }

  public void setReason(ShopifyPaymentsDisputeReason reason) {
    this.reason = reason;
  }

  @Override
  public String toString() {
    return "ShopifyPaymentsDisputeReasonDetails{networkReasonCode='" + networkReasonCode + "', reason='" + reason + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    ShopifyPaymentsDisputeReasonDetails that = (ShopifyPaymentsDisputeReasonDetails) o;
    return Objects.equals(networkReasonCode, that.networkReasonCode) &&
        Objects.equals(reason, that.reason);
  }

  @Override
  public int hashCode() {
    return Objects.hash(networkReasonCode, reason);
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public static class Builder {
    
    private String networkReasonCode;

    
    private ShopifyPaymentsDisputeReason reason;

    public ShopifyPaymentsDisputeReasonDetails build() {
      ShopifyPaymentsDisputeReasonDetails result = new ShopifyPaymentsDisputeReasonDetails();
      result.networkReasonCode = this.networkReasonCode;
      result.reason = this.reason;
      return result;
    }

    
    public Builder networkReasonCode(String networkReasonCode) {
      this.networkReasonCode = networkReasonCode;
      return this;
    }

    
    public Builder reason(ShopifyPaymentsDisputeReason reason) {
      this.reason = reason;
      return this;
    }
  }
}
