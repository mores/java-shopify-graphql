package com.shopify.admin.types;

import com.fasterxml.jackson.annotation.JsonTypeInfo;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.List;
import java.util.Objects;

/**
 * An entity that represents details of an asynchronous
 * [ProductDelete](https://shopify.dev/api/admin-graphql/current/mutations/productDelete) mutation.
 *
 * By querying this entity with the
 * [productOperation](https://shopify.dev/api/admin-graphql/current/queries/productOperation) query
 * using the ID that was returned when the product was deleted, this can be used to check the status of an operation.
 *
 * The `status` field indicates whether the operation is `CREATED`, `ACTIVE`, or `COMPLETE`.
 *
 * The `deletedProductId` field provides the ID of the deleted product.
 *
 * The `userErrors` field provides mutation errors that occurred during the operation.
 */
@JsonTypeInfo(
    use = JsonTypeInfo.Id.NONE
)
public class ProductDeleteOperation implements com.shopify.admin.types.Node, com.shopify.admin.types.ProductOperation {
  /**
   * The ID of the deleted product.
   */
  private String deletedProductId;

  /**
   * A globally-unique ID.
   */
  private String id;

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

  public ProductDeleteOperation() {
  }

  /**
   * The ID of the deleted product.
   */
  public String getDeletedProductId() {
    return deletedProductId;
  }

  public void setDeletedProductId(String deletedProductId) {
    this.deletedProductId = deletedProductId;
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
    return "ProductDeleteOperation{deletedProductId='" + deletedProductId + "', id='" + id + "', product='" + product + "', status='" + status + "', userErrors='" + userErrors + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    ProductDeleteOperation that = (ProductDeleteOperation) o;
    return Objects.equals(deletedProductId, that.deletedProductId) &&
        Objects.equals(id, that.id) &&
        Objects.equals(product, that.product) &&
        Objects.equals(status, that.status) &&
        Objects.equals(userErrors, that.userErrors);
  }

  @Override
  public int hashCode() {
    return Objects.hash(deletedProductId, id, product, status, userErrors);
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public static class Builder {
    /**
     * The ID of the deleted product.
     */
    private String deletedProductId;

    /**
     * A globally-unique ID.
     */
    private String id;

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

    public ProductDeleteOperation build() {
      ProductDeleteOperation result = new ProductDeleteOperation();
      result.deletedProductId = this.deletedProductId;
      result.id = this.id;
      result.product = this.product;
      result.status = this.status;
      result.userErrors = this.userErrors;
      return result;
    }

    /**
     * The ID of the deleted product.
     */
    public Builder deletedProductId(String deletedProductId) {
      this.deletedProductId = deletedProductId;
      return this;
    }

    /**
     * A globally-unique ID.
     */
    public Builder id(String id) {
      this.id = id;
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
