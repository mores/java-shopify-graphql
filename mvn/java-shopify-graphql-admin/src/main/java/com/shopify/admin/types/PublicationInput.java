package com.shopify.admin.types;

import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.time.OffsetDateTime;
import java.util.Objects;

/**
 * The input fields required to publish a resource.
 */
public class PublicationInput {
  /**
   * ID of the publication.
   */
  private String publicationId;

  /**
   * The date and time that the resource was published. Setting this to a date in
   * the future will schedule the resource to be published. Only online store
   * channels support future publishing. This field has no effect if you include it
   * in the `publishableUnpublish` mutation.
   */
  private OffsetDateTime publishDate;

  public PublicationInput() {
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
   * The date and time that the resource was published. Setting this to a date in
   * the future will schedule the resource to be published. Only online store
   * channels support future publishing. This field has no effect if you include it
   * in the `publishableUnpublish` mutation.
   */
  public OffsetDateTime getPublishDate() {
    return publishDate;
  }

  public void setPublishDate(OffsetDateTime publishDate) {
    this.publishDate = publishDate;
  }

  @Override
  public String toString() {
    return "PublicationInput{publicationId='" + publicationId + "', publishDate='" + publishDate + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    PublicationInput that = (PublicationInput) o;
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
     * The date and time that the resource was published. Setting this to a date in
     * the future will schedule the resource to be published. Only online store
     * channels support future publishing. This field has no effect if you include it
     * in the `publishableUnpublish` mutation.
     */
    private OffsetDateTime publishDate;

    public PublicationInput build() {
      PublicationInput result = new PublicationInput();
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
     * The date and time that the resource was published. Setting this to a date in
     * the future will schedule the resource to be published. Only online store
     * channels support future publishing. This field has no effect if you include it
     * in the `publishableUnpublish` mutation.
     */
    public Builder publishDate(OffsetDateTime publishDate) {
      this.publishDate = publishDate;
      return this;
    }
  }
}
