package com.shopify.admin.types;

import com.fasterxml.jackson.annotation.JsonTypeInfo;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.List;
import java.util.Objects;

/**
 * An entity that represents details of an asynchronous
 * [ProductDuplicate](https://shopify.dev/api/admin-graphql/current/mutations/productDuplicate) mutation.
 *
 * By querying this entity with the
 * [productOperation](https://shopify.dev/api/admin-graphql/current/queries/productOperation) query
 * using the ID that was returned
 * [when the product was duplicated](https://shopify.dev/api/admin/migrate/new-product-model/sync-data#create-a-product-with-variants-and-options-asynchronously),
 * this can be used to check the status of an operation.
 *
 * The `status` field indicates whether the operation is `CREATED`, `ACTIVE`, or `COMPLETE`.
 *
 * The `product` field provides the details of the original product.
 *
 * The `newProduct` field provides the details of the new duplicate of the product.
 *
 * The `userErrors` field provides mutation errors that occurred during the operation.
 */
@JsonTypeInfo(
    use = JsonTypeInfo.Id.NONE
)
public class ProductDuplicateOperation implements com.shopify.admin.types.Node, com.shopify.admin.types.ProductOperation {
  /**
   * A globally-unique ID.
   */
  private String id;

  /**
   * The newly created duplicate of the original product.
   */
  private Product newProduct;

  /**
   * The product on which the operation is being performed.
   */
  private Product product;

  /**
   * The status of this operation.
   */
  private ProductOperationStatus status;

  /**
   * Returns mutation errors occurred during background mutation processing.
   */
  private List<UserError> userErrors;

  public ProductDuplicateOperation() {
  }

  /**
   * A globally-unique ID.
   */
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  /**
   * The newly created duplicate of the original product.
   */
  public Product getNewProduct() {
    return newProduct;
  }

  public void setNewProduct(Product newProduct) {
    this.newProduct = newProduct;
  }

  /**
   * The product on which the operation is being performed.
   */
  public Product getProduct() {
    return product;
  }

  public void setProduct(Product product) {
    this.product = product;
  }

  /**
   * The status of this operation.
   */
  public ProductOperationStatus getStatus() {
    return status;
  }

  public void setStatus(ProductOperationStatus status) {
    this.status = status;
  }

  /**
   * Returns mutation errors occurred during background mutation processing.
   */
  public List<UserError> getUserErrors() {
    return userErrors;
  }

  public void setUserErrors(List<UserError> userErrors) {
    this.userErrors = userErrors;
  }

  @Override
  public String toString() {
    return "ProductDuplicateOperation{id='" + id + "', newProduct='" + newProduct + "', product='" + product + "', status='" + status + "', userErrors='" + userErrors + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    ProductDuplicateOperation that = (ProductDuplicateOperation) o;
    return Objects.equals(id, that.id) &&
        Objects.equals(newProduct, that.newProduct) &&
        Objects.equals(product, that.product) &&
        Objects.equals(status, that.status) &&
        Objects.equals(userErrors, that.userErrors);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, newProduct, product, status, userErrors);
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public static class Builder {
    /**
     * A globally-unique ID.
     */
    private String id;

    /**
     * The newly created duplicate of the original product.
     */
    private Product newProduct;

    /**
     * The product on which the operation is being performed.
     */
    private Product product;

    /**
     * The status of this operation.
     */
    private ProductOperationStatus status;

    /**
     * Returns mutation errors occurred during background mutation processing.
     */
    private List<UserError> userErrors;

    public ProductDuplicateOperation build() {
      ProductDuplicateOperation result = new ProductDuplicateOperation();
      result.id = this.id;
      result.newProduct = this.newProduct;
      result.product = this.product;
      result.status = this.status;
      result.userErrors = this.userErrors;
      return result;
    }

    /**
     * A globally-unique ID.
     */
    public Builder id(String id) {
      this.id = id;
      return this;
    }

    /**
     * The newly created duplicate of the original product.
     */
    public Builder newProduct(Product newProduct) {
      this.newProduct = newProduct;
      return this;
    }

    /**
     * The product on which the operation is being performed.
     */
    public Builder product(Product product) {
      this.product = product;
      return this;
    }

    /**
     * The status of this operation.
     */
    public Builder status(ProductOperationStatus status) {
      this.status = status;
      return this;
    }

    /**
     * Returns mutation errors occurred during background mutation processing.
     */
    public Builder userErrors(List<UserError> userErrors) {
      this.userErrors = userErrors;
      return this;
    }
  }
}
