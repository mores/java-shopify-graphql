package com.shopify.types;

import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.List;
import java.util.Objects;

/**
 * The input fields for specifying a product to publish and the channels to publish it to.
 */
public class ProductPublishInput {
  /**
   * The product to create or update publications for.
   */
  private String id;

  /**
   * The publication that the product is published to.
   */
  private List<ProductPublicationInput> productPublications;

  public ProductPublishInput() {
  }

  /**
   * The product to create or update publications for.
   */
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  /**
   * The publication that the product is published to.
   */
  public List<ProductPublicationInput> getProductPublications() {
    return productPublications;
  }

  public void setProductPublications(List<ProductPublicationInput> productPublications) {
    this.productPublications = productPublications;
  }

  @Override
  public String toString() {
    return "ProductPublishInput{id='" + id + "', productPublications='" + productPublications + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    ProductPublishInput that = (ProductPublishInput) o;
    return Objects.equals(id, that.id) &&
        Objects.equals(productPublications, that.productPublications);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, productPublications);
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public static class Builder {
    /**
     * The product to create or update publications for.
     */
    private String id;

    /**
     * The publication that the product is published to.
     */
    private List<ProductPublicationInput> productPublications;

    public ProductPublishInput build() {
      ProductPublishInput result = new ProductPublishInput();
      result.id = this.id;
      result.productPublications = this.productPublications;
      return result;
    }

    /**
     * The product to create or update publications for.
     */
    public Builder id(String id) {
      this.id = id;
      return this;
    }

    /**
     * The publication that the product is published to.
     */
    public Builder productPublications(List<ProductPublicationInput> productPublications) {
      this.productPublications = productPublications;
      return this;
    }
  }
}
