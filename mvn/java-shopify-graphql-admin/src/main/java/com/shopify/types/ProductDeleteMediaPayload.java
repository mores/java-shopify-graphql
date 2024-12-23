package com.shopify.types;

import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.List;
import java.util.Objects;

/**
 * Return type for `productDeleteMedia` mutation.
 */
public class ProductDeleteMediaPayload {
  /**
   * List of media IDs which were deleted.
   */
  private List<String> deletedMediaIds;

  /**
   * List of product image IDs which were deleted.
   */
  private List<String> deletedProductImageIds;

  /**
   * The list of errors that occurred from executing the mutation.
   */
  private List<MediaUserError> mediaUserErrors;

  /**
   * The product associated with the deleted media.
   */
  private Product product;

  /**
   * The list of errors that occurred from executing the mutation.
   */
  private List<UserError> userErrors;

  public ProductDeleteMediaPayload() {
  }

  /**
   * List of media IDs which were deleted.
   */
  public List<String> getDeletedMediaIds() {
    return deletedMediaIds;
  }

  public void setDeletedMediaIds(List<String> deletedMediaIds) {
    this.deletedMediaIds = deletedMediaIds;
  }

  /**
   * List of product image IDs which were deleted.
   */
  public List<String> getDeletedProductImageIds() {
    return deletedProductImageIds;
  }

  public void setDeletedProductImageIds(List<String> deletedProductImageIds) {
    this.deletedProductImageIds = deletedProductImageIds;
  }

  /**
   * The list of errors that occurred from executing the mutation.
   */
  public List<MediaUserError> getMediaUserErrors() {
    return mediaUserErrors;
  }

  public void setMediaUserErrors(List<MediaUserError> mediaUserErrors) {
    this.mediaUserErrors = mediaUserErrors;
  }

  /**
   * The product associated with the deleted media.
   */
  public Product getProduct() {
    return product;
  }

  public void setProduct(Product product) {
    this.product = product;
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
    return "ProductDeleteMediaPayload{deletedMediaIds='" + deletedMediaIds + "', deletedProductImageIds='" + deletedProductImageIds + "', mediaUserErrors='" + mediaUserErrors + "', product='" + product + "', userErrors='" + userErrors + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    ProductDeleteMediaPayload that = (ProductDeleteMediaPayload) o;
    return Objects.equals(deletedMediaIds, that.deletedMediaIds) &&
        Objects.equals(deletedProductImageIds, that.deletedProductImageIds) &&
        Objects.equals(mediaUserErrors, that.mediaUserErrors) &&
        Objects.equals(product, that.product) &&
        Objects.equals(userErrors, that.userErrors);
  }

  @Override
  public int hashCode() {
    return Objects.hash(deletedMediaIds, deletedProductImageIds, mediaUserErrors, product, userErrors);
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public static class Builder {
    /**
     * List of media IDs which were deleted.
     */
    private List<String> deletedMediaIds;

    /**
     * List of product image IDs which were deleted.
     */
    private List<String> deletedProductImageIds;

    /**
     * The list of errors that occurred from executing the mutation.
     */
    private List<MediaUserError> mediaUserErrors;

    /**
     * The product associated with the deleted media.
     */
    private Product product;

    /**
     * The list of errors that occurred from executing the mutation.
     */
    private List<UserError> userErrors;

    public ProductDeleteMediaPayload build() {
      ProductDeleteMediaPayload result = new ProductDeleteMediaPayload();
      result.deletedMediaIds = this.deletedMediaIds;
      result.deletedProductImageIds = this.deletedProductImageIds;
      result.mediaUserErrors = this.mediaUserErrors;
      result.product = this.product;
      result.userErrors = this.userErrors;
      return result;
    }

    /**
     * List of media IDs which were deleted.
     */
    public Builder deletedMediaIds(List<String> deletedMediaIds) {
      this.deletedMediaIds = deletedMediaIds;
      return this;
    }

    /**
     * List of product image IDs which were deleted.
     */
    public Builder deletedProductImageIds(List<String> deletedProductImageIds) {
      this.deletedProductImageIds = deletedProductImageIds;
      return this;
    }

    /**
     * The list of errors that occurred from executing the mutation.
     */
    public Builder mediaUserErrors(List<MediaUserError> mediaUserErrors) {
      this.mediaUserErrors = mediaUserErrors;
      return this;
    }

    /**
     * The product associated with the deleted media.
     */
    public Builder product(Product product) {
      this.product = product;
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
