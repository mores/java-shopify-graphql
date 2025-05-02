package com.shopify.types;

import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.Objects;

/**
 * Represents a source for a Shopify hosted 3d model.
 */
public class Model3dSource {
  /**
   * The filesize of the 3d model.
   */
  private int filesize;

  /**
   * The format of the 3d model.
   */
  private String format;

  /**
   * The MIME type of the 3d model.
   */
  private String mimeType;

  /**
   * The URL of the 3d model.
   */
  private String url;

  public Model3dSource() {
  }

  /**
   * The filesize of the 3d model.
   */
  public int getFilesize() {
    return filesize;
  }

  public void setFilesize(int filesize) {
    this.filesize = filesize;
  }

  /**
   * The format of the 3d model.
   */
  public String getFormat() {
    return format;
  }

  public void setFormat(String format) {
    this.format = format;
  }

  /**
   * The MIME type of the 3d model.
   */
  public String getMimeType() {
    return mimeType;
  }

  public void setMimeType(String mimeType) {
    this.mimeType = mimeType;
  }

  /**
   * The URL of the 3d model.
   */
  public String getUrl() {
    return url;
  }

  public void setUrl(String url) {
    this.url = url;
  }

  @Override
  public String toString() {
    return "Model3dSource{filesize='" + filesize + "', format='" + format + "', mimeType='" + mimeType + "', url='" + url + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    Model3dSource that = (Model3dSource) o;
    return filesize == that.filesize &&
        Objects.equals(format, that.format) &&
        Objects.equals(mimeType, that.mimeType) &&
        Objects.equals(url, that.url);
  }

  @Override
  public int hashCode() {
    return Objects.hash(filesize, format, mimeType, url);
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public static class Builder {
    /**
     * The filesize of the 3d model.
     */
    private int filesize;

    /**
     * The format of the 3d model.
     */
    private String format;

    /**
     * The MIME type of the 3d model.
     */
    private String mimeType;

    /**
     * The URL of the 3d model.
     */
    private String url;

    public Model3dSource build() {
      Model3dSource result = new Model3dSource();
      result.filesize = this.filesize;
      result.format = this.format;
      result.mimeType = this.mimeType;
      result.url = this.url;
      return result;
    }

    /**
     * The filesize of the 3d model.
     */
    public Builder filesize(int filesize) {
      this.filesize = filesize;
      return this;
    }

    /**
     * The format of the 3d model.
     */
    public Builder format(String format) {
      this.format = format;
      return this;
    }

    /**
     * The MIME type of the 3d model.
     */
    public Builder mimeType(String mimeType) {
      this.mimeType = mimeType;
      return this;
    }

    /**
     * The URL of the 3d model.
     */
    public Builder url(String url) {
      this.url = url;
      return this;
    }
  }
}
