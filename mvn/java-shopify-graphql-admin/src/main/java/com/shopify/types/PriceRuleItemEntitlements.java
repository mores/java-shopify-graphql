package com.shopify.types;

import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.Objects;

/**
 * The items to which this price rule applies. This may be multiple products,
 * product variants, collections or combinations of the aforementioned.
 */
public class PriceRuleItemEntitlements {
  /**
   * The collections to which the price rule applies.
   */
  private CollectionConnection collections;

  /**
   * The product variants to which the price rule applies.
   */
  private ProductVariantConnection productVariants;

  /**
   * The products to which the price rule applies.
   */
  private ProductConnection products;

  /**
   * Whether the price rule applies to all line items.
   */
  private boolean targetAllLineItems;

  public PriceRuleItemEntitlements() {
  }

  /**
   * The collections to which the price rule applies.
   */
  public CollectionConnection getCollections() {
    return collections;
  }

  public void setCollections(CollectionConnection collections) {
    this.collections = collections;
  }

  /**
   * The product variants to which the price rule applies.
   */
  public ProductVariantConnection getProductVariants() {
    return productVariants;
  }

  public void setProductVariants(ProductVariantConnection productVariants) {
    this.productVariants = productVariants;
  }

  /**
   * The products to which the price rule applies.
   */
  public ProductConnection getProducts() {
    return products;
  }

  public void setProducts(ProductConnection products) {
    this.products = products;
  }

  /**
   * Whether the price rule applies to all line items.
   */
  public boolean getTargetAllLineItems() {
    return targetAllLineItems;
  }

  public void setTargetAllLineItems(boolean targetAllLineItems) {
    this.targetAllLineItems = targetAllLineItems;
  }

  @Override
  public String toString() {
    return "PriceRuleItemEntitlements{collections='" + collections + "', productVariants='" + productVariants + "', products='" + products + "', targetAllLineItems='" + targetAllLineItems + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    PriceRuleItemEntitlements that = (PriceRuleItemEntitlements) o;
    return Objects.equals(collections, that.collections) &&
        Objects.equals(productVariants, that.productVariants) &&
        Objects.equals(products, that.products) &&
        targetAllLineItems == that.targetAllLineItems;
  }

  @Override
  public int hashCode() {
    return Objects.hash(collections, productVariants, products, targetAllLineItems);
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public static class Builder {
    /**
     * The collections to which the price rule applies.
     */
    private CollectionConnection collections;

    /**
     * The product variants to which the price rule applies.
     */
    private ProductVariantConnection productVariants;

    /**
     * The products to which the price rule applies.
     */
    private ProductConnection products;

    /**
     * Whether the price rule applies to all line items.
     */
    private boolean targetAllLineItems;

    public PriceRuleItemEntitlements build() {
      PriceRuleItemEntitlements result = new PriceRuleItemEntitlements();
      result.collections = this.collections;
      result.productVariants = this.productVariants;
      result.products = this.products;
      result.targetAllLineItems = this.targetAllLineItems;
      return result;
    }

    /**
     * The collections to which the price rule applies.
     */
    public Builder collections(CollectionConnection collections) {
      this.collections = collections;
      return this;
    }

    /**
     * The product variants to which the price rule applies.
     */
    public Builder productVariants(ProductVariantConnection productVariants) {
      this.productVariants = productVariants;
      return this;
    }

    /**
     * The products to which the price rule applies.
     */
    public Builder products(ProductConnection products) {
      this.products = products;
      return this;
    }

    /**
     * Whether the price rule applies to all line items.
     */
    public Builder targetAllLineItems(boolean targetAllLineItems) {
      this.targetAllLineItems = targetAllLineItems;
      return this;
    }
  }
}
