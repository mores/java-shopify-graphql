package com.shopify.types;

import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.List;
import java.util.Objects;


public class ProductPublishPayload {
  
  private Product product;

  
  private List<ProductPublication> productPublications;

  
  private Shop shop;

  
  private List<UserError> userErrors;

  public ProductPublishPayload() {
  }

  
  public Product getProduct() {
    return product;
  }

  public void setProduct(Product product) {
    this.product = product;
  }

  
  public List<ProductPublication> getProductPublications() {
    return productPublications;
  }

  public void setProductPublications(List<ProductPublication> productPublications) {
    this.productPublications = productPublications;
  }

  
  public Shop getShop() {
    return shop;
  }

  public void setShop(Shop shop) {
    this.shop = shop;
  }

  
  public List<UserError> getUserErrors() {
    return userErrors;
  }

  public void setUserErrors(List<UserError> userErrors) {
    this.userErrors = userErrors;
  }

  @Override
  public String toString() {
    return "ProductPublishPayload{product='" + product + "', productPublications='" + productPublications + "', shop='" + shop + "', userErrors='" + userErrors + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    ProductPublishPayload that = (ProductPublishPayload) o;
    return Objects.equals(product, that.product) &&
        Objects.equals(productPublications, that.productPublications) &&
        Objects.equals(shop, that.shop) &&
        Objects.equals(userErrors, that.userErrors);
  }

  @Override
  public int hashCode() {
    return Objects.hash(product, productPublications, shop, userErrors);
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public static class Builder {
    
    private Product product;

    
    private List<ProductPublication> productPublications;

    
    private Shop shop;

    
    private List<UserError> userErrors;

    public ProductPublishPayload build() {
      ProductPublishPayload result = new ProductPublishPayload();
      result.product = this.product;
      result.productPublications = this.productPublications;
      result.shop = this.shop;
      result.userErrors = this.userErrors;
      return result;
    }

    
    public Builder product(Product product) {
      this.product = product;
      return this;
    }

    
    public Builder productPublications(List<ProductPublication> productPublications) {
      this.productPublications = productPublications;
      return this;
    }

    
    public Builder shop(Shop shop) {
      this.shop = shop;
      return this;
    }

    
    public Builder userErrors(List<UserError> userErrors) {
      this.userErrors = userErrors;
      return this;
    }
  }
}
