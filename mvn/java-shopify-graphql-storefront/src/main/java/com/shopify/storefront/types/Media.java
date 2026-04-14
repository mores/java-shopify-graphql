package com.shopify.storefront.types;

import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import java.lang.String;

/**
 * A common set of fields for media content associated with
 * [products](https://shopify.dev/docs/api/storefront/current/objects/Product).
 * Implementations include [`MediaImage`](https://shopify.dev/docs/api/storefront/current/objects/MediaImage)
 * for Shopify-hosted images,
 * [`Video`](https://shopify.dev/docs/api/storefront/current/objects/Video) for
 * Shopify-hosted videos, [`ExternalVideo`](https://shopify.dev/docs/api/storefront/current/objects/ExternalVideo)
 * for videos hosted on platforms like YouTube or Vimeo, and
 * [`Model3d`](https://shopify.dev/docs/api/storefront/current/objects/Model3d) for 3D models.
 *
 * Each implementation shares fields for alt text, content type, and preview
 * images, while adding type-specific fields like embed URLs for external videos or
 * source files for 3D models.
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
