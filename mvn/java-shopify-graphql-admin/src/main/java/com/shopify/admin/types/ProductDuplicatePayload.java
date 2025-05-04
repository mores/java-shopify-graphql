package com.shopify.admin.types;

import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.List;
import java.util.Objects;

/**
 * Return type for `productDuplicate` mutation.
 */
public class ProductDuplicatePayload {
  /**
   * The asynchronous job that duplicates the product images.
   */
  private Job imageJob;

  /**
   * The duplicated product.
   */
  private Product newProduct;

  /**
   * The product duplicate operation, returned when run in asynchronous mode.
   */
  private ProductDuplicateOperation productDuplicateOperation;

  /**
   * The user's shop.
   */
  private Shop shop;

  /**
   * The list of errors that occurred from executing the mutation.
   */
  private List<UserError> userErrors;

  public ProductDuplicatePayload() {
  }

  /**
   * The asynchronous job that duplicates the product images.
   */
  public Job getImageJob() {
    return imageJob;
  }

  public void setImageJob(Job imageJob) {
    this.imageJob = imageJob;
  }

  /**
   * The duplicated product.
   */
  public Product getNewProduct() {
    return newProduct;
  }

  public void setNewProduct(Product newProduct) {
    this.newProduct = newProduct;
  }

  /**
   * The product duplicate operation, returned when run in asynchronous mode.
   */
  public ProductDuplicateOperation getProductDuplicateOperation() {
    return productDuplicateOperation;
  }

  public void setProductDuplicateOperation(ProductDuplicateOperation productDuplicateOperation) {
    this.productDuplicateOperation = productDuplicateOperation;
  }

  /**
   * The user's shop.
   */
  public Shop getShop() {
    return shop;
  }

  public void setShop(Shop shop) {
    this.shop = shop;
  }

  /**
   * The list of errors that occurred from executing the mutation.
   */
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
    /**
     * The asynchronous job that duplicates the product images.
     */
    private Job imageJob;

    /**
     * The duplicated product.
     */
    private Product newProduct;

    /**
     * The product duplicate operation, returned when run in asynchronous mode.
     */
    private ProductDuplicateOperation productDuplicateOperation;

    /**
     * The user's shop.
     */
    private Shop shop;

    /**
     * The list of errors that occurred from executing the mutation.
     */
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

    /**
     * The asynchronous job that duplicates the product images.
     */
    public Builder imageJob(Job imageJob) {
      this.imageJob = imageJob;
      return this;
    }

    /**
     * The duplicated product.
     */
    public Builder newProduct(Product newProduct) {
      this.newProduct = newProduct;
      return this;
    }

    /**
     * The product duplicate operation, returned when run in asynchronous mode.
     */
    public Builder productDuplicateOperation(ProductDuplicateOperation productDuplicateOperation) {
      this.productDuplicateOperation = productDuplicateOperation;
      return this;
    }

    /**
     * The user's shop.
     */
    public Builder shop(Shop shop) {
      this.shop = shop;
      return this;
    }

    /**
     * The list of errors that occurred from executing the mutation.
     */
    public Builder userErrors(List<UserError> userErrors) {
      this.userErrors = userErrors;
      return this;
    }
  }
}
