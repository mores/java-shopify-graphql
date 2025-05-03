package com.shopify.storefront.types;

import com.fasterxml.jackson.annotation.JsonTypeInfo;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.List;
import java.util.Objects;

/**
 * Represents a Shopify hosted video.
 */
@JsonTypeInfo(
    use = JsonTypeInfo.Id.NONE
)
public class Video implements MetafieldReference, com.shopify.storefront.types.Media, com.shopify.storefront.types.Node {
  /**
   * A word or phrase to share the nature or contents of a media.
   */
  private String alt;

  /**
   * A globally-unique ID.
   */
  private String id;

  /**
   * The media content type.
   */
  private MediaContentType mediaContentType;

  /**
   * The presentation for a media.
   */
  private MediaPresentation presentation;

  /**
   * The preview image for the media.
   */
  private Image previewImage;

  /**
   * The sources for a video.
   */
  private List<VideoSource> sources;

  public Video() {
  }

  /**
   * A word or phrase to share the nature or contents of a media.
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
   * The media content type.
   */
  public MediaContentType getMediaContentType() {
    return mediaContentType;
  }

  public void setMediaContentType(MediaContentType mediaContentType) {
    this.mediaContentType = mediaContentType;
  }

  /**
   * The presentation for a media.
   */
  public MediaPresentation getPresentation() {
    return presentation;
  }

  public void setPresentation(MediaPresentation presentation) {
    this.presentation = presentation;
  }

  /**
   * The preview image for the media.
   */
  public Image getPreviewImage() {
    return previewImage;
  }

  public void setPreviewImage(Image previewImage) {
    this.previewImage = previewImage;
  }

  /**
   * The sources for a video.
   */
  public List<VideoSource> getSources() {
    return sources;
  }

  public void setSources(List<VideoSource> sources) {
    this.sources = sources;
  }

  @Override
  public String toString() {
    return "Video{alt='" + alt + "', id='" + id + "', mediaContentType='" + mediaContentType + "', presentation='" + presentation + "', previewImage='" + previewImage + "', sources='" + sources + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    Video that = (Video) o;
    return Objects.equals(alt, that.alt) &&
        Objects.equals(id, that.id) &&
        Objects.equals(mediaContentType, that.mediaContentType) &&
        Objects.equals(presentation, that.presentation) &&
        Objects.equals(previewImage, that.previewImage) &&
        Objects.equals(sources, that.sources);
  }

  @Override
  public int hashCode() {
    return Objects.hash(alt, id, mediaContentType, presentation, previewImage, sources);
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public static class Builder {
    /**
     * A word or phrase to share the nature or contents of a media.
     */
    private String alt;

    /**
     * A globally-unique ID.
     */
    private String id;

    /**
     * The media content type.
     */
    private MediaContentType mediaContentType;

    /**
     * The presentation for a media.
     */
    private MediaPresentation presentation;

    /**
     * The preview image for the media.
     */
    private Image previewImage;

    /**
     * The sources for a video.
     */
    private List<VideoSource> sources;

    public Video build() {
      Video result = new Video();
      result.alt = this.alt;
      result.id = this.id;
      result.mediaContentType = this.mediaContentType;
      result.presentation = this.presentation;
      result.previewImage = this.previewImage;
      result.sources = this.sources;
      return result;
    }

    /**
     * A word or phrase to share the nature or contents of a media.
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
     * The media content type.
     */
    public Builder mediaContentType(MediaContentType mediaContentType) {
      this.mediaContentType = mediaContentType;
      return this;
    }

    /**
     * The presentation for a media.
     */
    public Builder presentation(MediaPresentation presentation) {
      this.presentation = presentation;
      return this;
    }

    /**
     * The preview image for the media.
     */
    public Builder previewImage(Image previewImage) {
      this.previewImage = previewImage;
      return this;
    }

    /**
     * The sources for a video.
     */
    public Builder sources(List<VideoSource> sources) {
      this.sources = sources;
      return this;
    }
  }
}
