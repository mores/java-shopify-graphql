package com.shopify.types;

import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.List;
import java.util.Objects;


public class ProductBundleUpdateInput {
  
  private String productId;

  
  private String title;

  
  private List<ProductBundleComponentInput> components;

  public ProductBundleUpdateInput() {
  }

  
  public String getProductId() {
    return productId;
  }

  public void setProductId(String productId) {
    this.productId = productId;
  }

  
  public String getTitle() {
    return title;
  }

  public void setTitle(String title) {
    this.title = title;
  }

  
  public List<ProductBundleComponentInput> getComponents() {
    return components;
  }

  public void setComponents(List<ProductBundleComponentInput> components) {
    this.components = components;
  }

  @Override
  public String toString() {
    return "ProductBundleUpdateInput{productId='" + productId + "', title='" + title + "', components='" + components + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    ProductBundleUpdateInput that = (ProductBundleUpdateInput) o;
    return Objects.equals(productId, that.productId) &&
        Objects.equals(title, that.title) &&
        Objects.equals(components, that.components);
  }

  @Override
  public int hashCode() {
    return Objects.hash(productId, title, components);
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public static class Builder {
    
    private String productId;

    
    private String title;

    
    private List<ProductBundleComponentInput> components;

    public ProductBundleUpdateInput build() {
      ProductBundleUpdateInput result = new ProductBundleUpdateInput();
      result.productId = this.productId;
      result.title = this.title;
      result.components = this.components;
      return result;
    }

    
    public Builder productId(String productId) {
      this.productId = productId;
      return this;
    }

    
    public Builder title(String title) {
      this.title = title;
      return this;
    }

    
    public Builder components(List<ProductBundleComponentInput> components) {
      this.components = components;
      return this;
    }
  }
}
