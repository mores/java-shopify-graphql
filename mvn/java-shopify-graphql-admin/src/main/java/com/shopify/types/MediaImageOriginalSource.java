package com.shopify.types;

import java.lang.Integer;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.Objects;

/**
 * The original source for an image.
 */
public class MediaImageOriginalSource {
  /**
   * The size of the original file in bytes.
   */
  private Integer fileSize;

  /**
   * The URL of the original image, valid only for a short period.
   */
  private String url;

  public MediaImageOriginalSource() {
  }

  /**
   * The size of the original file in bytes.
   */
  public Integer getFileSize() {
    return fileSize;
  }

  public void setFileSize(Integer fileSize) {
    this.fileSize = fileSize;
  }

  /**
   * The URL of the original image, valid only for a short period.
   */
  public String getUrl() {
    return url;
  }

  public void setUrl(String url) {
    this.url = url;
  }

  @Override
  public String toString() {
    return "MediaImageOriginalSource{fileSize='" + fileSize + "', url='" + url + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    MediaImageOriginalSource that = (MediaImageOriginalSource) o;
    return Objects.equals(fileSize, that.fileSize) &&
        Objects.equals(url, that.url);
  }

  @Override
  public int hashCode() {
    return Objects.hash(fileSize, url);
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public static class Builder {
    /**
     * The size of the original file in bytes.
     */
    private Integer fileSize;

    /**
     * The URL of the original image, valid only for a short period.
     */
    private String url;

    public MediaImageOriginalSource build() {
      MediaImageOriginalSource result = new MediaImageOriginalSource();
      result.fileSize = this.fileSize;
      result.url = this.url;
      return result;
    }

    /**
     * The size of the original file in bytes.
     */
    public Builder fileSize(Integer fileSize) {
      this.fileSize = fileSize;
      return this;
    }

    /**
     * The URL of the original image, valid only for a short period.
     */
    public Builder url(String url) {
      this.url = url;
      return this;
    }
  }
}
