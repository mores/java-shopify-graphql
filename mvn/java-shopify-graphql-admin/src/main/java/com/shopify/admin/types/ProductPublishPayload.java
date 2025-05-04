package com.shopify.admin.types;

import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.List;
import java.util.Objects;

/**
 * Return type for `productPublish` mutation.
 */
public class ProductPublishPayload {
  /**
   * The product that has been published.
   */
  private Product product;

  /**
   * The channels where the product is published.
   */
  private List<ProductPublication> productPublications;

  /**
   * The user's shop.
   */
  private Shop shop;

  /**
   * The list of errors that occurred from executing the mutation.
   */
  private List<UserError> userErrors;

  public ProductPublishPayload() {
  }

  /**
   * The product that has been published.
   */
  public Product getProduct() {
    return product;
  }

  public void setProduct(Product product) {
    this.product = product;
  }

  /**
   * The channels where the product is published.
   */
  public List<ProductPublication> getProductPublications() {
    return productPublications;
  }

  public void setProductPublications(List<ProductPublication> productPublications) {
    this.productPublications = productPublications;
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
    /**
     * The product that has been published.
     */
    private Product product;

    /**
     * The channels where the product is published.
     */
    private List<ProductPublication> productPublications;

    /**
     * The user's shop.
     */
    private Shop shop;

    /**
     * The list of errors that occurred from executing the mutation.
     */
    private List<UserError> userErrors;

    public ProductPublishPayload build() {
      ProductPublishPayload result = new ProductPublishPayload();
      result.product = this.product;
      result.productPublications = this.productPublications;
      result.shop = this.shop;
      result.userErrors = this.userErrors;
      return result;
    }

    /**
     * The product that has been published.
     */
    public Builder product(Product product) {
      this.product = product;
      return this;
    }

    /**
     * The channels where the product is published.
     */
    public Builder productPublications(List<ProductPublication> productPublications) {
      this.productPublications = productPublications;
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
