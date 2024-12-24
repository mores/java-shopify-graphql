package com.shopify.types;

import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.time.OffsetDateTime;
import java.util.Objects;


public class InventoryScheduledChange {
  
  private OffsetDateTime expectedAt;

  
  private String fromName;

  
  private InventoryLevel inventoryLevel;

  
  private String ledgerDocumentUri;

  
  private int quantity;

  
  private String toName;

  public InventoryScheduledChange() {
  }

  
  public OffsetDateTime getExpectedAt() {
    return expectedAt;
  }

  public void setExpectedAt(OffsetDateTime expectedAt) {
    this.expectedAt = expectedAt;
  }

  
  public String getFromName() {
    return fromName;
  }

  public void setFromName(String fromName) {
    this.fromName = fromName;
  }

  
  public InventoryLevel getInventoryLevel() {
    return inventoryLevel;
  }

  public void setInventoryLevel(InventoryLevel inventoryLevel) {
    this.inventoryLevel = inventoryLevel;
  }

  
  public String getLedgerDocumentUri() {
    return ledgerDocumentUri;
  }

  public void setLedgerDocumentUri(String ledgerDocumentUri) {
    this.ledgerDocumentUri = ledgerDocumentUri;
  }

  
  public int getQuantity() {
    return quantity;
  }

  public void setQuantity(int quantity) {
    this.quantity = quantity;
  }

  
  public String getToName() {
    return toName;
  }

  public void setToName(String toName) {
    this.toName = toName;
  }

  @Override
  public String toString() {
    return "InventoryScheduledChange{expectedAt='" + expectedAt + "', fromName='" + fromName + "', inventoryLevel='" + inventoryLevel + "', ledgerDocumentUri='" + ledgerDocumentUri + "', quantity='" + quantity + "', toName='" + toName + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    InventoryScheduledChange that = (InventoryScheduledChange) o;
    return Objects.equals(expectedAt, that.expectedAt) &&
        Objects.equals(fromName, that.fromName) &&
        Objects.equals(inventoryLevel, that.inventoryLevel) &&
        Objects.equals(ledgerDocumentUri, that.ledgerDocumentUri) &&
        quantity == that.quantity &&
        Objects.equals(toName, that.toName);
  }

  @Override
  public int hashCode() {
    return Objects.hash(expectedAt, fromName, inventoryLevel, ledgerDocumentUri, quantity, toName);
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public static class Builder {
    
    private OffsetDateTime expectedAt;

    
    private String fromName;

    
    private InventoryLevel inventoryLevel;

    
    private String ledgerDocumentUri;

    
    private int quantity;

    
    private String toName;

    public InventoryScheduledChange build() {
      InventoryScheduledChange result = new InventoryScheduledChange();
      result.expectedAt = this.expectedAt;
      result.fromName = this.fromName;
      result.inventoryLevel = this.inventoryLevel;
      result.ledgerDocumentUri = this.ledgerDocumentUri;
      result.quantity = this.quantity;
      result.toName = this.toName;
      return result;
    }

    
    public Builder expectedAt(OffsetDateTime expectedAt) {
      this.expectedAt = expectedAt;
      return this;
    }

    
    public Builder fromName(String fromName) {
      this.fromName = fromName;
      return this;
    }

    
    public Builder inventoryLevel(InventoryLevel inventoryLevel) {
      this.inventoryLevel = inventoryLevel;
      return this;
    }

    
    public Builder ledgerDocumentUri(String ledgerDocumentUri) {
      this.ledgerDocumentUri = ledgerDocumentUri;
      return this;
    }

    
    public Builder quantity(int quantity) {
      this.quantity = quantity;
      return this;
    }

    
    public Builder toName(String toName) {
      this.toName = toName;
      return this;
    }
  }
}
