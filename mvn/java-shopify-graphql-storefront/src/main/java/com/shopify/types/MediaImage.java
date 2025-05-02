package com.shopify.types;

import com.fasterxml.jackson.annotation.JsonTypeInfo;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.Objects;

/**
 * Represents a Shopify hosted image.
 */
@JsonTypeInfo(
    use = JsonTypeInfo.Id.NONE
)
public class MediaImage implements MetafieldReference, com.shopify.types.Media, com.shopify.types.Node {
  /**
   * A word or phrase to share the nature or contents of a media.
   */
  private String alt;

  /**
   * A globally-unique ID.
   */
  private String id;

  /**
   * The image for the media.
   */
  private Image image;

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

  public MediaImage() {
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
   * The image for the media.
   */
  public Image getImage() {
    return image;
  }

  public void setImage(Image image) {
    this.image = image;
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

  @Override
  public String toString() {
    return "MediaImage{alt='" + alt + "', id='" + id + "', image='" + image + "', mediaContentType='" + mediaContentType + "', presentation='" + presentation + "', previewImage='" + previewImage + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    MediaImage that = (MediaImage) o;
    return Objects.equals(alt, that.alt) &&
        Objects.equals(id, that.id) &&
        Objects.equals(image, that.image) &&
        Objects.equals(mediaContentType, that.mediaContentType) &&
        Objects.equals(presentation, that.presentation) &&
        Objects.equals(previewImage, that.previewImage);
  }

  @Override
  public int hashCode() {
    return Objects.hash(alt, id, image, mediaContentType, presentation, previewImage);
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
     * The image for the media.
     */
    private Image image;

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

    public MediaImage build() {
      MediaImage result = new MediaImage();
      result.alt = this.alt;
      result.id = this.id;
      result.image = this.image;
      result.mediaContentType = this.mediaContentType;
      result.presentation = this.presentation;
      result.previewImage = this.previewImage;
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
     * The image for the media.
     */
    public Builder image(Image image) {
      this.image = image;
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
  }
}
