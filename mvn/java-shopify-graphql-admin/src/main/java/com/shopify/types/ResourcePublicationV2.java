package com.shopify.types;

import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.time.OffsetDateTime;
import java.util.Objects;


public class ResourcePublicationV2 {
  
  private boolean isPublished;

  
  private Publication publication;

  
  private OffsetDateTime publishDate;

  
  private Publishable publishable;

  public ResourcePublicationV2() {
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
    
    private boolean isPublished;

    
    private Publication publication;

    
    private OffsetDateTime publishDate;

    
    private Publishable publishable;

    public ResourcePublicationV2 build() {
      ResourcePublicationV2 result = new ResourcePublicationV2();
      result.isPublished = this.isPublished;
      result.publication = this.publication;
      result.publishDate = this.publishDate;
      result.publishable = this.publishable;
      return result;
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
