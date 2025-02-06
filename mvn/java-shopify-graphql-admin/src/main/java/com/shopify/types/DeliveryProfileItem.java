package com.shopify.types;

import com.fasterxml.jackson.annotation.JsonTypeInfo;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.Objects;

/**
 * A product and the subset of associated variants that are part of this delivery profile.
 */
@JsonTypeInfo(
    use = JsonTypeInfo.Id.NONE
)
public class DeliveryProfileItem implements com.shopify.types.Node {
  /**
   * A globally-unique ID.
   */
  private String id;

  /**
   * A product associated with this profile.
   */
  private Product product;

  /**
   * The product variants associated with this delivery profile.
   */
  private ProductVariantConnection variants;

  public DeliveryProfileItem() {
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
   * A product associated with this profile.
   */
  public Product getProduct() {
    return product;
  }

  public void setProduct(Product product) {
    this.product = product;
  }

  /**
   * The product variants associated with this delivery profile.
   */
  public ProductVariantConnection getVariants() {
    return variants;
  }

  public void setVariants(ProductVariantConnection variants) {
    this.variants = variants;
  }

  @Override
  public String toString() {
    return "DeliveryProfileItem{id='" + id + "', product='" + product + "', variants='" + variants + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    DeliveryProfileItem that = (DeliveryProfileItem) o;
    return Objects.equals(id, that.id) &&
        Objects.equals(product, that.product) &&
        Objects.equals(variants, that.variants);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, product, variants);
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
     * A product associated with this profile.
     */
    private Product product;

    /**
     * The product variants associated with this delivery profile.
     */
    private ProductVariantConnection variants;

    public DeliveryProfileItem build() {
      DeliveryProfileItem result = new DeliveryProfileItem();
      result.id = this.id;
      result.product = this.product;
      result.variants = this.variants;
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
     * A product associated with this profile.
     */
    public Builder product(Product product) {
      this.product = product;
      return this;
    }

    /**
     * The product variants associated with this delivery profile.
     */
    public Builder variants(ProductVariantConnection variants) {
      this.variants = variants;
      return this;
    }
  }
}
