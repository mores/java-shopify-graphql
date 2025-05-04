package com.shopify.admin.types;

import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.Objects;

/**
 * Single or multiple line item products, product variants or collections required
 * for the price rule to be applicable, can also be provided in combination.
 */
public class PriceRuleLineItemPrerequisites {
  /**
   * The collections required for the price rule to be applicable.
   */
  private CollectionConnection collections;

  /**
   * The product variants required for the price rule to be applicable.
   */
  private ProductVariantConnection productVariants;

  /**
   * The products required for the price rule to be applicable.
   */
  private ProductConnection products;

  public PriceRuleLineItemPrerequisites() {
  }

  /**
   * The collections required for the price rule to be applicable.
   */
  public CollectionConnection getCollections() {
    return collections;
  }

  public void setCollections(CollectionConnection collections) {
    this.collections = collections;
  }

  /**
   * The product variants required for the price rule to be applicable.
   */
  public ProductVariantConnection getProductVariants() {
    return productVariants;
  }

  public void setProductVariants(ProductVariantConnection productVariants) {
    this.productVariants = productVariants;
  }

  /**
   * The products required for the price rule to be applicable.
   */
  public ProductConnection getProducts() {
    return products;
  }

  public void setProducts(ProductConnection products) {
    this.products = products;
  }

  @Override
  public String toString() {
    return "PriceRuleLineItemPrerequisites{collections='" + collections + "', productVariants='" + productVariants + "', products='" + products + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    PriceRuleLineItemPrerequisites that = (PriceRuleLineItemPrerequisites) o;
    return Objects.equals(collections, that.collections) &&
        Objects.equals(productVariants, that.productVariants) &&
        Objects.equals(products, that.products);
  }

  @Override
  public int hashCode() {
    return Objects.hash(collections, productVariants, products);
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public static class Builder {
    /**
     * The collections required for the price rule to be applicable.
     */
    private CollectionConnection collections;

    /**
     * The product variants required for the price rule to be applicable.
     */
    private ProductVariantConnection productVariants;

    /**
     * The products required for the price rule to be applicable.
     */
    private ProductConnection products;

    public PriceRuleLineItemPrerequisites build() {
      PriceRuleLineItemPrerequisites result = new PriceRuleLineItemPrerequisites();
      result.collections = this.collections;
      result.productVariants = this.productVariants;
      result.products = this.products;
      return result;
    }

    /**
     * The collections required for the price rule to be applicable.
     */
    public Builder collections(CollectionConnection collections) {
      this.collections = collections;
      return this;
    }

    /**
     * The product variants required for the price rule to be applicable.
     */
    public Builder productVariants(ProductVariantConnection productVariants) {
      this.productVariants = productVariants;
      return this;
    }

    /**
     * The products required for the price rule to be applicable.
     */
    public Builder products(ProductConnection products) {
      this.products = products;
      return this;
    }
  }
}
