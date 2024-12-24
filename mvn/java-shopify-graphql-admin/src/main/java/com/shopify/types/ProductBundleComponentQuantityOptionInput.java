package com.shopify.types;

import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.List;
import java.util.Objects;


public class ProductBundleComponentQuantityOptionInput {
  
  private String name;

  
  private List<ProductBundleComponentQuantityOptionValueInput> values;

  public ProductBundleComponentQuantityOptionInput() {
  }

  
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  
  public List<ProductBundleComponentQuantityOptionValueInput> getValues() {
    return values;
  }

  public void setValues(List<ProductBundleComponentQuantityOptionValueInput> values) {
    this.values = values;
  }

  @Override
  public String toString() {
    return "ProductBundleComponentQuantityOptionInput{name='" + name + "', values='" + values + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    ProductBundleComponentQuantityOptionInput that = (ProductBundleComponentQuantityOptionInput) o;
    return Objects.equals(name, that.name) &&
        Objects.equals(values, that.values);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, values);
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public static class Builder {
    
    private String name;

    
    private List<ProductBundleComponentQuantityOptionValueInput> values;

    public ProductBundleComponentQuantityOptionInput build() {
      ProductBundleComponentQuantityOptionInput result = new ProductBundleComponentQuantityOptionInput();
      result.name = this.name;
      result.values = this.values;
      return result;
    }

    
    public Builder name(String name) {
      this.name = name;
      return this;
    }

    
    public Builder values(List<ProductBundleComponentQuantityOptionValueInput> values) {
      this.values = values;
      return this;
    }
  }
}
