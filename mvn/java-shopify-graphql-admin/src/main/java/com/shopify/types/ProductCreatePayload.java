package com.shopify.types;

import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.List;
import java.util.Objects;

/**
 * Return type for `productCreate` mutation.
 */
public class ProductCreatePayload {
  /**
   * The product object.
   */
  private Product product;

  /**
   * The shop associated with the product.
   */
  private Shop shop;

  /**
   * The list of errors that occurred from executing the mutation.
   */
  private List<UserError> userErrors;

  public ProductCreatePayload() {
  }

  /**
   * The product object.
   */
  public Product getProduct() {
    return product;
  }

  public void setProduct(Product product) {
    this.product = product;
  }

  /**
   * The shop associated with the product.
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
    return "ProductCreatePayload{product='" + product + "', shop='" + shop + "', userErrors='" + userErrors + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    ProductCreatePayload that = (ProductCreatePayload) o;
    return Objects.equals(product, that.product) &&
        Objects.equals(shop, that.shop) &&
        Objects.equals(userErrors, that.userErrors);
  }

  @Override
  public int hashCode() {
    return Objects.hash(product, shop, userErrors);
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public static class Builder {
    /**
     * The product object.
     */
    private Product product;

    /**
     * The shop associated with the product.
     */
    private Shop shop;

    /**
     * The list of errors that occurred from executing the mutation.
     */
    private List<UserError> userErrors;

    public ProductCreatePayload build() {
      ProductCreatePayload result = new ProductCreatePayload();
      result.product = this.product;
      result.shop = this.shop;
      result.userErrors = this.userErrors;
      return result;
    }

    /**
     * The product object.
     */
    public Builder product(Product product) {
      this.product = product;
      return this;
    }

    /**
     * The shop associated with the product.
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
