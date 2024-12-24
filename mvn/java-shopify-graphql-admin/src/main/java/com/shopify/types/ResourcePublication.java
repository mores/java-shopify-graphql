package com.shopify.types;

import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.time.OffsetDateTime;
import java.util.Objects;


public class ResourcePublication {
  
  private Channel channel;

  
  private boolean isPublished;

  
  private Publication publication;

  
  private OffsetDateTime publishDate;

  
  private Publishable publishable;

  public ResourcePublication() {
  }

  
  public Channel getChannel() {
    return channel;
  }

  public void setChannel(Channel channel) {
    this.channel = channel;
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
    
    private Channel channel;

    
    private boolean isPublished;

    
    private Publication publication;

    
    private OffsetDateTime publishDate;

    
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

    
    public Builder channel(Channel channel) {
      this.channel = channel;
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

    
    public Builder publishable(Publishable publishable) {
      this.publishable = publishable;
      return this;
    }
  }
}
