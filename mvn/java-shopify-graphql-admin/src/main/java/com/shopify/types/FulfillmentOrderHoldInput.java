package com.shopify.types;

import java.lang.Boolean;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.Collections;
import java.util.List;
import java.util.Objects;


public class FulfillmentOrderHoldInput {
  
  private FulfillmentHoldReason reason;

  
  private String reasonNotes;

  
  private Boolean notifyMerchant = false;

  
  private String externalId;

  
  private List<FulfillmentOrderLineItemInput> fulfillmentOrderLineItems = Collections.emptyList();

  public FulfillmentOrderHoldInput() {
  }

  
  public FulfillmentHoldReason getReason() {
    return reason;
  }

  public void setReason(FulfillmentHoldReason reason) {
    this.reason = reason;
  }

  
  public String getReasonNotes() {
    return reasonNotes;
  }

  public void setReasonNotes(String reasonNotes) {
    this.reasonNotes = reasonNotes;
  }

  
  public Boolean getNotifyMerchant() {
    return notifyMerchant;
  }

  public void setNotifyMerchant(Boolean notifyMerchant) {
    this.notifyMerchant = notifyMerchant;
  }

  
  public String getExternalId() {
    return externalId;
  }

  public void setExternalId(String externalId) {
    this.externalId = externalId;
  }

  
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
    
    private FulfillmentHoldReason reason;

    
    private String reasonNotes;

    
    private Boolean notifyMerchant = false;

    
    private String externalId;

    
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

    
    public Builder reason(FulfillmentHoldReason reason) {
      this.reason = reason;
      return this;
    }

    
    public Builder reasonNotes(String reasonNotes) {
      this.reasonNotes = reasonNotes;
      return this;
    }

    
    public Builder notifyMerchant(Boolean notifyMerchant) {
      this.notifyMerchant = notifyMerchant;
      return this;
    }

    
    public Builder externalId(String externalId) {
      this.externalId = externalId;
      return this;
    }

    
    public Builder fulfillmentOrderLineItems(
        List<FulfillmentOrderLineItemInput> fulfillmentOrderLineItems) {
      this.fulfillmentOrderLineItems = fulfillmentOrderLineItems;
      return this;
    }
  }
}
