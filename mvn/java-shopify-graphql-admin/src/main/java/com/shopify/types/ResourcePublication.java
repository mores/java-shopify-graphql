package com.shopify.types;

import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.time.OffsetDateTime;
import java.util.Objects;

/**
 * A resource publication represents information about the publication of a resource.
 * An instance of `ResourcePublication`, unlike `ResourcePublicationV2`, can be neither published or scheduled to be published.
 *
 * See [ResourcePublicationV2](/api/admin-graphql/latest/objects/ResourcePublicationV2) for more context.
 */
public class ResourcePublication {
  /**
   * The channel the resource publication is published to.
   */
  private Channel channel;

  /**
   * Whether the resource publication is published. Also returns true if the resource publication is scheduled to be published.
   * If false, then the resource publication is neither published nor scheduled to be published.
   */
  private boolean isPublished;

  /**
   * The publication the resource publication is published to.
   */
  private Publication publication;

  /**
   * The date that the resource publication was or is going to be published to the publication.
   * If the product isn't published, then this field returns an epoch timestamp.
   */
  private OffsetDateTime publishDate;

  /**
   * The resource published to the publication.
   */
  private Publishable publishable;

  public ResourcePublication() {
  }

  /**
   * The channel the resource publication is published to.
   */
  public Channel getChannel() {
    return channel;
  }

  public void setChannel(Channel channel) {
    this.channel = channel;
  }

  /**
   * Whether the resource publication is published. Also returns true if the resource publication is scheduled to be published.
   * If false, then the resource publication is neither published nor scheduled to be published.
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
   * If the product isn't published, then this field returns an epoch timestamp.
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
    return "ResourcePublication{channel='" + channel + "', isPublished='" + isPublished + "', publication='" + publication + "', publishDate='" + publishDate + "', publishable='" + publishable + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    ResourcePublication that = (ResourcePublication) o;
    return Objects.equals(channel, that.channel) &&
        isPublished == that.isPublished &&
        Objects.equals(publication, that.publication) &&
        Objects.equals(publishDate, that.publishDate) &&
        Objects.equals(publishable, that.publishable);
  }

  @Override
  public int hashCode() {
    return Objects.hash(channel, isPublished, publication, publishDate, publishable);
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public static class Builder {
    /**
     * The channel the resource publication is published to.
     */
    private Channel channel;

    /**
     * Whether the resource publication is published. Also returns true if the resource publication is scheduled to be published.
     * If false, then the resource publication is neither published nor scheduled to be published.
     */
    private boolean isPublished;

    /**
     * The publication the resource publication is published to.
     */
    private Publication publication;

    /**
     * The date that the resource publication was or is going to be published to the publication.
     * If the product isn't published, then this field returns an epoch timestamp.
     */
    private OffsetDateTime publishDate;

    /**
     * The resource published to the publication.
     */
    private Publishable publishable;

    public ResourcePublication build() {
      ResourcePublication result = new ResourcePublication();
      result.channel = this.channel;
      result.isPublished = this.isPublished;
      result.publication = this.publication;
      result.publishDate = this.publishDate;
      result.publishable = this.publishable;
      return result;
    }

    /**
     * The channel the resource publication is published to.
     */
    public Builder channel(Channel channel) {
      this.channel = channel;
      return this;
    }

    /**
     * Whether the resource publication is published. Also returns true if the resource publication is scheduled to be published.
     * If false, then the resource publication is neither published nor scheduled to be published.
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
     * If the product isn't published, then this field returns an epoch timestamp.
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
