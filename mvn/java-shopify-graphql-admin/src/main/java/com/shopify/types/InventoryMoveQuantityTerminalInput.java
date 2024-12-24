package com.shopify.types;

import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.Objects;


public class InventoryMoveQuantityTerminalInput {
  
  private String locationId;

  
  private String name;

  
  private String ledgerDocumentUri;

  public InventoryMoveQuantityTerminalInput() {
  }

  
  public String getLocationId() {
    return locationId;
  }

  public void setLocationId(String locationId) {
    this.locationId = locationId;
  }

  
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  
  public String getLedgerDocumentUri() {
    return ledgerDocumentUri;
  }

  public void setLedgerDocumentUri(String ledgerDocumentUri) {
    this.ledgerDocumentUri = ledgerDocumentUri;
  }

  @Override
  public String toString() {
    return "InventoryMoveQuantityTerminalInput{locationId='" + locationId + "', name='" + name + "', ledgerDocumentUri='" + ledgerDocumentUri + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    InventoryMoveQuantityTerminalInput that = (InventoryMoveQuantityTerminalInput) o;
    return Objects.equals(locationId, that.locationId) &&
        Objects.equals(name, that.name) &&
        Objects.equals(ledgerDocumentUri, that.ledgerDocumentUri);
  }

  @Override
  public int hashCode() {
    return Objects.hash(locationId, name, ledgerDocumentUri);
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public static class Builder {
    
    private String locationId;

    
    private String name;

    
    private String ledgerDocumentUri;

    public InventoryMoveQuantityTerminalInput build() {
      InventoryMoveQuantityTerminalInput result = new InventoryMoveQuantityTerminalInput();
      result.locationId = this.locationId;
      result.name = this.name;
      result.ledgerDocumentUri = this.ledgerDocumentUri;
      return result;
    }

    
    public Builder locationId(String locationId) {
      this.locationId = locationId;
      return this;
    }

    
    public Builder name(String name) {
      this.name = name;
      return this;
    }

    
    public Builder ledgerDocumentUri(String ledgerDocumentUri) {
      this.ledgerDocumentUri = ledgerDocumentUri;
      return this;
    }
  }
}
