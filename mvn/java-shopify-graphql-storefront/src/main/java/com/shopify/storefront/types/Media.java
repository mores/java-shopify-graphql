package com.shopify.storefront.types;

import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import java.lang.String;

/**
 * Represents a media interface.
 */
@JsonTypeInfo(
    use = JsonTypeInfo.Id.NAME,
    include = JsonTypeInfo.As.PROPERTY,
    property = "__typename"
)
@JsonSubTypes({
    @JsonSubTypes.Type(value = ExternalVideo.class, name = "ExternalVideo"),
    @JsonSubTypes.Type(value = MediaImage.class, name = "MediaImage"),
    @JsonSubTypes.Type(value = Model3d.class, name = "Model3d"),
    @JsonSubTypes.Type(value = Video.class, name = "Video")
})
public interface Media {
  /**
   * A word or phrase to share the nature or contents of a media.
   */
  String getAlt();

  /**
   * A globally-unique ID.
   */
  String getId();

  /**
   * The media content type.
   */
  MediaContentType getMediaContentType();

  /**
   * The presentation for a media.
   */
  MediaPresentation getPresentation();

  /**
   * The preview image for the media.
   */
  Image getPreviewImage();
}
