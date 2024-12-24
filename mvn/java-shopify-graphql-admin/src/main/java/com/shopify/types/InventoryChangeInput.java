package com.shopify.types;

import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.Objects;


public class InventoryChangeInput {
  
  private int delta;

  
  private String inventoryItemId;

  
  private String locationId;

  
  private String ledgerDocumentUri;

  public InventoryChangeInput() {
  }

  
  public int getDelta() {
    return delta;
  }

  public void setDelta(int delta) {
    this.delta = delta;
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

  @Override
  public String toString() {
    return "InventoryChangeInput{delta='" + delta + "', inventoryItemId='" + inventoryItemId + "', locationId='" + locationId + "', ledgerDocumentUri='" + ledgerDocumentUri + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    InventoryChangeInput that = (InventoryChangeInput) o;
    return delta == that.delta &&
        Objects.equals(inventoryItemId, that.inventoryItemId) &&
        Objects.equals(locationId, that.locationId) &&
        Objects.equals(ledgerDocumentUri, that.ledgerDocumentUri);
  }

  @Override
  public int hashCode() {
    return Objects.hash(delta, inventoryItemId, locationId, ledgerDocumentUri);
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public static class Builder {
    
    private int delta;

    
    private String inventoryItemId;

    
    private String locationId;

    
    private String ledgerDocumentUri;

    public InventoryChangeInput build() {
      InventoryChangeInput result = new InventoryChangeInput();
      result.delta = this.delta;
      result.inventoryItemId = this.inventoryItemId;
      result.locationId = this.locationId;
      result.ledgerDocumentUri = this.ledgerDocumentUri;
      return result;
    }

    
    public Builder delta(int delta) {
      this.delta = delta;
      return this;
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
  }
}
