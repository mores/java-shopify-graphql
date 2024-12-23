package com.shopify.types;

import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.Objects;

/**
 * The input fields for a return line item.
 */
public class ReturnRequestLineItemInput {
  /**
   * The ID of the fulfillment line item to be returned.
   * Specifically, this field expects a `FulfillmentLineItem.id`.
   */
  private String fulfillmentLineItemId;

  /**
   * The quantity of the item that's being returned.
   */
  private int quantity;

  /**
   * The restocking fee to capture.
   */
  private RestockingFeeInput restockingFee;

  /**
   * The reason why the line item is being returned.
   */
  private ReturnReason returnReason;

  /**
   * A note from the customer that describes the item to be returned.
   * For example, the note can communicate issues with the item to the merchant.
   * Maximum length: 300 characters.
   */
  private String customerNote;

  public ReturnRequestLineItemInput() {
  }

  /**
   * The ID of the fulfillment line item to be returned.
   * Specifically, this field expects a `FulfillmentLineItem.id`.
   */
  public String getFulfillmentLineItemId() {
    return fulfillmentLineItemId;
  }

  public void setFulfillmentLineItemId(String fulfillmentLineItemId) {
    this.fulfillmentLineItemId = fulfillmentLineItemId;
  }

  /**
   * The quantity of the item that's being returned.
   */
  public int getQuantity() {
    return quantity;
  }

  public void setQuantity(int quantity) {
    this.quantity = quantity;
  }

  /**
   * The restocking fee to capture.
   */
  public RestockingFeeInput getRestockingFee() {
    return restockingFee;
  }

  public void setRestockingFee(RestockingFeeInput restockingFee) {
    this.restockingFee = restockingFee;
  }

  /**
   * The reason why the line item is being returned.
   */
  public ReturnReason getReturnReason() {
    return returnReason;
  }

  public void setReturnReason(ReturnReason returnReason) {
    this.returnReason = returnReason;
  }

  /**
   * A note from the customer that describes the item to be returned.
   * For example, the note can communicate issues with the item to the merchant.
   * Maximum length: 300 characters.
   */
  public String getCustomerNote() {
    return customerNote;
  }

  public void setCustomerNote(String customerNote) {
    this.customerNote = customerNote;
  }

  @Override
  public String toString() {
    return "ReturnRequestLineItemInput{fulfillmentLineItemId='" + fulfillmentLineItemId + "', quantity='" + quantity + "', restockingFee='" + restockingFee + "', returnReason='" + returnReason + "', customerNote='" + customerNote + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    ReturnRequestLineItemInput that = (ReturnRequestLineItemInput) o;
    return Objects.equals(fulfillmentLineItemId, that.fulfillmentLineItemId) &&
        quantity == that.quantity &&
        Objects.equals(restockingFee, that.restockingFee) &&
        Objects.equals(returnReason, that.returnReason) &&
        Objects.equals(customerNote, that.customerNote);
  }

  @Override
  public int hashCode() {
    return Objects.hash(fulfillmentLineItemId, quantity, restockingFee, returnReason, customerNote);
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public static class Builder {
    /**
     * The ID of the fulfillment line item to be returned.
     * Specifically, this field expects a `FulfillmentLineItem.id`.
     */
    private String fulfillmentLineItemId;

    /**
     * The quantity of the item that's being returned.
     */
    private int quantity;

    /**
     * The restocking fee to capture.
     */
    private RestockingFeeInput restockingFee;

    /**
     * The reason why the line item is being returned.
     */
    private ReturnReason returnReason;

    /**
     * A note from the customer that describes the item to be returned.
     * For example, the note can communicate issues with the item to the merchant.
     * Maximum length: 300 characters.
     */
    private String customerNote;

    public ReturnRequestLineItemInput build() {
      ReturnRequestLineItemInput result = new ReturnRequestLineItemInput();
      result.fulfillmentLineItemId = this.fulfillmentLineItemId;
      result.quantity = this.quantity;
      result.restockingFee = this.restockingFee;
      result.returnReason = this.returnReason;
      result.customerNote = this.customerNote;
      return result;
    }

    /**
     * The ID of the fulfillment line item to be returned.
     * Specifically, this field expects a `FulfillmentLineItem.id`.
     */
    public Builder fulfillmentLineItemId(String fulfillmentLineItemId) {
      this.fulfillmentLineItemId = fulfillmentLineItemId;
      return this;
    }

    /**
     * The quantity of the item that's being returned.
     */
    public Builder quantity(int quantity) {
      this.quantity = quantity;
      return this;
    }

    /**
     * The restocking fee to capture.
     */
    public Builder restockingFee(RestockingFeeInput restockingFee) {
      this.restockingFee = restockingFee;
      return this;
    }

    /**
     * The reason why the line item is being returned.
     */
    public Builder returnReason(ReturnReason returnReason) {
      this.returnReason = returnReason;
      return this;
    }

    /**
     * A note from the customer that describes the item to be returned.
     * For example, the note can communicate issues with the item to the merchant.
     * Maximum length: 300 characters.
     */
    public Builder customerNote(String customerNote) {
      this.customerNote = customerNote;
      return this;
    }
  }
}
