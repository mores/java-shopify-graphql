package com.shopify.types;

import com.fasterxml.jackson.annotation.JsonTypeInfo;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.Objects;


@JsonTypeInfo(
    use = JsonTypeInfo.Id.NONE
)
public class ProductTaxonomyNode implements com.shopify.types.Node {
  
  private String fullName;

  
  private String id;

  
  private boolean isLeaf;

  
  private boolean isRoot;

  
  private String name;

  public ProductTaxonomyNode() {
  }

  
  public String getFullName() {
    return fullName;
  }

  public void setFullName(String fullName) {
    this.fullName = fullName;
  }

  
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  
  public boolean getIsLeaf() {
    return isLeaf;
  }

  public void setIsLeaf(boolean isLeaf) {
    this.isLeaf = isLeaf;
  }

  
  public boolean getIsRoot() {
    return isRoot;
  }

  public void setIsRoot(boolean isRoot) {
    this.isRoot = isRoot;
  }

  
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  @Override
  public String toString() {
    return "ProductTaxonomyNode{fullName='" + fullName + "', id='" + id + "', isLeaf='" + isLeaf + "', isRoot='" + isRoot + "', name='" + name + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    ProductTaxonomyNode that = (ProductTaxonomyNode) o;
    return Objects.equals(fullName, that.fullName) &&
        Objects.equals(id, that.id) &&
        isLeaf == that.isLeaf &&
        isRoot == that.isRoot &&
        Objects.equals(name, that.name);
  }

  @Override
  public int hashCode() {
    return Objects.hash(fullName, id, isLeaf, isRoot, name);
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public static class Builder {
    
    private String fullName;

    
    private String id;

    
    private boolean isLeaf;

    
    private boolean isRoot;

    
    private String name;

    public ProductTaxonomyNode build() {
      ProductTaxonomyNode result = new ProductTaxonomyNode();
      result.fullName = this.fullName;
      result.id = this.id;
      result.isLeaf = this.isLeaf;
      result.isRoot = this.isRoot;
      result.name = this.name;
      return result;
    }

    
    public Builder fullName(String fullName) {
      this.fullName = fullName;
      return this;
    }

    
    public Builder id(String id) {
      this.id = id;
      return this;
    }

    
    public Builder isLeaf(boolean isLeaf) {
      this.isLeaf = isLeaf;
      return this;
    }

    
    public Builder isRoot(boolean isRoot) {
      this.isRoot = isRoot;
      return this;
    }

    
    public Builder name(String name) {
      this.name = name;
      return this;
    }
  }
}
