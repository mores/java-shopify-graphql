package com.shopify.types;

import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.Objects;

/**
 * The payout associated with a balance transaction.
 */
public class ShopifyPaymentsBalanceTransactionAssociatedPayout {
  /**
   * The ID of the payout associated with the balance transaction.
   */
  private String id;

  /**
   * The status of the payout associated with the balance transaction.
   */
  private ShopifyPaymentsBalanceTransactionPayoutStatus status;

  public ShopifyPaymentsBalanceTransactionAssociatedPayout() {
  }

  /**
   * The ID of the payout associated with the balance transaction.
   */
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  /**
   * The status of the payout associated with the balance transaction.
   */
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
    /**
     * The ID of the payout associated with the balance transaction.
     */
    private String id;

    /**
     * The status of the payout associated with the balance transaction.
     */
    private ShopifyPaymentsBalanceTransactionPayoutStatus status;

    public ShopifyPaymentsBalanceTransactionAssociatedPayout build() {
      ShopifyPaymentsBalanceTransactionAssociatedPayout result = new ShopifyPaymentsBalanceTransactionAssociatedPayout();
      result.id = this.id;
      result.status = this.status;
      return result;
    }

    /**
     * The ID of the payout associated with the balance transaction.
     */
    public Builder id(String id) {
      this.id = id;
      return this;
    }

    /**
     * The status of the payout associated with the balance transaction.
     */
    public Builder status(ShopifyPaymentsBalanceTransactionPayoutStatus status) {
      this.status = status;
      return this;
    }
  }
}
