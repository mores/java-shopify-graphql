package com.shopify.types;

import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.List;
import java.util.Objects;


public class InventoryProperties {
  
  private List<InventoryQuantityName> quantityNames;

  public InventoryProperties() {
  }

  
  public List<InventoryQuantityName> getQuantityNames() {
    return quantityNames;
  }

  public void setQuantityNames(List<InventoryQuantityName> quantityNames) {
    this.quantityNames = quantityNames;
  }

  @Override
  public String toString() {
    return "InventoryProperties{quantityNames='" + quantityNames + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    InventoryProperties that = (InventoryProperties) o;
    return Objects.equals(quantityNames, that.quantityNames);
  }

  @Override
  public int hashCode() {
    return Objects.hash(quantityNames);
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public static class Builder {
    
    private List<InventoryQuantityName> quantityNames;

    public InventoryProperties build() {
      InventoryProperties result = new InventoryProperties();
      result.quantityNames = this.quantityNames;
      return result;
    }

    
    public Builder quantityNames(List<InventoryQuantityName> quantityNames) {
      this.quantityNames = quantityNames;
      return this;
    }
  }
}
