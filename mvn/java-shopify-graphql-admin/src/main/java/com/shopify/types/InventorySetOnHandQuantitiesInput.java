package com.shopify.types;

import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.List;
import java.util.Objects;


public class InventorySetOnHandQuantitiesInput {
  
  private String reason;

  
  private String referenceDocumentUri;

  
  private List<InventorySetQuantityInput> setQuantities;

  public InventorySetOnHandQuantitiesInput() {
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

  
  public List<InventorySetQuantityInput> getSetQuantities() {
    return setQuantities;
  }

  public void setSetQuantities(List<InventorySetQuantityInput> setQuantities) {
    this.setQuantities = setQuantities;
  }

  @Override
  public String toString() {
    return "InventorySetOnHandQuantitiesInput{reason='" + reason + "', referenceDocumentUri='" + referenceDocumentUri + "', setQuantities='" + setQuantities + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    InventorySetOnHandQuantitiesInput that = (InventorySetOnHandQuantitiesInput) o;
    return Objects.equals(reason, that.reason) &&
        Objects.equals(referenceDocumentUri, that.referenceDocumentUri) &&
        Objects.equals(setQuantities, that.setQuantities);
  }

  @Override
  public int hashCode() {
    return Objects.hash(reason, referenceDocumentUri, setQuantities);
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public static class Builder {
    
    private String reason;

    
    private String referenceDocumentUri;

    
    private List<InventorySetQuantityInput> setQuantities;

    public InventorySetOnHandQuantitiesInput build() {
      InventorySetOnHandQuantitiesInput result = new InventorySetOnHandQuantitiesInput();
      result.reason = this.reason;
      result.referenceDocumentUri = this.referenceDocumentUri;
      result.setQuantities = this.setQuantities;
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

    
    public Builder setQuantities(List<InventorySetQuantityInput> setQuantities) {
      this.setQuantities = setQuantities;
      return this;
    }
  }
}
