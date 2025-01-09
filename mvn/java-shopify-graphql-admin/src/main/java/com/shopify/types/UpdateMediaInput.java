package com.shopify.types;

import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.Objects;

/**
 * The input fields required to update a media object.
 */
public class UpdateMediaInput {
  /**
   * Specifies the media to update.
   */
  private String id;

  /**
   * The source from which to update the media preview image. May be an external URL or staged upload URL.
   */
  private String previewImageSource;

  /**
   * The alt text associated to the media.
   */
  private String alt;

  public UpdateMediaInput() {
  }

  /**
   * Specifies the media to update.
   */
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  /**
   * The source from which to update the media preview image. May be an external URL or staged upload URL.
   */
  public String getPreviewImageSource() {
    return previewImageSource;
  }

  public void setPreviewImageSource(String previewImageSource) {
    this.previewImageSource = previewImageSource;
  }

  /**
   * The alt text associated to the media.
   */
  public String getAlt() {
    return alt;
  }

  public void setAlt(String alt) {
    this.alt = alt;
  }

  @Override
  public String toString() {
    return "UpdateMediaInput{id='" + id + "', previewImageSource='" + previewImageSource + "', alt='" + alt + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    UpdateMediaInput that = (UpdateMediaInput) o;
    return Objects.equals(id, that.id) &&
        Objects.equals(previewImageSource, that.previewImageSource) &&
        Objects.equals(alt, that.alt);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, previewImageSource, alt);
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public static class Builder {
    /**
     * Specifies the media to update.
     */
    private String id;

    /**
     * The source from which to update the media preview image. May be an external URL or staged upload URL.
     */
    private String previewImageSource;

    /**
     * The alt text associated to the media.
     */
    private String alt;

    public UpdateMediaInput build() {
      UpdateMediaInput result = new UpdateMediaInput();
      result.id = this.id;
      result.previewImageSource = this.previewImageSource;
      result.alt = this.alt;
      return result;
    }

    /**
     * Specifies the media to update.
     */
    public Builder id(String id) {
      this.id = id;
      return this;
    }

    /**
     * The source from which to update the media preview image. May be an external URL or staged upload URL.
     */
    public Builder previewImageSource(String previewImageSource) {
      this.previewImageSource = previewImageSource;
      return this;
    }

    /**
     * The alt text associated to the media.
     */
    public Builder alt(String alt) {
      this.alt = alt;
      return this;
    }
  }
}
