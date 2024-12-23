package com.shopify.types;

import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.Objects;

/**
 * The input fields for a return line item.
 */
public class ReturnLineItemInput {
  /**
   * The quantity of the item to be returned.
   */
  private int quantity;

  /**
   * The reason for the item to be returned.
   */
  private ReturnReason returnReason;

  /**
   * A note about the reason that the item is being returned.
   * Maximum length: 255 characters.
   */
  private String returnReasonNote = "";

  /**
   * The ID of the fulfillment line item to be returned.
   * Specifically, this field expects a `FulfillmentLineItem.id`.
   */
  private String fulfillmentLineItemId;

  /**
   * The restocking fee to capture.
   */
  private RestockingFeeInput restockingFee;

  public ReturnLineItemInput() {
  }

  /**
   * The quantity of the item to be returned.
   */
  public int getQuantity() {
    return quantity;
  }

  public void setQuantity(int quantity) {
    this.quantity = quantity;
  }

  /**
   * The reason for the item to be returned.
   */
  public ReturnReason getReturnReason() {
    return returnReason;
  }

  public void setReturnReason(ReturnReason returnReason) {
    this.returnReason = returnReason;
  }

  /**
   * A note about the reason that the item is being returned.
   * Maximum length: 255 characters.
   */
  public String getReturnReasonNote() {
    return returnReasonNote;
  }

  public void setReturnReasonNote(String returnReasonNote) {
    this.returnReasonNote = returnReasonNote;
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
   * The restocking fee to capture.
   */
  public RestockingFeeInput getRestockingFee() {
    return restockingFee;
  }

  public void setRestockingFee(RestockingFeeInput restockingFee) {
    this.restockingFee = restockingFee;
  }

  @Override
  public String toString() {
    return "ReturnLineItemInput{quantity='" + quantity + "', returnReason='" + returnReason + "', returnReasonNote='" + returnReasonNote + "', fulfillmentLineItemId='" + fulfillmentLineItemId + "', restockingFee='" + restockingFee + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    ReturnLineItemInput that = (ReturnLineItemInput) o;
    return quantity == that.quantity &&
        Objects.equals(returnReason, that.returnReason) &&
        Objects.equals(returnReasonNote, that.returnReasonNote) &&
        Objects.equals(fulfillmentLineItemId, that.fulfillmentLineItemId) &&
        Objects.equals(restockingFee, that.restockingFee);
  }

  @Override
  public int hashCode() {
    return Objects.hash(quantity, returnReason, returnReasonNote, fulfillmentLineItemId, restockingFee);
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public static class Builder {
    /**
     * The quantity of the item to be returned.
     */
    private int quantity;

    /**
     * The reason for the item to be returned.
     */
    private ReturnReason returnReason;

    /**
     * A note about the reason that the item is being returned.
     * Maximum length: 255 characters.
     */
    private String returnReasonNote = "";

    /**
     * The ID of the fulfillment line item to be returned.
     * Specifically, this field expects a `FulfillmentLineItem.id`.
     */
    private String fulfillmentLineItemId;

    /**
     * The restocking fee to capture.
     */
    private RestockingFeeInput restockingFee;

    public ReturnLineItemInput build() {
      ReturnLineItemInput result = new ReturnLineItemInput();
      result.quantity = this.quantity;
      result.returnReason = this.returnReason;
      result.returnReasonNote = this.returnReasonNote;
      result.fulfillmentLineItemId = this.fulfillmentLineItemId;
      result.restockingFee = this.restockingFee;
      return result;
    }

    /**
     * The quantity of the item to be returned.
     */
    public Builder quantity(int quantity) {
      this.quantity = quantity;
      return this;
    }

    /**
     * The reason for the item to be returned.
     */
    public Builder returnReason(ReturnReason returnReason) {
      this.returnReason = returnReason;
      return this;
    }

    /**
     * A note about the reason that the item is being returned.
     * Maximum length: 255 characters.
     */
    public Builder returnReasonNote(String returnReasonNote) {
      this.returnReasonNote = returnReasonNote;
      return this;
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
     * The restocking fee to capture.
     */
    public Builder restockingFee(RestockingFeeInput restockingFee) {
      this.restockingFee = restockingFee;
      return this;
    }
  }
}
