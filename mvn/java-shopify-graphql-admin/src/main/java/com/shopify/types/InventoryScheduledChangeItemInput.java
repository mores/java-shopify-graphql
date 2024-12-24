package com.shopify.types;

import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.List;
import java.util.Objects;


public class InventoryScheduledChangeItemInput {
  
  private String inventoryItemId;

  
  private String locationId;

  
  private String ledgerDocumentUri;

  
  private List<InventoryScheduledChangeInput> scheduledChanges;

  public InventoryScheduledChangeItemInput() {
  }

  
  public String getInventoryItemId() {
    return inventoryItemId;
  }

  public void setInventoryItemId(String inventoryItemId) {
    this.inventoryItemId = inventoryItemId;
  }

  
  public String getLocationId() {
    return locationId;
  }

  public void setLocationId(String locationId) {
    this.locationId = locationId;
  }

  
  public String getLedgerDocumentUri() {
    return ledgerDocumentUri;
  }

  public void setLedgerDocumentUri(String ledgerDocumentUri) {
    this.ledgerDocumentUri = ledgerDocumentUri;
  }

  
  public List<InventoryScheduledChangeInput> getScheduledChanges() {
    return scheduledChanges;
  }

  public void setScheduledChanges(List<InventoryScheduledChangeInput> scheduledChanges) {
    this.scheduledChanges = scheduledChanges;
  }

  @Override
  public String toString() {
    return "InventoryScheduledChangeItemInput{inventoryItemId='" + inventoryItemId + "', locationId='" + locationId + "', ledgerDocumentUri='" + ledgerDocumentUri + "', scheduledChanges='" + scheduledChanges + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    InventoryScheduledChangeItemInput that = (InventoryScheduledChangeItemInput) o;
    return Objects.equals(inventoryItemId, that.inventoryItemId) &&
        Objects.equals(locationId, that.locationId) &&
        Objects.equals(ledgerDocumentUri, that.ledgerDocumentUri) &&
        Objects.equals(scheduledChanges, that.scheduledChanges);
  }

  @Override
  public int hashCode() {
    return Objects.hash(inventoryItemId, locationId, ledgerDocumentUri, scheduledChanges);
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public static class Builder {
    
    private String inventoryItemId;

    
    private String locationId;

    
    private String ledgerDocumentUri;

    
    private List<InventoryScheduledChangeInput> scheduledChanges;

    public InventoryScheduledChangeItemInput build() {
      InventoryScheduledChangeItemInput result = new InventoryScheduledChangeItemInput();
      result.inventoryItemId = this.inventoryItemId;
      result.locationId = this.locationId;
      result.ledgerDocumentUri = this.ledgerDocumentUri;
      result.scheduledChanges = this.scheduledChanges;
      return result;
    }

    
    public Builder inventoryItemId(String inventoryItemId) {
      this.inventoryItemId = inventoryItemId;
      return this;
    }

    
    public Builder locationId(String locationId) {
      this.locationId = locationId;
      return this;
    }

    
    public Builder ledgerDocumentUri(String ledgerDocumentUri) {
      this.ledgerDocumentUri = ledgerDocumentUri;
      return this;
    }

    
    public Builder scheduledChanges(List<InventoryScheduledChangeInput> scheduledChanges) {
      this.scheduledChanges = scheduledChanges;
      return this;
    }
  }
}
