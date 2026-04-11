package com.shopify.admin.types;

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
   * The ID of a [`ReturnReasonDefinition`](https://shopify.dev/docs/api/admin-graphql/latest/objects/ReturnReasonDefinition). Accepts any ID from the full library of reasons available via [`returnReasonDefinitions`](https://shopify.dev/docs/api/admin-graphql/latest/queries/returnReasonDefinitions),
   * not limited to the suggested reasons for the line item.
   */
  private String returnReasonDefinitionId;

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
    return "ReturnLineItemInput{quantity='" + quantity + "', returnReasonDefinitionId='" + returnReasonDefinitionId + "', returnReasonNote='" + returnReasonNote + "', fulfillmentLineItemId='" + fulfillmentLineItemId + "', restockingFee='" + restockingFee + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    ReturnLineItemInput that = (ReturnLineItemInput) o;
    return quantity == that.quantity &&
        Objects.equals(returnReasonDefinitionId, that.returnReasonDefinitionId) &&
        Objects.equals(returnReasonNote, that.returnReasonNote) &&
        Objects.equals(fulfillmentLineItemId, that.fulfillmentLineItemId) &&
        Objects.equals(restockingFee, that.restockingFee);
  }

  @Override
  public int hashCode() {
    return Objects.hash(quantity, returnReasonDefinitionId, returnReasonNote, fulfillmentLineItemId, restockingFee);
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
     * The ID of a [`ReturnReasonDefinition`](https://shopify.dev/docs/api/admin-graphql/latest/objects/ReturnReasonDefinition). Accepts any ID from the full library of reasons available via [`returnReasonDefinitions`](https://shopify.dev/docs/api/admin-graphql/latest/queries/returnReasonDefinitions),
     * not limited to the suggested reasons for the line item.
     */
    private String returnReasonDefinitionId;

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
      result.returnReasonDefinitionId = this.returnReasonDefinitionId;
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
     * The ID of a [`ReturnReasonDefinition`](https://shopify.dev/docs/api/admin-graphql/latest/objects/ReturnReasonDefinition). Accepts any ID from the full library of reasons available via [`returnReasonDefinitions`](https://shopify.dev/docs/api/admin-graphql/latest/queries/returnReasonDefinitions),
     * not limited to the suggested reasons for the line item.
     */
    public Builder returnReasonDefinitionId(String returnReasonDefinitionId) {
      this.returnReasonDefinitionId = returnReasonDefinitionId;
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
