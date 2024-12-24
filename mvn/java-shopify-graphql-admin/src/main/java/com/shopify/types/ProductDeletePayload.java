package com.shopify.types;

import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.List;
import java.util.Objects;


public class ProductDeletePayload {
  
  private String deletedProductId;

  
  private ProductDeleteOperation productDeleteOperation;

  
  private Shop shop;

  
  private List<UserError> userErrors;

  public ProductDeletePayload() {
  }

  
  public String getDeletedProductId() {
    return deletedProductId;
  }

  public void setDeletedProductId(String deletedProductId) {
    this.deletedProductId = deletedProductId;
  }

  
  public ProductDeleteOperation getProductDeleteOperation() {
    return productDeleteOperation;
  }

  public void setProductDeleteOperation(ProductDeleteOperation productDeleteOperation) {
    this.productDeleteOperation = productDeleteOperation;
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
    return "ProductDeletePayload{deletedProductId='" + deletedProductId + "', productDeleteOperation='" + productDeleteOperation + "', shop='" + shop + "', userErrors='" + userErrors + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    ProductDeletePayload that = (ProductDeletePayload) o;
    return Objects.equals(deletedProductId, that.deletedProductId) &&
        Objects.equals(productDeleteOperation, that.productDeleteOperation) &&
        Objects.equals(shop, that.shop) &&
        Objects.equals(userErrors, that.userErrors);
  }

  @Override
  public int hashCode() {
    return Objects.hash(deletedProductId, productDeleteOperation, shop, userErrors);
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public static class Builder {
    
    private String deletedProductId;

    
    private ProductDeleteOperation productDeleteOperation;

    
    private Shop shop;

    
    private List<UserError> userErrors;

    public ProductDeletePayload build() {
      ProductDeletePayload result = new ProductDeletePayload();
      result.deletedProductId = this.deletedProductId;
      result.productDeleteOperation = this.productDeleteOperation;
      result.shop = this.shop;
      result.userErrors = this.userErrors;
      return result;
    }

    
    public Builder deletedProductId(String deletedProductId) {
      this.deletedProductId = deletedProductId;
      return this;
    }

    
    public Builder productDeleteOperation(ProductDeleteOperation productDeleteOperation) {
      this.productDeleteOperation = productDeleteOperation;
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
