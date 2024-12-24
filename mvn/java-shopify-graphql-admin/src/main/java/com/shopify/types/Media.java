package com.shopify.types;

import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import java.lang.String;
import java.util.List;


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
  
  String getAlt();

  
  String getId();

  
  MediaContentType getMediaContentType();

  
  List<MediaError> getMediaErrors();

  
  List<MediaWarning> getMediaWarnings();

  
  MediaPreviewImage getPreview();

  
  MediaStatus getStatus();
}
