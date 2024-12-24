package com.shopify.types;

import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.List;
import java.util.Objects;


public class InventoryAdjustQuantitiesInput {
  
  private String reason;

  
  private String name;

  
  private String referenceDocumentUri;

  
  private List<InventoryChangeInput> changes;

  public InventoryAdjustQuantitiesInput() {
  }

  
  public String getReason() {
    return reason;
  }

  public void setReason(String reason) {
    this.reason = reason;
  }

  
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  
  public String getReferenceDocumentUri() {
    return referenceDocumentUri;
  }

  public void setReferenceDocumentUri(String referenceDocumentUri) {
    this.referenceDocumentUri = referenceDocumentUri;
  }

  
  public List<InventoryChangeInput> getChanges() {
    return changes;
  }

  public void setChanges(List<InventoryChangeInput> changes) {
    this.changes = changes;
  }

  @Override
  public String toString() {
    return "InventoryAdjustQuantitiesInput{reason='" + reason + "', name='" + name + "', referenceDocumentUri='" + referenceDocumentUri + "', changes='" + changes + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    InventoryAdjustQuantitiesInput that = (InventoryAdjustQuantitiesInput) o;
    return Objects.equals(reason, that.reason) &&
        Objects.equals(name, that.name) &&
        Objects.equals(referenceDocumentUri, that.referenceDocumentUri) &&
        Objects.equals(changes, that.changes);
  }

  @Override
  public int hashCode() {
    return Objects.hash(reason, name, referenceDocumentUri, changes);
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public static class Builder {
    
    private String reason;

    
    private String name;

    
    private String referenceDocumentUri;

    
    private List<InventoryChangeInput> changes;

    public InventoryAdjustQuantitiesInput build() {
      InventoryAdjustQuantitiesInput result = new InventoryAdjustQuantitiesInput();
      result.reason = this.reason;
      result.name = this.name;
      result.referenceDocumentUri = this.referenceDocumentUri;
      result.changes = this.changes;
      return result;
    }

    
    public Builder reason(String reason) {
      this.reason = reason;
      return this;
    }

    
    public Builder name(String name) {
      this.name = name;
      return this;
    }

    
    public Builder referenceDocumentUri(String referenceDocumentUri) {
      this.referenceDocumentUri = referenceDocumentUri;
      return this;
    }

    
    public Builder changes(List<InventoryChangeInput> changes) {
      this.changes = changes;
      return this;
    }
  }
}
