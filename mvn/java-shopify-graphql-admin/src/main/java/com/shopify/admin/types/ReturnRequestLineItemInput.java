package com.shopify.admin.types;

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
   * The ID of a [`ReturnReasonDefinition`](https://shopify.dev/docs/api/admin-graphql/latest/objects/ReturnReasonDefinition). Accepts any ID from the full library of reasons available via [`returnReasonDefinitions`](https://shopify.dev/docs/api/admin-graphql/latest/queries/returnReasonDefinitions),
   * not limited to the suggested reasons for the line item.
   */
  private String returnReasonDefinitionId;

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
   * The ID of a [`ReturnReasonDefinition`](https://shopify.dev/docs/api/admin-graphql/latest/objects/ReturnReasonDefinition). Accepts any ID from the full library of reasons available via [`returnReasonDefinitions`](https://shopify.dev/docs/api/admin-graphql/latest/queries/returnReasonDefinitions),
   * not limited to the suggested reasons for the line item.
   */
  public String getReturnReasonDefinitionId() {
    return returnReasonDefinitionId;
  }

  public void setReturnReasonDefinitionId(String returnReasonDefinitionId) {
    this.returnReasonDefinitionId = returnReasonDefinitionId;
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
    return "ReturnRequestLineItemInput{fulfillmentLineItemId='" + fulfillmentLineItemId + "', quantity='" + quantity + "', restockingFee='" + restockingFee + "', returnReasonDefinitionId='" + returnReasonDefinitionId + "', customerNote='" + customerNote + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    ReturnRequestLineItemInput that = (ReturnRequestLineItemInput) o;
    return Objects.equals(fulfillmentLineItemId, that.fulfillmentLineItemId) &&
        quantity == that.quantity &&
        Objects.equals(restockingFee, that.restockingFee) &&
        Objects.equals(returnReasonDefinitionId, that.returnReasonDefinitionId) &&
        Objects.equals(customerNote, that.customerNote);
  }

  @Override
  public int hashCode() {
    return Objects.hash(fulfillmentLineItemId, quantity, restockingFee, returnReasonDefinitionId, customerNote);
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
     * The ID of a [`ReturnReasonDefinition`](https://shopify.dev/docs/api/admin-graphql/latest/objects/ReturnReasonDefinition). Accepts any ID from the full library of reasons available via [`returnReasonDefinitions`](https://shopify.dev/docs/api/admin-graphql/latest/queries/returnReasonDefinitions),
     * not limited to the suggested reasons for the line item.
     */
    private String returnReasonDefinitionId;

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
      result.returnReasonDefinitionId = this.returnReasonDefinitionId;
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
     * The ID of a [`ReturnReasonDefinition`](https://shopify.dev/docs/api/admin-graphql/latest/objects/ReturnReasonDefinition). Accepts any ID from the full library of reasons available via [`returnReasonDefinitions`](https://shopify.dev/docs/api/admin-graphql/latest/queries/returnReasonDefinitions),
     * not limited to the suggested reasons for the line item.
     */
    public Builder returnReasonDefinitionId(String returnReasonDefinitionId) {
      this.returnReasonDefinitionId = returnReasonDefinitionId;
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
