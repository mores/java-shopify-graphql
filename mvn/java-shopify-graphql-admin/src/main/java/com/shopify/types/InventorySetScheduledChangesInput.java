package com.shopify.types;

import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.List;
import java.util.Objects;


public class InventorySetScheduledChangesInput {
  
  private String reason;

  
  private List<InventoryScheduledChangeItemInput> items;

  
  private String referenceDocumentUri;

  public InventorySetScheduledChangesInput() {
  }

  
  public String getReason() {
    return reason;
  }

  public void setReason(String reason) {
    this.reason = reason;
  }

  
  public List<InventoryScheduledChangeItemInput> getItems() {
    return items;
  }

  public void setItems(List<InventoryScheduledChangeItemInput> items) {
    this.items = items;
  }

  
  public String getReferenceDocumentUri() {
    return referenceDocumentUri;
  }

  public void setReferenceDocumentUri(String referenceDocumentUri) {
    this.referenceDocumentUri = referenceDocumentUri;
  }

  @Override
  public String toString() {
    return "InventorySetScheduledChangesInput{reason='" + reason + "', items='" + items + "', referenceDocumentUri='" + referenceDocumentUri + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    InventorySetScheduledChangesInput that = (InventorySetScheduledChangesInput) o;
    return Objects.equals(reason, that.reason) &&
        Objects.equals(items, that.items) &&
        Objects.equals(referenceDocumentUri, that.referenceDocumentUri);
  }

  @Override
  public int hashCode() {
    return Objects.hash(reason, items, referenceDocumentUri);
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public static class Builder {
    
    private String reason;

    
    private List<InventoryScheduledChangeItemInput> items;

    
    private String referenceDocumentUri;

    public InventorySetScheduledChangesInput build() {
      InventorySetScheduledChangesInput result = new InventorySetScheduledChangesInput();
      result.reason = this.reason;
      result.items = this.items;
      result.referenceDocumentUri = this.referenceDocumentUri;
      return result;
    }

    
    public Builder reason(String reason) {
      this.reason = reason;
      return this;
    }

    
    public Builder items(List<InventoryScheduledChangeItemInput> items) {
      this.items = items;
      return this;
    }

    
    public Builder referenceDocumentUri(String referenceDocumentUri) {
      this.referenceDocumentUri = referenceDocumentUri;
      return this;
    }
  }
}
