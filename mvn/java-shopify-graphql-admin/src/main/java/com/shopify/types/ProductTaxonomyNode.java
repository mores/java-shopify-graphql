package com.shopify.types;

import com.fasterxml.jackson.annotation.JsonTypeInfo;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.Objects;

/**
 * Represents a [Shopify product taxonomy](https://shopify.github.io/product-taxonomy/releases/unstable/?categoryId=sg-4-17-2-17) node.
 */
@JsonTypeInfo(
    use = JsonTypeInfo.Id.NONE
)
public class ProductTaxonomyNode implements com.shopify.types.Node {
  /**
   * The full name of the product taxonomy node. For example,  Animals & Pet Supplies > Pet Supplies > Dog Supplies > Dog Beds.
   */
  private String fullName;

  /**
   * The ID of the product taxonomy node.
   */
  private String id;

  /**
   * Whether the node is a leaf node.
   */
  private boolean isLeaf;

  /**
   * Whether the node is a root node.
   */
  private boolean isRoot;

  /**
   * The name of the product taxonomy node. For example, Dog Beds.
   */
  private String name;

  public ProductTaxonomyNode() {
  }

  /**
   * The full name of the product taxonomy node. For example,  Animals & Pet Supplies > Pet Supplies > Dog Supplies > Dog Beds.
   */
  public String getFullName() {
    return fullName;
  }

  public void setFullName(String fullName) {
    this.fullName = fullName;
  }

  /**
   * The ID of the product taxonomy node.
   */
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  /**
   * Whether the node is a leaf node.
   */
  public boolean getIsLeaf() {
    return isLeaf;
  }

  public void setIsLeaf(boolean isLeaf) {
    this.isLeaf = isLeaf;
  }

  /**
   * Whether the node is a root node.
   */
  public boolean getIsRoot() {
    return isRoot;
  }

  public void setIsRoot(boolean isRoot) {
    this.isRoot = isRoot;
  }

  /**
   * The name of the product taxonomy node. For example, Dog Beds.
   */
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
    /**
     * The full name of the product taxonomy node. For example,  Animals & Pet Supplies > Pet Supplies > Dog Supplies > Dog Beds.
     */
    private String fullName;

    /**
     * The ID of the product taxonomy node.
     */
    private String id;

    /**
     * Whether the node is a leaf node.
     */
    private boolean isLeaf;

    /**
     * Whether the node is a root node.
     */
    private boolean isRoot;

    /**
     * The name of the product taxonomy node. For example, Dog Beds.
     */
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

    /**
     * The full name of the product taxonomy node. For example,  Animals & Pet Supplies > Pet Supplies > Dog Supplies > Dog Beds.
     */
    public Builder fullName(String fullName) {
      this.fullName = fullName;
      return this;
    }

    /**
     * The ID of the product taxonomy node.
     */
    public Builder id(String id) {
      this.id = id;
      return this;
    }

    /**
     * Whether the node is a leaf node.
     */
    public Builder isLeaf(boolean isLeaf) {
      this.isLeaf = isLeaf;
      return this;
    }

    /**
     * Whether the node is a root node.
     */
    public Builder isRoot(boolean isRoot) {
      this.isRoot = isRoot;
      return this;
    }

    /**
     * The name of the product taxonomy node. For example, Dog Beds.
     */
    public Builder name(String name) {
      this.name = name;
      return this;
    }
  }
}
