package com.shopify.types;

import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import java.lang.String;
import java.time.OffsetDateTime;
import java.util.List;

/**
 * A file interface.
 */
@JsonTypeInfo(
    use = JsonTypeInfo.Id.NAME,
    include = JsonTypeInfo.As.PROPERTY,
    property = "__typename"
)
@JsonSubTypes({
    @JsonSubTypes.Type(value = ExternalVideo.class, name = "ExternalVideo"),
    @JsonSubTypes.Type(value = GenericFile.class, name = "GenericFile"),
    @JsonSubTypes.Type(value = MediaImage.class, name = "MediaImage"),
    @JsonSubTypes.Type(value = Model3d.class, name = "Model3d"),
    @JsonSubTypes.Type(value = Video.class, name = "Video")
})
public interface File {
  /**
   * A word or phrase to describe the contents or the function of a file.
   */
  String getAlt();

  /**
   * The date and time ([ISO 8601 format](http://en.wikipedia.org/wiki/ISO_8601)) when the file was created.
   */
  OffsetDateTime getCreatedAt();

  /**
   * Any errors that have occurred on the file.
   */
  List<FileError> getFileErrors();

  /**
   * The status of the file.
   */
  FileStatus getFileStatus();

  /**
   * A globally-unique ID.
   */
  String getId();

  /**
   * The preview image for the media.
   */
  MediaPreviewImage getPreview();

  /**
   * The date and time ([ISO 8601 format](http://en.wikipedia.org/wiki/ISO_8601)) when the file was last updated.
   */
  OffsetDateTime getUpdatedAt();
}
