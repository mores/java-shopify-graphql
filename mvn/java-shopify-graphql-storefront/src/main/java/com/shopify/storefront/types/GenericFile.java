package com.shopify.storefront.types;

import com.fasterxml.jackson.annotation.JsonTypeInfo;
import java.lang.Integer;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.Objects;

/**
 * The generic file resource lets you manage files in a merchant’s store. Generic
 * files include any file that doesn’t fit into a designated type such as image or
 * video. Example: PDF, JSON.
 */
@JsonTypeInfo(
    use = JsonTypeInfo.Id.NONE
)
public class GenericFile implements MetafieldReference, com.shopify.storefront.types.Node {
  /**
   * A word or phrase to indicate the contents of a file.
   */
  private String alt;

  /**
   * A globally-unique ID.
   */
  private String id;

  /**
   * The MIME type of the file.
   */
  private String mimeType;

  /**
   * The size of the original file in bytes.
   */
  private Integer originalFileSize;

  /**
   * The preview image for the file.
   */
  private Image previewImage;

  /**
   * The URL of the file.
   */
  private String url;

  public GenericFile() {
  }

  /**
   * A word or phrase to indicate the contents of a file.
   */
  public String getAlt() {
    return alt;
  }

  public void setAlt(String alt) {
    this.alt = alt;
  }

  /**
   * A globally-unique ID.
   */
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  /**
   * The MIME type of the file.
   */
  public String getMimeType() {
    return mimeType;
  }

  public void setMimeType(String mimeType) {
    this.mimeType = mimeType;
  }

  /**
   * The size of the original file in bytes.
   */
  public Integer getOriginalFileSize() {
    return originalFileSize;
  }

  public void setOriginalFileSize(Integer originalFileSize) {
    this.originalFileSize = originalFileSize;
  }

  /**
   * The preview image for the file.
   */
  public Image getPreviewImage() {
    return previewImage;
  }

  public void setPreviewImage(Image previewImage) {
    this.previewImage = previewImage;
  }

  /**
   * The URL of the file.
   */
  public String getUrl() {
    return url;
  }

  public void setUrl(String url) {
    this.url = url;
  }

  @Override
  public String toString() {
    return "GenericFile{alt='" + alt + "', id='" + id + "', mimeType='" + mimeType + "', originalFileSize='" + originalFileSize + "', previewImage='" + previewImage + "', url='" + url + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    GenericFile that = (GenericFile) o;
    return Objects.equals(alt, that.alt) &&
        Objects.equals(id, that.id) &&
        Objects.equals(mimeType, that.mimeType) &&
        Objects.equals(originalFileSize, that.originalFileSize) &&
        Objects.equals(previewImage, that.previewImage) &&
        Objects.equals(url, that.url);
  }

  @Override
  public int hashCode() {
    return Objects.hash(alt, id, mimeType, originalFileSize, previewImage, url);
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public static class Builder {
    /**
     * A word or phrase to indicate the contents of a file.
     */
    private String alt;

    /**
     * A globally-unique ID.
     */
    private String id;

    /**
     * The MIME type of the file.
     */
    private String mimeType;

    /**
     * The size of the original file in bytes.
     */
    private Integer originalFileSize;

    /**
     * The preview image for the file.
     */
    private Image previewImage;

    /**
     * The URL of the file.
     */
    private String url;

    public GenericFile build() {
      GenericFile result = new GenericFile();
      result.alt = this.alt;
      result.id = this.id;
      result.mimeType = this.mimeType;
      result.originalFileSize = this.originalFileSize;
      result.previewImage = this.previewImage;
      result.url = this.url;
      return result;
    }

    /**
     * A word or phrase to indicate the contents of a file.
     */
    public Builder alt(String alt) {
      this.alt = alt;
      return this;
    }

    /**
     * A globally-unique ID.
     */
    public Builder id(String id) {
      this.id = id;
      return this;
    }

    /**
     * The MIME type of the file.
     */
    public Builder mimeType(String mimeType) {
      this.mimeType = mimeType;
      return this;
    }

    /**
     * The size of the original file in bytes.
     */
    public Builder originalFileSize(Integer originalFileSize) {
      this.originalFileSize = originalFileSize;
      return this;
    }

    /**
     * The preview image for the file.
     */
    public Builder previewImage(Image previewImage) {
      this.previewImage = previewImage;
      return this;
    }

    /**
     * The URL of the file.
     */
    public Builder url(String url) {
      this.url = url;
      return this;
    }
  }
}
