package com.shopify.admin.types;

import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.Objects;

/**
 * The input fields for removing an exchange line item from a return.
 */
public class ExchangeLineItemRemoveFromReturnInput {
  /**
   * The ID of the exchange line item to remove.
   */
  private String exchangeLineItemId;

  /**
   * The quantity of the associated exchange line item to be removed.
   */
  private int quantity;

  public ExchangeLineItemRemoveFromReturnInput() {
  }

  /**
   * The ID of the exchange line item to remove.
   */
  public String getExchangeLineItemId() {
    return exchangeLineItemId;
  }

  public void setExchangeLineItemId(String exchangeLineItemId) {
    this.exchangeLineItemId = exchangeLineItemId;
  }

  /**
   * The quantity of the associated exchange line item to be removed.
   */
  public int getQuantity() {
    return quantity;
  }

  public void setQuantity(int quantity) {
    this.quantity = quantity;
  }

  @Override
  public String toString() {
    return "ExchangeLineItemRemoveFromReturnInput{exchangeLineItemId='" + exchangeLineItemId + "', quantity='" + quantity + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    ExchangeLineItemRemoveFromReturnInput that = (ExchangeLineItemRemoveFromReturnInput) o;
    return Objects.equals(exchangeLineItemId, that.exchangeLineItemId) &&
        quantity == that.quantity;
  }

  @Override
  public int hashCode() {
    return Objects.hash(exchangeLineItemId, quantity);
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public static class Builder {
    /**
     * The ID of the exchange line item to remove.
     */
    private String exchangeLineItemId;

    /**
     * The quantity of the associated exchange line item to be removed.
     */
    private int quantity;

    public ExchangeLineItemRemoveFromReturnInput build() {
      ExchangeLineItemRemoveFromReturnInput result = new ExchangeLineItemRemoveFromReturnInput();
      result.exchangeLineItemId = this.exchangeLineItemId;
      result.quantity = this.quantity;
      return result;
    }

    /**
     * The ID of the exchange line item to remove.
     */
    public Builder exchangeLineItemId(String exchangeLineItemId) {
      this.exchangeLineItemId = exchangeLineItemId;
      return this;
    }

    /**
     * The quantity of the associated exchange line item to be removed.
     */
    public Builder quantity(int quantity) {
      this.quantity = quantity;
      return this;
    }
  }
}
