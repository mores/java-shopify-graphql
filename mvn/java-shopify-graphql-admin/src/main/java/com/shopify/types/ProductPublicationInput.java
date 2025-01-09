package com.shopify.types;

import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.time.OffsetDateTime;
import java.util.Objects;

/**
 * The input fields for specifying a publication to which a product will be published.
 */
public class ProductPublicationInput {
  /**
   * ID of the publication.
   */
  private String publicationId;

  /**
   * The date and time that the product was (or will be) published.
   */
  private OffsetDateTime publishDate;

  public ProductPublicationInput() {
  }

  /**
   * ID of the publication.
   */
  public String getPublicationId() {
    return publicationId;
  }

  public void setPublicationId(String publicationId) {
    this.publicationId = publicationId;
  }

  /**
   * The date and time that the product was (or will be) published.
   */
  public OffsetDateTime getPublishDate() {
    return publishDate;
  }

  public void setPublishDate(OffsetDateTime publishDate) {
    this.publishDate = publishDate;
  }

  @Override
  public String toString() {
    return "ProductPublicationInput{publicationId='" + publicationId + "', publishDate='" + publishDate + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    ProductPublicationInput that = (ProductPublicationInput) o;
    return Objects.equals(publicationId, that.publicationId) &&
        Objects.equals(publishDate, that.publishDate);
  }

  @Override
  public int hashCode() {
    return Objects.hash(publicationId, publishDate);
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public static class Builder {
    /**
     * ID of the publication.
     */
    private String publicationId;

    /**
     * The date and time that the product was (or will be) published.
     */
    private OffsetDateTime publishDate;

    public ProductPublicationInput build() {
      ProductPublicationInput result = new ProductPublicationInput();
      result.publicationId = this.publicationId;
      result.publishDate = this.publishDate;
      return result;
    }

    /**
     * ID of the publication.
     */
    public Builder publicationId(String publicationId) {
      this.publicationId = publicationId;
      return this;
    }

    /**
     * The date and time that the product was (or will be) published.
     */
    public Builder publishDate(OffsetDateTime publishDate) {
      this.publishDate = publishDate;
      return this;
    }
  }
}
