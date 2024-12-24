package com.shopify.types;

import com.fasterxml.jackson.annotation.JsonTypeInfo;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.Objects;


@JsonTypeInfo(
    use = JsonTypeInfo.Id.NONE
)
public class ProductVariantComponent implements com.shopify.types.Node {
  
  private String id;

  
  private ProductVariant productVariant;

  
  private int quantity;

  public ProductVariantComponent() {
  }

  
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  
  public ProductVariant getProductVariant() {
    return productVariant;
  }

  public void setProductVariant(ProductVariant productVariant) {
    this.productVariant = productVariant;
  }

  
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
    
    private String id;

    
    private ProductVariant productVariant;

    
    private int quantity;

    public ProductVariantComponent build() {
      ProductVariantComponent result = new ProductVariantComponent();
      result.id = this.id;
      result.productVariant = this.productVariant;
      result.quantity = this.quantity;
      return result;
    }

    
    public Builder id(String id) {
      this.id = id;
      return this;
    }

    
    public Builder productVariant(ProductVariant productVariant) {
      this.productVariant = productVariant;
      return this;
    }

    
    public Builder quantity(int quantity) {
      this.quantity = quantity;
      return this;
    }
  }
}
