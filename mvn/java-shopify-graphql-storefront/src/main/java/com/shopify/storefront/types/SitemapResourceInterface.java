package com.shopify.storefront.types;

import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import java.lang.String;
import java.time.OffsetDateTime;

/**
 * Represents the common fields for all sitemap resource types.
 */
@JsonTypeInfo(
    use = JsonTypeInfo.Id.NAME,
    include = JsonTypeInfo.As.PROPERTY,
    property = "__typename"
)
@JsonSubTypes({
    @JsonSubTypes.Type(value = SitemapResource.class, name = "SitemapResource"),
    @JsonSubTypes.Type(value = SitemapResourceMetaobject.class, name = "SitemapResourceMetaobject")
})
public interface SitemapResourceInterface {
  /**
   * Resource's handle.
   */
  String getHandle();

  /**
   * The date and time when the resource was updated.
   */
  OffsetDateTime getUpdatedAt();
}
