package com.shopify.types;

import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.Objects;

/**
 * A source for a Shopify-hosted 3d model.
 *
 * Types of sources include GLB and USDZ formatted 3d models, where the former
 * is an original 3d model and the latter has been converted from the original.
 *
 * If the original source is in GLB format and over 15 MBs in size, then both the
 * original and the USDZ formatted source are optimized to reduce the file size.
 */
public class Model3dSource {
  /**
   * The 3d model source's filesize.
   */
  private int filesize;

  /**
   * The 3d model source's format.
   */
  private String format;

  /**
   * The 3d model source's MIME type.
   */
  private String mimeType;

  /**
   * The 3d model source's URL.
   */
  private String url;

  public Model3dSource() {
  }

  /**
   * The 3d model source's filesize.
   */
  public int getFilesize() {
    return filesize;
  }

  public void setFilesize(int filesize) {
    this.filesize = filesize;
  }

  /**
   * The 3d model source's format.
   */
  public String getFormat() {
    return format;
  }

  public void setFormat(String format) {
    this.format = format;
  }

  /**
   * The 3d model source's MIME type.
   */
  public String getMimeType() {
    return mimeType;
  }

  public void setMimeType(String mimeType) {
    this.mimeType = mimeType;
  }

  /**
   * The 3d model source's URL.
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
     * The 3d model source's filesize.
     */
    private int filesize;

    /**
     * The 3d model source's format.
     */
    private String format;

    /**
     * The 3d model source's MIME type.
     */
    private String mimeType;

    /**
     * The 3d model source's URL.
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
     * The 3d model source's filesize.
     */
    public Builder filesize(int filesize) {
      this.filesize = filesize;
      return this;
    }

    /**
     * The 3d model source's format.
     */
    public Builder format(String format) {
      this.format = format;
      return this;
    }

    /**
     * The 3d model source's MIME type.
     */
    public Builder mimeType(String mimeType) {
      this.mimeType = mimeType;
      return this;
    }

    /**
     * The 3d model source's URL.
     */
    public Builder url(String url) {
      this.url = url;
      return this;
    }
  }
}
