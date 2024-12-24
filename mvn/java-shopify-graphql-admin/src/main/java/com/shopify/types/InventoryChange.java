package com.shopify.types;

import java.lang.Integer;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.Objects;


public class InventoryChange {
  
  private int delta;

  
  private InventoryItem item;

  
  private String ledgerDocumentUri;

  
  private Location location;

  
  private String name;

  
  private Integer quantityAfterChange;

  public InventoryChange() {
  }

  
  public int getDelta() {
    return delta;
  }

  public void setDelta(int delta) {
    this.delta = delta;
  }

  
  public InventoryItem getItem() {
    return item;
  }

  public void setItem(InventoryItem item) {
    this.item = item;
  }

  
  public String getLedgerDocumentUri() {
    return ledgerDocumentUri;
  }

  public void setLedgerDocumentUri(String ledgerDocumentUri) {
    this.ledgerDocumentUri = ledgerDocumentUri;
  }

  
  public Location getLocation() {
    return location;
  }

  public void setLocation(Location location) {
    this.location = location;
  }

  
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  
  public Integer getQuantityAfterChange() {
    return quantityAfterChange;
  }

  public void setQuantityAfterChange(Integer quantityAfterChange) {
    this.quantityAfterChange = quantityAfterChange;
  }

  @Override
  public String toString() {
    return "InventoryChange{delta='" + delta + "', item='" + item + "', ledgerDocumentUri='" + ledgerDocumentUri + "', location='" + location + "', name='" + name + "', quantityAfterChange='" + quantityAfterChange + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    InventoryChange that = (InventoryChange) o;
    return delta == that.delta &&
        Objects.equals(item, that.item) &&
        Objects.equals(ledgerDocumentUri, that.ledgerDocumentUri) &&
        Objects.equals(location, that.location) &&
        Objects.equals(name, that.name) &&
        Objects.equals(quantityAfterChange, that.quantityAfterChange);
  }

  @Override
  public int hashCode() {
    return Objects.hash(delta, item, ledgerDocumentUri, location, name, quantityAfterChange);
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public static class Builder {
    
    private int delta;

    
    private InventoryItem item;

    
    private String ledgerDocumentUri;

    
    private Location location;

    
    private String name;

    
    private Integer quantityAfterChange;

    public InventoryChange build() {
      InventoryChange result = new InventoryChange();
      result.delta = this.delta;
      result.item = this.item;
      result.ledgerDocumentUri = this.ledgerDocumentUri;
      result.location = this.location;
      result.name = this.name;
      result.quantityAfterChange = this.quantityAfterChange;
      return result;
    }

    
    public Builder delta(int delta) {
      this.delta = delta;
      return this;
    }

    
    public Builder item(InventoryItem item) {
      this.item = item;
      return this;
    }

    
    public Builder ledgerDocumentUri(String ledgerDocumentUri) {
      this.ledgerDocumentUri = ledgerDocumentUri;
      return this;
    }

    
    public Builder location(Location location) {
      this.location = location;
      return this;
    }

    
    public Builder name(String name) {
      this.name = name;
      return this;
    }

    
    public Builder quantityAfterChange(Integer quantityAfterChange) {
      this.quantityAfterChange = quantityAfterChange;
      return this;
    }
  }
}
