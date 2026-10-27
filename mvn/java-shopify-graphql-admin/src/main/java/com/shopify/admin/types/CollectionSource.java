package com.shopify.admin.types;

import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import java.lang.String;

/**
 * A source that provides products for a collection.
 */
@JsonTypeInfo(
    use = JsonTypeInfo.Id.NAME,
    include = JsonTypeInfo.As.PROPERTY,
    property = "__typename"
)
@JsonSubTypes({
    @JsonSubTypes.Type(value = CollectionConditionsSource.class, name = "CollectionConditionsSource"),
    @JsonSubTypes.Type(value = CollectionSubCollectionsSource.class, name = "CollectionSubCollectionsSource")
})
public interface CollectionSource {
  /**
   * The app that created this source, if applicable. In the case of shareable
   * sources, this app manages this source's conditions and selections exclusively.
   */
  App getApp();

  /**
   * An optional description of the source.
   */
  String getDescription();

  /**
   * The unique identifier for this source.
   */
  String getId();

  /**
   * The title of the source.
   */
  String getTitle();
}
