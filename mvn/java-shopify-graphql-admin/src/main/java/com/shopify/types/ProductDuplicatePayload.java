package com.shopify.types;

import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.List;
import java.util.Objects;


public class ProductDuplicatePayload {
  
  private Job imageJob;

  
  private Product newProduct;

  
  private ProductDuplicateOperation productDuplicateOperation;

  
  private Shop shop;

  
  private List<UserError> userErrors;

  public ProductDuplicatePayload() {
  }

  
  public Job getImageJob() {
    return imageJob;
  }

  public void setImageJob(Job imageJob) {
    this.imageJob = imageJob;
  }

  
  public Product getNewProduct() {
    return newProduct;
  }

  public void setNewProduct(Product newProduct) {
    this.newProduct = newProduct;
  }

  
  public ProductDuplicateOperation getProductDuplicateOperation() {
    return productDuplicateOperation;
  }

  public void setProductDuplicateOperation(ProductDuplicateOperation productDuplicateOperation) {
    this.productDuplicateOperation = productDuplicateOperation;
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
    return "ProductDuplicatePayload{imageJob='" + imageJob + "', newProduct='" + newProduct + "', productDuplicateOperation='" + productDuplicateOperation + "', shop='" + shop + "', userErrors='" + userErrors + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    ProductDuplicatePayload that = (ProductDuplicatePayload) o;
    return Objects.equals(imageJob, that.imageJob) &&
        Objects.equals(newProduct, that.newProduct) &&
        Objects.equals(productDuplicateOperation, that.productDuplicateOperation) &&
        Objects.equals(shop, that.shop) &&
        Objects.equals(userErrors, that.userErrors);
  }

  @Override
  public int hashCode() {
    return Objects.hash(imageJob, newProduct, productDuplicateOperation, shop, userErrors);
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public static class Builder {
    
    private Job imageJob;

    
    private Product newProduct;

    
    private ProductDuplicateOperation productDuplicateOperation;

    
    private Shop shop;

    
    private List<UserError> userErrors;

    public ProductDuplicatePayload build() {
      ProductDuplicatePayload result = new ProductDuplicatePayload();
      result.imageJob = this.imageJob;
      result.newProduct = this.newProduct;
      result.productDuplicateOperation = this.productDuplicateOperation;
      result.shop = this.shop;
      result.userErrors = this.userErrors;
      return result;
    }

    
    public Builder imageJob(Job imageJob) {
      this.imageJob = imageJob;
      return this;
    }

    
    public Builder newProduct(Product newProduct) {
      this.newProduct = newProduct;
      return this;
    }

    
    public Builder productDuplicateOperation(ProductDuplicateOperation productDuplicateOperation) {
      this.productDuplicateOperation = productDuplicateOperation;
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
