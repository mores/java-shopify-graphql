package com.shopify.types;

import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.List;
import java.util.Objects;

/**
 * The input fields for specifying a product to unpublish from a channel and the sales channels to unpublish it from.
 */
public class ProductUnpublishInput {
  /**
   * The ID of the product to create or update publications for.
   */
  private String id;

  /**
   * The channels to unpublish the product from.
   */
  private List<ProductPublicationInput> productPublications;

  public ProductUnpublishInput() {
  }

  /**
   * The ID of the product to create or update publications for.
   */
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  /**
   * The channels to unpublish the product from.
   */
  public List<ProductPublicationInput> getProductPublications() {
    return productPublications;
  }

  public void setProductPublications(List<ProductPublicationInput> productPublications) {
    this.productPublications = productPublications;
  }

  @Override
  public String toString() {
    return "ProductUnpublishInput{id='" + id + "', productPublications='" + productPublications + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    ProductUnpublishInput that = (ProductUnpublishInput) o;
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
     * The ID of the product to create or update publications for.
     */
    private String id;

    /**
     * The channels to unpublish the product from.
     */
    private List<ProductPublicationInput> productPublications;

    public ProductUnpublishInput build() {
      ProductUnpublishInput result = new ProductUnpublishInput();
      result.id = this.id;
      result.productPublications = this.productPublications;
      return result;
    }

    /**
     * The ID of the product to create or update publications for.
     */
    public Builder id(String id) {
      this.id = id;
      return this;
    }

    /**
     * The channels to unpublish the product from.
     */
    public Builder productPublications(List<ProductPublicationInput> productPublications) {
      this.productPublications = productPublications;
      return this;
    }
  }
}
