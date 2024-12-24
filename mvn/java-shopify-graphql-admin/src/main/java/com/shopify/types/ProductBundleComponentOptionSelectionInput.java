package com.shopify.types;

import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.List;
import java.util.Objects;


public class ProductBundleComponentOptionSelectionInput {
  
  private String componentOptionId;

  
  private String name;

  
  private List<String> values;

  public ProductBundleComponentOptionSelectionInput() {
  }

  
  public String getComponentOptionId() {
    return componentOptionId;
  }

  public void setComponentOptionId(String componentOptionId) {
    this.componentOptionId = componentOptionId;
  }

  
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  
  public List<String> getValues() {
    return values;
  }

  public void setValues(List<String> values) {
    this.values = values;
  }

  @Override
  public String toString() {
    return "ProductBundleComponentOptionSelectionInput{componentOptionId='" + componentOptionId + "', name='" + name + "', values='" + values + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    ProductBundleComponentOptionSelectionInput that = (ProductBundleComponentOptionSelectionInput) o;
    return Objects.equals(componentOptionId, that.componentOptionId) &&
        Objects.equals(name, that.name) &&
        Objects.equals(values, that.values);
  }

  @Override
  public int hashCode() {
    return Objects.hash(componentOptionId, name, values);
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public static class Builder {
    
    private String componentOptionId;

    
    private String name;

    
    private List<String> values;

    public ProductBundleComponentOptionSelectionInput build() {
      ProductBundleComponentOptionSelectionInput result = new ProductBundleComponentOptionSelectionInput();
      result.componentOptionId = this.componentOptionId;
      result.name = this.name;
      result.values = this.values;
      return result;
    }

    
    public Builder componentOptionId(String componentOptionId) {
      this.componentOptionId = componentOptionId;
      return this;
    }

    
    public Builder name(String name) {
      this.name = name;
      return this;
    }

    
    public Builder values(List<String> values) {
      this.values = values;
      return this;
    }
  }
}
