package com.shopify.admin.types;

import java.lang.Integer;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.Objects;

/**
 * Represents a source for a Shopify hosted video.
 *
 * Types of sources include the original video, lower resolution versions of the original video,
 * and an m3u8 playlist file.
 *
 * Only [videos](https://shopify.dev/api/admin-graphql/latest/objects/video) with a status field
 * of [READY](https://shopify.dev/api/admin-graphql/latest/enums/MediaStatus#value-ready) have sources.
 */
public class VideoSource {
  /**
   * The video source's file size in bytes.
   */
  private Integer fileSize;

  /**
   * The video source's file format extension.
   */
  private String format;

  /**
   * The video source's height.
   */
  private int height;

  /**
   * The video source's MIME type.
   */
  private String mimeType;

  /**
   * The video source's URL.
   */
  private String url;

  /**
   * The video source's width.
   */
  private int width;

  public VideoSource() {
  }

  /**
   * The video source's file size in bytes.
   */
  public Integer getFileSize() {
    return fileSize;
  }

  public void setFileSize(Integer fileSize) {
    this.fileSize = fileSize;
  }

  /**
   * The video source's file format extension.
   */
  public String getFormat() {
    return format;
  }

  public void setFormat(String format) {
    this.format = format;
  }

  /**
   * The video source's height.
   */
  public int getHeight() {
    return height;
  }

  public void setHeight(int height) {
    this.height = height;
  }

  /**
   * The video source's MIME type.
   */
  public String getMimeType() {
    return mimeType;
  }

  public void setMimeType(String mimeType) {
    this.mimeType = mimeType;
  }

  /**
   * The video source's URL.
   */
  public String getUrl() {
    return url;
  }

  public void setUrl(String url) {
    this.url = url;
  }

  /**
   * The video source's width.
   */
  public int getWidth() {
    return width;
  }

  public void setWidth(int width) {
    this.width = width;
  }

  @Override
  public String toString() {
    return "VideoSource{fileSize='" + fileSize + "', format='" + format + "', height='" + height + "', mimeType='" + mimeType + "', url='" + url + "', width='" + width + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    VideoSource that = (VideoSource) o;
    return Objects.equals(fileSize, that.fileSize) &&
        Objects.equals(format, that.format) &&
        height == that.height &&
        Objects.equals(mimeType, that.mimeType) &&
        Objects.equals(url, that.url) &&
        width == that.width;
  }

  @Override
  public int hashCode() {
    return Objects.hash(fileSize, format, height, mimeType, url, width);
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public static class Builder {
    /**
     * The video source's file size in bytes.
     */
    private Integer fileSize;

    /**
     * The video source's file format extension.
     */
    private String format;

    /**
     * The video source's height.
     */
    private int height;

    /**
     * The video source's MIME type.
     */
    private String mimeType;

    /**
     * The video source's URL.
     */
    private String url;

    /**
     * The video source's width.
     */
    private int width;

    public VideoSource build() {
      VideoSource result = new VideoSource();
      result.fileSize = this.fileSize;
      result.format = this.format;
      result.height = this.height;
      result.mimeType = this.mimeType;
      result.url = this.url;
      result.width = this.width;
      return result;
    }

    /**
     * The video source's file size in bytes.
     */
    public Builder fileSize(Integer fileSize) {
      this.fileSize = fileSize;
      return this;
    }

    /**
     * The video source's file format extension.
     */
    public Builder format(String format) {
      this.format = format;
      return this;
    }

    /**
     * The video source's height.
     */
    public Builder height(int height) {
      this.height = height;
      return this;
    }

    /**
     * The video source's MIME type.
     */
    public Builder mimeType(String mimeType) {
      this.mimeType = mimeType;
      return this;
    }

    /**
     * The video source's URL.
     */
    public Builder url(String url) {
      this.url = url;
      return this;
    }

    /**
     * The video source's width.
     */
    public Builder width(int width) {
      this.width = width;
      return this;
    }
  }
}
