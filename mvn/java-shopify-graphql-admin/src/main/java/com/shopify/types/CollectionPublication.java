package com.shopify.types;

import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.time.OffsetDateTime;
import java.util.Objects;


public class CollectionPublication {
  
  private Channel channel;

  
  private Collection collection;

  
  private boolean isPublished;

  
  private Publication publication;

  
  private OffsetDateTime publishDate;

  public CollectionPublication() {
  }

  
  public Channel getChannel() {
    return channel;
  }

  public void setChannel(Channel channel) {
    this.channel = channel;
  }

  
  public Collection getCollection() {
    return collection;
  }

  public void setCollection(Collection collection) {
    this.collection = collection;
  }

  
  public boolean getIsPublished() {
    return isPublished;
  }

  public void setIsPublished(boolean isPublished) {
    this.isPublished = isPublished;
  }

  
  public Publication getPublication() {
    return publication;
  }

  public void setPublication(Publication publication) {
    this.publication = publication;
  }

  
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
    
    private Channel channel;

    
    private Collection collection;

    
    private boolean isPublished;

    
    private Publication publication;

    
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

    
    public Builder channel(Channel channel) {
      this.channel = channel;
      return this;
    }

    
    public Builder collection(Collection collection) {
      this.collection = collection;
      return this;
    }

    
    public Builder isPublished(boolean isPublished) {
      this.isPublished = isPublished;
      return this;
    }

    
    public Builder publication(Publication publication) {
      this.publication = publication;
      return this;
    }

    
    public Builder publishDate(OffsetDateTime publishDate) {
      this.publishDate = publishDate;
      return this;
    }
  }
}
