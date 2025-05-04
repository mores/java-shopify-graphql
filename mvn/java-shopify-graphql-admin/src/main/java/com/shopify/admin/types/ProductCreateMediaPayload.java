package com.shopify.admin.types;

import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.List;
import java.util.Objects;

/**
 * Return type for `productCreateMedia` mutation.
 */
public class ProductCreateMediaPayload {
  /**
   * The newly created media.
   */
  private List<Media> media;

  /**
   * The list of errors that occurred from executing the mutation.
   */
  private List<MediaUserError> mediaUserErrors;

  /**
   * The product associated with the media.
   */
  private Product product;

  /**
   * The list of errors that occurred from executing the mutation.
   */
  private List<UserError> userErrors;

  public ProductCreateMediaPayload() {
  }

  /**
   * The newly created media.
   */
  public List<Media> getMedia() {
    return media;
  }

  public void setMedia(List<Media> media) {
    this.media = media;
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
   * The product associated with the media.
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
    return "ProductCreateMediaPayload{media='" + media + "', mediaUserErrors='" + mediaUserErrors + "', product='" + product + "', userErrors='" + userErrors + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    ProductCreateMediaPayload that = (ProductCreateMediaPayload) o;
    return Objects.equals(media, that.media) &&
        Objects.equals(mediaUserErrors, that.mediaUserErrors) &&
        Objects.equals(product, that.product) &&
        Objects.equals(userErrors, that.userErrors);
  }

  @Override
  public int hashCode() {
    return Objects.hash(media, mediaUserErrors, product, userErrors);
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public static class Builder {
    /**
     * The newly created media.
     */
    private List<Media> media;

    /**
     * The list of errors that occurred from executing the mutation.
     */
    private List<MediaUserError> mediaUserErrors;

    /**
     * The product associated with the media.
     */
    private Product product;

    /**
     * The list of errors that occurred from executing the mutation.
     */
    private List<UserError> userErrors;

    public ProductCreateMediaPayload build() {
      ProductCreateMediaPayload result = new ProductCreateMediaPayload();
      result.media = this.media;
      result.mediaUserErrors = this.mediaUserErrors;
      result.product = this.product;
      result.userErrors = this.userErrors;
      return result;
    }

    /**
     * The newly created media.
     */
    public Builder media(List<Media> media) {
      this.media = media;
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
     * The product associated with the media.
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
