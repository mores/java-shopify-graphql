package com.shopify.types;

import com.fasterxml.jackson.annotation.JsonTypeInfo;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.Objects;


@JsonTypeInfo(
    use = JsonTypeInfo.Id.NONE
)
public class DeliveryProfileItem implements com.shopify.types.Node {
  
  private String id;

  
  private Product product;

  
  private ProductVariantConnection variants;

  public DeliveryProfileItem() {
  }

  
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  
  public Product getProduct() {
    return product;
  }

  public void setProduct(Product product) {
    this.product = product;
  }

  
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
    
    private String id;

    
    private Product product;

    
    private ProductVariantConnection variants;

    public DeliveryProfileItem build() {
      DeliveryProfileItem result = new DeliveryProfileItem();
      result.id = this.id;
      result.product = this.product;
      result.variants = this.variants;
      return result;
    }

    
    public Builder id(String id) {
      this.id = id;
      return this;
    }

    
    public Builder product(Product product) {
      this.product = product;
      return this;
    }

    
    public Builder variants(ProductVariantConnection variants) {
      this.variants = variants;
      return this;
    }
  }
}
