package com.shopify.admin.types;

import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.time.OffsetDateTime;
import java.util.Objects;

/**
 * Represents the publications where a collection is published.
 */
public class CollectionPublication {
  /**
   * The channel where the collection will be published.
   */
  private Channel channel;

  /**
   * The collection to be published on the publication.
   */
  private Collection collection;

  /**
   * Whether the publication is published or not.
   */
  private boolean isPublished;

  /**
   * The publication where the collection will be published.
   */
  private Publication publication;

  /**
   * The date that the publication was or is going to be published.
   */
  private OffsetDateTime publishDate;

  public CollectionPublication() {
  }

  /**
   * The channel where the collection will be published.
   */
  public Channel getChannel() {
    return channel;
  }

  public void setChannel(Channel channel) {
    this.channel = channel;
  }

  /**
   * The collection to be published on the publication.
   */
  public Collection getCollection() {
    return collection;
  }

  public void setCollection(Collection collection) {
    this.collection = collection;
  }

  /**
   * Whether the publication is published or not.
   */
  public boolean getIsPublished() {
    return isPublished;
  }

  public void setIsPublished(boolean isPublished) {
    this.isPublished = isPublished;
  }

  /**
   * The publication where the collection will be published.
   */
  public Publication getPublication() {
    return publication;
  }

  public void setPublication(Publication publication) {
    this.publication = publication;
  }

  /**
   * The date that the publication was or is going to be published.
   */
  public OffsetDateTime getPublishDate() {
    return publishDate;
  }

  public void setPublishDate(OffsetDateTime publishDate) {
    this.publishDate = publishDate;
  }

  @Override
  public String toString() {
    return "CollectionPublication{channel='" + channel + "', collection='" + collection + "', isPublished='" + isPublished + "', publication='" + publication + "', publishDate='" + publishDate + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    CollectionPublication that = (CollectionPublication) o;
    return Objects.equals(channel, that.channel) &&
        Objects.equals(collection, that.collection) &&
        isPublished == that.isPublished &&
        Objects.equals(publication, that.publication) &&
        Objects.equals(publishDate, that.publishDate);
  }

  @Override
  public int hashCode() {
    return Objects.hash(channel, collection, isPublished, publication, publishDate);
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public static class Builder {
    /**
     * The channel where the collection will be published.
     */
    private Channel channel;

    /**
     * The collection to be published on the publication.
     */
    private Collection collection;

    /**
     * Whether the publication is published or not.
     */
    private boolean isPublished;

    /**
     * The publication where the collection will be published.
     */
    private Publication publication;

    /**
     * The date that the publication was or is going to be published.
     */
    private OffsetDateTime publishDate;

    public CollectionPublication build() {
      CollectionPublication result = new CollectionPublication();
      result.channel = this.channel;
      result.collection = this.collection;
      result.isPublished = this.isPublished;
      result.publication = this.publication;
      result.publishDate = this.publishDate;
      return result;
    }

    /**
     * The channel where the collection will be published.
     */
    public Builder channel(Channel channel) {
      this.channel = channel;
      return this;
    }

    /**
     * The collection to be published on the publication.
     */
    public Builder collection(Collection collection) {
      this.collection = collection;
      return this;
    }

    /**
     * Whether the publication is published or not.
     */
    public Builder isPublished(boolean isPublished) {
      this.isPublished = isPublished;
      return this;
    }

    /**
     * The publication where the collection will be published.
     */
    public Builder publication(Publication publication) {
      this.publication = publication;
      return this;
    }

    /**
     * The date that the publication was or is going to be published.
     */
    public Builder publishDate(OffsetDateTime publishDate) {
      this.publishDate = publishDate;
      return this;
    }
  }
}
