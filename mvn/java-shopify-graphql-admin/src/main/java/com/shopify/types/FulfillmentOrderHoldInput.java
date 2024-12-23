package com.shopify.types;

import java.lang.Boolean;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.Collections;
import java.util.List;
import java.util.Objects;

/**
 * The input fields for the fulfillment hold applied on the fulfillment order.
 */
public class FulfillmentOrderHoldInput {
  /**
   * The reason for the fulfillment hold.
   */
  private FulfillmentHoldReason reason;

  /**
   * Additional information about the fulfillment hold reason.
   */
  private String reasonNotes;

  /**
   * Whether the merchant receives a notification about the fulfillment hold. The default value is `false`.
   */
  private Boolean notifyMerchant = false;

  /**
   * A configurable ID used to track the automation system releasing these holds.
   */
  private String externalId;

  /**
   * The fulfillment order line items to be placed on hold.
   *   
   * If left blank, all line items of the fulfillment order are placed on hold.
   */
  private List<FulfillmentOrderLineItemInput> fulfillmentOrderLineItems = Collections.emptyList();

  public FulfillmentOrderHoldInput() {
  }

  /**
   * The reason for the fulfillment hold.
   */
  public FulfillmentHoldReason getReason() {
    return reason;
  }

  public void setReason(FulfillmentHoldReason reason) {
    this.reason = reason;
  }

  /**
   * Additional information about the fulfillment hold reason.
   */
  public String getReasonNotes() {
    return reasonNotes;
  }

  public void setReasonNotes(String reasonNotes) {
    this.reasonNotes = reasonNotes;
  }

  /**
   * Whether the merchant receives a notification about the fulfillment hold. The default value is `false`.
   */
  public Boolean getNotifyMerchant() {
    return notifyMerchant;
  }

  public void setNotifyMerchant(Boolean notifyMerchant) {
    this.notifyMerchant = notifyMerchant;
  }

  /**
   * A configurable ID used to track the automation system releasing these holds.
   */
  public String getExternalId() {
    return externalId;
  }

  public void setExternalId(String externalId) {
    this.externalId = externalId;
  }

  /**
   * The fulfillment order line items to be placed on hold.
   *   
   * If left blank, all line items of the fulfillment order are placed on hold.
   */
  public List<FulfillmentOrderLineItemInput> getFulfillmentOrderLineItems() {
    return fulfillmentOrderLineItems;
  }

  public void setFulfillmentOrderLineItems(
      List<FulfillmentOrderLineItemInput> fulfillmentOrderLineItems) {
    this.fulfillmentOrderLineItems = fulfillmentOrderLineItems;
  }

  @Override
  public String toString() {
    return "FulfillmentOrderHoldInput{reason='" + reason + "', reasonNotes='" + reasonNotes + "', notifyMerchant='" + notifyMerchant + "', externalId='" + externalId + "', fulfillmentOrderLineItems='" + fulfillmentOrderLineItems + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    FulfillmentOrderHoldInput that = (FulfillmentOrderHoldInput) o;
    return Objects.equals(reason, that.reason) &&
        Objects.equals(reasonNotes, that.reasonNotes) &&
        Objects.equals(notifyMerchant, that.notifyMerchant) &&
        Objects.equals(externalId, that.externalId) &&
        Objects.equals(fulfillmentOrderLineItems, that.fulfillmentOrderLineItems);
  }

  @Override
  public int hashCode() {
    return Objects.hash(reason, reasonNotes, notifyMerchant, externalId, fulfillmentOrderLineItems);
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public static class Builder {
    /**
     * The reason for the fulfillment hold.
     */
    private FulfillmentHoldReason reason;

    /**
     * Additional information about the fulfillment hold reason.
     */
    private String reasonNotes;

    /**
     * Whether the merchant receives a notification about the fulfillment hold. The default value is `false`.
     */
    private Boolean notifyMerchant = false;

    /**
     * A configurable ID used to track the automation system releasing these holds.
     */
    private String externalId;

    /**
     * The fulfillment order line items to be placed on hold.
     *   
     * If left blank, all line items of the fulfillment order are placed on hold.
     */
    private List<FulfillmentOrderLineItemInput> fulfillmentOrderLineItems = Collections.emptyList();

    public FulfillmentOrderHoldInput build() {
      FulfillmentOrderHoldInput result = new FulfillmentOrderHoldInput();
      result.reason = this.reason;
      result.reasonNotes = this.reasonNotes;
      result.notifyMerchant = this.notifyMerchant;
      result.externalId = this.externalId;
      result.fulfillmentOrderLineItems = this.fulfillmentOrderLineItems;
      return result;
    }

    /**
     * The reason for the fulfillment hold.
     */
    public Builder reason(FulfillmentHoldReason reason) {
      this.reason = reason;
      return this;
    }

    /**
     * Additional information about the fulfillment hold reason.
     */
    public Builder reasonNotes(String reasonNotes) {
      this.reasonNotes = reasonNotes;
      return this;
    }

    /**
     * Whether the merchant receives a notification about the fulfillment hold. The default value is `false`.
     */
    public Builder notifyMerchant(Boolean notifyMerchant) {
      this.notifyMerchant = notifyMerchant;
      return this;
    }

    /**
     * A configurable ID used to track the automation system releasing these holds.
     */
    public Builder externalId(String externalId) {
      this.externalId = externalId;
      return this;
    }

    /**
     * The fulfillment order line items to be placed on hold.
     *   
     * If left blank, all line items of the fulfillment order are placed on hold.
     */
    public Builder fulfillmentOrderLineItems(
        List<FulfillmentOrderLineItemInput> fulfillmentOrderLineItems) {
      this.fulfillmentOrderLineItems = fulfillmentOrderLineItems;
      return this;
    }
  }
}
