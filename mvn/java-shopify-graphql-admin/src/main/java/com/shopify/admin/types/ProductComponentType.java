package com.shopify.admin.types;

import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.Objects;

/**
 * The product component information.
 */
public class ProductComponentType {
  /**
   * The list of products' variants that are components.
   */
  private ProductVariantConnection componentVariants;

  /**
   * The number of component variants for the product component.
   */
  private Count componentVariantsCount;

  /**
   * The list of products' variants that are not components.
   */
  private ProductVariantConnection nonComponentVariants;

  /**
   * The number of non_components variants for the product component.
   */
  private Count nonComponentVariantsCount;

  /**
   * The product that's a component.
   */
  private Product product;

  public ProductComponentType() {
  }

  /**
   * The list of products' variants that are components.
   */
  public ProductVariantConnection getComponentVariants() {
    return componentVariants;
  }

  public void setComponentVariants(ProductVariantConnection componentVariants) {
    this.componentVariants = componentVariants;
  }

  /**
   * The number of component variants for the product component.
   */
  public Count getComponentVariantsCount() {
    return componentVariantsCount;
  }

  public void setComponentVariantsCount(Count componentVariantsCount) {
    this.componentVariantsCount = componentVariantsCount;
  }

  /**
   * The list of products' variants that are not components.
   */
  public ProductVariantConnection getNonComponentVariants() {
    return nonComponentVariants;
  }

  public void setNonComponentVariants(ProductVariantConnection nonComponentVariants) {
    this.nonComponentVariants = nonComponentVariants;
  }

  /**
   * The number of non_components variants for the product component.
   */
  public Count getNonComponentVariantsCount() {
    return nonComponentVariantsCount;
  }

  public void setNonComponentVariantsCount(Count nonComponentVariantsCount) {
    this.nonComponentVariantsCount = nonComponentVariantsCount;
  }

  /**
   * The product that's a component.
   */
  public Product getProduct() {
    return product;
  }

  public void setProduct(Product product) {
    this.product = product;
  }

  @Override
  public String toString() {
    return "ProductComponentType{componentVariants='" + componentVariants + "', componentVariantsCount='" + componentVariantsCount + "', nonComponentVariants='" + nonComponentVariants + "', nonComponentVariantsCount='" + nonComponentVariantsCount + "', product='" + product + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    ProductComponentType that = (ProductComponentType) o;
    return Objects.equals(componentVariants, that.componentVariants) &&
        Objects.equals(componentVariantsCount, that.componentVariantsCount) &&
        Objects.equals(nonComponentVariants, that.nonComponentVariants) &&
        Objects.equals(nonComponentVariantsCount, that.nonComponentVariantsCount) &&
        Objects.equals(product, that.product);
  }

  @Override
  public int hashCode() {
    return Objects.hash(componentVariants, componentVariantsCount, nonComponentVariants, nonComponentVariantsCount, product);
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public static class Builder {
    /**
     * The list of products' variants that are components.
     */
    private ProductVariantConnection componentVariants;

    /**
     * The number of component variants for the product component.
     */
    private Count componentVariantsCount;

    /**
     * The list of products' variants that are not components.
     */
    private ProductVariantConnection nonComponentVariants;

    /**
     * The number of non_components variants for the product component.
     */
    private Count nonComponentVariantsCount;

    /**
     * The product that's a component.
     */
    private Product product;

    public ProductComponentType build() {
      ProductComponentType result = new ProductComponentType();
      result.componentVariants = this.componentVariants;
      result.componentVariantsCount = this.componentVariantsCount;
      result.nonComponentVariants = this.nonComponentVariants;
      result.nonComponentVariantsCount = this.nonComponentVariantsCount;
      result.product = this.product;
      return result;
    }

    /**
     * The list of products' variants that are components.
     */
    public Builder componentVariants(ProductVariantConnection componentVariants) {
      this.componentVariants = componentVariants;
      return this;
    }

    /**
     * The number of component variants for the product component.
     */
    public Builder componentVariantsCount(Count componentVariantsCount) {
      this.componentVariantsCount = componentVariantsCount;
      return this;
    }

    /**
     * The list of products' variants that are not components.
     */
    public Builder nonComponentVariants(ProductVariantConnection nonComponentVariants) {
      this.nonComponentVariants = nonComponentVariants;
      return this;
    }

    /**
     * The number of non_components variants for the product component.
     */
    public Builder nonComponentVariantsCount(Count nonComponentVariantsCount) {
      this.nonComponentVariantsCount = nonComponentVariantsCount;
      return this;
    }

    /**
     * The product that's a component.
     */
    public Builder product(Product product) {
      this.product = product;
      return this;
    }
  }
}
