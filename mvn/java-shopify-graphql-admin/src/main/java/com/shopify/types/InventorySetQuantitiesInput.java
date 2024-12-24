package com.shopify.types;

import java.lang.Boolean;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.List;
import java.util.Objects;


public class InventorySetQuantitiesInput {
  
  private String reason;

  
  private String name;

  
  private String referenceDocumentUri;

  
  private List<InventoryQuantityInput> quantities;

  
  private Boolean ignoreCompareQuantity = false;

  public InventorySetQuantitiesInput() {
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

  
  public List<InventoryQuantityInput> getQuantities() {
    return quantities;
  }

  public void setQuantities(List<InventoryQuantityInput> quantities) {
    this.quantities = quantities;
  }

  
  public Boolean getIgnoreCompareQuantity() {
    return ignoreCompareQuantity;
  }

  public void setIgnoreCompareQuantity(Boolean ignoreCompareQuantity) {
    this.ignoreCompareQuantity = ignoreCompareQuantity;
  }

  @Override
  public String toString() {
    return "InventorySetQuantitiesInput{reason='" + reason + "', name='" + name + "', referenceDocumentUri='" + referenceDocumentUri + "', quantities='" + quantities + "', ignoreCompareQuantity='" + ignoreCompareQuantity + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    InventorySetQuantitiesInput that = (InventorySetQuantitiesInput) o;
    return Objects.equals(reason, that.reason) &&
        Objects.equals(name, that.name) &&
        Objects.equals(referenceDocumentUri, that.referenceDocumentUri) &&
        Objects.equals(quantities, that.quantities) &&
        Objects.equals(ignoreCompareQuantity, that.ignoreCompareQuantity);
  }

  @Override
  public int hashCode() {
    return Objects.hash(reason, name, referenceDocumentUri, quantities, ignoreCompareQuantity);
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public static class Builder {
    
    private String reason;

    
    private String name;

    
    private String referenceDocumentUri;

    
    private List<InventoryQuantityInput> quantities;

    
    private Boolean ignoreCompareQuantity = false;

    public InventorySetQuantitiesInput build() {
      InventorySetQuantitiesInput result = new InventorySetQuantitiesInput();
      result.reason = this.reason;
      result.name = this.name;
      result.referenceDocumentUri = this.referenceDocumentUri;
      result.quantities = this.quantities;
      result.ignoreCompareQuantity = this.ignoreCompareQuantity;
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

    
    public Builder quantities(List<InventoryQuantityInput> quantities) {
      this.quantities = quantities;
      return this;
    }

    
    public Builder ignoreCompareQuantity(Boolean ignoreCompareQuantity) {
      this.ignoreCompareQuantity = ignoreCompareQuantity;
      return this;
    }
  }
}
