package com.shopify.types;

import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.Objects;

/**
 * Presents all Shopify Payments specific information related to an order transaction.
 */
public class ShopifyPaymentsTransactionSet {
  /**
   * Contains all fields related to an extended authorization.
   */
  private ShopifyPaymentsExtendedAuthorization extendedAuthorizationSet;

  /**
   * Contains all fields related to a refund.
   */
  private ShopifyPaymentsRefundSet refundSet;

  public ShopifyPaymentsTransactionSet() {
  }

  /**
   * Contains all fields related to an extended authorization.
   */
  public ShopifyPaymentsExtendedAuthorization getExtendedAuthorizationSet() {
    return extendedAuthorizationSet;
  }

  public void setExtendedAuthorizationSet(
      ShopifyPaymentsExtendedAuthorization extendedAuthorizationSet) {
    this.extendedAuthorizationSet = extendedAuthorizationSet;
  }

  /**
   * Contains all fields related to a refund.
   */
  public ShopifyPaymentsRefundSet getRefundSet() {
    return refundSet;
  }

  public void setRefundSet(ShopifyPaymentsRefundSet refundSet) {
    this.refundSet = refundSet;
  }

  @Override
  public String toString() {
    return "ShopifyPaymentsTransactionSet{extendedAuthorizationSet='" + extendedAuthorizationSet + "', refundSet='" + refundSet + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    ShopifyPaymentsTransactionSet that = (ShopifyPaymentsTransactionSet) o;
    return Objects.equals(extendedAuthorizationSet, that.extendedAuthorizationSet) &&
        Objects.equals(refundSet, that.refundSet);
  }

  @Override
  public int hashCode() {
    return Objects.hash(extendedAuthorizationSet, refundSet);
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public static class Builder {
    /**
     * Contains all fields related to an extended authorization.
     */
    private ShopifyPaymentsExtendedAuthorization extendedAuthorizationSet;

    /**
     * Contains all fields related to a refund.
     */
    private ShopifyPaymentsRefundSet refundSet;

    public ShopifyPaymentsTransactionSet build() {
      ShopifyPaymentsTransactionSet result = new ShopifyPaymentsTransactionSet();
      result.extendedAuthorizationSet = this.extendedAuthorizationSet;
      result.refundSet = this.refundSet;
      return result;
    }

    /**
     * Contains all fields related to an extended authorization.
     */
    public Builder extendedAuthorizationSet(
        ShopifyPaymentsExtendedAuthorization extendedAuthorizationSet) {
      this.extendedAuthorizationSet = extendedAuthorizationSet;
      return this;
    }

    /**
     * Contains all fields related to a refund.
     */
    public Builder refundSet(ShopifyPaymentsRefundSet refundSet) {
      this.refundSet = refundSet;
      return this;
    }
  }
}
