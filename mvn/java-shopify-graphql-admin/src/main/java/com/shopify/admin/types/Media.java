package com.shopify.admin.types;

import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import java.lang.String;
import java.util.List;

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
   * Any errors which have occurred on the media.
   */
  List<MediaError> getMediaErrors();

  /**
   * The warnings attached to the media.
   */
  List<MediaWarning> getMediaWarnings();

  /**
   * The preview image for the media.
   */
  MediaPreviewImage getPreview();

  /**
   * Current status of the media.
   */
  MediaStatus getStatus();
}
