package com.shopify.storefront.types;

import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.time.OffsetDateTime;
import java.util.Objects;

/**
 * Represents a sitemap's image.
 */
public class SitemapImage {
  /**
   * Image's alt text.
   */
  private String alt;

  /**
   * Path to the image.
   */
  private String filepath;

  /**
   * The date and time when the image was updated.
   */
  private OffsetDateTime updatedAt;

  public SitemapImage() {
  }

  /**
   * Image's alt text.
   */
  public String getAlt() {
    return alt;
  }

  public void setAlt(String alt) {
    this.alt = alt;
  }

  /**
   * Path to the image.
   */
  public String getFilepath() {
    return filepath;
  }

  public void setFilepath(String filepath) {
    this.filepath = filepath;
  }

  /**
   * The date and time when the image was updated.
   */
  public OffsetDateTime getUpdatedAt() {
    return updatedAt;
  }

  public void setUpdatedAt(OffsetDateTime updatedAt) {
    this.updatedAt = updatedAt;
  }

  @Override
  public String toString() {
    return "SitemapImage{alt='" + alt + "', filepath='" + filepath + "', updatedAt='" + updatedAt + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    SitemapImage that = (SitemapImage) o;
    return Objects.equals(alt, that.alt) &&
        Objects.equals(filepath, that.filepath) &&
        Objects.equals(updatedAt, that.updatedAt);
  }

  @Override
  public int hashCode() {
    return Objects.hash(alt, filepath, updatedAt);
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public static class Builder {
    /**
     * Image's alt text.
     */
    private String alt;

    /**
     * Path to the image.
     */
    private String filepath;

    /**
     * The date and time when the image was updated.
     */
    private OffsetDateTime updatedAt;

    public SitemapImage build() {
      SitemapImage result = new SitemapImage();
      result.alt = this.alt;
      result.filepath = this.filepath;
      result.updatedAt = this.updatedAt;
      return result;
    }

    /**
     * Image's alt text.
     */
    public Builder alt(String alt) {
      this.alt = alt;
      return this;
    }

    /**
     * Path to the image.
     */
    public Builder filepath(String filepath) {
      this.filepath = filepath;
      return this;
    }

    /**
     * The date and time when the image was updated.
     */
    public Builder updatedAt(OffsetDateTime updatedAt) {
      this.updatedAt = updatedAt;
      return this;
    }
  }
}
