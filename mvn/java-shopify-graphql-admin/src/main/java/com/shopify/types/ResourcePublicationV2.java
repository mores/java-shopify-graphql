package com.shopify.types;

import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.time.OffsetDateTime;
import java.util.Objects;

/**
 * A resource publication represents information about the publication of a resource.
 * Unlike `ResourcePublication`, an instance of `ResourcePublicationV2` can't be
 * unpublished. It must either be published or scheduled to be published.
 *
 * See [ResourcePublication](/api/admin-graphql/latest/objects/ResourcePublication) for more context.
 */
public class ResourcePublicationV2 {
  /**
   * Whether the resource publication is published. If true, then the resource publication is published to the publication.
   * If false, then the resource publication is staged to be published to the publication.
   */
  private boolean isPublished;

  /**
   * The publication the resource publication is published to.
   */
  private Publication publication;

  /**
   * The date that the resource publication was or is going to be published to the publication.
   */
  private OffsetDateTime publishDate;

  /**
   * The resource published to the publication.
   */
  private Publishable publishable;

  public ResourcePublicationV2() {
  }

  /**
   * Whether the resource publication is published. If true, then the resource publication is published to the publication.
   * If false, then the resource publication is staged to be published to the publication.
   */
  public boolean getIsPublished() {
    return isPublished;
  }

  public void setIsPublished(boolean isPublished) {
    this.isPublished = isPublished;
  }

  /**
   * The publication the resource publication is published to.
   */
  public Publication getPublication() {
    return publication;
  }

  public void setPublication(Publication publication) {
    this.publication = publication;
  }

  /**
   * The date that the resource publication was or is going to be published to the publication.
   */
  public OffsetDateTime getPublishDate() {
    return publishDate;
  }

  public void setPublishDate(OffsetDateTime publishDate) {
    this.publishDate = publishDate;
  }

  /**
   * The resource published to the publication.
   */
  public Publishable getPublishable() {
    return publishable;
  }

  public void setPublishable(Publishable publishable) {
    this.publishable = publishable;
  }

  @Override
  public String toString() {
    return "ResourcePublicationV2{isPublished='" + isPublished + "', publication='" + publication + "', publishDate='" + publishDate + "', publishable='" + publishable + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    ResourcePublicationV2 that = (ResourcePublicationV2) o;
    return isPublished == that.isPublished &&
        Objects.equals(publication, that.publication) &&
        Objects.equals(publishDate, that.publishDate) &&
        Objects.equals(publishable, that.publishable);
  }

  @Override
  public int hashCode() {
    return Objects.hash(isPublished, publication, publishDate, publishable);
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public static class Builder {
    /**
     * Whether the resource publication is published. If true, then the resource publication is published to the publication.
     * If false, then the resource publication is staged to be published to the publication.
     */
    private boolean isPublished;

    /**
     * The publication the resource publication is published to.
     */
    private Publication publication;

    /**
     * The date that the resource publication was or is going to be published to the publication.
     */
    private OffsetDateTime publishDate;

    /**
     * The resource published to the publication.
     */
    private Publishable publishable;

    public ResourcePublicationV2 build() {
      ResourcePublicationV2 result = new ResourcePublicationV2();
      result.isPublished = this.isPublished;
      result.publication = this.publication;
      result.publishDate = this.publishDate;
      result.publishable = this.publishable;
      return result;
    }

    /**
     * Whether the resource publication is published. If true, then the resource publication is published to the publication.
     * If false, then the resource publication is staged to be published to the publication.
     */
    public Builder isPublished(boolean isPublished) {
      this.isPublished = isPublished;
      return this;
    }

    /**
     * The publication the resource publication is published to.
     */
    public Builder publication(Publication publication) {
      this.publication = publication;
      return this;
    }

    /**
     * The date that the resource publication was or is going to be published to the publication.
     */
    public Builder publishDate(OffsetDateTime publishDate) {
      this.publishDate = publishDate;
      return this;
    }

    /**
     * The resource published to the publication.
     */
    public Builder publishable(Publishable publishable) {
      this.publishable = publishable;
      return this;
    }
  }
}
