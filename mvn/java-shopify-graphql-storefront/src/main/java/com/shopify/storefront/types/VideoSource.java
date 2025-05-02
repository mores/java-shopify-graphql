package com.shopify.storefront.types;

import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.Objects;

/**
 * Represents a source for a Shopify hosted video.
 */
public class VideoSource {
  /**
   * The format of the video source.
   */
  private String format;

  /**
   * The height of the video.
   */
  private int height;

  /**
   * The video MIME type.
   */
  private String mimeType;

  /**
   * The URL of the video.
   */
  private String url;

  /**
   * The width of the video.
   */
  private int width;

  public VideoSource() {
  }

  /**
   * The format of the video source.
   */
  public String getFormat() {
    return format;
  }

  public void setFormat(String format) {
    this.format = format;
  }

  /**
   * The height of the video.
   */
  public int getHeight() {
    return height;
  }

  public void setHeight(int height) {
    this.height = height;
  }

  /**
   * The video MIME type.
   */
  public String getMimeType() {
    return mimeType;
  }

  public void setMimeType(String mimeType) {
    this.mimeType = mimeType;
  }

  /**
   * The URL of the video.
   */
  public String getUrl() {
    return url;
  }

  public void setUrl(String url) {
    this.url = url;
  }

  /**
   * The width of the video.
   */
  public int getWidth() {
    return width;
  }

  public void setWidth(int width) {
    this.width = width;
  }

  @Override
  public String toString() {
    return "VideoSource{format='" + format + "', height='" + height + "', mimeType='" + mimeType + "', url='" + url + "', width='" + width + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    VideoSource that = (VideoSource) o;
    return Objects.equals(format, that.format) &&
        height == that.height &&
        Objects.equals(mimeType, that.mimeType) &&
        Objects.equals(url, that.url) &&
        width == that.width;
  }

  @Override
  public int hashCode() {
    return Objects.hash(format, height, mimeType, url, width);
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public static class Builder {
    /**
     * The format of the video source.
     */
    private String format;

    /**
     * The height of the video.
     */
    private int height;

    /**
     * The video MIME type.
     */
    private String mimeType;

    /**
     * The URL of the video.
     */
    private String url;

    /**
     * The width of the video.
     */
    private int width;

    public VideoSource build() {
      VideoSource result = new VideoSource();
      result.format = this.format;
      result.height = this.height;
      result.mimeType = this.mimeType;
      result.url = this.url;
      result.width = this.width;
      return result;
    }

    /**
     * The format of the video source.
     */
    public Builder format(String format) {
      this.format = format;
      return this;
    }

    /**
     * The height of the video.
     */
    public Builder height(int height) {
      this.height = height;
      return this;
    }

    /**
     * The video MIME type.
     */
    public Builder mimeType(String mimeType) {
      this.mimeType = mimeType;
      return this;
    }

    /**
     * The URL of the video.
     */
    public Builder url(String url) {
      this.url = url;
      return this;
    }

    /**
     * The width of the video.
     */
    public Builder width(int width) {
      this.width = width;
      return this;
    }
  }
}
