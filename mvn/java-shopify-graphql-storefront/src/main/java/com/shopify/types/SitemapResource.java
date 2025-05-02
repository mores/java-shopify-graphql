package com.shopify.types;

import com.fasterxml.jackson.annotation.JsonTypeInfo;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.time.OffsetDateTime;
import java.util.Objects;

/**
 * Represents a sitemap resource that is not a metaobject.
 */
@JsonTypeInfo(
    use = JsonTypeInfo.Id.NONE
)
public class SitemapResource implements com.shopify.types.SitemapResourceInterface {
  /**
   * Resource's handle.
   */
  private String handle;

  /**
   * Resource's image.
   */
  private SitemapImage image;

  /**
   * Resource's title.
   */
  private String title;

  /**
   * The date and time when the resource was updated.
   */
  private OffsetDateTime updatedAt;

  public SitemapResource() {
  }

  /**
   * Resource's handle.
   */
  public String getHandle() {
    return handle;
  }

  public void setHandle(String handle) {
    this.handle = handle;
  }

  /**
   * Resource's image.
   */
  public SitemapImage getImage() {
    return image;
  }

  public void setImage(SitemapImage image) {
    this.image = image;
  }

  /**
   * Resource's title.
   */
  public String getTitle() {
    return title;
  }

  public void setTitle(String title) {
    this.title = title;
  }

  /**
   * The date and time when the resource was updated.
   */
  public OffsetDateTime getUpdatedAt() {
    return updatedAt;
  }

  public void setUpdatedAt(OffsetDateTime updatedAt) {
    this.updatedAt = updatedAt;
  }

  @Override
  public String toString() {
    return "SitemapResource{handle='" + handle + "', image='" + image + "', title='" + title + "', updatedAt='" + updatedAt + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    SitemapResource that = (SitemapResource) o;
    return Objects.equals(handle, that.handle) &&
        Objects.equals(image, that.image) &&
        Objects.equals(title, that.title) &&
        Objects.equals(updatedAt, that.updatedAt);
  }

  @Override
  public int hashCode() {
    return Objects.hash(handle, image, title, updatedAt);
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public static class Builder {
    /**
     * Resource's handle.
     */
    private String handle;

    /**
     * Resource's image.
     */
    private SitemapImage image;

    /**
     * Resource's title.
     */
    private String title;

    /**
     * The date and time when the resource was updated.
     */
    private OffsetDateTime updatedAt;

    public SitemapResource build() {
      SitemapResource result = new SitemapResource();
      result.handle = this.handle;
      result.image = this.image;
      result.title = this.title;
      result.updatedAt = this.updatedAt;
      return result;
    }

    /**
     * Resource's handle.
     */
    public Builder handle(String handle) {
      this.handle = handle;
      return this;
    }

    /**
     * Resource's image.
     */
    public Builder image(SitemapImage image) {
      this.image = image;
      return this;
    }

    /**
     * Resource's title.
     */
    public Builder title(String title) {
      this.title = title;
      return this;
    }

    /**
     * The date and time when the resource was updated.
     */
    public Builder updatedAt(OffsetDateTime updatedAt) {
      this.updatedAt = updatedAt;
      return this;
    }
  }
}
