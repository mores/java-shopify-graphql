package com.shopify.types;

import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.Objects;

/**
 * Presents all Shopify Payments specific information related to an order refund.
 */
public class ShopifyPaymentsRefundSet {
  /**
   * The acquirer reference number (ARN) code generated for Visa/Mastercard transactions.
   */
  private String acquirerReferenceNumber;

  public ShopifyPaymentsRefundSet() {
  }

  /**
   * The acquirer reference number (ARN) code generated for Visa/Mastercard transactions.
   */
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
    /**
     * The acquirer reference number (ARN) code generated for Visa/Mastercard transactions.
     */
    private String acquirerReferenceNumber;

    public ShopifyPaymentsRefundSet build() {
      ShopifyPaymentsRefundSet result = new ShopifyPaymentsRefundSet();
      result.acquirerReferenceNumber = this.acquirerReferenceNumber;
      return result;
    }

    /**
     * The acquirer reference number (ARN) code generated for Visa/Mastercard transactions.
     */
    public Builder acquirerReferenceNumber(String acquirerReferenceNumber) {
      this.acquirerReferenceNumber = acquirerReferenceNumber;
      return this;
    }
  }
}
