package com.shopify.types;

import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.List;
import java.util.Objects;


public class InventoryMoveQuantitiesInput {
  
  private String reason;

  
  private String referenceDocumentUri;

  
  private List<InventoryMoveQuantityChange> changes;

  public InventoryMoveQuantitiesInput() {
  }

  
  public String getReason() {
    return reason;
  }

  public void setReason(String reason) {
    this.reason = reason;
  }

  
  public String getReferenceDocumentUri() {
    return referenceDocumentUri;
  }

  public void setReferenceDocumentUri(String referenceDocumentUri) {
    this.referenceDocumentUri = referenceDocumentUri;
  }

  
  public List<InventoryMoveQuantityChange> getChanges() {
    return changes;
  }

  public void setChanges(List<InventoryMoveQuantityChange> changes) {
    this.changes = changes;
  }

  @Override
  public String toString() {
    return "InventoryMoveQuantitiesInput{reason='" + reason + "', referenceDocumentUri='" + referenceDocumentUri + "', changes='" + changes + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    InventoryMoveQuantitiesInput that = (InventoryMoveQuantitiesInput) o;
    return Objects.equals(reason, that.reason) &&
        Objects.equals(referenceDocumentUri, that.referenceDocumentUri) &&
        Objects.equals(changes, that.changes);
  }

  @Override
  public int hashCode() {
    return Objects.hash(reason, referenceDocumentUri, changes);
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public static class Builder {
    
    private String reason;

    
    private String referenceDocumentUri;

    
    private List<InventoryMoveQuantityChange> changes;

    public InventoryMoveQuantitiesInput build() {
      InventoryMoveQuantitiesInput result = new InventoryMoveQuantitiesInput();
      result.reason = this.reason;
      result.referenceDocumentUri = this.referenceDocumentUri;
      result.changes = this.changes;
      return result;
    }

    
    public Builder reason(String reason) {
      this.reason = reason;
      return this;
    }

    
    public Builder referenceDocumentUri(String referenceDocumentUri) {
      this.referenceDocumentUri = referenceDocumentUri;
      return this;
    }

    
    public Builder changes(List<InventoryMoveQuantityChange> changes) {
      this.changes = changes;
      return this;
    }
  }
}
