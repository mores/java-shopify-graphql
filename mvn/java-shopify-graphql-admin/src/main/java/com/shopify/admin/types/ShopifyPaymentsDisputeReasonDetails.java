package com.shopify.admin.types;

import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.Objects;

/**
 * Details regarding a dispute reason.
 */
public class ShopifyPaymentsDisputeReasonDetails {
  /**
   * The raw code provided by the payment network.
   */
  private String networkReasonCode;

  /**
   * The reason for the dispute provided by the cardholder's banks.
   */
  private ShopifyPaymentsDisputeReason reason;

  public ShopifyPaymentsDisputeReasonDetails() {
  }

  /**
   * The raw code provided by the payment network.
   */
  public String getNetworkReasonCode() {
    return networkReasonCode;
  }

  public void setNetworkReasonCode(String networkReasonCode) {
    this.networkReasonCode = networkReasonCode;
  }

  /**
   * The reason for the dispute provided by the cardholder's banks.
   */
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
    /**
     * The raw code provided by the payment network.
     */
    private String networkReasonCode;

    /**
     * The reason for the dispute provided by the cardholder's banks.
     */
    private ShopifyPaymentsDisputeReason reason;

    public ShopifyPaymentsDisputeReasonDetails build() {
      ShopifyPaymentsDisputeReasonDetails result = new ShopifyPaymentsDisputeReasonDetails();
      result.networkReasonCode = this.networkReasonCode;
      result.reason = this.reason;
      return result;
    }

    /**
     * The raw code provided by the payment network.
     */
    public Builder networkReasonCode(String networkReasonCode) {
      this.networkReasonCode = networkReasonCode;
      return this;
    }

    /**
     * The reason for the dispute provided by the cardholder's banks.
     */
    public Builder reason(ShopifyPaymentsDisputeReason reason) {
      this.reason = reason;
      return this;
    }
  }
}
