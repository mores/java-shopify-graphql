package com.shopify.types;

import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.List;
import java.util.Objects;


public class ProductBundleComponentOptionSelection {
  
  private ProductOption componentOption;

  
  private ProductOption parentOption;

  
  private List<ProductBundleComponentOptionSelectionValue> values;

  public ProductBundleComponentOptionSelection() {
  }

  
  public ProductOption getComponentOption() {
    return componentOption;
  }

  public void setComponentOption(ProductOption componentOption) {
    this.componentOption = componentOption;
  }

  
  public ProductOption getParentOption() {
    return parentOption;
  }

  public void setParentOption(ProductOption parentOption) {
    this.parentOption = parentOption;
  }

  
  public List<ProductBundleComponentOptionSelectionValue> getValues() {
    return values;
  }

  public void setValues(List<ProductBundleComponentOptionSelectionValue> values) {
    this.values = values;
  }

  @Override
  public String toString() {
    return "ProductBundleComponentOptionSelection{componentOption='" + componentOption + "', parentOption='" + parentOption + "', values='" + values + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    ProductBundleComponentOptionSelection that = (ProductBundleComponentOptionSelection) o;
    return Objects.equals(componentOption, that.componentOption) &&
        Objects.equals(parentOption, that.parentOption) &&
        Objects.equals(values, that.values);
  }

  @Override
  public int hashCode() {
    return Objects.hash(componentOption, parentOption, values);
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public static class Builder {
    
    private ProductOption componentOption;

    
    private ProductOption parentOption;

    
    private List<ProductBundleComponentOptionSelectionValue> values;

    public ProductBundleComponentOptionSelection build() {
      ProductBundleComponentOptionSelection result = new ProductBundleComponentOptionSelection();
      result.componentOption = this.componentOption;
      result.parentOption = this.parentOption;
      result.values = this.values;
      return result;
    }

    
    public Builder componentOption(ProductOption componentOption) {
      this.componentOption = componentOption;
      return this;
    }

    
    public Builder parentOption(ProductOption parentOption) {
      this.parentOption = parentOption;
      return this;
    }

    
    public Builder values(List<ProductBundleComponentOptionSelectionValue> values) {
      this.values = values;
      return this;
    }
  }
}
