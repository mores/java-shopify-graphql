package com.shopify.admin.types;

import com.fasterxml.jackson.annotation.JsonTypeInfo;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.Objects;

/**
 * A product variant component that is included within a bundle.
 *
 * These are the individual product variants that make up a bundle product,
 * where each component has a specific required quantity.
 */
@JsonTypeInfo(
    use = JsonTypeInfo.Id.NONE
)
public class ProductVariantComponent implements com.shopify.admin.types.Node {
  /**
   * A globally-unique ID.
   */
  private String id;

  /**
   * The product variant associated with the component.
   */
  private ProductVariant productVariant;

  /**
   * The required quantity of the component.
   */
  private int quantity;

  public ProductVariantComponent() {
  }

  /**
   * A globally-unique ID.
   */
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  /**
   * The product variant associated with the component.
   */
  public ProductVariant getProductVariant() {
    return productVariant;
  }

  public void setProductVariant(ProductVariant productVariant) {
    this.productVariant = productVariant;
  }

  /**
   * The required quantity of the component.
   */
  public int getQuantity() {
    return quantity;
  }

  public void setQuantity(int quantity) {
    this.quantity = quantity;
  }

  @Override
  public String toString() {
    return "ProductVariantComponent{id='" + id + "', productVariant='" + productVariant + "', quantity='" + quantity + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    ProductVariantComponent that = (ProductVariantComponent) o;
    return Objects.equals(id, that.id) &&
        Objects.equals(productVariant, that.productVariant) &&
        quantity == that.quantity;
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, productVariant, quantity);
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public static class Builder {
    /**
     * A globally-unique ID.
     */
    private String id;

    /**
     * The product variant associated with the component.
     */
    private ProductVariant productVariant;

    /**
     * The required quantity of the component.
     */
    private int quantity;

    public ProductVariantComponent build() {
      ProductVariantComponent result = new ProductVariantComponent();
      result.id = this.id;
      result.productVariant = this.productVariant;
      result.quantity = this.quantity;
      return result;
    }

    /**
     * A globally-unique ID.
     */
    public Builder id(String id) {
      this.id = id;
      return this;
    }

    /**
     * The product variant associated with the component.
     */
    public Builder productVariant(ProductVariant productVariant) {
      this.productVariant = productVariant;
      return this;
    }

    /**
     * The required quantity of the component.
     */
    public Builder quantity(int quantity) {
      this.quantity = quantity;
      return this;
    }
  }
}
