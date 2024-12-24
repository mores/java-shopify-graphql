package com.shopify.types;

import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.List;
import java.util.Objects;


public class ProductBundleComponentQuantityOption {
  
  private String name;

  
  private ProductOption parentOption;

  
  private List<ProductBundleComponentQuantityOptionValue> values;

  public ProductBundleComponentQuantityOption() {
  }

  
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  
  public ProductOption getParentOption() {
    return parentOption;
  }

  public void setParentOption(ProductOption parentOption) {
    this.parentOption = parentOption;
  }

  
  public List<ProductBundleComponentQuantityOptionValue> getValues() {
    return values;
  }

  public void setValues(List<ProductBundleComponentQuantityOptionValue> values) {
    this.values = values;
  }

  @Override
  public String toString() {
    return "ProductBundleComponentQuantityOption{name='" + name + "', parentOption='" + parentOption + "', values='" + values + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    ProductBundleComponentQuantityOption that = (ProductBundleComponentQuantityOption) o;
    return Objects.equals(name, that.name) &&
        Objects.equals(parentOption, that.parentOption) &&
        Objects.equals(values, that.values);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, parentOption, values);
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public static class Builder {
    
    private String name;

    
    private ProductOption parentOption;

    
    private List<ProductBundleComponentQuantityOptionValue> values;

    public ProductBundleComponentQuantityOption build() {
      ProductBundleComponentQuantityOption result = new ProductBundleComponentQuantityOption();
      result.name = this.name;
      result.parentOption = this.parentOption;
      result.values = this.values;
      return result;
    }

    
    public Builder name(String name) {
      this.name = name;
      return this;
    }

    
    public Builder parentOption(ProductOption parentOption) {
      this.parentOption = parentOption;
      return this;
    }

    
    public Builder values(List<ProductBundleComponentQuantityOptionValue> values) {
      this.values = values;
      return this;
    }
  }
}
